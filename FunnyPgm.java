public class FunnyProgram {
    public static void main(String[] args) {
        System.out.println("🤖 Hello Human!");
        
        String mood = "hungry";

        if (mood.equals("hungry")) {
            System.out.println("🍕 I refuse to run until you feed me pizza!");
        } else if (mood.equals("sleepy")) {
            System.out.println("😴 Sorry, I’m sleeping. Come back later...");
        } else {
            System.out.println("✨ Fine, I’ll run... but I’m not happy about it!");
        }

        // Fake calculation
        int answer = 42; // Because why not? (Hitchhiker's Guide joke)
        System.out.println("The secret answer to life, universe, and everything is: " + answer);
    }
}
