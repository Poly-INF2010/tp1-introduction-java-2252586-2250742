package Shape;

import Point.Point2d;

import java.awt.*;
import java.util.Collection;

public class Rectangle extends BaseShape {
    /**
     * TODO
     * Create a filled rectangle centered on (0, 0)
     *
     * @param width  Width of the rectangle
     * @param height Height of the rectangle
     */
    public Rectangle(Double width, Double height) {
        Double centerX = -(width / 2.0);
        Double centerY = -(height / 2.0);

        for (Double i = 0.0; i < Math.ceil(width); i += 0.5) {
            for (Double j = 0.0; j < Math.ceil(height); j += 0.5) {
                Double x = i + centerX;
                Double y = j + centerY;
                Point2d p = new Point2d(x, y);
                this.add(p);
            }
        }
    }

    /**
     * TODO
     * Create a filled rectangle centered on (0, 0)
     *
     * @param dimensions 2D point containing the width and height of the rectangle
     */
    public Rectangle(Point2d dimensions) {
        Double width = dimensions.X();
        Double height = dimensions.Y();;
        Double centerX = -(width / 2.0);
        Double centerY = -(height / 2.0);

        for (Double i = 0.0; i < Math.ceil(width); i += 0.5) {
            for (Double j = 0.0; j < Math.ceil(height); j += 0.5) {
                Double x = i + centerX;
                Double y = j + centerY;
                Point2d p = new Point2d(x, y);
                this.add(p);
            }
        }
    }

    /**
     * Create a rectangle from a given collection of Points
     *
     * @param coords The collection of 2D points
     */
    private Rectangle(Collection<Point2d> coords) {
        BaseShape tempBaseShape = new BaseShape(coords);
        Double minX = tempBaseShape.getMinX();
        Double maxX = tempBaseShape.getMaxX();
        Double minY = tempBaseShape.getMinY();
        Double maxY = tempBaseShape.getMaxY();
        Double width = 0.0;
        Double height = 0.0;

        if (Math.abs(maxX) > Math.abs(minX)){
            width = maxX;
            if (minX < 0.0){
                width += Math.abs(minX);
            }
        }
        else {
            width = Math.abs(minX);
            if (maxX > 0.0){
                width += maxX;
            }
        }
        if (Math.abs(maxY) > Math.abs(minY)){
            height = maxY;
            if (minY < 0.0){
                height += Math.abs(minY);
            }
        }
        else {
            height = Math.abs(minY);
            if (maxY > 0.0){
                width += maxY;
            }
        }

        Double centerX = -(width / 2.0);
        Double centerY = -(height / 2.0);

        for (Double i = 0.0; i < Math.ceil(width); i += 0.5) {
            for (Double j = 0.0; j < Math.ceil(height); j += 0.5) {
                Double x = i + centerX;
                Double y = j + centerY;
                Point2d p = new Point2d(x, y);
                this.add(p);
            }
        }
    }

    /**
     * TODO
     *
     * @return Deep copy of the rectangle
     */
    @Override
    public Rectangle clone() {
        return new Rectangle(this.cloneCoords());
    }
}
