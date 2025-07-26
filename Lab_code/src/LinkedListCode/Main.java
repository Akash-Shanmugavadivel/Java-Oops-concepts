import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        LinkedList list1 = new LinkedList();
        Scanner sc = new Scanner(System.in);
        int choice, data, pos, val;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add element to the list");
            System.out.println("2. Insert element at the beginning");
            System.out.println("3. Insert element at a specific position");
            System.out.println("4. Insert element after a specific node");
            System.out.println("5. Insert element before a specific node");
            System.out.println("6. Delete the last node");
            System.out.println("7. Delete the first node");
            System.out.println("8. Delete node at a specific position");
            System.out.println("9. Delete node by value");
            System.out.println("10. Search by value");
            System.out.println("11. Access element by position");
            System.out.println("12. Reverse the list");
            System.out.println("13. Get the length of the list");
            System.out.println("14. Count occurrences of a value");
            System.out.println("15. Sort the list");
            System.out.println("16. Concatenate another list");
            System.out.println("17. Display the list");
            System.out.println("18. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to add: ");
                    data = sc.nextInt();
                    list.add(data);
                    break;

                case 2:
                    System.out.print("Enter element to insert at the beginning: ");
                    data = sc.nextInt();
                    list.insertAtBeg(data);
                    break;

                case 3:
                    System.out.print("Enter position to insert at: ");
                    pos = sc.nextInt();
                    System.out.print("Enter element to insert: ");
                    data = sc.nextInt();
                    list.insertAtSpecPos(pos, data);
                    break;

                case 4:
                    System.out.print("Enter value after which to insert: ");
                    val = sc.nextInt();
                    System.out.print("Enter element to insert: ");
                    data = sc.nextInt();
                    list.insertAftNode(val, data);
                    break;

                case 5:
                    System.out.print("Enter value before which to insert: ");
                    val = sc.nextInt();
                    System.out.print("Enter element to insert: ");
                    data = sc.nextInt();
                    list.insertBefNode(val, data);
                    break;

                case 6:
                    list.deleteLastNode();
                    break;

                case 7:
                    list.deleteAtBeg();
                    break;

                case 8:
                    System.out.print("Enter position to delete: ");
                    pos = sc.nextInt();
                    list.deleteAtpos(pos);
                    break;

                case 9:
                    System.out.print("Enter value to delete: ");
                    val = sc.nextInt();
                    list.deleteByValue(val);
                    break;

                case 10:
                    System.out.print("Enter value to search: ");
                    val = sc.nextInt();
                    list.searchByVal(val);
                    break;

                case 11:
                    System.out.print("Enter position to access: ");
                    pos = sc.nextInt();
                    list.AccessEleByPos(pos);
                    break;

                case 12:
                    list.reverse();
                    break;

                case 13:
                    list.length();
                    break;

                case 14:
                    System.out.print("Enter value to count occurrences: ");
                    val = sc.nextInt();
                    list.countOcc(val);
                    break;

                case 15:
                    list.sort();
                    break;

                case 16:
                    System.out.println("Creating another list...");
                    list1.add(10);
                    list1.add(20);
                    list1.add(30);
                    list1.add(40);
                    System.out.println("Second list created.");
                    list.concatenate(list1);
                    break;

                case 17:
                    list.display();
                    break;

                case 18:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 18);

        sc.close();
    }
}
