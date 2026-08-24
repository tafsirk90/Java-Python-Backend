import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        try {
//            int n = sc.nextInt();
//            System.out.println(1/n);
//            for(int i = n; ; i++){
//                System.out.println(i);
//            }
//        }
//        catch(InputMismatchException e){
//            System.out.println("Invalid Input");
//        }
//        catch (ArithmeticException e) {
//            System.out.println("You can't divide by zero!!");
//        }
//        catch (Exception e){
//            //Safety Net
//            System.out.println("Something went wrong!");
//        }
        //| Exception                           | Why does it appear?                                             |
        //| ----------------------------------- | --------------------------------------------------------------- |
        //| **ArithmeticException**             | Division by zero or other illegal arithmetic operation          |
        //| **NullPointerException**            | Trying to use an object/reference that is `null`                |
        //| **ArrayIndexOutOfBoundsException**  | Accessing an array using an invalid index                       |
        //| **StringIndexOutOfBoundsException** | Accessing a string using an invalid index                       |
        //| **NumberFormatException**           | Trying to convert invalid text into a number                    |
        //| **InputMismatchException**          | `Scanner` receives input of the wrong type                      |
        //| **ClassCastException**              | Trying to cast an object to an incompatible type                |
        //| **IllegalArgumentException**        | A method receives an invalid argument                           |
        //| **IllegalStateException**           | A method is called when the object is in an inappropriate state |
        //| **IOException**                     | A general input/output operation fails                          |
        //| **FileNotFoundException**           | Trying to access a file that doesn't exist/can't be opened      |
        //| **SQLException**                    | A database operation fails                                      |
        //| **ClassNotFoundException**          | Java cannot find a requested class                              |
        //| **InterruptedException**            | A running thread is interrupted                                 |
        //| **ConcurrentModificationException** | A collection is modified while being improperly iterated        |
        //| **UnsupportedOperationException**   | Trying to perform an operation that isn't supported             |
        //| **SecurityException**               | A security restriction prevents an operation                    |
        //| **OutOfMemoryError**                | JVM runs out of available memory                                |
        //| **StackOverflowError**              | Stack becomes full, commonly due to infinite recursion          |

        //Custom exception
        try{
            int r = sc.nextInt();
            checkRadius(r);
        }
        catch(InputMismatchException e){
            System.out.println("Invalid Input");
        }
        catch(RadiusException e) {
            System.out.println(e.getMessage());
        }
        catch(Exception e) {
            System.out.println("Smething is wrong "+e);
        }

    }
    public static void checkRadius(int r) throws RadiusException {
        if(r <= 0) {
            throw new RadiusException("Radius must be greater than 0");
        }
        else {
            System.out.println("Area of circle : " + 3.1416*r*r);
        }
    }
}