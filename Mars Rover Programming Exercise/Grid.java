import java.util.HashSet;
import java.util.Set;

public class Grid {
    private final int width, height;
    private final Set<Coordinate> obstacles;

    public Grid(int width, int height) {
        this.width = width;
        this.height = height;
        this.obstacles = new HashSet<>();
    }

    public void addObstacle(int x, int y) {
        obstacles.add(new Coordinate(x, y));
    }

    public boolean isWithinBounds(int x, int y) {
        return x >= 0 && y >= 0 && x < width && y < height;
    }

    public boolean hasObstacle(int x, int y) {
        return obstacles.contains(new Coordinate(x, y));
    }
}
