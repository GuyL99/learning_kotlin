/**
 * Created by dell on 6/20/2017.
 */

fun sum(n1:Double,n2:Double):Double{
    var sum = n1+n2
    return sum
}


fun display(n:Int=0):Unit{

    println("n:$n")

}

fun displayNoInput():Unit{
 print("thing")
}

fun main(args:Array<String>){

    var r = sum(10.0,12.0)
    print("r:$r")
    display(4)
    display()
}