// Define multiple interfaces
interface Interface1 {
    void method1();
}

interface Interface2 {
    void method2();
}

// Implement the interfaces in a single class
class MyClass implements Interface1, Interface2 {
    public void method1() {
        System.out.println("Method 1 implementation");
    }

    public void method2() {
        System.out.println("Method 2 implementation");
    }
}

// Main class to demonstrate the usage
public class Q3 {
    public static void main(String[] args) {
        // Create an object of MyClass
        MyClass obj = new MyClass();

        // Call methods from both interfaces
        obj.method1();
        obj.method2();
    }
}
