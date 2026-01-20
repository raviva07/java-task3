import java.util.Scanner;

public class DriverMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Employee ID: ");
        int eid = sc.nextInt();
        sc.nextLine();
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Monthly Salary: ");
        double sal = sc.nextDouble();

        Employee emp = new Employee(eid, name, sal);
        System.out.println("Yearly Income Tax: " + emp.calcTax());

        System.out.print("\nProduct ID: ");
        int pid = sc.nextInt();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity: ");
        int qty = sc.nextInt();

        Product prod = new Product(pid, price, qty);
        System.out.println("Sales Tax per Unit: " + prod.calcTax());
    }
}
