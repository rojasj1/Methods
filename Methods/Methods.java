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
//Recipe
public class Methods {
    static void Morir_Soñando(String ingredients , String Finale){
        System.out.println(ingredients);//Ingredients and steps
        System.out.println(Finale);//Final step most important step
    }    

    //providing steps in chronological order
    public static void main(String[] args) {
        Morir_Soñando("\nStep 1. Freshly squeeze 2-3 Oranges into a pitcher", "\n");
        Morir_Soñando("\nStep 2. Add 4 TableSpoons of Sugar","\n");
        Morir_Soñando("\nStep 3. 2-3 cans of Canation Evaporated milk","\n");
        Morir_Soñando("\nStep 4. Mix everything in" , "\nStep 5. The most Important step! \n-Pour over a cup of ice and Enjoy!\n");
        
      }
      
} 
 
   