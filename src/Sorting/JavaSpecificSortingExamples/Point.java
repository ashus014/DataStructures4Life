package Sorting.JavaSpecificSortingExamples;

//comparing Array of Objects with Comparable interface
class Point implements Comparable<Point> {

    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        return this.x - o.x;
    }

}
