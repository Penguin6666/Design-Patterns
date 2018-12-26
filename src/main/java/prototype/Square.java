package prototype;

/**
 * @description
 * @author: panguoyan
 * @date: 2018/12/26 14:27
 */
public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
