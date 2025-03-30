package bruteforce.boj_1436

import java.io.BufferedReader
import java.io.InputStreamReader

fun main () {
	val br = BufferedReader(InputStreamReader(System.`in`))
	val r = br.readLine().toInt()
	var i = 666
	val arr:ArrayList<Int> = arrayListOf()
	while (true) {
		if (i.toString().contains("666")) {
			arr.add(i)
		}
		if (arr.size == r) {
			println(arr.last())
			break
		}
		i++
	}
}