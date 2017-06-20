class UserAdmins<T>(credit:T){

    init{
        println(credit)
    }

}


fun <T> display(process: T){
    println(process)
}


fun main(args:Array<String>){

    var userAdmin = UserAdmins<String>("Guy")
    var userAdmin2 = UserAdmins<Int>(55)
    var userAdmin3 = UserAdmins<Double>(55.3)
}