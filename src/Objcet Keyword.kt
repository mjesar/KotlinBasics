data class Student3(var s: String,var r :Int){

    var name=s
    var rollNo=r

}

object `class`{

    var student= arrayListOf<Student3>()

   fun showAll(){
       for (i in student){
           println(i)
       }

   }
}


fun main (args:Array<String>){

    `class`.student.add(Student3("Ali",99));
    `class`.student.add(Student3("Sunny",211));

    `class`.showAll()
}