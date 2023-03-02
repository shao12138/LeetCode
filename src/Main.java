public class Main {
    public static void main(String[] args) {
        String demo = new String("杜马");
        System.out.println("方法调用前:  "+demo);
        update(demo);
        System.out.println("方法调用前:  "+demo);
    }
    public static void update(String demo){
        demo = null;
    }
}