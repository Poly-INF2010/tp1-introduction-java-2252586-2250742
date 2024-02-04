package Letter;

import Point.Point2d;
import Shape.*;
import Shape.Rectangle;

import java.awt.*;
import java.util.logging.XMLFormatter;

public final class LetterFactory {
    final static Double maxHeight = 150.0;
    final static Double maxWidth = maxHeight / 2.5;
    final static Double halfMaxHeight = maxHeight / 2;
    final static Double horizontalBarHeight = maxHeight / 2.8;
    final static Double circleRadius = maxHeight / 1.8;
    final static Double ellipseToBeRemovedWidth = maxWidth / 1.15;    /*maxwidth diviser par 1.3 marche bien*/
    final static Double ellipseToBeRemovedHeight = maxHeight / 1.1;  /*1.3 marche bien*/
    final static Double circleRadiusToBeRemoved = circleRadius / 1.45;
    final static Double halfMaxWidth = maxWidth / 2;
    final static Double stripeThickness = maxHeight / 8;
    final static Double halfStripeThickness = stripeThickness / 2;
    final static Double lessThanHalfMaxHeight = halfMaxHeight / 2;

    /**
     * TODO
     * Create the letter A graphically
     *
     * @return BaseShape containing the letter A
     */
    public static BaseShape create_A() {
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

    /**
     * TODO
     * Create the letter B graphically
     *
     * @return BaseShape containing the letter B
     */
    public static BaseShape create_B() {
        Rectangle rectangle = new Rectangle(stripeThickness, maxHeight);
        Circle circle1 = new Circle(circleRadius);
        Circle circleToBeRemoved = new Circle(circleRadiusToBeRemoved);
        circle1.removeAll(circleToBeRemoved.getCoords());
        Circle circle2 = new Circle(circleRadius);
        circle2.removeAll(circleToBeRemoved.getCoords());
        Point2d translateVectorCircle1 = new Point2d(32.0, -33.5);
        Point2d translateVectorCircle2 = new Point2d(32.0, 33.5);
        circle1.translate(circle1.getCoords(), translateVectorCircle1);
        circle2.translate(circle2.getCoords(), translateVectorCircle2);
        BaseShape finalshape = new BaseShape(rectangle.cloneCoords());
        finalshape.addAll(circle1.cloneCoords());
        finalshape.addAll(circle2.cloneCoords());
        return finalshape;
    }

    /**
     * TODO
     * Create the letter C graphically
     *
     * @return BaseShape containing the letter C
     */
    public static BaseShape create_C() {
        Rectangle rectangle = new Rectangle(halfMaxWidth, maxHeight / 1.4);   /*maxHeight / 1.3*/
        Ellipse ellipse = new Ellipse(maxWidth, maxHeight);
        Ellipse ellipseToBeRemoved = new Ellipse(ellipseToBeRemovedWidth, ellipseToBeRemovedHeight);
        Point2d translateVectorEllipseToBeRemoved = new Point2d(3.0, 0.0); /*10 comme x*/
        Point2d translateVectorRectangleToBeRemoved = new Point2d(15.0, 0.0);
        rectangle.translate(rectangle.getCoords(), translateVectorRectangleToBeRemoved);
        ellipseToBeRemoved.translate(ellipseToBeRemoved.getCoords(), translateVectorEllipseToBeRemoved);
        ellipse.remove(ellipseToBeRemoved);
        ellipse.remove(rectangle);
        BaseShape finalshape = new BaseShape(ellipse.cloneCoords());
        return finalshape;
    }

    /**
     * TODO
     * Create the letter E graphically
     *
     * @return BaseShape containing the letter E
     */
    public static BaseShape create_E() {
        Rectangle verticalRectangle = new Rectangle(halfStripeThickness,maxHeight);
        Rectangle topBarRectangle = new Rectangle(halfStripeThickness, horizontalBarHeight);
        Rectangle middleBarRectangle = new Rectangle(halfStripeThickness, horizontalBarHeight);
        Rectangle bottomBarRectangle = new Rectangle(halfStripeThickness, horizontalBarHeight);
        Double horizontalAngle = 2 * Math.PI / 4;
        Point2d topBarTranslationVector = new Point2d(37.0, -70.0);
        Point2d middleBarTranslationVector = new Point2d(37.0, 0.0);
        Point2d bottomBarTranslationVector = new Point2d(37.0, 70.0);
        topBarRectangle.rotate(topBarRectangle.getCoords(), horizontalAngle);
        middleBarRectangle.rotate(middleBarRectangle.getCoords(), horizontalAngle);
        bottomBarRectangle.rotate(bottomBarRectangle.getCoords(), horizontalAngle);
        topBarRectangle.translate(topBarRectangle.getCoords(), topBarTranslationVector);
        middleBarRectangle.translate(middleBarRectangle.getCoords(), middleBarTranslationVector);
        bottomBarRectangle.translate(bottomBarRectangle.getCoords(), bottomBarTranslationVector);
        BaseShape finalshape = new BaseShape(verticalRectangle.cloneCoords());
        finalshape.add(topBarRectangle);
        finalshape.add(middleBarRectangle);
        finalshape.add(bottomBarRectangle);
        return finalshape;
    }

    /**
     * TODO
     * Create the letter H graphically
     *
     * @return BaseShape containing the letter H
     */
    public static BaseShape create_H() {
        Rectangle rectangle = new Rectangle(halfMaxWidth, halfMaxHeight);
        BaseShape finalshape = new BaseShape(rectangle.cloneCoords());
        return finalshape;
    }

    /**
     * TODO
     * Create the letter N graphically
     *
     * @return BaseShape containing the letter N
     */
    public static BaseShape create_N() {
        Rectangle rectangle = new Rectangle(halfMaxWidth, halfMaxHeight);
        BaseShape finalshape = new BaseShape(rectangle.cloneCoords());
        return finalshape;
    }

    /**
     * TODO
     * Create the letter O graphically
     *
     * @return BaseShape containing the letter O
     */
    public static BaseShape create_O() {
        Rectangle rectangle = new Rectangle(halfMaxWidth, halfMaxHeight);
        BaseShape finalshape = new BaseShape(rectangle.cloneCoords());
        return finalshape;
    }

}
