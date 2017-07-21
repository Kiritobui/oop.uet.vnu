package Shape;

/**
 * Lớp hình vuông
 * @author Virgo
 */
public class Square extends Retangle {
    private double side;
    
    //Khởi tạo hình vuông với cạnh bằng 1.0
    public Square() {
        side = 1.0;
    }
    
    public Square(double side) {
        this.side = side;
    }
    
    public Square(double side, String color, boolean filled) {
        this.side = side;
        super.setColor(color);
        super.setFilled(filled);
    }
    
    /**
     * @return giá trị cạnh hình vuông
     */
    public double getSide() {
        return side;
    }
    
    /**
     * @param side là cạnh hình vuông
     */
    public void setSide(double side) {
        this.side = side;
    }
}
