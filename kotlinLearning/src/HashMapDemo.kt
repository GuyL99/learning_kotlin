/**
 * Created by dell on 6/20/2017.
 */
fun main(args:Array<String>){

    var map = HashMap<Int,String>()
    map.put(1,"Guy")
    map.put(2,"GuyL")
    map.put(31,"Guyger")
    print(map.get(31))
//print the strings....
    for(k in map.keys){
        println(map.get(k))

    }


}