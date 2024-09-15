
import java.io.DataInputStream;
import java.io.IOException;



class DataInputStreamClass {
    public static void main(String[] args) throws IOException {
        DataInputStream dis1 = new DataInputStream(System.in);

        System.out.println("Enter value1 : ");
        String s1 = dis1.readLine();

        System.out.println("Enter value2 : ");
        String s2 = dis1.readLine();
        
        int i1 = Integer.parseInt(s1);
        int i2 = Integer.parseInt(s2);

        System.out.println("Addition of two integers is : " + (i1+i2));

    }
}