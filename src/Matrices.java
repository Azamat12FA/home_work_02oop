public class Matrices {

    int dimension_x;
    int dimension_y;
    int[][] matrix;

    public Matrices(int dimension_x, int dimension_y, int[][] matrix) {
        this.dimension_x = dimension_x;
        this.dimension_y = dimension_y;
        this.matrix = matrix;
    }

    public int getDimension_y() {
        return dimension_y;
    }

    public void setDimension_y(int dimension_y) {
        this.dimension_y = dimension_y;
    }

    public int getDimension_x() {
        return dimension_x;
    }

    public void setDimension_x(int dimension_x) {
        this.dimension_x = dimension_x;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

}