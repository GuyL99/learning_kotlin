import java.io.FileReader
import java.io.FileWriter

fun main(args:Array<String>){
    println("1 - read \n 2- write")
    var op = readLine()!!.toInt()
    when(op){
        1-> readFromFile()
        2->{
            println("write to file")
            var str:String= readLine().toString()
            writeToFile(str)
        }
        else->println("no....")
    }


}


fun writeToFile(str:String){
    try {
        //the true in the next line mean add data(dont replace the file with a new one)
        val fo = FileWriter("test.txt",true)
        fo.write(str)
        fo.close()
    }catch (ex:Exception){
        println(ex.message)
    }
}


fun readFromFile(){

    try{
        val fin = FileReader("test.txt")
        var c:Int
        do{
            c=fin.read()
            print(c.toChar())
        }while(c!=-1)

    }catch(ex:Exception) {
        print(ex.message)
    }

}