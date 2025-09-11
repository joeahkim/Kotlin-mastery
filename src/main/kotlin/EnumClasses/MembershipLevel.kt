package EnumClasses

enum class MembershipLevel {
    SILVER {
        override fun applyDiscount(price: Double): Double = price * 0.95
    },
    GOLD {
        override fun applyDiscount(price: Double): Double = price * 0.90
    },
    PLATINUM {
        override fun applyDiscount(price: Double): Double = price * 0.80
    },
    NONE {
        override fun applyDiscount(price: Double): Double = price
    };

    abstract fun applyDiscount(price: Double): Double
}

data class Purchase(val price: Double, val membership: MembershipLevel)

fun main() {
    val purchases = listOf(
        Purchase(100.0, MembershipLevel.SILVER),
        Purchase(200.0, MembershipLevel.GOLD),
        Purchase(300.0, MembershipLevel.PLATINUM),
        Purchase(50.0, MembershipLevel.NONE)
    )

    for (purchase in purchases) {
        val finalPrice = purchase.membership.applyDiscount(purchase.price)
        println("Membership: ${purchase.membership} | Original Price: ${purchase.price} | Final Price: $finalPrice")
    }
}
