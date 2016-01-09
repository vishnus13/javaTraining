package edu.tutorial.javaTraining;
/*
* Animal class
*
* animal class is super class in my java program
* it has generic components like animal color and gender
* */
class Animal{
    String animalColor;
    String gender;

    Animal()
    {
        System.out.println("Animals are motile, they can move spontaneously and independently ");
    }
}

/*
* Mammal class
*
* Mammal class is the child class for animal class
* it inherits the properties of animal class
*
* Mammal has some characteristic
* */
class Mammal extends Animal{
    final String characteristic = "viviparous"; // gives birth directly
    String feedingType; //Herbivores,Carnivores,Omnivores
    Mammal()
    {
        super();
        System.out.println("All Mammals are "+characteristic+"(means live birth)");
    }
}

/*
* Dog class is the child class for Mammals class
*
* here i have implemented multi-level inheritance
* Dog class have it own property and functions
*
* */
public class Dog extends Mammal{
    String animalBreed;

    public static void main(String args[])
    {
        Dog d = new Dog("white and brown","Male","Carnivores","saint bernard");
    }
    Dog(String color,String gender1,String typeofFood,String breed)
    {
        super();
        this.animalColor =color;
        this.gender =gender1;
        this.feedingType = typeofFood;
        this.animalBreed = breed;
        System.out.print(gender+" "+animalBreed+" Dog is a "+feedingType+" identified in "+animalColor+" colour");
    }
}

