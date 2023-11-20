package Inherit;


public class ClassE extends ClassD{

    @Override
    public String toString() {
       ClassE e = new ClassE();
        return e.getClass().getSimpleName() + " extends " + super.toString();
    }

}
