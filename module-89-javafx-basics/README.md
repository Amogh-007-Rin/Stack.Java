# Module 89: JavaFX Basics

## Overview
JavaFX is a modern, feature-rich GUI toolkit for Java desktop applications. It replaces Swing as the standard GUI library with hardware-accelerated rendering, CSS styling, FXML-based UI definition, and a cleaner API. This module introduces the JavaFX architecture and core controls.

## Learning Objectives
- Understand JavaFX architecture (Stage, Scene, Node hierarchy)
- Implement the Application class and launch method
- Create and configure Stage and Scene objects
- Use basic controls: Label, Button, TextField, TextArea
- Handle events with setOnAction and EventHandler
- Use layout panes: VBox, HBox, BorderPane, GridPane

## Prerequisites
- JDK 21 (JavaFX may need to be added separately on JDK 11+)
- Basic Java knowledge (inheritance, anonymous classes, lambdas)
- Familiarity with event-driven programming

## Theory

### JavaFX Architecture
JavaFX follows a **staircase** model:

```
Application → Stage (window) → Scene (content graph) → Nodes (controls, layouts)
```

- **Application**: The entry point; override `start(Stage)`.
- **Stage**: The top-level window (like JFrame in Swing).
- **Scene**: The container holding the node graph.
- **Node**: Every visual element (controls, layouts, shapes).

### Basic Controls
| Control    | Description |
|------------|-------------|
| Label      | Non-editable text display |
| Button     | Clickable control with text or icon |
| TextField  | Single-line text input |
| TextArea   | Multi-line text input |

### Event Handling
JavaFX uses a simpler event model than Swing. Use `setOnAction` with a lambda:

```java
button.setOnAction(e -> {
    // handle event
});
```

The `EventHandler<T>` functional interface can also be used.

### Layout Panes
| Pane        | Behavior |
|-------------|----------|
| VBox        | Vertical column |
| HBox        | Horizontal row |
| BorderPane  | Five regions (top, bottom, left, right, center) |
| GridPane    | Flexible grid of rows and columns |

### JavaFX Setup (JDK 11+)
JavaFX is not bundled with JDK 11+. Use the Gluon builds or a build tool like Maven/Gradle with the JavaFX plugin. Compile and run with:

```bash
javac --module-path /path/to/javafx/lib --add-modules javafx.controls HelloJavaFX.java
java --module-path /path/to/javafx/lib --add-modules javafx.controls HelloJavaFX
```

## Code Examples

### Example 1: HelloJavaFX
A minimal JavaFX application displaying "Hello, JavaFX!" with a Label.

### Example 2: ButtonEventDemo
A button that updates a label when clicked, with a counter.

### Example 3: LayoutDemo
Shows VBox, HBox, BorderPane, and GridPane in one application.

### Example 4: TextAreaDemo
A TextField + TextArea combination with event handling.

## Common Pitfalls
- **Missing JavaFX modules**: On JDK 11+, you must explicitly add `javafx.controls` (and `javafx.fxml` if using FXML).
- **Calling Platform.exit() prematurely**: The JavaFX thread terminates when the last Stage is closed; calling `Platform.exit()` forces termination.
- **Modifying nodes off the JavaFX Application Thread**: Use `Platform.runLater()` to update the scene graph from background threads.
- **Not calling `launch()`**: The `main` method must call `Application.launch()` to start JavaFX.
- **Null layout in JavaFX**: Avoid `setLayout(null)` — use layout panes and constraints.

## Exercises
See [exercises/README.md](exercises/README.md) for exercise descriptions.

## Quiz

1. Which class must a JavaFX application extend?
   a) Stage
   b) Scene
   c) Application
   d) Node

2. Which method is overridden to set up the JavaFX UI?
   a) init()
   b) start(Stage)
   c) launch()
   d) run()

3. Which layout pane divides the window into five regions?
   a) VBox
   b) HBox
   c) GridPane
   d) BorderPane

4. How do you handle a button click in JavaFX?
   a) `button.addActionListener(e -> {})`
   b) `button.setOnAction(e -> {})`
   c) `button.onClick(e -> {})`
   d) `button.addEventListener(e -> {})`

5. What is the top-level container in JavaFX?
   a) Stage
   b) Scene
   c) BorderPane
   d) Application

---

**Answers**: 1-c, 2-b, 3-d, 4-b, 5-a

## Key Takeaways
- JavaFX uses a Stage → Scene → Node hierarchy
- Extend `Application` and override `start(Stage)`
- Layout panes (VBox, HBox, BorderPane, GridPane) manage positioning
- Use `setOnAction` for button event handling
- On JDK 11+, add JavaFX modules explicitly

## Next Module
Continue to Module 90: JavaFX FXML and Styling, where you will learn to separate UI definition from logic using FXML and CSS.
