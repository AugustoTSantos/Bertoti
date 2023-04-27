public class Singleton {
    private static Singleton instance;
    private static String hello = "hello";


    private Singleton(String hello) {
        Singleton.hello = hello;
    }


    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton(hello);
        }
        return instance;
    }

    public void oi() {
        System.out.println(hello);
    }
}
