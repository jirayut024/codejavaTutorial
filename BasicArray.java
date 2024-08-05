public class BasicArray {
    public static void main(String[] args) {
        final int LIMIT = 15, MUTIPLE = 10;
        int sum = 0;
        int [ ] list = new int[LIMIT];
        for(int index = 0; index < LIMIT; index++){
          list[index] = index * MUTIPLE;
        }
        list[5] = 999;
        for(int value : list){
            System.out.print(value+" ");
        }
        for(int value : list){
          sum += value;
        }
        System.out.println("sum = : " +sum);
    }
}
