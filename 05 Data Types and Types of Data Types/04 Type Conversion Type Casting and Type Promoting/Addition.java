class Addition {
    public static void main(String[] args) {
        
        // System.out.println(args[0]);
        // System.out.println(args[1]);
        // System.out.println(args[2]);
        // System.out.println(args[3]);

        // int i1 = (int)args[0];  // incompatible tyes Compile time error   
        // int i2 = (int)args[1];  // incompatible tyes Compile time error
        // int i3 = (int)args[2];  // incompatible tyes Compile time error
        // int i4 = (int)args[3];  // incompatible tyes Compile time error

        int i1 = Integer.parseInt(args[0]);
        int i2 = Integer.parseInt(args[1]);
        int i3 = Integer.parseInt(args[2]);
        int i4 = Integer.parseInt(args[3]);

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);

        int i5 = i1 + i2 + i3 + i4;
        System.out.println(i5);

    }
}