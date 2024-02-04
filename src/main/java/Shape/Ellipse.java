package Shape;

import Point.Point2d;

import java.util.Collection;

public class Ellipse extends BaseShape {
    /**
     * TODO
     * Create a filled Ellipse that is centered on (0, 0)
     *
     * @param widthDiameter  Width of the Ellipse
     * @param heightDiameter Height of the Ellipse
     */
    public Ellipse(Double widthDiameter, Double heightDiameter) {
        Double radiusWidth = widthDiameter / 2;
        Double radiusHeight = heightDiameter / 2;

        for (Double i = 0.0; i < Math.ceil(widthDiameter); i += 0.5) {
            for (Double j = 0.0; j < Math.ceil(heightDiameter); j += 0.5) {
                Double x = -radiusWidth + i;
                Double y = -radiusHeight + j;
                if ((x * x) / (radiusWidth * radiusWidth) + (y * y) / (radiusHeight * radiusHeight) <= 1) {
                    Point2d p = new Point2d(x, y);
                    this.add(p);
                }
            }
        }
    }

    /**
     * TODO
     * Create a filled Ellipse that is centered on (0,0)
     *
     * @param dimensions 2D point containing the width and height of the Ellipse
     */
    public Ellipse(Point2d dimensions) {
        this(dimensions.X(), dimensions.Y());
    }

    /**
     * Create an Ellipse from a given collection of 2D points
     *
     * @param coords Collection of 2D points
     */
    private Ellipse(Collection<Point2d> coords) {
        BaseShape tempBaseShape = new BaseShape(coords);
        Double minX = tempBaseShape.getMinX();
        Double maxX = tempBaseShape.getMaxX();
        Double minY = tempBaseShape.getMinY();
        Double maxY = tempBaseShape.getMaxY();

        Double widthDiameter = Math.abs(maxX) > Math.abs(minX)
                ? maxX + (minX < 0.0 ? Math.abs(minX) : 0.0)
                : Math.abs(minX) + (maxX > 0.0 ? maxX : 0.0);
        Double heightDiameter = Math.abs(maxY) > Math.abs(minY)
                ? maxY + (minY < 0.0 ? Math.abs(minY) : 0.0)
                : Math.abs(minY) + (maxY > 0.0 ? maxY : 0.0);

        Double radiusWidth = widthDiameter / 2;
        Double radiusHeight = heightDiameter / 2;

        for (Double i = 0.0; i < Math.ceil(widthDiameter); i += 0.5) {
            for (Double j = 0.0; j < Math.ceil(heightDiameter); j += 0.5) {
                Double x = i - radiusWidth;
                Double y = j - radiusHeight;
                if ((x * x) / (radiusWidth * radiusWidth) + (y * y) / (radiusHeight * radiusHeight) <= 1) {
                    Point2d p = new Point2d(x, y);
                    this.add(p);
                }
            }
        }
    }

    /**
     * TODO
     *
     * @return Deep Copy of the Ellipse
     */
    @Override
    public Ellipse clone() {
        return new Ellipse(this.cloneCoords());
    }
}
