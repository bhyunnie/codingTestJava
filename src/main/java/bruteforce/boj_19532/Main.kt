package bruteforce.boj_19532

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args:Array<String>) {
	val br = BufferedReader(InputStreamReader(System.`in`))
	val arr = br.readLine().split(" ").map { it.toInt() }
	val a = arr[0]
	val b = arr[1]
	val c = arr[2]
	val d = arr[3]
	val e = arr[4]
	val f = arr[5]


	for (x in -999..999) {
		for (y in -999..999) {
			if (((a+d) * x +  (b+e) * y == c+f) && (a-d) * x + (b-e) * y == c-f) {
				println("$x $y")
			}
		}
	}
}