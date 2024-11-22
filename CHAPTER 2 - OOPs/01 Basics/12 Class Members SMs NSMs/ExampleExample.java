class ExampleExample {
    static ExampleExample e1 = new ExampleExample();
    static{
        System.out.println("SB start");
        ExampleExample e2 = new ExampleExample();
        System.out.println("SB end");
    }
    ExampleExample(){
        System.out.println("NPC start");
        ExampleExample e3 = new ExampleExample(5);
        System.out.println("NPC end");
    }
    ExampleExample(int x){
        System.out.println("IPC executed");
    }
    static int a = m1();
    static int m1(){
        System.out.println("SV a is initialized");
        return 10;
    }
    int x = m2();
    int m2(){
        System.out.println("NSV x is initialized");
        return 30;
    }
    static{
        System.out.println("SB2 is executed");
    }
    {
        System.out.println("NSB is executed");
    }
    public static void main(String[] args){
        System.out.println("main start");
        ExampleExample e3 = new ExampleExample();
        m3();
        e3.m4();
        System.out.println("main end");
    }
    static void m3(){
        System.out.println("m3 start");
        ExampleExample e5 = new ExampleExample();
        System.out.println("m3 end");
    }
    void m4(){
        System.out.println("m4 start");
        ExampleExample e6 = new ExampleExample();
        System.out.println("m4 end");
    }
    static void m5(){
        System.out.println("m5 start");
        ExampleExample e7 = new ExampleExample();
        System.out.println("m5 end");
    }
    static int b = 20;
    int y = 30;
    static {
        System.out.println("SB3 executed");
    }
    {
        System.out.println("NSB2 executed");
    }
    static ExampleExample e8 = new ExampleExample(5);
}
