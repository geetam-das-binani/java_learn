package packagesAndEncapsulation.learnEncapsulation;

import packagesAndEncapsulation.learnPackage.Person;

public class MainEncapsulation {



  static {
    System.out.println("static block 1"); //* this will run at the time of class loading */
  }
  
  static {
    System.out.println("static block 2"); //* this will run at the time of class loading */
  }
  public MainEncapsulation(){
    System.out.println("constructor");
  }
  public static void main(String[] args) {
    System.out.println("from the main method");
    // MainEncapsulation.hello();
    MainEncapsulation mainEncapsulation = new MainEncapsulation();
    Person person = new Person();
    System.out.println(person.count);

    person.setAge(12);
    System.out.println(person.getAge());
    person.count = 50;

    System.out.println(Person.count);
    // * static propery can be accessed via class directly */

  }

  public static void hello() {
    System.out.println("hello");
  }

}
