class SimpleStringExample {
    public static void main(String[] args) {
        String name = "Arman";
        String greeting = "Hello, " + name + "!";

        System.out.println(greeting); // Output: Hello, Arman!

        // Some basic string operations
        System.out.println("Length: " + name.length());
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());
        System.out.println("First letter: " + name.charAt(0));
        System.out.println("Substring (first 3 letters): " + name.substring(0, 3));
    }
}
