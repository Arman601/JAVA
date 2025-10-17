public class BlanketProtector {
    public static void main(String[] args) {
        String underBlanket = "safe";
        boolean monsterNear = true;

        System.out.println("Nighttime! Monsters are near...");
        if (monsterNear && underBlanket.equals("safe")) {
            System.out.println("You are under the blanket!");
            System.out.println("No monster can reach you. 💤");
        } else {
            System.out.println("Oh no! Exposed toes – instant danger! 🦶👻");
        }
    }
}
