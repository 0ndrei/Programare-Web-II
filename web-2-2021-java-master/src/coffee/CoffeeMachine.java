package coffee;

import java.util.Scanner;

public class CoffeeMachine {
    private Boolean pay(Integer banknoteNominal){
        if ( banknoteNominal == 5 || banknoteNominal == 10) {
            return true;
        }
        return false;
    }

    private String choose(Integer option){
        Scanner cm = new Scanner(System.in);

        System.out.print("Please chose option:");
        System.out.println("1.Coffee");
        System.out.println("2.Cappuccino");

        option = cm.nextInt();

       if (option == 1) {
           return "Coffee";
       } else if (option == 2){
           return "Cappuccino";
       }
       return "Incorrect option";
    }

    private void showInfo(String message){
        System.out.println(message);
    }

    private String done(String coffeeType){
        return coffeeType;
    }

    public void prepare(){
        String coffeeType = "";
        this.showInfo("Please insert banknote");
        if(this.pay(10)){
            this.showInfo("Please chose option");
            coffeeType = this.choose(2);
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