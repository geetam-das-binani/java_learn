package packagesAndEncapsulation.learnPackage;

public class Person {

  private int age;
  private String name;

  public static int count = 12;
  boolean canbeChanged = true;

  boolean canBeAccessed = false;

  public void setAge(int age) { // *setter methods
    if (canbeChanged && age > 0)
      this.age = age;

  }

  public int getAge() { // * getter method
    if (canBeAccessed)
      return this.age;

    return -1;

  }

  
}
