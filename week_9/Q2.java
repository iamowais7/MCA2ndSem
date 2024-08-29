class Fruit {
    String name;
    String type;

    // Constructor
    public Fruit(String name, String type) {
        this.name = name;
        this.type = type;
    }

    // Method to display fruit attributes
    public void displayFruit() {
        System.out.println("Name of the fruit: " + name);
        System.out.println("Type of fruit: " + type);
    }
}

public class Q2 {
    public static void main(String[] args) {
        // Creating objects of Fruit class
        Fruit fruit1 = new Fruit("Apple", "Single");
        Fruit fruit2 = new Fruit("Banana", "Bunch");

        // Displaying attributes of fruit1
        System.out.println("Details of Fruit 1:");
        fruit1.displayFruit();
        System.out.println();

        // Displaying attributes of fruit2
        System.out.println("Details of Fruit 2:");
        fruit2.displayFruit();
    }
}
