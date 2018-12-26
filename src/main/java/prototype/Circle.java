package prototype;

/**
 * @description
 * @author: panguoyan
 * @date: 2018/12/26 14:28
 */
public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
