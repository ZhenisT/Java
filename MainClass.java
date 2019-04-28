public class MainClass {
    public static void main(String[] args) {
        System.out.println("Hello, world");
        System.out.println("Переменные:");
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
	int pol = -10;
        if (pol < 0) {
            System.out.println("Число отрицательное");
        } else
        {
            System.out.println("Число положительное");
        }

        System.out.println(neg(-5));
        hellosay("Zhenis");
        System.out.println(v_god(2020));
    }

    public static float rez(int a, int b, int c, int d){
        return a * (b + (c/d));
    }
    public static boolean neg(int x){
        if (x < 0){
            return true;
        }
        return false;
    }
    public static void hellosay(String name){
        System.out.println("Привет " + name + "!");
    }
    public static boolean v_god(int z)
    {
        if (((z % 4 == 0) || (z % 400 == 0)) && (z % 100 > 0))
        {
            System.out.println("Год високосный");
            return true;
        }
        System.out.println("Год не високосный");
            return false;
    }
}
