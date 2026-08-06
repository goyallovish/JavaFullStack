package demo;
public class method1 {

    int sum = 232;
    public static void main(String[] args) {
        
        // int res = sum(2,3);
        // System.out.println(res); // if method is return then we have to hold it in variable
        // sum1(4,5);
        // demo1();
        // creating object

        // method in same class
        // object if metghod in diferent class
        method1 obj = new method1(); // creating object so we can acces no nstaic variabes in staic
        System.out.println(obj.sum);
    }

    public static void demo1()
    {
        
        System.out.println("no parameter no return");
    }

    public static int sum(int a, int b)
    {
        int c = a + b;
        return c;
    }

    public static void sum1(int d, int e)
    {
        int f = d + e;
        System.out.println(f);
    }
}
