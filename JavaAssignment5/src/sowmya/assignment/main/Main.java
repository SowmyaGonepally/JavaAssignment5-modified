package sowmya.assignment.main;

import sowmya.assignment.data.Data;
import sowmya.assignment.singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        Data data=new Data();
        data.printGlobalData();
        data.printLocalData();

        Singleton singleton=Singleton.initializeSingle("Singleton");
        singleton.printSingle();
    }
}
