package packagesAndEncapsulation.learnPackage;

public class Teacher {
  public  int teachingClass;

  private int id;

         String degree;  //* default or package private */

   protected int studentCount;      // * it will be available in subclasses or in different package subclasses */  

  public static void main(String[] args) {
    Teacher obj =new Teacher();
    obj.teachingClass=101;
    obj.id=123;
    
  

    
  }
}
