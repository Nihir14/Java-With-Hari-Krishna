class ReadCharFromCmd {
    public static void main(String[] args) {

        char ch0 = args[0].charAt(1);
        System.err.println("2 element of 1 index is : " + ch0);

        int i1 = Integer.parseInt(args[0]);
        System.err.println("Integer is : " + i1);

        char ch = args[1].charAt(0);
        System.out.println("character is : " + ch);
        
    }
}