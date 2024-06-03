/*Task 4: Implement control structures to categorize transactions
(e.g., Food, Utilities, Entertainment) using when statements.
 */

data class Transaction(
    val description: String,
    val amount: Double
)

fun categorizeTransaction(transaction: Transaction): String {
    return when {
        transaction.description.contains("grocery", ignoreCase = true) -> "Food"
        transaction.description.contains("restaurant", ignoreCase = true) -> "Food"
        transaction.description.contains("electricity", ignoreCase = true) -> "Utilities"
        transaction.description.contains("water", ignoreCase = true) -> "Utilities"
        transaction.description.contains("internet", ignoreCase = true) -> "Utilities"
        transaction.description.contains("movie", ignoreCase = true) -> "Entertainment"
        transaction.description.contains("concert", ignoreCase = true) -> "Entertainment"
        else -> "Other"
    }
}

fun main() {
    val transactions = listOf(
        Transaction("Grocery store purchase", 45.23),
        Transaction("Electricity bill payment", 75.00),
        Transaction("Concert ticket", 120.50),
        Transaction("Restaurant dining", 60.00),
        Transaction("Internet service", 45.99)
    )

    for (transaction in transactions) {
        val category = categorizeTransaction(transaction)
        println("Transaction: ${transaction.description} - Category: $category")
    }
}
