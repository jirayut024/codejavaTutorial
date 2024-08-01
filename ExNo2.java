public class ExNo2 {
    public static void main(String[] args) {
        int limit = 100; 

        System.out.println("ตัวเลขไม่เกิน " + limit + " ที่หารด้วย 3 และ 5 ลงตัว:");

        for (int i = 1; i <= limit; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
