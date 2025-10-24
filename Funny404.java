public class LazyRobot {
    public static void main(String[] args) {
        System.out.println("Hello, I’m your lazy robot 🤖");
        System.out.println("You told me to make coffee...");
        waitForASecond();
        System.out.println("But sorry, I don’t have hands ☕😂");
        waitForASecond();
        System.out.println("So I’ll just imagine making it for you!");
        System.out.println("Here’s your invisible coffee ☕😎");
    }

    static void waitForASecond() {
        try {
            Thread.sleep(1000); // robot takes a small break
        } catch (InterruptedException e) {
            System.out.println("Oops, I fell asleep 😴");
        }
    }
}
