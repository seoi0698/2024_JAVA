package SM.sec12.exam01;

public class BeeprintExample1 {
    public static void main(String[] args) {
        // ASCII Bell Character 대신 Toolkit.beep() 대체
        for (int i = 0; i < 5; i++) {
            System.out.print("\007"); // ASCII Bell
            System.out.flush();      // 출력 강제 플러시
            try { Thread.sleep(500); } catch (Exception e) {}
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try { Thread.sleep(500); } catch (Exception e) {}
        }
    }
}
