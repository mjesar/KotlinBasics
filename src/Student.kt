class Student{

    var name:String?=null
    var rollNo:Int ?= null


    fun print(){
        println("Name ${name}" )
        println("RollNo: ${rollNo}")

    }
    fun assign(n: String,r: Int){
        name=n
        rollNo=r
    }
}