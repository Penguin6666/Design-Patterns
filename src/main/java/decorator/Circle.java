package decorator;

/**
 * @description
 * @author: panguoyan
 * @date: 2018/12/26 16:53
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
