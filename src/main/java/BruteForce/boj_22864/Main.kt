package bruteforce.boj_22864

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

// 20752kb 108ms
fun main(args: Array<String>) {
	val br = BufferedReader(InputStreamReader(System.`in`))
	val arr = br.readLine().split(" ").map {it.toInt()}
	val damage = arr[0]
	val work = arr[1]
	val heal = arr[2]
	val deadline = arr[3]
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