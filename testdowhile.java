public class testdowhile {
    public static void main(String[] args) {
        int i;
        for(i = 1; i <= 10; i++){
            System.out.println("i in for"+i);
           
        }
        int iWhile = 1;
        while (iWhile <= 10) {
            System.out.println("iWhile in while"+iWhile);
            iWhile++;
        }
        int counter = 1;
        do{
            System.out.println("counter in while"+counter);
            counter++;

        }while(counter <= 10);
    }
}
