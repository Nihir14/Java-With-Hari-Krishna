class ReadAllValues {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("You did not pass any values !");
            return;
        }

        for (int i = 0; i < args.length; i++) {
            System.err.println("Value of args[" + i + "] is : " + args[i]);
            
        }
    }
}