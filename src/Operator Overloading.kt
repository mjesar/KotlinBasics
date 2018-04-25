


        fun main(args: Array<String>){

            var dc = DataClass()
            var dc1= DataClass()

            dc.name= "Ali"
            dc.rollNo= 99

            dc1.name= "sunny"
            dc1.rollNo=211


            print(dc1.name)

            var dc2 = DataClass()
            dc2 = dc+dc1


            dc2.show()
        }

       fun DataClass.Display(){

           println("Name: "+ this.name)
           println("RollNo: "+ this.rollNo)

       }


        //OPERATOR OVERLOADING FUNCTION
       operator fun DataClass.plus(dc: DataClass):DataClass{

           var dc3 = DataClass()
           dc3.name = this.name +"  "+dc.name
           dc3.rollNo= this.rollNo + dc.rollNo


           return dc3
       }

