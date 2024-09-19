class TypeConversion {
    public static void main(String[] args) {
        char ch = 'a'+'b';
        // char ch1 = ch + 'c'; // CE due to variable type will be cosidered.
        int ch1 = ch + 'c';

        System.out.println("Value of ch is : "+ ch);
        System.out.println("Value of ch1 is : "+ ch1);
    }
}