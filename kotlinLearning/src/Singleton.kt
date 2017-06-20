class Singleton{

    var name:String?=null

    private constructor(){

        println("instance created")

    }
    companion object{

        val instance:Singleton by lazy { Singleton() }

    }
}

fun main(args:Array<String>){
    var s1 = Singleton.instance
    s1.name="Guy"
    var s2 = Singleton.instance

    var s3 = Singleton.instance


}
