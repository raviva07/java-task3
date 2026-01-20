import java.util.Scanner;

public class BookManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("\n1.Add Book\n2.Replace Book\n3.Display Books\n4.Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Title: ");
                    String title = sc.nextLine();
                    System.out.print("Author: ");
                    String author = sc.nextLine();

                    library.addBook(new Book(id, title, author, true));
                    break;

                case 2:
                    System.out.print("Enter Book ID to replace: ");
                    int rid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("New Title: ");
                    String nt = sc.nextLine();
                    System.out.print("New Author: ");
                    String na = sc.nextLine();

                    library.replaceBook(rid, nt, na);
                    break;

                case 3:
                    library.displayBooks();
                    break;

                case 4:
                    System.out.println("Thank you!");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
