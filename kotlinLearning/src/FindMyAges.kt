import java.util.*

/**
 * Created by dell on 6/20/2017.
 */
fun main(args:Array<String>){
    ///input
    print("Enter your DOB:")
    var DOB:Int= readLine()!!.toInt()
    //process
    var year = Calendar.getInstance().get(Calendar.YEAR)
    var age = year - DOB


    //output

    println("your age in years is $age")
}