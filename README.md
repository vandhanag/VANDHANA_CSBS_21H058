Mars Rover Simulation and Design Patterns in Java
Exercise 1: Mars Rover Simulation
Overview
Simulates the movement of a Mars Rover on a 10x10 grid. The rover can move forward, turn left, and turn right, detecting and avoiding obstacles.

Functional Requirements
Initialization: Starts at a specified position with a given direction (N, E, S, W).
Commands: M (move), L (turn left), R (turn right).
Obstacle Detection: Stops before colliding with obstacles.
Status Report: Provides current position and direction.
File Structure
.
├── src
│   ├── Command.java
│   ├── Direction.java
│   ├── Grid.java
│   ├── MarsRoverSimulation.java
│   ├── MoveCommand.java
│   ├── Position.java
│   ├── Rover.java
│   ├── TurnLeftCommand.java
│   ├── TurnRightCommand.java
└── tests
    └── MarsRoverSimulationTest.java
How to Run
1.Setup: Ensure JDK is installed.
2.Compile: javac src/*.java
3.Run: java -cp src MarsRoverSimulation
4.Input Commands: e.g., M M R M M L M M R M
5.Output: Displays final position and status.
Tests
1.Compile Tests: javac -cp .:junit-4.13.2.jar:hamcrest-core-1.3.jar tests/MarsRoverSimulationTest.java
2.Run Tests: java -cp .:junit-4.13.2.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore tests.MarsRoverSimulationTest
License
MIT License. See LICENSE file for details.

Exercise 2: Design Patterns in Java
Overview
Examples demonstrating different software design patterns in Java. Each example includes a use case with sample input and output.

Patterns Covered
Behavioral:
Command Pattern (CommandPatternDemo.java)
Observer Pattern (ObserverPatternDemo.java)
Creational:
Factory Method Pattern (FactoryMethodPatternDemo.java)
Singleton Pattern (SingletonPatternDemo.java)
Structural:
Adapter Pattern (AdapterPatternDemo.java)
Decorator Pattern (DecoratorPatternDemo.java)
Running the Examples
Compile and run the respective Java class files. Example for Command Pattern:

1.Compile: javac CommandPatternDemo.java
2.Run: java CommandPatternDemo
Requirements
1.Java Development Kit (JDK) installed
2.Basic knowledge of Java programming
Conclusion
Demonstrates various software design patterns in Java with simple examples, each implemented in a separate class with a specific use case.


