import java.util.*


fun main(args : Array<String>){

        //Make a list just like arrays
            var list = listOf(11,22,33,43,54,52,41,21,22)

        //now make a loop to access list items
            for ((i, x) in list.withIndex()){
                println(i.toString()+"  ${x.toString()}" )
            }

        // TREE MAPS

            var tree = TreeMap<String,Int>()

            tree ["mango"]=56
            tree ["banana"]=76
            tree ["apple"]=90
    for ((fruit,price)in tree){

        println(fruit+" "+price)

    }

        }
