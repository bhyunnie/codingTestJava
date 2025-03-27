package BruteFoce.BOJ_3040

import java.io.BufferedReader
import java.io.InputStreamReader

// 12164kb 72ms
fun main(args: Array<String>) {
	val br = BufferedReader(InputStreamReader(System.`in`))
	val nums: Array<Int> = Array(9) {0}
	var sum = 0;
	for(i in 0..8) {
		nums[i] = br.readLine().toInt()
		sum += nums[i]
	}

	for(i in 0..8) {
		for (j in (i+1)..8) {
			if (nums[i] + nums[j] == sum - 100) {
				nums.forEachIndexed { idx,it ->
					if (idx != i && idx != j) {
						println(it)
					}
				}
			}
		}
	}
}