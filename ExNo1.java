public class ExNo1 {
    public static void main(String[] args) {
        int ball = 2,  end = 100; 

        System.out.println("เลขคู่ระหว่าง " + ball + " และ " + end + ":");

        for (int i = ball; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

