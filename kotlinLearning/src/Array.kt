/**
 * Created by dell on 6/20/2017.
 */
fun main(args:Array<String>){
    var arrayInt= Array<Int>(5){0}
    arrayInt[3]=55
    println("Array[3]="+arrayInt[3])

    for(element in arrayInt){
        println(element)
    }
    for(index in 0..4){
        println(arrayInt[index])
    }
    var arrayStr = Array<String>(4){""}
    for(index in 0..3){
        arrayStr[index]= readLine()!!

    }

}