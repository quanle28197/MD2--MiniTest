public class Methods {
    public static int getSumQuantity(Book[] b) {
        int sum = 0;
        for (int i = 0; i < b.length; i++) {
            sum += b[i].getQuantity();
        }
        return sum;
    }

    public static int getSumPrice(Book[] b) {
        int sum = 0;
        for (int i = 0; i < b.length; i++) {
            sum += b[i].getPrice() * b[i].getQuantity();
        }
        return sum;
    }

    public static int getSumWeight(Book[] b) {
        int sum = 0;
        for (int i = 0; i < b.length; i++) {
            sum += b[i].getWeight() * b[i].getQuantity();
        }
        return sum;


    }
}
