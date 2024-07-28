import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MarsRoverSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Grid grid = new Grid(10, 10, List.of(new Position(2, 2), new Position(3, 5)));

        Rover rover = new Rover(0, 0, Direction.N, grid);

        System.out.println("Enter commands (M for move, L for left, R for right) separated by space:");
        String commandInput = scanner.nextLine();
        String[] commandStrings = commandInput.split(" ");

        List<Command> commands = new ArrayList<>();
        for (String cmd : commandStrings) {
            switch (cmd) {
                case "M" -> commands.add(new MoveCommand(rover));
                case "L" -> commands.add(new TurnLeftCommand(rover));
                case "R" -> commands.add(new TurnRightCommand(rover));
                default -> System.out.println("Invalid command: " + cmd);
            }
        }

        for (Command command : commands) {
            command.execute();
        }

        System.out.println(rover.reportStatus());

        scanner.close();
    }
}
