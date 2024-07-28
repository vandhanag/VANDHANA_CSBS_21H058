Mars Rover Simulation and Design Patterns in Java
Exercise 1: Mars Rover Simulation
Overview
This project simulates the movement of a Mars Rover on a 10x10 grid. The rover can move forward, turn left, and turn right. The grid contains obstacles that the rover must detect and avoid.

Functional Requirements
Initialization: The rover starts at a specified position with a given direction (N, E, S, W).
Commands:
M: Move forward in the current direction.
L: Turn left.
R: Turn right.
Obstacle Detection: The rover detects obstacles and stops before colliding.
Status Report: The rover provides a status report with its current position and direction.
Design Patterns
Command Pattern: Encapsulates the commands (M, L, R) as objects.
Composite Pattern: Represents the grid and obstacles.
File Structure
css
Copy code
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
Setup: Ensure you have JDK installed.
Compile: Compile the Java files.
sh
Copy code
javac src/*.java
Run: Run the MarsRoverSimulation program.
sh
Copy code
java -cp src MarsRoverSimulation
Input Commands: Enter commands (e.g., M M R M M L M M R M).
Output: The program will display the final position and status of the rover.
csharp
Copy code
Rover is at (2, 4) facing E. No obstacles detected.
Tests
Compile Tests:
sh
Copy code
javac -cp .:junit-4.13.2.jar:hamcrest-core-1.3.jar tests/MarsRoverSimulationTest.java
Run Tests:
sh
Copy code
java -cp .:junit-4.13.2.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore tests.MarsRoverSimulationTest
License
This project is licensed under the MIT License. See the LICENSE file for more details.

Exercise 2: Design Patterns in Java
Overview
This project contains examples demonstrating different software design patterns in Java. Each example includes a use case with sample input and output. The design patterns covered are:

Behavioral Design Patterns
Command Pattern

Class Name: CommandPatternDemo.java
Description: This example demonstrates a simple remote control that can turn a light on and off using command objects.
Sample Output:
vbnet
Copy code
The light is on.
The light is off.
Observer Pattern

Class Name: ObserverPatternDemo.java
Description: This example simulates a weather station that notifies registered observers (displays) whenever there is a change in weather data.
Sample Output:
sql
Copy code
Current conditions: 80.0F degrees and 65.0% humidity.
Current conditions: 82.0F degrees and 70.0% humidity.
Creational Design Patterns
Factory Method Pattern

Class Name: FactoryMethodPatternDemo.java
Description: This example demonstrates a character creation system for a game using factory methods to create different types of characters (wizard and warrior).
Sample Output:
css
Copy code
Wizard casts a spell!
Warrior swings a sword!
Singleton Pattern

Class Name: SingletonPatternDemo.java
Description: This example demonstrates a logger system where only one instance of the logger class is created (singleton pattern).
Sample Output:
vbnet
Copy code
Log: This is a log message.
Log: This is another log message.
true
Structural Design Patterns
Adapter Pattern

Class Name: AdapterPatternDemo.java
Description: This example demonstrates an adapter pattern that allows a media player to play different types of audio files (MP3 and MP4).
Sample Output:
objectivec
Copy code
Playing MP3 file. Name: song.mp3
Playing MP4 file. Name: video.mp4
Decorator Pattern

Class Name: DecoratorPatternDemo.java
Description: This example demonstrates a coffee shop where different decorators (milk, sugar) are added to the base coffee object.
Sample Output:
javascript
Copy code
Simple coffee $5.0
Simple coffee, with milk $6.5
Simple coffee, with milk, with sugar $7.0
Running the Examples
To run the examples, compile and run the respective Java class files. For example, to run the Command Pattern example:

bash
Copy code
javac CommandPatternDemo.java
java CommandPatternDemo
Requirements
Java Development Kit (JDK) installed
Basic knowledge of Java programming
Conclusion
This project demonstrates various software design patterns in Java with simple and easy-to-understand examples. Each pattern is implemented in a separate class with a specific use case and expected output.

