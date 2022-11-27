public class Constructor {
    
     public static void main(String[] args) {
    
        Student s1 = new Student();
        // Student s2 = new Student( "Anupriya");
        // Student s3 = new Student(123456 );
      s1.name ="ANU";
      s1.roll = 123;
      s1.Password = "abz";

      Student s2 = new Student(s1);
     s2.Password= "qwe";
   System.out.println(s2.name);
    }


}

class Student{
    String name;
    int roll;
   String Password;

   //copy constructor
     Student(Student s1){
        this.name = s1.name;
        this.roll = s1.roll;
     }



    Student(){
       // System.out.println(" non-parameterized constructor");
    }

    //parametrized constructor
    Student(String name){
        this.name = name;
    }

    Student(int rol){
        this.roll= rol;
    }










    // Student(){
    //    // this.name = name;
    //    System.out.println("this is a girl");
    // }

}
