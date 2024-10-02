# EI_Study_Assignment

## Design Patterns Implementation in Java
This repository demonstrates the implementation of six different design patterns (two use cases for each category: behavioral, creational, and structural) using Java. Each pattern is implemented in adherence to global best practices, focusing on clean code, optimization, and modular structure. All the classes are separated into different files for better organization and scalability.

Behavioral Design Patterns:
Observer Pattern - Weather Monitoring System:
A weather station system that notifies multiple devices whenever the weather conditions change. Devices subscribe to updates and are notified in real-time about weather changes.

Strategy Pattern - Payment Processing System:
A flexible payment system that allows users to select between different payment methods (e.g., Credit Card, PayPal) to process payments. The strategy pattern is used to enable dynamic method selection without altering the core logic.

Creational Design Patterns:
Singleton Pattern - Configuration Manager:
A configuration manager that ensures a single instance is maintained across the entire application. It allows different parts of the application to access and modify global configurations safely.

Factory Pattern - Vehicle Factory:
A vehicle factory that produces different types of vehicles (e.g., Car, Bike) based on user input. The factory pattern centralizes object creation logic, promoting code reusability and maintainability.

Structural Design Patterns:
Adapter Pattern - Media Player:
A media player that supports multiple formats (e.g., MP3, VLC). The adapter pattern is used to make different incompatible media formats work seamlessly together in a unified player interface.

Decorator Pattern - Coffee Shop:
A flexible coffee ordering system where users can add ingredients (e.g., Milk, Sugar) to their coffee. The decorator pattern enables dynamic addition of functionality without modifying the base class, keeping the design extensible and clean.


## Mars Rover Simulation (Java)
This repository contains a Mars Rover Simulation implemented in Java as part of the coding exercise. The goal of the project is to simulate a Mars Rover navigating a grid-based terrain, with a focus on applying design patterns, SOLID principles, and clean code best practices.

Key Features:
Command Pattern: Used to encapsulate the rover's movement (Move, Turn Left, Turn Right) as separate command objects, allowing for flexible command execution and history management.
Composite Pattern: The grid is modeled as a composite structure, containing obstacles and boundaries that the rover must navigate.
Behavioral Pattern (Invoker): The command invoker tracks and executes commands while ensuring proper rover navigation.
SOLID Principles: The code adheres to single-responsibility, open-closed, and dependency inversion principles to ensure scalability and maintainability.
Object-Oriented Design: The project is fully object-oriented, emphasizing encapsulation, inheritance, and polymorphism where appropriate.

Simulation Features:
Grid Initialization: The grid size is customizable, with obstacles defined at specific coordinates.
Rover Commands: The rover can move forward, turn left, or turn right while avoiding obstacles and staying within grid boundaries.
Obstacle Detection: The rover detects obstacles and prevents movement when necessary, simulating real-world terrain challenges.
Status Reporting: After executing a series of commands, the rover provides its final position and facing direction, ensuring traceability of the operations.

Design Patterns Implemented:
Command Pattern: Encapsulates rover commands as objects to support command execution and history management.
Composite Pattern: Manages grid and obstacles within a hierarchical structure.
Behavioral Design: The use of the invoker ensures proper execution of rover commands in sequence.

Usage:
The project is a console-based application, and no fancy UI is required. The rover starts at a predefined position on the grid and navigates based on user-provided commands. The grid can be customized to include different obstacles, and the system gracefully handles invalid movements, boundaries, and obstacle collisions.

Technologies Used:
Java
Object-Oriented Design
SOLID Principles
Design Patterns (Command, Composite)
This project demonstrates the practical application of design patterns in solving a real-world problem, showcasing the importance of code quality, maintainability, and performance. The project serves as an example of implementing a command-driven simulation in Java, following best practices for professional software development.
