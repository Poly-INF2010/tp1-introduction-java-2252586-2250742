package Letter;

import Point.Point2d;
import Shape.*;

public final class LetterFactory {
    final static Double maxHeight = 150.0;
    final static Double maxWidth = maxHeight / 2.5;
    final static Double halfMaxHeight = maxHeight / 2;
    final static Double halfMaxWidth = maxWidth / 2;
    final static Double stripeThickness = maxHeight / 8;
    final static Double halfStripeThickness = stripeThickness / 2;

    final static Double lessThanHalfMaxHeight = halfMaxHeight / 2;

    /** TODO
     * Create the letter A graphically
     * @return BaseShape containing the letter A
     */
    public static BaseShape create_A()  {
        Double angle1 = (Math.PI - 1.5) / 6;
        Double angle2 = (11 * Math.PI + 1.5) / 6;
        Double angle3 = Math.PI / 2;
        Rectangle rectangle1 = new Rectangle(halfStripeThickness, maxHeight);
        Rectangle rectangle2 = new Rectangle(halfStripeThickness, maxHeight);
        Rectangle rectangle3 = new Rectangle(halfStripeThickness, lessThanHalfMaxHeight);
        Point2d translateVectorRectangle1 = new Point2d(3.0, 0.0);
        Point2d translateVectorRectangle2 = new Point2d(42.5, 12.2);
        Point2d translateVectorRectangle3 = new Point2d(30.0, 0.0);
        rectangle1.rotate(rectangle1.getCoords(), angle1);
        rectangle2.translate(rectangle2.getCoords(), translateVectorRectangle2);
        rectangle1.translate(rectangle1.getCoords(), translateVectorRectangle1);
        rectangle2.rotate(rectangle2.getCoords(), angle2);
        rectangle3.rotate(rectangle3.getCoords(), angle3);
        rectangle3.translate(rectangle3.getCoords(), translateVectorRectangle3);
        BaseShape finalShape = new BaseShape(rectangle1.cloneCoords());
        finalShape.addAll(rectangle2.cloneCoords());
        finalShape.addAll(rectangle3.cloneCoords());
        return finalShape;
    }

    /** TODO
     * Create the letter B graphically
     * @return BaseShape containing the letter B
     */
    public static BaseShape create_B() {
        Rectangle rectangle = new Rectangle(halfMaxWidth, halfMaxHeight);
        BaseShape finalshape = new BaseShape(rectangle.cloneCoords());
        return finalshape;
    }

    /** TODO
     * Create the letter C graphically
     * @return BaseShape containing the letter C
     */
    public static BaseShape create_C() {
        Rectangle rectangle = new Rectangle(halfMaxWidth, halfMaxHeight);
        BaseShape finalshape = new BaseShape(rectangle.cloneCoords());
        return finalshape;
    }

    /** TODO
     * Create the letter E graphically
     * @return BaseShape containing the letter E
     */
    public static BaseShape create_E() {
        Rectangle rectangle = new Rectangle(halfMaxWidth, halfMaxHeight);
        BaseShape finalshape = new BaseShape(rectangle.cloneCoords());
        return finalshape;
    }

    /** TODO
     * Create the letter H graphically
     * @return BaseShape containing the letter H
     */
    public static BaseShape create_H() {
        Rectangle rectangle = new Rectangle(halfMaxWidth, halfMaxHeight);
        BaseShape finalshape = new BaseShape(rectangle.cloneCoords());
        return finalshape;
    }

    /** TODO
     * Create the letter N graphically
     * @return BaseShape containing the letter N
     */
    public static BaseShape create_N() {
        Rectangle rectangle = new Rectangle(halfMaxWidth, halfMaxHeight);
        BaseShape finalshape = new BaseShape(rectangle.cloneCoords());
        return finalshape;
    }

    /** TODO
     * Create the letter O graphically
     * @return BaseShape containing the letter O
     */
    public static BaseShape create_O() {
        Rectangle rectangle = new Rectangle(halfMaxWidth, halfMaxHeight);
        BaseShape finalshape = new BaseShape(rectangle.cloneCoords());
        return finalshape;
    }

}
