package Shape;

/**
 * Class thao tác với hình tròn
 * @author KOS_Virgo
 */
public class Circle extends Shape {
    //radius là bán kính hình tròn
    private double radius;
    
    //Khởi tạo hình tròn với bán kính mặc định 1.0
    public Circle() {
        this.radius = 1.0;
    }
    
    /**
     * @param radius bán kính hình tròn
     */
    public Circle(double radius) {
        this.radius = radius;
    }
    
    /**
     * @param radius bán kính hình tròn
     * @param color màu hình tròn
     * @param filled hình tròn đặc hay không
     */
    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        super.setColor(color);
        super.setFilled(filled);
    }
    
    /**
     * Tính diện tích hình tròn
     * @return double diện tích hình tròn
     */
    public double getArea() {
        return 3.14 * radius * radius;
    }
    
    /**
     * Tính chu vi hình tròn
     * @return double chu vi hình tròn
     */
    public double getPerimeter() {
        return 3.14 * 2 * radius;
    }
}
