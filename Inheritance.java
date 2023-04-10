package OopsAlpha;

public class Inheritance {
    public static void main(String args[]){


        // Fish shark = new Fish();
        // shark.color="skyblue";
        // System.out.println(shark.color);
        // shark.fins=5;
        // System.out.println(shark.fins);
        // shark.eat();
        // shark.breath();
        // shark.swims();

        // Vehicle obj1 = new Car();
        // obj1.print1();

        Vehicle boj2 = new Vehicle();
        boj2.print();
        
    }
}

  /// Base class
// class Animal{
//     String color;
    
//      void eat(){
//         System.out.println("fish want to eat somthing");
//      }
//      void breath(){
//         System.out.println("fish want to Oxygen");
//      }
// }
//   //Drived class or sub class
// class Fish extends Animal{
//         int fins;
//     void swims(){
//         System.out.println("fish is swims in water");
//     }
// }

class Vehicle{
    void print(){
        System.out.println("this is base class");
    }
}

class Car extends Vehicle{
    void print1(){
        System.out.println("this is a child class fo parent class..");
    }
}