import java.util.Scanner;

public class FoodOrder {

    Scanner scan = new Scanner(System.in);
    //MENU ITEM PRICES
    double frenchFries = 2.00;
    double hamburger = 5.00;
    double chickenSandwich = 4.50;
    double blackBeanBurder = 5.50;
    double salad = 6.00;
    double pizza = 7.00;
    double fountainDrink = 2.25;
    double coffee = 1.75;
    int option;
    double quanity;
    static double total;
    String more;

    //DISPLAY MENU
    public void displayMenu(){
        System.out.println("***************Welcome to JayA Dinner*************");
        System.out.println("===================================================");
        System.out.println("*****************MENU ITEMS BELOW******************");
        System.out.println("             1. French Fries...........2.00        ");
        System.out.println("             2. Hamburger..............5.00        ");
        System.out.println("             3. Chicken Sandwich.......4.50        ");
        System.out.println("             4. BlackBean Burger.......5.50        ");
        System.out.println("             5. Salad..................6.00        ");
        System.out.println("             6. Pizza..................7.00        ");
        System.out.println("             7. Fountain Drink.........2.25        ");
        System.out.println("             8. Coffee.................1.77        ");
        System.out.println("             9. Exit.......................        ");
        System.out.println("===================================================");
        System.out.println("");
        System.out.println("*************What would you like to order today?****");
    }
    //GENERATE BILL
    public void generateBill(){
        System.out.println();
        System.out.println("*************THANK YOU FOR ORDERING WITH US**********");
        System.out.println("Your Total for today is: " + total + " *****************");


    }


    //ORDER FOOD ITEMS
    public void order(){
        while(true){
            System.out.println("Please enter your food option");
        option = scan.nextInt();
        switch(option){
            case 1:
                System.err.println("You Selected French Fries");
                System.out.println();
                System.out.println("Please enter your quanity: ");
                quanity = scan.nextInt();
                total = total + (quanity * frenchFries);
                break;
            case 2:
                System.out.println("You Selected Hamburger");
                System.out.println();
                System.out.println("Please enter your quanity: ");
                quanity = scan.nextInt();
                total = total + (quanity * hamburger);
                break;
            case 3:
                System.out.println("You Selected Chicken Sandwich");
                System.out.println();
                System.out.println("Please enter your quanity: ");
                quanity = scan.nextInt();
                total = total + (quanity * chickenSandwich);
                break;
            case 4:
                System.out.println("You Selected Blackbean Burger");
                System.out.println();
                System.out.println("Please enter your quanity: ");
                quanity = scan.nextInt();
                total = total + (quanity * blackBeanBurder);
                break;
            case 5:
                System.out.println("You Selected Salad");
                System.out.println();
                System.out.println("Please enter your quanity: ");
                quanity = scan.nextInt();
                total = total + (quanity * salad);
                break;
            case 6:
                System.out.println("You Selected Pizza");
                System.out.println();
                System.out.println("Please enter your quanity: ");
                quanity = scan.nextInt();
                total = total + (quanity * pizza);
                break;
            case 7:
                System.out.println("You Selected Fountain Drink");
                System.out.println();
                System.out.println("Please enter your quanity: ");
                quanity = scan.nextInt();
                total = total + (quanity * fountainDrink);
                break;
            case 8:
                System.out.println("You Selected Coffee");
                System.out.println();
                System.out.println("Please enter your quanity: ");
                quanity = scan.nextInt();
                total = total + (quanity * coffee);
                break;
            case 9:
                System.exit(1);
                break;

                default: break;
        }
        System.out.println();
        System.out.println("Would you like anything else? (y/n)");
        more = scan.next();
        if(more.equalsIgnoreCase("y")){
            order();
        } else if(more.equalsIgnoreCase("n")){
            generateBill();
            System.exit(1);
        } else{
            System.out.println("Invalid Choice");
        }
    }
}
}
