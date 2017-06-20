class Car(Type:String,Model:Int,Price:Double,MilesDriven:Int, owner:String){
    var owner:String?=null
    var Price:Double?=null
    var MilesDriven:Int?=null
    var Model:Int?=null
    var Type:String?=null


    init{
        println("Type:$Type")
        println("Model:$Model")
        println("Price:$Price")
        println("MilesDriven:$MilesDriven")
        println("owner:$owner")

        this.owner=owner
        this.Price=Price
        this.MilesDriven=MilesDriven
        this.Model=Model
        this.Type=Type

    }
    fun GetPrice():Double?{
        return this.Price!!-(this.MilesDriven!!.toDouble()*10)
    }
    fun GetOwner():String?{
        return this.owner
    }
    fun GetMilesDriven():Int?{
        return this.MilesDriven
    }

    fun main(args:Array<String>){
        //create  a car
        //cal methods

    }
}
