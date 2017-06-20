/**
 * Created by dell on 6/20/2017.
 */

//This is func main
fun main (args: Array <String>){
    println("enter name")
    var name = readLine()
    println("enter age")
    var age: Int = readLine()!!.toInt()
    println("enter department")
    var dep: String?
    dep = readLine()
    var pi: Double= readLine()!!.toDouble()
    println("name: ${name}")
    println("age: ${age}")
    println("department: ${dep}")
    println("pi: ${pi}")

}