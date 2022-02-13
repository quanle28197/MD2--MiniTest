import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Book b1 = new Book("The Alchemist ", "Paulo Coelho", 100000, 5, 0.7);
        Book b2 = new Book("Rich Dad, Poor Dad", "Robert Kiyosaki", 200000, 3, 0.3);
        Book b3 = new Book("The Power of Now", "Eckhart Tolle", 250000, 3, 0.3);
        Book b4 = new Book("Man’s Search for Meaning", "Viktor E. Frankl", 300000, 3, 0.3);
        Book b5 = new Book("Principles", "Ray Dalio", 450000, 3, 0.3);
        Book[] Books= {b1,b2,b3,b4,b5};
        String[] Name = {b1.name, b2.name, b3.name, b4.name, b5.name};


        int totalQuantity = Methods.getSumQuantity(Books);
        System.out.println("Total number of books available: ");
        System.out.println(totalQuantity + "book");
        double totalWeight = Methods.getSumWeight(Books);
        System.out.println("Total weight of books available");
        System.out.println(totalWeight + "gr");
        int totalPrice = Methods.getSumPrice(Books);
        System.out.println("Total amount to buy all the books");
        System.out.println(totalPrice + "VND");

        String search ;
        System.out.println("Enter a book you want to find");
        do{
            search = scanner.nextLine();
            boolean check = false;
            for (int i = 0; i < Name.length; i++) {
                if (search.equals(Name[i])) {
                    check = true;
                    break;
                }
            }
            if (check) {
                for (int i = 0; i < Name.length; i++) {
                    if (search.equals(Name[i])) {
                        System.out.println(Books[i].toString());
                        System.out.println("Do you want to find more");
                        break;
                    }
                }
            }else {
                System.out.println("Did you enter the wrong book?");
            }
        }while (!search.equals("Exit"));
    }
}
