import java.util.Scanner;

class Mini_Project {
    public static void Menu() {
        System.out.println("-------- Menu --------");
        System.out.println("     1. Calculator");
        System.out.println("     2. ATM");
        System.out.println("     3. Exit");
        Menu_Calling();
    }

    public static void Menu_Calling() {
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------------------------");
        System.out.print("Please choose key : ");
        int m = sc.nextInt();
        switch (m) {
            case 1: {
                Calculator_Menu();
            }
                break;
            case 2: {
                pinCheck();
            }
                break;
            case 3: {
                exit();
            }
        }
    }

    // ========================================================================Calculator
    public static void Calculator_Menu() {
        System.out.println("----------------------------------------");
        System.out.println("!!!!!!!!!!!!!! Calculator !!!!!!!!!!!!!!");
        System.out.println("----------------------------------------");
        System.out.println("          1. Add");
        System.out.println("          2. Sub");
        System.out.println("          3. Mul");
        System.out.println("          4. Div");
        System.out.println("          5. Exit");
        Calculator_Menu_Calling();
    }

    public static void Calculator_Menu_Calling() {
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------------------------");
        System.out.print("Please choose key : ");
        int c = sc.nextInt();
        switch (c) {
            case 1: {
                Add();
            }
                break;
            case 2: {
                Sub();
            }
                break;
            case 3: {
                Mul();
            }
                break;
            case 4: {
                Div();
            }
                break;
            case 5: {
                Menu();
            }
        }
    }

    public static void Add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------------------------");
        System.out.print("Enter 1st - number : ");
        int number_one = sc.nextInt();
        System.out.print("Enter 2nd - number : ");
        int number_two = sc.nextInt();
        long add = number_one + number_two;
        System.out.println("----------------------------------------");
        System.out.println("Addition : " + add);
        Calculator_Menu();
    }

    public static void Sub() {
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------------------------");
        System.out.print("Enter 1st - number : ");
        int number_one = sc.nextInt();
        System.out.print("Enter 2nd - number : ");
        int number_two = sc.nextInt();
        long sub = number_one - number_two;
        System.out.println("----------------------------------------");
        System.out.println("Subtraction : " + sub);
        Calculator_Menu();
    }

    public static void Mul() {
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------------------------");
        System.out.print("Enter 1st - number : ");
        int number_one = sc.nextInt();
        System.out.print("Enter 2nd - number : ");
        int number_two = sc.nextInt();
        long mul = number_one * number_two;
        System.out.println("----------------------------------------");
        System.out.println("Multiplication : " + mul);
        Calculator_Menu();
    }

    public static void Div() {
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------------------------");
        System.out.print("Enter 1st - number : ");
        int number_one = sc.nextInt();
        System.out.print("Enter 2nd - number : ");
        int number_two = sc.nextInt();
        long div = number_one / number_two;
        System.out.println("----------------------------------------");
        System.out.println("Division : " + div);
        Calculator_Menu();
    }

    // ========================================================================ATM
    public static void pinCheck() {
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------------------------");
        System.out.println("!!!!!!!!!!!!!!! Wellcome !!!!!!!!!!!!!!!");
        System.out.println("----------------------------------------");
        System.out.print("Enter Your ATM Pin : ");
        int pin;
        pin = sc.nextInt();
        if (pin == 1234) {
            System.out.println("----------------------------------------");
            System.out.println("            Go to Banking");
            System.out.println("----------------------------------------");
            ATM_Menu();
        } else {
            System.out.println("----------------------------------------");
            System.out.println("Your pin is incorrect");
            System.out.println("Please inter pin = **** ");
            System.out.print("Re - Enter Your Pin : ");
            pin = sc.nextInt();
            if (pin == 1234) {
                System.out.println("----------------------------------------");
                System.out.println("            Go to Banking");
                System.out.println("----------------------------------------");
                ATM_Menu();
            }
        }
    }

    public static void ATM_Menu() {
        System.out.println("          1. Withdraw");
        System.out.println("          2. Deposit");
        System.out.println("          3. Check balance");
        System.out.println("          4. Exit");
        ATM_Menu_Calling();
    }

    public static void ATM_Menu_Calling() {
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------------------------");
        System.out.print("Please choose key : ");
        int a = sc.nextInt();
        switch (a) {
            case 1: {
                Withdraw();
            }
                break;
            case 2: {
                Deposit();
            }
                break;
            case 3: {
                Check_balance();
            }
                break;
            case 4: {
                Menu();
            }
        }
    }

    static long Balance = 100000;

    public static long Withdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------------------------");
        System.out.println("          Withdrawn section");
        System.out.println("----------------------------------------");
        System.out.print("Please Enter the withdraw Amount : ");
        long w = sc.nextLong();
        System.out.println("----------------------------------------");
        System.out.println("Please collect your money and collect the card");
        System.out.println("Current Balence : " + (Balance - w));
        System.out.println("----------------------------------------");
        ATM_Menu();
        return Balance - w;
    }

    public static void Deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------------------------");
        System.out.println("          Depositing section");
        System.out.println("----------------------------------------");
        System.out.print("Please Enter the Depositing Amount : ");
        long d = sc.nextLong();
        System.out.println("----------------------------------------");
        System.out.println("Your Money has been successfully deposited");
        System.out.println("Current Balence : " + (Balance + d));
        System.out.println("----------------------------------------");
        ATM_Menu();
    }

    public static void Check_balance() {
        long CurrentBalence = Balance;
        System.out.println("----------------------------------------");
        System.out.println("Current Balence : " + CurrentBalence);
        System.out.println("----------------------------------------");
        ATM_Menu();
    }

    // ========================================================================Exit
    public static void exit() {
        System.out.println("----------------------------------------");
        System.out.println("         Thank you for vigit");
        System.out.println("----------------------------------------");
        System.exit(0);
    }

    public static void main(String[] args) {
        Menu();
    }
}