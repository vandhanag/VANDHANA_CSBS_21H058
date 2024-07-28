public class Rover {
    private Position position;
    private Direction direction;
    private Grid grid;
    private boolean obstacleDetected;

    public Rover(int x, int y, Direction direction, Grid grid) {
        this.position = new Position(x, y);
        this.direction = direction;
        this.grid = grid;
        this.obstacleDetected = false;
    }

    public void move() {
        Position newPosition = new Position(position.x, position.y);
        switch (direction) {
            case N -> newPosition.y++;
            case S -> newPosition.y--;
            case E -> newPosition.x++;
            case W -> newPosition.x--;
        }
        if (grid.isValidMove(newPosition)) {
            position = newPosition;
            obstacleDetected = false;
        } else {
            obstacleDetected = true;
        }
    }

    public void turnLeft() {
        direction = switch (direction) {
            case N -> Direction.W;
            case W -> Direction.S;
            case S -> Direction.E;
            case E -> Direction.N;
        };
    }

    public void turnRight() {
        direction = switch (direction) {
            case N -> Direction.E;
            case E -> Direction.S;
            case S -> Direction.W;
            case W -> Direction.N;
        };
    }

    public String reportStatus() {
        String status = "Rover is at (" + position.x + ", " + position.y + ") facing " + direction + ".";
        if (obstacleDetected) {
            status += " Obstacle detected in the path.";
        } else {
            status += " No obstacles detected.";
        }
        return status;
    }
}
