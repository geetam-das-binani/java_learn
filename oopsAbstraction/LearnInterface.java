package oopsAbstraction;

public class LearnInterface {
    public static void main(String[] args) {
        // Animal animal = new Animal() ;
        Monkey monkey = new Monkey();
        monkey.eats();
        monkey.sings();
        monkey.drinks();
    }

}

interface Pet {
    void sings();

    void drinks();
}

interface Animal {

    // *in interface we are creating abstract only but all methods are abstract by
    // default and public as well by default */
    void eats();

    void drinks();
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
}