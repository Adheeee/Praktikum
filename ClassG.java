package Inherit;


public class ClassG extends ClassF {

    @Override
    public String toString() {
        ClassG g = new ClassG();
        return g.getClass().getSimpleName() + " extends " + super.toString();
    }

}
