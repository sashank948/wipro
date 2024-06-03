/*Task 4: Implement a basic user input flow to create new events using if and
 when statements

 */
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

data class eventDetails(val name:String, val date: LocalDate, val attendeeCount:Int)
fun main(){
    val sc=Scanner(System.`in`)
    println("enter Event name: ")
    val n= sc.nextLine()
    println("enter date of the event(yyyy-MM-dd): ")
    val input = sc.nextLine()
    val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")
        val date = LocalDate.parse(input, formatter)
    println("enter number of people attend to the event:")

    val count=sc.nextInt()
    val newEvent=eventDetails(n, date, count);
    println(newEvent.date)
    println(newEvent.name)
    println(newEvent.attendeeCount)

}