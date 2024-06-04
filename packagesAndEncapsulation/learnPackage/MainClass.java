package packagesAndEncapsulation.learnPackage;
import packagesAndEncapsulation.learnEncapsulation.MainEncapsulation;;

//* import statement  should always come after package and before class ----------------->

// import java.util.*;


public class MainClass {
    public static void main(String[] args) {
        MainEncapsulation.hello(); //* static public method can be accessed directly without creating an instance */
        // Scanner sc=new Scanner(System.in);
       Teacher obj =new Teacher();
       obj.teachingClass=101;
       obj.degree="btech";
      
       
    //    obj.id=123; //* can't set as id is private in teacher class */

    }

 
   
}
