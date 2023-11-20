package Inherit;

public class ClassB extends ClassA {

    @Override
    public String toString() {

        ClassB b = new ClassB();
        return b.getClass().getSimpleName() + " extends " + super.toString();
    }

}
