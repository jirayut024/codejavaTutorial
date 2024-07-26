public class StringMethods {
    public static void main(String[] args) {
        String message = "Java is Great Fun";
        /*
         เมดธอดพื้นฐาน
         1.toUperCase()ปรับค่าข้อความให้เป็นตัวอักษรพิทพืใหย่
         2.toLowerCase()ปรับค่าข้อความให้เป็นตัวพิมพ์เล็ก
         3.length()เก็บความของสตริง
         4.charAt(2)บอกให้เก็บตามจำนวนพารามิเตอร์ที่ส่งเข้าไป
         */
        String upper =message.toUpperCase();
        System.out.println(upper);

        String Lower =message.toLowerCase();
        System.out.println(Lower);

        int length =message.length();
        System.out.println(length);
        
        char charAt =message.charAt(3);
        System.out.println(charAt);
      
    }
}
