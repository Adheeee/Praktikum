package Inherit;


public class ClassA {

    @Override
    public String toString() {
        ClassA a = new ClassA();
        return a.getClass().getSimpleName();
    }

}
