package de.hvo.fp

import kotlin.math.roundToInt
import kotlin.math.sqrt

//Beauty of functional programming
class Fp01 {
    companion object {

        @JvmStatic
        fun main(args: Array<String>) {

            // take a list of integers. produce a second list that for each index contains the count of the appearance of that index in the first list.
            // (0,0,1,2,2,2) -> (2, 1, 3)
            val inputList = listOf(3, 4, 3, 2, 1, 4, 3, 3, 3, 3, 5, 11, 13, 3, 11, 3, 11, 13)
            countElements(inputList).forEachIndexed { index, i -> println("Number $index appeares $i times") }

            // produce a list of primes up to a value
            3.rangeTo(250).step(2).filter { it.isPrime() }.forEach { print("$it ") }
        }

        fun countElements(inputList: List<Int>): List<Int> =
            0.rangeTo(inputList.max() ?: 0).map { value -> inputList.count { it == value } }

        fun Int.isPrime(): Boolean {
            return !(3.rangeTo(sqrt(this.toDouble()).roundToInt()).map { this % it }.contains(0))
        }
    }
//    Output:
//    Number 0 appeares 0 times
//    Number 1 appeares 1 times
//    Number 2 appeares 1 times
//    Number 3 appeares 8 times
//    Number 4 appeares 2 times
//    Number 5 appeares 1 times
//    Number 6 appeares 0 times
//    Number 7 appeares 0 times
//    Number 8 appeares 0 times
//    Number 9 appeares 0 times
//    Number 10 appeares 0 times
//    Number 11 appeares 3 times
//    Number 12 appeares 0 times
//    Number 13 appeares 2 times
//    3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 101 103 107 109 113 127 131 137 139 149 151 157 163 167 173 179 181 191 193 197 199 211 223 227 229 233 239 241
}