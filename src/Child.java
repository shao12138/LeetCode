class Person {
    {
        System.out.println("父类非静态代码块");
    }

    static {
        System.out.println("父类静态代码块");
    }

    Person() {
        System.out.println("父类构造方法");
    }
}

public class Child extends Person {
    {
        System.out.println("子类非静态代码块");
    }

    static {
        System.out.println("子类静态代码块");
    }
    public static void main(String[] args) {
        new Person();
        new Person();
    }
}