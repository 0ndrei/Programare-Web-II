package coffee;

import java.util.Scanner;

public class CoffeeMachine {
    private Boolean pay(Integer banknoteNominal) {
        Scanner bN = new Scanner(System.in);

        System.out.print("Insert the banknote:\n");
        System.out.println("5 euro");
        System.out.println("10 euro");

        banknoteNominal = bN.nextInt();

        if (banknoteNominal == 5 || banknoteNominal == 10) {
            return true;
        }
        return false;
    }

    private String choose(Integer option) {
        Scanner op = new Scanner(System.in);

        System.out.print("Please chose option:\n");
        System.out.println("1.Coffee");
        System.out.println("2.Cappuccino");

        option = op.nextInt();

        if (option == 1) {
            return "Coffee";
        } else if (option == 2) {
            return "Cappuccino";
        }
        return "Incorrect option";
    }

    private String milk(Integer milkoption) {
        Scanner mop = new Scanner(System.in);

        System.out.print("You want milk?\n");
        System.out.println("1.Yes");
        System.out.println("2.No");

        milkoption = mop.nextInt();

        if (milkoption == 1) {
            return "Yes";
        } else if (milkoption == 2) {
            return "No";
        }
        return "Incorrect option";
    }

    private void showInfo(String message) {
        System.out.println(message);
    }

    private String done(String coffeeType) {
        return coffeeType;
    }

    public void prepare() {
        String coffeeType = "";
        String milk = "";
        if (this.pay(10)) {
            coffeeType = this.choose(2);
            milk = this.milk(2);
            this.showInfo(
                    "You choose is: " + coffeeType
            );
            this.showInfo("Preparing...");
            this.showInfo(
                    "Done: " + this.done(coffeeType)
            );
        } else {
            this.showInfo("Please insert correct banknote");
        }
    }
}