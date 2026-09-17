 class Person {
    //height, age, color, weight, name: Instance variables

    double height;

    int age;

    String color;

    String name;

    double weight;

    //Constructors can have private, protected, public access modifiers

     //Protected members are accesible within the same package
    protected Person(){
        //Default constructor can be empty
        height = 48;
        age = 18;
        color = "black";
        name = "";
        weight = 140;
    }
     protected Person(double height, int age){
         //Overloaded Constructor
         //Parameters variables are local to the constructor

         this.height = height;
         this.age = age;
     }
    private Person(double height, int age, String color,String name, double weight){
        //Overloaded Constructor
        //Parameters variables are local to the constructor

        this.height = height;
        this.age = age;
        this.color = color;
        this.name = name;
        this.weight = weight;

    }
    //Setter and Getter
     // Methods

public Person Call_Private(){
        Person p3 = new Person();
        return p3;
    }
}
