package oopsPolyMorphism;

//**  / polymorphism is the ability of an object to take many forms.
//**poly means many
//**morph means forms
class Data {
    int data;

    public void printData() {
        System.out.println(data);
    }

    public void printData(int times) {
        for (int i = 0; i < times; i++) {
            data++;
            System.out.println(data);
        }
    }
}

class ChildData extends Data {

    // * method overriding is called runtime polymorphism */
    @Override
    public void printData() {
        System.out.println("method overridden" + " " + data);
    }
}

public class LearnPolyMorphism {
    public static void main(String[] args) {
        Data d = new ChildData();
        d.printData(); // *method overriding is called runtime polymorphism
        
        Data d2 = new Data();
        
        d.printData(5); //*method overriding is called runtime polymorphism
        d2.printData(5); // *complile time polymorphism also knows as method overloading */

    }
}
