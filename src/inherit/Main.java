package inherit;

public class Main {
    public static void main(String[] args) {
        Player p1 = new Player();
        Player p2 = new Player("Ravi", "Viking", false, 32433, (short) 88, (short) 18, 23.7f);
        p1.setName("Jacobian Jones");
        p1.output();
        p2.output();

        PlayerV2 p3 = new PlayerV2();
        PlayerV2 p4 = new PlayerV2("Dio", "Captain", true, 45312, (short) 43, (short) 7, 55.8f, "Dark", (short) 23, (short) 89, (short) 5, -43242342);
        p3.output();
        p4.output();
        System.out.println(p3.getTitle());
        System.out.println(p4.getTitle());
    }
}