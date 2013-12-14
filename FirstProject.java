// Class names should be nouns (person, animal, place or thing) and in UpperCamelCase, with the first letter of every word capitalised. Use whole words - avoid acronymns and abbreviations).
// Methods nanes should be verbs (actions, events or statds of being) and in lowerCamelCase or a multi-word that begins with a verb in lowercase, e.g run, runFast, getBackground. 
// Local and instance variables are also written in lowerCamelCase. Variable names should be short yet meaningful. One-character variable names should be avoided except for temporary "throwaway" variables.

public class FirstProject {

   // A class called FirstProject.
   
   /**
    *  @param args
    */

   FirstProject() {
   
   // A constructor method

   // Good for setting intial values to field variables. An object will executed this code first when created.


   // Constructor methods don't have a return type or value.

   }

   public static void main(String[] args){

   // The main constructor method

   // A 'public' method means it can be seen outside the class. 'Static' means that you don't have to create a new object and 'void' means it doesn't return a value (but you can pass data in its parameters).

      Kiwi orange = new Kiwi();
      
      // Create a new object called 'orange' from the Kiwi class.
      
      short aValue = obj1.addNumbers(5);

      System.out.printIn(aValue);
      
      // System.out is the object
      // printIn is a method of the object
      
      String myString = "This is a string";
      int length = myString.length();
      System.out.printIn(length);

   }  
}

public class Kiwi {
   
// A class is like a blueprint. The code sits here until an object is created from it. Then the object can call all the methods within the class that it was created from.

   String globalVariable;
   
   // A variable that is defined in a class (but not in a method) is available to all the methods in a class, this is called global scope.

   private String privateVariable;
   
   // A private variable can only be seen in the class it is contained within.
   

   short addNumbers( short number1) {

   // A method is like a function in PHP. It is only run when it is called upon.
   
   // The return data type is specified at the start of the method. Variables are passed to the method by adding them in between the curly brackets (called parameters).

   // Variables inside a method are only available to that method, this is called local scope.

      short number2 = 5;
      short total = number1 + number2;
      return total;

   }
}

public class MyMethodsExtended extends MyMethods {

   // Subclass

}
    
