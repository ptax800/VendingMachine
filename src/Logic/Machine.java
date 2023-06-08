package Logic;

import DataBase.DataBase;

import java.util.Scanner;

public class Machine {
    Scanner console = new Scanner(System.in);
    int keyboard = console.nextInt();
    DataBase dataBase = new DataBase();
    StringBuilder quantity = dataBase.readBase();

    int quantitySnikers = Integer.parseInt(quantity.substring(0, 1));
    int quantityMars = Integer.parseInt(quantity.substring(1, 2));
    int quantityBaunty = Integer.parseInt(quantity.substring(2, 3));
    int quantityAlenka = Integer.parseInt(quantity.substring(3, 4));
    int quantitySwissChocolate = Integer.parseInt(quantity.substring(4, 5));

    public int getChocolate() {


        if (quantitySnikers <= 0) {

        }

        switch (keyboard) {
            case 1 -> {
                if (quantitySnikers <= 0) {
                    System.out.println("this item is out of stock. choose another chocolate");
                    return 0;
                }
                System.out.println("you have chosen Snickers deposit 300 rubles");
                quantitySnikers--;
                return 300;
            }
            case 2 -> {
                if (quantityMars <= 0) {
                    System.out.println("this item is out of stock. choose another chocolate");
                    return 0;
                }
                System.out.println("you have chosen Mars deposit  270 rubles");
                quantityMars--;
                return 270;
            }
            case 3 -> {
                if (quantityBaunty <= 0) {
                    System.out.println("this item is out of stock. choose another chocolate");
                    quantityBaunty--;
                    return 0;
                }
                System.out.println("you have chosen Baunty deposit  400 rubles");
                return 400;
            }
            case 4 -> {
                if (quantityAlenka <= 0) {
                    System.out.println("this item is out of stock. choose another chocolate");
                    return 0;
                }

                quantityAlenka--;
                System.out.println("you have chosen Alenka deposit  135 rubles");
                return 135;
            }
            case 5 -> {
                if (quantitySwissChocolate <= 0) {
                    System.out.println("this item is out of stock. choose another chocolate");
                    return 0;
                }
                System.out.println("you have chosen SwissChocolate deposit  700 rubles");
                quantitySwissChocolate--;
                return 700;
            }
            default -> {
                System.out.println("you entered an invalid value. please select again");
                return 0;
            }
        }
    }

    public void takeMyMoney() {

        int moneyOfChocolate = getChocolate();

        while (true) {
            if (console.nextInt() >= moneyOfChocolate) {
                System.out.println("Take your chocolate");
                break;
            } else {
                console.nextInt();
                System.out.println("deposit more money");
            }
        }
    }
    public String returnBase(){
        String str = String.valueOf(quantitySnikers) + String.valueOf(quantityMars) +
                String.valueOf(quantityBaunty) + String.valueOf(quantityAlenka) +
                String.valueOf(quantitySwissChocolate);
        return str;
    }
}
