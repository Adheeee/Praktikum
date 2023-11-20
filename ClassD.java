package Inherit;


public class ClassD extends ClassC {

    @Override
    public String toString() {
        ClassD d = new ClassD();
        return d.getClass().getSimpleName() + " extends " + super.toString();
        
    }

}
