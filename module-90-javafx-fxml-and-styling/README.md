# Module 90: JavaFX FXML and Styling

## Overview
This module covers FXML — an XML-based language for defining JavaFX user interfaces — and CSS styling for JavaFX applications. Separating UI layout (FXML) from application logic (Java controllers) improves maintainability, enables visual design tools like Scene Builder, and follows the Model-View-Controller pattern.

## Learning Objectives
- Understand FXML structure and elements
- Use FXMLLoader to load FXML files
- Annotate controller fields and methods with @FXML
- Apply CSS styles to JavaFX nodes
- Use inline styles, style classes, and external stylesheets
- Build a login form with FXML + CSS

## Prerequisites
- Module 89: JavaFX Basics
- Basic understanding of XML
- Familiarity with CSS (cascading style sheets)

## Theory

### FXML Overview
FXML is an XML-based markup language that describes the JavaFX scene graph. It allows you to define the UI structure separate from the application logic.

**Basic FXML structure:**

```xml
<?xml version="1.0" encoding="UTF-8"?>
<?import javafx.scene.layout.VBox?>
<?import javafx.scene.control.Label?>
<VBox xmlns:fx="http://javafx.com/fxml"
      fx:controller="com.example.MyController">
    <Label text="Hello, FXML!"/>
</VBox>
```

### FXMLLoader
The `FXMLLoader` class reads an FXML file, constructs the node graph, and connects it to the controller.

```java
FXMLLoader loader = new FXMLLoader(getClass().getResource("MyLayout.fxml"));
Parent root = loader.load();
Scene scene = new Scene(root);
```

### @FXML Annotation
The `@FXML` annotation is placed on fields and methods in the controller class to make them accessible from FXML. It allows the FXMLLoader to inject references to UI components and connect event handlers.

### Scene Builder
Scene Builder is a visual drag-and-drop tool (by Gluon) that generates FXML files. It accelerates UI development by allowing designers to build layouts without writing code.

### CSS in JavaFX
JavaFX supports styling via CSS, similar to web development.

**Ways to apply styles:**
1. **Inline**: `button.setStyle("-fx-background-color: red;");`
2. **Style class**: `button.getStyleClass().add("my-button");` with `.my-button { ... }` in a stylesheet
3. **External stylesheet**: `scene.getStylesheets().add("style.css");`

**Common CSS properties:**
- `-fx-font-size`, `-fx-font-family`, `-fx-font-weight`
- `-fx-background-color`, `-fx-text-fill`
- `-fx-padding`, `-fx-border-color`, `-fx-border-radius`
- `-fx-alignment`

### Compiling with FXML
On JDK 11+, include `javafx.fxml` module:

```bash
javac --module-path /path/to/javafx/lib --add-modules javafx.controls,javafx.fxml LoginForm.java
java --module-path /path/to/javafx/lib --add-modules javafx.controls,javafx.fxml LoginForm
```

## Code Examples

### Example 1: LoginForm (FXML + CSS)
A complete login form with FXML-based UI and external CSS styling.

### Example 2: FXMLTableDemo
A data display using TableView defined in FXML with CSS alternating row colors.

### Example 3: CSSStylingDemo
Demonstrates inline styles, style classes, and external stylesheet loading.

## Common Pitfalls
- **FXML file not found**: The FXML file must be on the classpath. Use `getClass().getResource("/path.fxml")` or place it alongside the class file.
- **Missing @FXML on controller fields**: Without `@FXML`, the FXMLLoader cannot inject the component reference.
- **Controller method signature**: Event handler methods in FXML (`onAction="#handleLogin"`) must match the signature `public void methodName(ActionEvent event)` or `public void methodName()`.
- **CSS syntax**: JavaFX CSS uses `-fx-` prefixed properties, not standard CSS properties like `background-color`.
- **fx:controller package mismatch**: The fully qualified class name in `fx:controller` must match the actual controller package.

## Exercises
See [exercises/README.md](exercises/README.md) for exercise descriptions.

## Quiz

1. Which annotation is used to mark controller fields for FXML injection?
   a) @Override
   b) @FXML
   c) @Inject
   d) @Resource

2. Which class loads an FXML file?
   a) FXMLDocument
   b) FXMLReader
   c) FXMLLoader
   d) FXMLParser

3. What CSS property sets the background color in JavaFX?
   a) background-color
   b) -fx-background-color
   c) bg-color
   d) fx-background

4. Which attribute in FXML connects a button's action to a controller method?
   a) onClick
   b) onAction
   c) action="#method"
   d) onAction="#method"

5. What tool is commonly used to visually design FXML layouts?
   a) NetBeans GUI Builder
   b) JavaFX Scene Builder
   c) Eclipse WindowBuilder
   d) IntelliJ UI Designer

---

**Answers**: 1-b, 2-c, 3-b, 4-d, 5-b

## Key Takeaways
- FXML separates UI layout from application logic
- @FXML annotation enables dependency injection from FXML to controller
- FXMLLoader parses FXML and builds the scene graph
- JavaFX CSS uses `-fx-` prefixed properties
- Scene Builder is a visual tool for designing FXML layouts
- External stylesheets keep styling modular and reusable

## Next Module
Continue to Module 91: Mini Project — Building a Simple JavaFX Desktop App, where you will build a complete To-Do List Manager using JavaFX and FXML.
