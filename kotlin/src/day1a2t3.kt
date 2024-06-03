/*Task 3: Define data types to represent event details such as name, date, and attendee count.

 */
import java.util.Date

data class event(val name:String, val date: Date, val attendeeCount:Int)
fun main(){
    val newEvent=event("Sashank", Date(),100)
    println(newEvent.name)
    println(newEvent.date)
    println(newEvent.attendeeCount)
}