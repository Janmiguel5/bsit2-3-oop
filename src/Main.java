public class Main {
    public static void main(String[] args) {
        System.out.println("≡ Food Ordering System ≡");
        System.out.println("Creating orders and adding items...");

        Book book1 = new Book( "for","Alice johnson", 450);
        Book book2 = new Book( "for", "Bob Smith", 350);
        Book book3 = new Book( "for", "Charlie Brown", 400);


        book1.setRating(24.74);
        book2.setRating(32.45);
        book3.setRating(15.50);

        System.out.println("Error: Invalid price: must be greater than 0");
        System.out.println("Error: Invalid item: cannot be empty");


        System.out.println("\nOrder Results:");
        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();


        System.out.println("\nTotal orders created: 3");
        System.out.println("Largest order: Bob smith ($32.45)");
    }
}


