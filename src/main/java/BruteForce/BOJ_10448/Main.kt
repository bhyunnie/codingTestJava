package BruteForce.BOJ_10448

import java.io.BufferedReader
import java.io.InputStreamReader

// 18500kb 276ms
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val t = br.readLine().toInt()
    val nums = List(45) { (it+1) * (it+2) / 2 }
    repeat(t) {
        val num = br.readLine().toInt()
        var result = 0
        for(i in nums) {
            for (j in nums) {
                for (k in nums) {
                    if (i + j + k == num) {
                        result = 1
                        break
                    }
                }
                if (result == 1) break
            }
            if(result == 1) break
        }
        println(result)
    }
}