


import java.util.*;

public  class Oops{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Pen p1 = new Pen();  //created object
//        p1.setColor("Yellow");
//        p1.getColor("yellow");
//        System.out.println(p1.getColor("yellow"));




//        Student s1 = new Student();
//        s1.name = "Yash";
//        s1.rollNo = 1064;
//        s1.pin = 1;
//        s1.marks[0] = 100;
//        s1.marks[1] = 90;
//        s1.marks[2] = 80;
//        s1.schoolName = "JMV";
//        System.out.println(s1.name+" "+s1.rollNo+" "+s1.pin+" " + s1.schoolName);
//        Student s2 = new Student();
//        s2.name = "Prem";
//        s2.rollNo = 2064;
//        s2.pin = 2;
//        s2.marks[0] = 10;
//        s2.marks[1] = 90;
//        s2.marks[2] = 80;
//        System.out.println(s2.name+" "+s2.rollNo+" "+s2.pin+" " + s2.schoolName);
//        Function.outputArray(s1.marks);
//        System.out.println();
//        Function.outputArray(s2.marks);


        Fish f1 = new Fish();
//        f1.eat();


//        Dog bunny = new Dog();
//        bunny.color = "Brown";
//        bunny.type = "PET";
//        System.out.println("Bunny Info : Color "+bunny.color+", Type "+bunny.type);
//
//        Cat mini = new Cat();
//        mini.breed = "Indian";
//        mini.color = "White";
//        mini.size = 10;
//        System.out.println("Mini Info : Breed : "+mini.breed+", Color : "+mini.color+", size : "+mini.size);


//
//        Clac c1 = new Clac();
//        System.out.println(c1.sum(1,1));
//        System.out.println(c1.sum((float)1.5,(float)2.5));
//        System.out.println(c1.sum(1,1,1));

//        Deer d1 = new Deer();
//        d1.eat();

//        Female f1 = new Female();

//        Bear b1 = new Bear();
//        b1.meet();
//        b1.veggies();
        sc.close();
    }
}

class Student{
    String name;
    int rollNo;
    int pin;
    int []marks = new int[3];
    static String schoolName ;

    Student(){
        marks = new int[3];
        System.out.println("Constructor is called");
    }

//    //shallow copy constructor (this shallow copy constructor copy reference)
//    Student(Student s1) {
//        marks = new int[3];
//        this.name = s1.name;
//        this.rollNo = s1.rollNo;
//        this.marks = s1.marks;
//    }

    //deep copy constructor (this copy value)
//    Student(Student s) {
//        marks = new int[3];
//        this.name = s.name;
//        this.rollNo = s.rollNo;
//        System.arraycopy(s.marks, 0, this.marks, 0, marks.length);
//    }

}
//class Pen {
//   private String color;
//   private int tip;
//
//    String getColor(String color) {
//        return this.color = color;
//    }
//    int getTip(int tip) {
//        return this.tip = tip;
//    }
//    void setColor(String newColor) {
//        color = newColor;
//    }
//
//    void setTip(int newTip) {
//        tip = newTip;
//    }
//}

//parent / base class
class Animal{
    String color;
    int size;
    Animal(){
        System.out.println("Animal constructor called..");
    }
    void eat(){
        System.out.println("Eat anything");
    }
}

//child class / sub_class
 class Fish extends Animal{
    int fins;
    Fish(){
       super();
        System.out.println("Fish constructor called....");
    }
}

//child / sub_class
class Shark extends Fish{
    int power;
}

//child / sub_class
class Piranha extends  Fish{
    int power;
}

//child / sub_class
class Bird extends Animal {
    int flyCapacity;
}

//child / sub_class
class Peacock extends Bird{
    int nColor;
}
//child / sub_class
class Mammals extends Animal{
    int leg;
}

//child / sub_class
class Deer extends  Animal{
    void eat(){
        System.out.println("Eat grass !!");
    }

}
//child / sub_class
class Dog extends Mammals{
    String type;
}

//child /sub /derived class
class Cat extends Mammals{
    String breed;
}

//child / sub_class
class Human extends Animal {
    int nBehaviours;
}

class Clac{
    int sum(int a, int b){
        return  a+b;
    }
    float sum(float a, float b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return  a+b+c;
    }
}

//abstract class
abstract class Humanity{
    Humanity(){
        System.out.println("Hmanity called");
    }
    void eat(){
        System.out.println("Human can eat");
    }

    abstract void read();
}

class Man extends Humanity{
    Man(){
        System.out.println("Man constructor called");
    }
    void read(){
        System.out.println("Man can read!!");
    }
}

class Female extends Man{
    Female(){
        System.out.println("Female constructor called");
    }
    void read(){
        System.out.println("Female can read !!");
    }
}

interface  Herbivore{
    void veggies();
}

interface Carnivouras{
    void meet();
}

class Bear implements Herbivore,Carnivouras{
    public    void veggies(){
        System.out.println("Frutes");
    }

    public void meet(){
        System.out.println("Meet");
    }
}