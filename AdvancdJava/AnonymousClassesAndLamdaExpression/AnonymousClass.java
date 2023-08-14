package AdvancdJava.AnonymousClassesAndLamdaExpression;

@FunctionalInterface
interface greet {
    void sayHello();
}
@FunctionalInterface
interface LambdaExp{
    void meth1(int a, int b);
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
        // Lambda Expressions :
        LambdaExp obj = (a, b) -> {
            System.out.println("The value of a and b is : "+ a + "," + b);
        };

        obj.meth1(5, 10);

    }
}
