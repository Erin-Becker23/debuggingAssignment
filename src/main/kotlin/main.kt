import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit

fun main(args: Array<String>) {

    //var scanner = "" // to get user input

    val today = LocalDate.now() // to get current date / time

    // set date format
    val formatter = DateTimeFormatter.ofPattern("M/d/yyyy")

    // display today's date formatted
    val textToday = today.format(formatter)
    println("Today's date is: $textToday")

    // get info from user
    println("What month were you born in? (Enter as number: January = 1)")
    val myMonth = readLine()!!.toInt()
    println("What day were you born? ")
    val myDay = readLine()!!.toInt()
    val myYear = today.year // assign year to current year
    val thisMonth = today.monthValue

    // assign information to variable birthday
    var birthday = LocalDate.of(myYear, myMonth, myDay)


    // calculate days till next birthday
    if (birthday.isBefore(today)) {
        birthday = birthday.plusYears(1)
    }

    val daysToBirthday = today.until(birthday, ChronoUnit.DAYS)

    if (myMonth == thisMonth && myDay == today.getDayOfMonth()) {
        println("Happy Birthday!")
    } else {
        println("Your next birthday is: $birthday")
        println("There are $daysToBirthday days till your next birthday!")
    }

}