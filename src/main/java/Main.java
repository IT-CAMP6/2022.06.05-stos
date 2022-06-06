public class Main {
    public static void main(String[] args) {
        a();

        System.out.println("cos");
    }

    public static void a() {
        b();
    }

    public static void b() {
        c();
    }

    public static void c() {
        d();
    }

    public static void d() {
        a();
    }
}
