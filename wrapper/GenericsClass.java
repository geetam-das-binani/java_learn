package wrapper;

public class GenericsClass {
    public static void main(String[] args) {
        Dog<String, String> d1 = new Dog<String, String>("1", "Tommy");

        // * note on the right hand side expression we can define the data type in
        // diamond brackets or not.It is Optional bu t we should use empty diamond
        // brackets its is must */
        Dog<String, String> d2 = new Dog<>("2", "Tom");

        Dog<Integer, String> d3 = new Dog<>(1, "Tommy");
        System.out.println(d3.getId());


        Run<Boolean, String> run = new Run<>();
        run.sings(true);
        run.Dog("dog is running");

    }
}

class Dog<E, V> {
    E id;
    V name;

    public Dog(E id, V name) {
        this.id = id;
        this.name = name;
    }


    //* E type return  */
    E getId() {
        return id;
    }

}

interface Cat<E> {

    void sings(E val);
}

class Run<E, V> implements Cat<E> {
    @Override
    public void sings(E val) {
        System.out.println("cat is singing" + " " + val);
    }

    public void Dog(V val) {
        System.out.println(val);
    }
}