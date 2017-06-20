/**
 * Created by dell on 6/20/2017.
 */
fun main(args:Array<String>){
    var x =10

    when(x){
        1->{
            print("1")
        }
        2-> {
            print("2")
        }
        3,4->{
            print("3 or 4")
        }
        !in 10..30->{
            print("not between 10 and 30")
        }
        in 10..30->{
            print("between 10 and 30")
        }
        else->{
            print("else val")
        }
    }
}