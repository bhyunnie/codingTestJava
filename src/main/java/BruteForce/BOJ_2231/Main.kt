package bruteforce.boj_2231

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

// 12756kb 104ms
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val input = br.readLine().toInt()
    var result = 0

    for (i in 1..input) {
        var sum = i
        var n = i
        while(n > 0) {
            sum += n % 10
            n /= 10
        }
        if (sum == input) {
            result = i
            break
        }
    }

    bw.write("$result")
    bw.flush()
    bw.close()
    br.close()
}