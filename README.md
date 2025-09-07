Abstract vs Interface Design – Shape Management System

This Java project implements a Shape Management System using both abstract classes and interfaces to explore object-oriented design principles. The goal is to demonstrate how different modeling techniques can be used to represent shared behaviors like area calculation, drawing, and shape description.

The codebase is structured into three packages:
- "main" – Contains the entry point and user interface ("Main.java")
- "shapes" – Contains the abstract class ("Shape") and concrete shape implementations ("Circle", "Rectangle","Hexagon")
- "interfaces" – Defines behavior contracts ("Calculable", "Describable")

Users interact with the system via a command-line menu to create and view shapes. Each shape supports area calculation, drawing, and description. Polymorphism is demonstrated by storing created shapes in a shared list and interacting with them through their common abstract type.

To compile and run:
1. Compile: "javac main/Main.java"
2. Run: "java main.Main"

This project compares the abstract class approach (shared structure and default behavior) with the interface-based approach (behavioral flexibility). Both are implemented and tested across multiple shapes, allowing for an objective comparison in terms of scalability, reusability, and clarity.

The project satisfies the full set of assignment criteria, including JavaDocs, modular code organization, and design reflections.
