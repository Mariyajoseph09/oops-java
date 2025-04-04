class Product {
    // Data members
    String pcode;
    String pname;
    double price;

    // Constructor
    Product(String pcode, String pname, double price) {
        this.pcode = pcode;
        this.pname = pname;
        this.price = price;
    }

    // Method to display product details
    void display() {
        System.out.println("Product Code: " + pcode + ", Name: " + pname + ", Price: $" + price);
    }

    // Static method to find the product with the lowest price
    static Product findLowestPrice(Product p1, Product p2, Product p3) {
        if (p1.price <= p2.price && p1.price <= p3.price)
            return p1;
        else if (p2.price <= p1.price && p2.price <= p3.price)
            return p2;
        else
            return p3;
    }

    // Main method
    public static void main(String[] args) {
        // Creating three product objects
        Product prod1 = new Product("P001", "Laptop", 750.00);
        Product prod2 = new Product("P002", "Tablet", 500.00);
        Product prod3 = new Product("P003", "Smartphone", 300.00);

        // Displaying product details
        System.out.println("Product Details:");
        prod1.display();
        prod2.display();
        prod3.display();

        // Finding the product with the lowest price
        Product lowest = findLowestPrice(prod1, prod2, prod3);
        System.out.println("\nProduct with the Lowest Price:");
        lowest.display();
    }
}

