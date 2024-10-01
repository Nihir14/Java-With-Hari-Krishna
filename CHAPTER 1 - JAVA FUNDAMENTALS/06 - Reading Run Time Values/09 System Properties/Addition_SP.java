public class Addition_SP {
    public static void main(String[] args) {
        
        String value1 = System.getProperty("fno");
        String value2 = System.getProperty("sno");

        int i1 = Integer.parseInt(value1);
        int i2 = Integer.parseInt(value2);

        int sum = i1 + i2;
        System.out.println("Addition of 2 Integers is : " + sum);
    }
}
