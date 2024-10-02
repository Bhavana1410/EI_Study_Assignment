public class Rover {
    private int x, y;
    private Direction direction;
    private final Grid grid;

    public Rover(int x, int y, Direction direction, Grid grid) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.grid = grid;
    }

    public void move() {
        int newX = x, newY = y;
        switch (direction) {
            case NORTH: newY++; break;
            case SOUTH: newY--; break;
            case EAST: newX++; break;
            case WEST: newX--; break;
        }

        if (grid.isWithinBounds(newX, newY) && !grid.hasObstacle(newX, newY)) {
            x = newX;
            y = newY;
        } else {
            System.out.println("Obstacle detected or out of bounds, can't move!");
        }
    }

    public void turnLeft() {
        direction = direction.left();
    }

    public void turnRight() {
        direction = direction.right();
    }

    public String getStatus() {
        return String.format("Rover is at (%d, %d) facing %s", x, y, direction);
    }
}
