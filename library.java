import java.util.Scanner;

public class library {
    public static void main(String[] args) {
        printMenu();
        Scanner scan = new Scanner(System.in);
        int choice = 0;


        while (choice != 4) {
            
            
            System.out.print("Enter you choice: ");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    bookList();
                    break;

                case 2:
                    
                    break;
                
                case 3:
                    
                    break;
                
                case 4:
                    
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
        int javaBook = 10;
        int dataStructures = 8;
        int machineLearning = 5;
        int dataScience = 4;
        int softEngineering = 2;
        System.out.println("Java Programming: " + javaBook);
        System.out.println("Data Structures and Algorithms: " + dataStructures);
        System.out.println("Introduction to Machine Learning: " + machineLearning);
        System.out.println("Data Science: " + dataScience);
        System.out.println("Software Engineering: " + softEngineering);
    }
}
