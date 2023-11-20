package Inherit;


public class ClassC extends ClassB{

    @Override
    public String toString() {
        ClassC c = new ClassC();
        return c.getClass().getSimpleName() + " extends " + super.toString();
    }

}
