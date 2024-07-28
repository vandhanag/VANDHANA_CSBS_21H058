import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Grid {
    private int width, height;
    private Set<Position> obstacles;

    public Grid(int width, int height, List<Position> obstaclePositions) {
        this.width = width;
        this.height = height;
        this.obstacles = new HashSet<>(obstaclePositions);
    }

    public boolean isValidMove(Position position) {
        return position.x >= 0 && position.x < width && position.y >= 0 && position.y < height
                && !obstacles.contains(position);
    }
}
