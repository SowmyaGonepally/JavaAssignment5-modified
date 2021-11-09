package sowmya.assignment.singleton;

public class Singleton {
     String single;
    static Singleton singleton=new Singleton();

    public static Singleton initializeSingle(String single)
    {
        singleton.single=single;


        /*

        this.single=single;

        */

        //The keyword 'this' refers to instance of a class. It is a non-static keyword.
         //Non-static variables cannot be referenced from a static block or method.
         //Removing static keyword for the method initializeSingle will work.

        return singleton;
    }
    public void printSingle()
    {
        System.out.println(single);
    }
}
