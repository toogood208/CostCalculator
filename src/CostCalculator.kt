class CostCalculator {
    private val mpos = 21500
    private val cards = 268.75

    fun calculate(mposQuantity: Int, cardsQuantity: Int, delivery: String): Double {
        val total: Double = (mposQuantity * mpos) + (cardsQuantity * cards)

        return if (delivery == "lagos") {
            total + 1500
        } else if (delivery == "pickup") {
            total
        } else {
            total + 3500
        }
    }

}

fun main(){
    val cost = CostCalculator()
   print(cost.calculate(0,20,"pickup"))

}