package org.example.Util

class RollDice {
    fun rolagemAtributos(): Int {
        val rolling = List(4) { Dices.d6() }
        val minValue = rolling.min()

        val maxSum = rolling.sorted().drop(1).sum()

        return maxSum;
    }
}