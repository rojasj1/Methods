/* Justin Rojas */
/* Format definition: Method */
/* A method is a block of code which only runs when it is called.
You can pass data, known as parameters, into a method.
Methods are used to perform certain actions, and they are also known as functions.
Why use methods? To reuse code: define the code once, and use it many times. In the following we will be creating different methods
to verify our Output.

1. Declare a method within a class
2. Call the method
3. Formulate
4. Execute
*/
/*
Mathematical Equations
The system will perform mathemtical equtions and run & execute the equations
*/

public class Calculate {
    static int Operations (int a) {
      return 25 * a + (50 - 4);
    }
  
    public static void main(String[] args) {
      System.out.println(Operations(125));
    }
  }
  // End Result = 3,171 , Reason = 25 * 125 + (50-4)