public class MainClass {
    public static void main(String[] args) {
        System.out.println("Hello, world");
        System.out.println("����������:");
        byte b = 125;
        System.out.println("b = " + b);
        short s = -32768;
        int i = 50000;
        long l = 123456789L;
        float f = 15.75f;
        double d = -157.3456;
        char c = 'c';
        boolean bl = false;
        System.out.println("short " + s + " int " + i + " long " + l + " float " + f + " double " + d + " char " + c);
        System.out.println(rez(10, 2, 10, 2));
        int x = 15, y = 10, sum;
        sum = x + y;
        if ((sum >= 10) && (sum <= 20))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }

    }

    public static float rez(int a, int b, int c, int d){
        return a * (b + (c/d));
    }
}
