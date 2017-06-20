abstract class CreditCard(){

    fun CreditId():String{return "rf2f2fewfw2"}
    abstract fun newCredit()



}
class UserInfo():CreditCard(){
    fun getInfo():String{
        return CreditId()

    }
   override fun newCredit(){

       println("new card")
   }
}



fun main(args:Array<String>){
    //var credit=CreditCard()
    //println(credit.CreditId())
    var user = UserInfo()
    println(user.getInfo())
}