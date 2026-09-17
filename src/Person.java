public class Person {
    //height, age, color, weight, name: Instance variables

    double height;

    int age;

    String color;

    String name;

    double weight;

    Person(){
        //Default constructor can be empty
        height = 48;
        age = 18;
        color = "black";
        name = "";
        weight = 140;
    }

    Person(double height, int age, String color,String name, double weight){
        //Overloaded Constructor
        //Parameters variables are local to the constructor

        this.height = height;
        this.age = age;
        this.color = color;
        this.name = name;
        this.weight = weight;

    }
}
