package bruteforce.boj_15721

import java.io.BufferedReader
import java.io.InputStreamReader

// 15032kb 96ms
fun main() {
	val br = BufferedReader(InputStreamReader(System.`in`))
	val a = br.readLine().toInt()
	val t = br.readLine().toInt()
	val g = br.readLine()
	// n -> n+1
	val sb = StringBuilder()
	val intro = "0101"
	var n = 1
	while(sb.length < t*2) {
		sb.append(intro)
		sb.append("0".repeat(n+1)).append("1".repeat(n+1))
		n += 1
	}
	var result = 0
	sb.forEachIndexed { idx, it ->
		if (it.toString() == g) {
			result += 1
			if (result == t) {
				println(idx % a)
			}
		}
	}
}