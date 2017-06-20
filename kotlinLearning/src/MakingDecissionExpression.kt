/**
 * Created by dell on 6/20/2017.
 */
fun main(args:Array<String>){
    var n1 = 10
    var n2 = 20
    var max = if(n1>n2) n1 else n2
    print(max)


    var age = 30

    var isYoung= when(age){
        30->true
        else->false
    }
    print(isYoung)

}