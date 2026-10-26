# Strategy Pattern Assignment

## Project Overview
This project implements the Strategy behavioral design pattern in Java (JDK 17) for Software Design Patterns (Assignment #5). It demonstrates how interchangeable algorithms can be encapsulated behind a common interface to eliminate conditional logic (if-else/switch) and allow runtime algorithm selection.

## Project Structure
src/
  main/
    java/
      com/
        assignment/
          strategy/     # Strategy Interface
          concrete/     # Concrete Strategy Implementations
          context/      # Context Class
          Main.java     # Client / Entry Point
README.md

## How to Build and Run
Prerequisites: JDK 17, IntelliJ IDEA (recommended) or terminal.

Via Terminal:
1. javac -d bin src/main/java/com/assignment/**/*.java
2. java -cp bin com.assignment.Main

Via IntelliJ:
1. Open project and set JDK to 17.
2. Run Main.java.

## How to Add a New Strategy
1. Create a new class implementing the strategy interface:
   public class NewStrategy implements StrategyInterface {
       @Override
       public double execute(double a, double b) {
           return ...;
       }
   }
2. Instantiate and pass it to the context at runtime:
   Context context = new Context(new NewStrategy());
