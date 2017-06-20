fun main(args:Array<String>){

    var t1 = thread("thread1")
    t1.start()
    var t2 = thread("thread2")
    t2.start()
    var t3 = thread("thread3")
    t3.start()
    println(" thread is run")

}

class thread():Thread(){
    var threadName:String=""

    constructor(threadName:String):this(){
        this.threadName= threadName
        println("${this.threadName} is started")
    }


    override fun run() {
        var count = 0
        while (count < 10) {
            println("${threadName}count:$count")
            count++

            try {
                Thread.sleep(1000)
            } catch (ex: Exception) {
                print(ex.message)
            }
        }
    }
}