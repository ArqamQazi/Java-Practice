package AdvancdJava.AnonymousClassesAndLamdaExpression;

@FunctionalInterface
interface greet {
    void sayHello();
}


public class AnonymousClass {
    public static void main(String[] args) {
        // Implementing greet interface without any new class name
        // This is known as Anonymous class
        greet g1 = new greet() {
            @Override
            public void sayHello() {
                System.out.println("Hello");
            }
        };
        g1.sayHello();
    }
}
