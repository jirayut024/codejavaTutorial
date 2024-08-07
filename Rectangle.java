public class Rectangle {
    private double length;
    private double width;
    public void setLength(double len) {
        length = len;
      
    }
    public void setwidth(double w){
        width = w;
    }
    public double getLength(){
        return length;
    }
    public double getwidth(){
        return width;
    }
    public double getArea(){
        return length * width ;
    }
}
