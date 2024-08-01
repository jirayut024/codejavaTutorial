public class result1to100 {
    public static void main(String[] args) {
        int non = 0, ball = 1;
        while (ball <= 100){
           non += ball;
           System.out.println("ball : " +ball+ "non : "+non);
            ball++ ;
    }
    System.out.println("ผลลับ 1  ถึง 100 :"+non);
}
}
