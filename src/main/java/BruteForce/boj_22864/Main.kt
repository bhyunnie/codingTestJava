package bruteforce.boj_22864

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

// 20752kb 108ms
fun main(args: Array<String>) {
	val br = BufferedReader(InputStreamReader(System.`in`))
	val (damage,work,heal,deadline) = br.readLine().split(" ").map {it.toInt()}
	var damageSum = 0
	var result = 0
	for (i in 0..23) {
		if (damage + damageSum <= deadline) {
			damageSum += damage
			result += work
		} else {
			damageSum = max(0, damageSum-heal)
		}
	}
	println(result)
}