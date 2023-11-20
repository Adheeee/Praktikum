package Inherit;


public class ClassH extends ClassG {

    @Override
    public String toString() {
        ClassH h = new ClassH();
        return h.getClass().getSimpleName() + " extends " + super.toString();
    }

}
