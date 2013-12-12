public class FirstProject {

   // A class called FirstProject.

   FirstProject() {
   
   // A constructor method

   // Good for setting intial values to field variables.
   // An object will executed this code first when 
   // created.


   // Constructor methods don't have a return type or 
   // value.

   }

   public static void main(String[] args){

   // The main constructor method

   // Public method can be seen outside the class.
   // Static means that you don't have to create a
   // new object.
   // Void means it doesn't return a value.

      MyMethod obj1 = new MyMethod();
      
      short aValue = obj1.addNumbers(5);

      System.out.printIn("My first project");

   }  
}

public class MyMethods {
   
   // A class is like a blueprint.
   // The code sits here until an created from it
   // uses its methods.

   String globalVar;
   // A variable defined in a class (but not in a method)
   // is available to all the methods in a class, this
   // is called global scope.

   private String privateVar;
   // A private variable can only be seen in the class
   // it is contained in.

   short addNumbers( short number1) {

   // A method is like a function in PHP.

   // The return data type is specified at the start
   // of the method.
   // Variables are passed to the method in the curly
   // brackets.

   // Variables inside a method are only available
   // inside of that method, this is called local
   // scope.

      short number2 = 5;
      short total = number1 + number2;
      return total;

   }
}

public class MyMethodsExtended extends MyMethods {

   // Subclass

}
    
