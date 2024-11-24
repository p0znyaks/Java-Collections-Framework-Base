package Collections.list;

public class StackExample {
    static void Foo() {
        System.out.println("Foo starts");
        System.out.println("Foo ends");
    }
    static void Bar() {
        System.out.println("Bar starts");
        Foo();
        System.out.println("Bar ends");
    }
    static void FooBar() {
        System.out.println("FooBar starts");
        Bar();
        System.out.println("FooBar ends");
    }

    public static void main(String[] args) {
        FooBar();
    }
}
