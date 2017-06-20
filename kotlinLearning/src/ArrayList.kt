/**
 * Created by dell on 6/20/2017.
 */
fun main(args:Array<String>){
    var arrayList = ArrayList<String>()
    arrayList.add("Guy")
    println("First name:"+ arrayList.get(0))
    arrayList.set(0,"GuyL")
    for(item in arrayList){
        println(item)
    }
    if(arrayList.contains("Guy")){
        print("Name is found")
    }else{
        print("Name not found")
    }
    for(index in 0..arrayList.size-1){
        println("array list inedex $index :"+ arrayList.get(index))
    }
}