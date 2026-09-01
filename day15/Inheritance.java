package day15;


public class Inheritance {
public static void main(String[] args) {
    Animal a1=new Animal();
    a1.eats();
    Fish f1=new Fish();
    f1.swin();
    f1.eats();
    f1.breath();
}
    
}
class Animal{
    String color;
     
    void eats(){
        System.out.println("it eats the food");
    }
    void breath(){
        System.out.println("it breaths");
    }
}
class Fish extends Animal{
    void swin(){
        System.out.println("it swims in the water with the help of finss");
    }
}