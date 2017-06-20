/**
 * Created by dell on 6/20/2017.
 */

fun sum (n1:Int,n2:Int):Int{
    return n1+n2
}

fun sum(n1:Int,n2:Int,n3:Int):Int{
    return  n1+n2+n3
}



fun main(args:Array<String>){

    var sumNum = sum(10,11)
    println("sum="+sumNum)
    sumNum= sum(11,223,223)
    println("sum="+sumNum)
}