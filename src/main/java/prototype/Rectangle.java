package prototype;

/**
 * @description
 * @author: panguoyan
 * @date: 2018/12/26 14:27
 */
public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
