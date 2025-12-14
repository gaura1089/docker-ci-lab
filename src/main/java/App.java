public class App {
    public static void main(String[] args) {
        System.out.println("Hello from Jenkins CI/CD + Docker");
        while(true) {
            try {
                Thread.sleep(5000);
            } catch (Exception e) {}
        }
    }
}