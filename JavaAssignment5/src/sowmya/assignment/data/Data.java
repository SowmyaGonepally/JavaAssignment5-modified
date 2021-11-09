package sowmya.assignment.data;

public class Data {
    int value;
    char letter;

    public void printGlobalData()
    {
        System.out.println("value is "+value);
        System.out.println("letter is "+letter);
    }
    public void printLocalData()
    {
        /*

        int marks;
        char grade;

       */

        //Local variables do not take default values.
        //They must be initialized.
        //Writing the following will work
        int marks=20;
        char grade='A';

        System.out.println("marks is "+marks);
        System.out.println("grade is "+grade);

    }
}
