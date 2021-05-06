package java0506;

public class Step {
    public static void main(String[] args) {
        int step = 0;
        for (int i = 0; i < 1000; i++) {
            if (step % 2 == 1 && step % 3 == 2 && step % 4 == 3 && step % 5 == 4 && step % 6 == 5 && step % 7 == 0) {
                System.out.println(step);
            }
        }
    }
}
