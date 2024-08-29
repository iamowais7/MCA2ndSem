class Box {
    double length;
    double width;
    double height;

    // Constructor
    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // Method to calculate volume
    public double calculateVolume() {
        return length * width * height;
    }
}

public class Q6 {
    public static void main(String[] args) {
        // Create two Box objects
        Box box1 = new Box(5, 3, 2);
        Box box2 = new Box(4, 6, 7);

        // Print volumes of the boxes
        System.out.println("Volume of Box 1: " + box1.calculateVolume());
        System.out.println("Volume of Box 2: " + box2.calculateVolume());
    }
}
