package oopsAbstraction;

public class LearnInterface {

  
    public static void main(String[] args) {
        // Animal animal = new Animal() ;
        Monkey monkey = new Monkey();
        monkey.eats();
        monkey.sings();
        monkey.drinks();
        monkey.walks();
        System.out.println(Animal.legs);
    }

}

interface Pet {
    void sings();

    void drinks();
}

interface Animal {

    // * in interface if we create a variable then it is by default
    // * public static final

    public static final int legs = 4;
    // *or
    // * int legs=4;

    // *in interface we are creating abstract only but all methods are abstract by
    // default and public as well by default
    void eats();

    void drinks();

   default  void walks(){  //*default implementaion which can be overwritten */
       System.out.println("Animal walks");
   }

}

class Monkey implements Animal, Pet {
    @Override
    public void eats() {
        System.out.println("Monkey eats banana");

    }

    @Override
    public void sings() {
        System.out.println("Monkey sings");
    }

    @Override
    public void drinks() {
        System.out.println("Monkey drinks water");
    }

    @Override
    public void walks() {  //*default implementaion which is overwriteen here */
        System.out.println("Monkey walks");
    }
}