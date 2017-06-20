/**
 * Created by dell on 6/20/2017.
 */
fun main(args:Array<String>) {
   loop@ for (count in 1.. 10){
        for(count2 in 1..5){
            println(count)
            if(count==2){
                break@loop
            }
        }
    }
    print("loop done")
}