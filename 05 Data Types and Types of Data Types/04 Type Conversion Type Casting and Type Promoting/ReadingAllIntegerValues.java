
class ReadingAllIntegerValues {

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            try {
                int value = Integer.parseInt(args[i]);
                System.err.println(value);
            } catch (NumberFormatException e) {
                /* No-Operation */ }
        }
    }
}
