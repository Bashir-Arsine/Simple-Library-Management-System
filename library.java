// Importing scanner to read user input
import java.util.Scanner;

public class library {
    // intializing variables for storign quantitiy of available books
    static int javaBook = 10;
    static int dataStructures = 8;
    static int machineLearning = 5;
    static int dataScience = 4;
    static int softEngineering = 2;
    public static void main(String[] args) {
        //initializing the scanner
        Scanner scan = new Scanner(System.in);
        //initilaizing variable choice/ this variable will be used in the loop and switch statement
        int choice =0;

        //creating a loop to continuously prompt user for action
        while (choice != 4) {
            
            //invoking the printMenu method
            printMenu();

            //prompting user for action
            System.out.print("\nEnter you choice: ");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                //case 1 invokes the bookList method
                    bookList(scan);
                    break;

                case 2:
                //case 2 invokes teh borrowBook method
                    borrowBook(scan);
                    break;
                
                case 3:
                //case 3 invokes teh returnBook method
                    returnBook(scan);
                    break;
                
                case 4:
                //Case 4 simply ends the program with a message
                    System.out.println("Exiting the system. Thank you for using our service!");
                    break;
                default:
                //In case user enters an invalid input
                    System.out.println("Invalid choice. Please kindly write an appropriate number!");
                    break;
            
            }
        }
        }
    //printMenu method shows the list of actions the user can perform once the profram starts
    static void printMenu(){
        System.out.println("Welcome to the Library Management System!");
        System.out.println("1. Display available book");
        System.out.println("2. Borrow a book");
        System.out.println("3. Return a book");
        System.out.println("4. Exit");
    }
    // bookList method shows available books with their quantity
    static void bookList(Scanner scan){
        System.out.println("Available Books: ");
        System.out.println("Java Programming (Quantity: " + javaBook+")");
        System.out.println("Data Structures and Algorithms (Quantity: " + dataStructures+ ")");
        System.out.println("Introduction to Machine Learning (Quantity: " + machineLearning+")");
        System.out.println("Data Science (Quantity: " + dataScience+")");
        System.out.println("Software Engineering (Quantity: " + softEngineering+")");
        System.out.println("\nType in any number to return to main menu: \n");
        //No conditionals are used because the scanner is used here just to create a gap between 
        //this and the main menu
        //If this is not used, the main menu will be printed directly after this which might be a bit confusing and unefficient
        int sentinel = scan.nextInt();
    }
    //borrowBook method prints the book list and updates the quantity of the borrowed book
    static void borrowBook(Scanner scan){
        System.out.println("Select the book you want to borrow:");
        System.out.println("1. Java Programming");
        System.out.println("2. Data Structures and Algorithms");
        System.out.println("3. Introduction to Machine Learning");
        System.out.println("4. Data Science");
        System.out.println("5. Software Engineering\n");

        int bookChoice = scan.nextInt();

        switch (bookChoice) {
            case 1:
            //case 1 confirms that java programming is borrowed and updates its quantity.

            if (javaBook > 0) {
                System.out.println("You borrowed Java Programming");
                javaBook--;
                
            }
            //If the book wasn't available the following message will be printed. 
            else{
                System.out.println("Java Programming isn't available.");
            }
                
                break;

            case 2:
            //case 2 confirms that Data Structures and Algorithms is borrowed and updates its quantity.
            if (dataStructures > 0) {
                System.out.println("You borrowed Data Structures and Algorithms.");
                dataStructures--;
                
            } 
            //If the book wasn't available the following message will be printed. 
            else{
                System.out.println("Data Structures and Algorithms isn't available.");
            }
                
                break;
                
            case 3:
            //case 2 confirms that Data Introduction to Machine Learning is borrowed and updates its quantity.
            if (machineLearning > 0) {
                System.out.println("You borrowed Introduction to Machine Learning.");
                machineLearning--;
                
            } 
            //If the book wasn't available the following message will be printed. 
            else{
                System.out.println("Introduction to Machine learning isn't available.");
            }
                
                break;
                
            case 4:
            //case 2 confirms that Data Science is borrowed and updates its quantity.
            if (dataScience > 0) {
                System.out.println("You borrowed Data Science.");
                dataScience--;
                
            } 
            //If the book wasn't available the following message will be printed. 
            else{
                System.out.println("Data Science isn't available.");
            }
                
                break;

            case 5:
            //case 2 confirms that Software Engineering is borrowed and updates its quantity.
            if (softEngineering > 0) {
                System.out.println("You borrowed Software Engineering.");
                softEngineering--;
                
            } 
            //If the book wasn't available the following message will be printed. 
            else{
                System.out.println("Software Engineering isn't available.");
            }
                
                break;
            //in case the input is wrong
            default:
            System.out.println("Wrong input. Please try again!");
                break;
        }

    }
    //This method confirms book returns and updates the quantitiy
    static void returnBook(Scanner scan){
        System.out.println("Select the book you want to return:");
        System.out.println("1. Java Programming");
        System.out.println("2. Data Structures and Algorithms");
        System.out.println("3. Introduction to Machine Learning");
        System.out.println("4. Data Science");
        System.out.println("5. Software Engineering\n");

        int bookChoice = scan.nextInt();

        switch (bookChoice) {
            case 1:
            //confirms and changes quantity for Java programming
            javaBook++;
            
            System.out.println("You returned Java Programming");    
                break;

            case 2:
            //confirms and changes quantity for Data Structure and Algorithms
            dataStructures++;
            System.out.println("You returned Data Structures and Algorithms.");
                
                break;
                
            case 3:
            //confirms and changes quantity for Introduction to Machine Learning

                System.out.println("You returned Introduction to Machine Learning.");
                machineLearning++;
         
                break;
                
            case 4:
            //confirms and changes quantity for Data Science
                System.out.println("You returned Data Science.");
                dataScience++;
                
        
                break;

            case 5:
            //confirms and changes quantity for Software Engineering
                System.out.println("You returned Software Engineering.");
                softEngineering++;
        
                
                break;
            //in case the user enters wrong input
            default:
            System.out.println("Wrong input. Please try again!");
                break;
        }
    }
}
