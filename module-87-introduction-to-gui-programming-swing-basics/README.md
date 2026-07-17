# Module 87: Introduction to GUI Programming - Swing Basics

## Overview
This module introduces graphical user interface (GUI) programming in Java using Swing. Swing is Java's original widget toolkit that provides a rich set of components for building desktop applications. Despite being older than JavaFX, Swing remains widely used in enterprise environments due to its maturity, stability, and extensive documentation.

## Learning Objectives
- Understand the Swing component hierarchy
- Create a basic JFrame window
- Add JPanel, JLabel, JButton, and JTextField components
- Understand the Event Dispatch Thread (EDT)
- Use SwingUtilities.invokeLater for thread-safe GUI updates
- Build a simple "Hello World" Swing application

## Prerequisites
- Java SE Development Kit (JDK) 21
- Basic understanding of classes, inheritance, and interfaces
- Familiarity with event-driven programming concepts

## Theory

### Swing Architecture
Swing is part of the Java Foundation Classes (JFC) and is built on top of the Abstract Window Toolkit (AWT). Swing components are lightweight — they are written entirely in Java and do not rely on native OS widgets.

### Component Hierarchy
- **JFrame**: The top-level container representing a window
- **JPanel**: A generic lightweight container used to group components
- **JLabel**: Displays text or an image
- **JButton**: A clickable button that triggers actions
- **JTextField**: A single-line text input field

### Event Dispatch Thread (EDT)
All Swing components must be created and updated on the Event Dispatch Thread. Swing is not thread-safe; accessing GUI components from any other thread can cause unpredictable behavior. The `SwingUtilities.invokeLater` method schedules a Runnable to be executed on the EDT.

```java
SwingUtilities.invokeLater(() -> {
    // Create and show GUI
});
```

### Hello World Swing Window
The simplest Swing application creates a JFrame, sets its size and close operation, makes it visible, and runs the whole thing on the EDT.

## Code Examples

### Example 1: HelloWorldSwing
A minimal Swing application that displays a window with a greeting label.

### Example 2: SimpleWindow
Shows how to configure JFrame properties: title, size, close operation, centering.

### Example 3: ButtonDemo
Demonstrates a JButton with an ActionListener that updates a JLabel.

### Example 4: TextInputDemo
A JTextField that captures user input and displays it in a JLabel when a button is clicked.

## Common Pitfalls
- **Forgetting invokeLater**: Creating Swing components on the main thread can cause intermittent deadlocks and rendering glitches.
- **Null layout**: Avoid `setLayout(null)` and absolute positioning — use layout managers instead.
- **Not setting default close operation**: Without `setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)`, the window closes but the JVM keeps running.
- **Mixing AWT and Swing components**: Prefer Swing components (JFrame, JPanel) over AWT (Frame, Panel) for consistent behavior.

## Exercises
See [exercises/README.md](exercises/README.md) for exercise descriptions.

## Quiz

1. Which method ensures Swing code runs on the Event Dispatch Thread?
   a) `SwingUtilities.invokeLater()`
   b) `Thread.start()`
   c) `EventQueue.invoke()`
   d) `SwingWorker.execute()`

2. What is the top-level container for a Swing window?
   a) JPanel
   b) JWindow
   c) JFrame
   d) JDialog

3. Which layout manager does JPanel use by default?
   a) BorderLayout
   b) FlowLayout
   c) GridLayout
   d) BoxLayout

4. What happens if you do not call `setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)`?
   a) The program crashes when the window closes
   b) The window closes but the JVM continues running
   c) The window cannot be closed
   d) An exception is thrown

5. Which component is best for single-line text input?
   a) JLabel
   b) JTextArea
   c) JTextField
   d) JTextPane

---

**Answers**: 1-a, 2-c, 3-b, 4-b, 5-c

## Key Takeaways
- Swing is a mature, enterprise-ready GUI toolkit for Java
- Always use `SwingUtilities.invokeLater` to start your GUI
- JFrame is the top-level window; JPanel is a reusable container
- JLabel, JButton, and JTextField are the fundamental components
- Never access Swing components from outside the EDT

## Next Module
Continue to Module 88: Swing Layouts and Event Handling, where you will learn about layout managers and handling user interactions.
