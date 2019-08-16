class Animal{
    void eat(){                                    //note access specifier in dog eat()
        System.out.println("animal is eating");
    }

}
class Dog extends Animal{
    String breed;
    String colour;

    public Dog(String breed, String colour) {
        this.breed = breed;
        this.colour = colour;
    }
    protected void eat(){                             //private->default(no specifier)->protected->public
        System.out.println(this.breed+" is eating");
        super.eat();                                   //calling super class in child class
    }
}
public class Inheritance {
    public static void main(String[] args){
        Animal animal1= new Dog("dalmation","brown");       //method overriding
        animal1.eat();                                                 //since the object is for dog , eat in dog is called

    }

}
