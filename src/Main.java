import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import DataBase.DataBase;
import Logic.Machine;
import Logic.Machine.*;

public class Main {
    private StringBuilder quantityChocolate = new StringBuilder("35482");

    public static void main(String[] args) {


        System.out.println("enter the number you want");
        System.out.println("Snikers - 1");
        System.out.println("Mars - 2");
        System.out.println("Baunty - 3");
        System.out.println("Alenka - 4");
        System.out.println("SwissChocolate - 5");

        Machine machine = new Machine();
        machine.takeMyMoney();
        machine.returnBase();

    }
}