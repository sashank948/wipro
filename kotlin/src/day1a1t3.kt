import java.util.Date

/*Task 3: Create a Transaction class with properties
 such as amount, date, and category.
 */

class transaction(val amount: Double, val date: Date,val category: String)
fun main(){
    val trans=transaction(100.9, Date(),"fruits")
    println(trans.amount )
    println(trans.date)
    println(trans.category)
}