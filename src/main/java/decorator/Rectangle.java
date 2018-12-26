package decorator;

/**
 * @description
 * @author: panguoyan
 * @date: 2018/12/26 16:52
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
