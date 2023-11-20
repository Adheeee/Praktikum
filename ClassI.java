package Inherit;


public class ClassI extends ClassH {

    @Override
    public String toString() {
        ClassI i = new ClassI();
        return i.getClass().getSimpleName() + " extends " + super.toString();
    }

}
