/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cef19
 */
public class MyClass { //Constructor example
    int x;             // Create a class attribute

    public MyClass(){ //constructor created here
      x = 5;          // Set the initial value for the class attribute x
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyClass myObj= new MyClass(); // Create an object of class MyClass (This will call the constructor)
        System.out.println(myObj.x); //Print the value of x, outputs 5
    }
    
}
