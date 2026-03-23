package exercises;

public class ClassForEx011 {
    String name;
    double price;
    int quantity;

    public double totalValueInStock() {

        return price * quantity;
    }
    public void addProducts(int qnt) {
        quantity += qnt;
    }
    public void removeProducts(int qnt) {
        quantity -= qnt;
    }

    public String toString() {
        return "Name: " + name + "\nPrice: " + price + "\nQuantity: " + quantity +
                "\nTotal value: " + totalValueInStock();
    }
}
