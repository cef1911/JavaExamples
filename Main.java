/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animal;

/**
 *
 * @author cef19
 */
//Polymorphism example
class Animal {
  void animalSound() {
    System.out.println("The animal makes a sound");
  }
}

class Pig extends Animal {
 @Override
  void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}

class Dog extends Animal {
 @Override
  void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}

class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal(); //object created here
        Animal myPig = new Pig();       //object created here
        Animal myDog = new Dog();       //object created here
        
        myAnimal.animalSound();         //implementation of animalSound
        myPig.animalSound();            //different implementation of animalSound
        myDog.animalSound();            //different implementation of animalSound
        myDog.animalSound();            //different implementation of animalSound
        
    }
    
}
