
interface op{

    fun sum(n1:Int,n2:Int){ println(n1+n2)}
    fun div(n1: Int, n2: Int){ println(n1/n2)}


}


class UserOp:op{
    override fun div(n1: Int, n2: Int) {
       println(n1/n2)
    }

    override fun sum(n1: Int, n2: Int) {
        println(n1+n2)
     }


}


class AdminOp:op{
    override fun div(n1: Int, n2: Int) {
        println(n1/n2-2)
    }

    override fun sum(n1: Int, n2: Int) {
        println(n1+n2-2)
    }


}
class ManagerOp:op{}