import javax.lang.model.type.ArrayType


fun main(args :Array<String> ){

    var dc = DataClass()

    dc.name= "Ali"
    dc.rollNo=99

    println(dc.name+"\n")

    dc.show()
}

fun DataClass.show(){
    print(this.name+"\n")
    print(this.rollNo)
}