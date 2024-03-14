import java.sql.Time
import java.util.Date
import java.time.LocalDate


import java.text.SimpleDateFormat
import java.time.DayOfWeek
import java.time.LocalTime
import java.time.MonthDay
import kotlin.concurrent.timer

//fun main() {
////    println("Hello World!")
////    print("hey")
//var name = "Marcel"
//   name = "john"
//    println(name)
//
// hence()
//  chap()
//val Emg:Int = 34
//}
//fun hence(){
//    println("Chelsea is the best")
//
//}
//fun chap() {
//var gg:Int =23
//var rr:Boolean = true
//var aa:Double =8.0
//var zz:Char= 'A'
//
//
//}
fun main (){
  val school = "Emobilis"
  var year = 2012
  var course = "MIT"
  var name = "Marcel"
// println("My school is " + (school) + "I went in the year " + (year) + "I did " + (course) + "My name is "+ (name))
//print("my name is $name i do $course i went ")
//  Operators()
//  ifst()
//  Program()
//even()
//  Program2()
//    maxs()
    Times()
}
//fun Operators (){
//  var Biology = 28
//  var Maths = 26
//  var sum = Biology + Maths
//  var rem = Biology % Maths
//
//
//
//
//  println(sum)
//  print(rem)
//
//
//}
//fun ifst (){
//  var scie = 45
//  var sst = 45
//  if (scie > sst){
//    println("SSt less")
//  } else if (sst > scie){
//    print("SSt more")
//
//  }else{
//    print("Unavailable")
//
//
//  }
//
//
//}
//fun Program(){
//  var eve = -4
//  if (eve > 0) {
//    print("postive")
//  }else if (eve < 0) {
//    print("negative")
//
//  }else{
//    print("0")
//  }
//
//
//}
//fun even (){
//  var tr = 5
//  if (tr % 2 == 0){
//    println("even")
//  }else if (tr % 2 != 0){
//
//
//    print("Odd")
//  }
//
//
//}
//fun Program2 () {
//    var Mq = -1
//    var Me = -1
//    var Mr = -1
//    var Avg = (Mq + Me + Mr) / 3
//    println(Avg)
//    if (Avg <0){
//        print("Invalid input")
//        if (Avg>100){
//            print("Invalid input")
//        }
//    }
//
//    if (Avg <= 20) {
//        print("E")
//
//    } else if (Avg <= 40) {
//        print("D")
//    } else if (Avg <= 60) {
//        print("C")
//    } else if (Avg <= 80) {
//        print("B")
//    } else if (Avg <= 100) {
//        print("A")
//    }
//}
    
//fun maxs (){
//    var rty = 78
//    var tyu = 784
//    var hyu = 6
//    if (rty > tyu) {
//        println(rty)
//
//    }else if (rty > hyu) {
//        print(rty)
//    }else if (hyu > rty) {
//            print(hyu)
//    }else if (hyu > tyu) {
//        print(hyu)
//    }else if (tyu > rty) {
//        print(tyu)
//    }else if (tyu > hyu) {
//        print(tyu)
//    }
//}
fun Times () {
    val curentDate = LocalDate.now()
//    if (curentDate>LocalTime.NOON){
//        println("Evening")
//    }
//    if (curentDate<LocalTime.NOON){
//        println("Morning")

  val rt =curentDate.month
    val ct = curentDate.dayOfWeek
    val yy = curentDate.year
    println("current month is $rt")
    println("current day of week is $ct")
    println("current year is $yy")
    }






















