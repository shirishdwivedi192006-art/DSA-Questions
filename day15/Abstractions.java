
public class Abstractions{
    public static void main(String[] args) {
        Human h1=new Human();
        System.out.println(h1.color);
        h1.changcolor();
          System.out.println(h1.color);
    }
}
abstract class Animal{
     String color;
    public Animal() {
        color="brown";
    }

    void eats(){
        System.out.println("Animal eats");
    }

   abstract  void walks();
}
class Cow extends Animal{
    void walks(){
        System.out.println("walks on four legs");
    }
    void changcolor(){
        color="darkk borwn";
    }
}
class Human extends Animal{
    void walks(){
        System.out.println("walks on two legs");
    }
    void changcolor(){
        color="skin color";
    }
}