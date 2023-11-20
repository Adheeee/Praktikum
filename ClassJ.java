package Inherit;


public class ClassJ extends ClassI{

    @Override
    public String toString() {
        ClassJ j = new ClassJ();
        return j.getClass().getSimpleName() + " extends " + super.toString();
    }

}
