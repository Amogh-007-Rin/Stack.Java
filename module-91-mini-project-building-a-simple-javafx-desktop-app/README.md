# Module 91: Mini Project — Building a Simple JavaFX Desktop App

## Overview
This module is a capstone project that brings together everything you have learned about JavaFX: layouts, controls, event handling, FXML, and CSS styling. You will build a fully functional **To-Do List Manager** — a desktop application that allows users to add, complete, delete, and list tasks.

## Learning Objectives
- Design and implement a complete JavaFX application from scratch
- Use FXML to separate UI layout from controller logic
- Use ListView, TextField, and Buttons effectively
- Handle CRUD (Create, Read, Update, Delete) operations in a GUI
- Apply CSS styling for a polished appearance
- Implement in-memory data storage (with optional file I/O persistence)

## Prerequisites
- Modules 89-90: JavaFX Basics and FXML/Styling
- Familiarity with Java collections (ArrayList, ObservableList)
- Understanding of the MVC pattern

## Theory

### Application Architecture
The To-Do List Manager follows a simple architecture:

- **Model**: `Task` class with properties (description, completed status)
- **View**: FXML layout with ListView, TextField, and buttons
- **Controller**: Java class that handles user actions and updates the view
- **Styles**: External CSS for visual design

### Key JavaFX Features Used
- **ListView** with `ObservableList` for dynamic task display
- **CheckBox** or custom cell factory for completion status
- **TextField** for new task input
- **Button** event handlers for add, delete, and toggle actions
- **CSS** for custom ListView cell styling

### Data Persistence (Extension)
The basic version stores tasks in memory. For persistence, implement file I/O using `BufferedReader`/`BufferedWriter` to save and load tasks from a text file.

### Cell Factory
To customize how tasks appear in the ListView, use a custom `ListCell` that shows a CheckBox for completion alongside the task description.

```java
listView.setCellFactory(lv -> new ListCell<Task>() {
    @Override
    protected void updateItem(Task task, boolean empty) {
        super.updateItem(task, empty);
        if (empty || task == null) {
            setText(null);
            setGraphic(null);
        } else {
            CheckBox cb = new CheckBox(task.getDescription());
            cb.setSelected(task.isCompleted());
            cb.setOnAction(e -> task.setCompleted(cb.isSelected()));
            setGraphic(cb);
        }
    }
});
```

## Code Examples
See [examples/](examples/) for a minimal JavaFX demo showing ListView basics.

## Exercises
See [exercises/README.md](exercises/README.md) for the full project description.

## Common Pitfalls
- **ObservableList must be used with ListView**: Using a regular ArrayList will not trigger UI updates.
- **Cell factory performance**: Creating new nodes in `updateItem` is fine for small lists; for large lists, consider reusing nodes.
- **FXML file location**: Ensure FXML and CSS files are on the classpath (same directory as the class files).
- **Not handling empty input**: Always validate user input before adding a task.
- **Thread safety**: All UI updates must happen on the JavaFX Application Thread.

## Quiz

1. Which JavaFX collection type should be used as the backing data for a ListView?
   a) ArrayList
   b) LinkedList
   c) ObservableList
   d) HashMap

2. What method on ListView is used to customize how items are displayed?
   a) setItems()
   b) setCellFactory()
   c) setConverter()
   d) setRenderer()

3. Which FXMLLoader method returns the controller instance?
   a) getController()
   b) getControllerClass()
   c) loadController()
   d) getInstance()

4. What attribute in FXML connects a button click to a controller method?
   a) onClick="#method"
   b) onAction="#method"
   c) action="#method"
   d) handler="#method"

5. Which file extension is used for JavaFX stylesheets?
   a) .style
   b) .fxss
   c) .css
   d) .jfxss

---

**Answers**: 1-c, 2-b, 3-a, 4-b, 5-c

## Key Takeaways
- A complete JavaFX application combines FXML, a controller, and CSS
- ListView with ObservableList provides reactive data display
- Custom cell factories enable rich list item rendering
- Validating input and providing user feedback is essential
- File I/O can extend the app with data persistence

## Next Module
Congratulations on completing Phase 12! You now have a solid foundation in Java desktop GUI programming with both Swing and JavaFX. Consider exploring more advanced topics like JavaFX charts, animations, or multi-threading with Platform.runLater and Task.
