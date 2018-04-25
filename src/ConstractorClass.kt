class ConstractorClass  (n:String)  {

    var name :String = ""
    var rollNo : Int= 0

    init{
        name= n
    }

    constructor(n: String, r:Int):this(n){


        rollNo= r
    }

    fun show(){
        println(name)
        println(rollNo)

    }
}