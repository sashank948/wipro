/*Task 5: Write functions to add, delete, and edit transactions in a TransactionList class

 */
data class transactiondata(
    val id:Int,
    var description: String,
    var amount: Double,
    var category : String
)
class TransactionList {
    private val transactions = mutableListOf<transactiondata>()
    private var nextId = 1

    fun addTransaction(description: String, amount: Double, category: String) {
        val transaction =transactiondata(nextId++, description, amount, category)
        transactions.add(transaction)
        println("Transaction added: $transaction")
    }

    fun deleteTransaction(id: Int) {
        val transaction = transactions.find { it.id == id }
        if (transaction != null) {
            transactions.remove(transaction)
            println("Transaction deleted: $transaction")
        } else {
            println("Transaction with id $id not found.")
        }
    }

    fun editTransaction(id: Int, newDescription: String, newAmount: Double, newCategory: String) {
        val transaction = transactions.find { it.id == id }
        if (transaction != null) {
            transaction.description = newDescription
            transaction.amount = newAmount
            transaction.category = newCategory
            println("Transaction edited: $transaction")
        } else {
            println("Transaction with id $id not found.")
        }
    }

    fun listTransactions() {
        if (transactions.isEmpty()) {
            println("No transactions found.")
        } else {
            println("Transactions:")
            transactions.forEach { println(it) }
        }
    }
}
fun main() {
    val transactionList = TransactionList()


    transactionList.addTransaction("Grocery shopping", 50.0, "Food")
    transactionList.addTransaction("Electricity bill", 75.0, "Utilities")
    transactionList.addTransaction("Movie night", 30.0, "Entertainment")


    transactionList.listTransactions()


    transactionList.editTransaction(2, "Electricity bill (April)", 80.0, "Utilities")


    transactionList.deleteTransaction(1)

  
    transactionList.listTransactions()
}
