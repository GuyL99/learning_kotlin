open class Operations() {
    protected var ProcessName:String?=null
    //private..... regular(public)....
    fun sum(n1: Int, n2: Int): Int {

        return n1 + n2
    }

    fun div(n1: Int, n2: Int): Int {

        return n1 / n2
    }

}
class MultiOperations():Operations(){


    fun sub(n1:Int,n2:Int):Int{

        return  n1-n2
    }

    fun mult(n1:Int,n2:Int):Int{

        return  n1*n2
    }

    fun GetName(){
        super.ProcessName
    }

}




    fun main(args:Array<String>){

        var op= Operations()
        var sum=op.sum(10,15)
        var div=op.div(22,11)
        println(sum)
        println(div)

        //decond

        var op2=MultiOperations()
        sum=op2.sum(102,125)
        div=op2.div(222,111)
        println(sum)
        println(div)

    }
