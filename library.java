import java.util.Scanner;

public class library {
    static int javaBook = 10;
    static int dataStructures = 8;
    static int machineLearning = 5;
    static int dataScience = 4;
    static int softEngineering = 2;
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        int choice = 0;
        printMenu();

        while (choice != 4) {
            
           
            System.out.print("\nEnter you choice: ");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    bookList();
                    break;

                case 2:
                    borrowBook(scan);
                    break;
                
                case 3:
                    returnBook(scan);
                    break;
                
                case 4:
                    System.out.println("Exiting the system. Thank you for using our service!");
                    break;
                default:
                    System.out.println("Invalid choice. Please kindly write an appropriate number!");
                    break;
            }
        }
        }

    static void printMenu(){
        System.out.println("Welcome to the Library Management System!");
        System.out.println("1. Display available book");
        System.out.println("2. Borrow a book");
        System.out.println("3. Return a book");
        System.out.println("4. Exit");
    }

    static void bookList(){

        System.out.println("Java Programming: " + javaBook);
        System.out.println("Data Structures and Algorithms: " + dataStructures);
        System.out.println("Introduction to Machine Learning: " + machineLearning);
        System.out.println("Data Science: " + dataScience);
        System.out.println("Software Engineering: " + softEngineering);
    }

    static void borrowBook(Scanner scan){
        System.out.println("Select the book you want to borrow:");
        System.out.println("1. Java Programming");
        System.out.println("2. Data Structures and Algorithms");
        System.out.println("3. Introduction to Machine Learning");
        System.out.println("4. Data Science");
        System.out.println("5. Software Engineering");

        int bookChoice = scan.nextInt();

        switch (bookChoice) {
            case 1:

            if (javaBook > 0) {
                System.out.println("You borrowed Java Programming");
                javaBook--;
                
            } else{
                System.out.println("Java Programming isn't available.");
            }
                
                break;

            case 2:

            if (dataStructures > 0) {
                System.out.println("You borrowed Data Structures and Algorithms.");
                dataStructures--;
                
            } else{
                System.out.println("Data Structures and Algorithms isn't available.");
            }
                
                break;
                
            case 3:

            if (machineLearning > 0) {
                System.out.println("You borrowed Introduction to Machine Learning.");
                machineLearning--;
                
            } else{
                System.out.println("Introduction to Machine learning isn't available.");
            }
                
                break;
                
            case 4:

            if (dataScience > 0) {
                System.out.println("You borrowed Data Science.");
                dataScience--;
                
            } else{
                System.out.println("Data Science isn't available.");
            }
                
                break;

            case 5:

            if (softEngineering > 0) {
                System.out.println("You borrowed Software Engineering.");
                softEngineering--;
                
            } else{
                System.out.println("Software Engineering isn't available.");
            }
                
                break;
            default:
            System.out.println("Wrong input. Please try again!");
                break;
        }

    }

    static void returnBook(Scanner scan){
        System.out.println("Select the book you want to return:");
        System.out.println("1. Java Programming");
        System.out.println("2. Data Structures and Algorithms");
        System.out.println("3. Introduction to Machine Learning");
        System.out.println("4. Data Science");
        System.out.println("5. Software Engineering");

        int bookChoice = scan.nextInt();

        switch (bookChoice) {
            case 1:

            javaBook++;
            
            System.out.println("You returned Java Programming");    
                break;

            case 2:

            dataStructures++;
            System.out.println("You returned Data Structures and Algorithms.");
                
                break;
                
            case 3:


                System.out.println("You returned Introduction to Machine Learning.");
                machineLearning++;
         
                break;
                
            case 4:

                System.out.println("You returned Data Science.");
                dataScience++;
                
        
                break;

            case 5:

                System.out.println("You returned Software Engineering.");
                softEngineering++;
        
                
                break;
            default:
            System.out.println("Wrong input. Please try again!");
                break;
        }
    }
}
