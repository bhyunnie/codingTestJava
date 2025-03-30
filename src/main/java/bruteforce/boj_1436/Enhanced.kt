package bruteforce.boj_1436

import java.io.BufferedReader
import java.io.InputStreamReader

// 14596kb 140ms
fun main () {
	val br = BufferedReader(InputStreamReader(System.`in`))
	val r = br.readLine().toInt()
	val arr = arrayListOf<Int>()
	var i = 666
	while (true) {
		if (hasThreeSix(i)) {
			arr.add(i)
		}
		if (arr.size == r) {
			println(arr.last())
			break
		}
		i++
	}
}

fun hasThreeSix(n: Int):Boolean {
	var num = n
	while(num > 0) {
		if (num < 666) return false
		if (num % 1000 == 666) {
			return true
		}
		num /= 10
	}
	return false
}