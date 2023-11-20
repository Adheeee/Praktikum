package Inherit;


public class ClassF extends ClassE {

    @Override
    public String toString() {
        ClassF f = new ClassF();
        return f.getClass().getSimpleName() + " extends " + super.toString();
    }

}
