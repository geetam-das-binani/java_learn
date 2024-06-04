package packagesAndEncapsulation.package2;

import packagesAndEncapsulation.learnPackage.Teacher;

public class MainPackage2  extends Teacher{
     public static void main(String[] args) {
        Teacher obj =new Teacher();
        obj.teachingClass=11;
        

        MainPackage2 mainPackage2=new MainPackage2();
        mainPackage2.studentCount=100;
        mainPackage2.teachingClass=12;
       
     // !   obj.degree="Mtech"; can't access as it is package private or default modifier

       //! obj.id=12;  can't set as id is private in teacher class 
     }
}
