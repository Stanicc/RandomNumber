package stanic.randomnumber

import java.util.*

class RandomNumber {

    fun getAbove(): Int {
        val i = (Math.random() * (100 - 1)) + 1
        return i.toInt()
    }

    fun getBelow(): Int {
        val i = (Math.random() * (10000 - 100)) + 10000
        return i.toInt()
    }

}