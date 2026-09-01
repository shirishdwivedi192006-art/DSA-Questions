package day15;

public class OOPs {
    public static void main(String[] args) {
        // Student s1=new Student();
        // s1.clapercentage(21, 76, 98);
        // System.out.println(s1.percentage);
        // s1.age=43;
        // s1.name="Shirish dwivdei";
        // System.out.println(s1.age+" "+s1.name);
        //------------------------------------------------------------------------------------------//
        Pen p1=new Pen();
        p1.setcolor("green");
        System.out.print(p1.getcolor());

    }
}

class Pen{
    private String color;
    int tip;

    String getcolor(){
        return this.color;
    }
    int gettip(){
        return this.tip;
    }

    void setcolor(String newcolor){
        this.color=newcolor;
    }
    void settip(int newtip){
        this.tip=newtip;
    }
}

class Student{
    String name;
    int age;
    float percentage;

    void clapercentage(int py,int ma,int ch){
        percentage=py+ma+ch;
    }
}
