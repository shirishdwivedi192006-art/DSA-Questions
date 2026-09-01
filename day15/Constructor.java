package day15;

public class Constructor {
public static void main(String[] args) {
    Constructori c1=new Constructori();
    Constructori c2=new Constructori("shirish");
    Constructori c3=new Constructori(5);
      
      Constructori c4=new Constructori(c2);
      c4.age=8;
}    
}
// CONSTRUCTOR OVER LOADING WITH USING OBJECT
class Constructori{
    private String name;
     int age;

    //COPY CONSTRUCTOR
    Constructori(Constructori s3){
        this.name=s3.name;
     
    }
//-------------------------------------------------------
     Constructori() {
     System.out.println("constructor is called ");
    }

     Constructori(String name) {
     this.name=name;
     System.out.println(this.name);
    }

     Constructori(int age) {
     this.age=age;

     System.out.println(this.age);
    }
    
}
