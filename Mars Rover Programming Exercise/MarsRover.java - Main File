public class MarsRover {
    public static void main(String[] args) {
        // Initialize a 10x10 grid with obstacles at (2,2) and (3,5)
        Grid grid = new Grid(10, 10);
        grid.addObstacle(2, 2);
        grid.addObstacle(3, 5);
        
        // Initialize Rover starting at (0, 0) facing North
        Rover rover = new Rover(0, 0, Direction.NORTH, grid);
        
        // Execute a sequence of commands
        Command moveCommand = new MoveCommand(rover);
        Command leftCommand = new TurnLeftCommand(rover);
        Command rightCommand = new TurnRightCommand(rover);

        // Use Invoker to execute commands
        Invoker invoker = new Invoker();
        invoker.executeCommand(moveCommand);
        invoker.executeCommand(moveCommand);
        invoker.executeCommand(rightCommand);
        invoker.executeCommand(moveCommand);
        invoker.executeCommand(leftCommand);
        invoker.executeCommand(moveCommand);
        
        // Final position and status
        System.out.println(rover.getStatus());
    }
}
