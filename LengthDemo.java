public class LengthDemo {
    public static void main(String[] args) {
        Rectangle box = new Rectangle();
        System.out.println("Sending the value 10.0 to the setLength method");
        box.setLength(10.0);
        box.setwidth(20.0);
        System.out.println("The box's lenng is " +box.getLength());
        System.out.println("The box's width is " +box.getwidth());
        System.out.println("The box's arrea is " +box.getArea());
        System.out.println("Done");
    }
}
