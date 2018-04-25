import org.jcp.xml.dsig.internal.dom.DOMCanonicalXMLC14N11Method
import javax.lang.model.type.ArrayType


fun main(args :Array<String> ){

    var dc = DataClass()

    dc.name= "Ali"
    dc.rollNo=99
    println(dc.name+"\n")
    dc.show()

    var dc1 = DataClass()
    dc1.name="Sunny"
    dc1.rollNo= 211

    var sum =dc add dc1

    print(sum)


}

fun DataClass.show(){
    println(this.name+"\n")
    println(this.rollNo)
}

// Functions marked with the infix keyword can also be called using the infix notation (omitting the dot and the parentheses for the call). Infix functions must satisfy the following requirements:
infix fun DataClass.add(dc: DataClass ): Int{

    return dc.rollNo+ this.rollNo
}