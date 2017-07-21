
package Shape;

/**
 * Lớp hình chữ nhật
 * @author KOS_Virgo
 */
public class Retangle extends Shape {
    private double width;
    private double length;
    
    //Khởi tạo hình chữ nhật với chiều dài, chiều rộng mặc định
    public Retangle() {
        this.width = 1.0;
        this.length = 1.0;
    }
    
    //Khởi tạo hình chữ nhật có tham số
    public Retangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    
    public Retangle(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        super.setColor(color);
        super.setFilled(filled);
    }
    
    /**
     * @return giá trị chiều rộng hình chữ nhật
     */
    public double getWidth() {
        return this.width;
    }
    
    /**
     * @param width là chiều rộng hình chữ nhật
     */
    public void setWidth(double width) {
        this.width = width;
    }
    
    /**
     * @return giá trị chiều dài hình chữ nhật
     */
    public double getLength() {
        return this.length;
    }
    
    /**
     * @param length là chiều dài hình chữ nhật
     */
    public void setLength(double length) {
        this.length = length;
    }
    
    /**
     * @return diện tích hình chữ nhật
     */
    public double getArea() {
        return this.width * this.length;
    }
    
    /**
     * @return chu vi hình chữ nhật
     */
    public double getPerimeter() {
        return 2 * (this.width + this.length);
    }
}
