# Module 88: Swing Layouts and Event Handling

## Overview
This module explores Swing layout managers — the mechanisms that automatically position and resize components within containers — and event handling, which allows your GUI to respond to user actions like clicks, key presses, and mouse movements.

## Learning Objectives
- Use FlowLayout, BorderLayout, GridLayout, and BoxLayout
- Handle button clicks with ActionListener
- Handle mouse events with MouseListener
- Handle keyboard events with KeyListener
- Write event handlers with anonymous inner classes and lambdas
- Build a simple calculator UI

## Prerequisites
- Module 87: Introduction to GUI Programming - Swing Basics
- Familiarity with anonymous inner classes and lambda expressions (Java 8+)

## Theory

### Layout Managers
Layout managers automatically arrange components within a container, handling resize and platform-specific rendering differences.

| Manager       | Behavior |
|---------------|----------|
| FlowLayout    | Components flow left-to-right, top-to-bottom (default for JPanel) |
| BorderLayout  | Five regions: NORTH, SOUTH, EAST, WEST, CENTER (default for JFrame) |
| GridLayout    | Equal-sized cells in a grid (rows x columns) |
| BoxLayout     | Single row or column, respecting each component's preferred size |

### Event Handling Model
Swing uses the **delegation event model**. A source component fires an event object to registered listener objects.

**Common listener interfaces:**
- `ActionListener` — single method `actionPerformed(ActionEvent e)`
- `MouseListener` — five methods: clicked, pressed, released, entered, exited
- `KeyListener` — three methods: keyPressed, keyReleased, keyTyped

**Anonymous inner class style:**

```java
button.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        // handle event
    }
});
```

**Lambda style (Java 8+):**

```java
button.addActionListener(e -> {
    // handle event
});
```

Lambda syntax is more concise and is preferred for single-method interfaces (functional interfaces).

## Code Examples

### Example 1: FlowLayoutDemo
Demonstrates FlowLayout with alignment and gap settings.

### Example 2: BorderLayoutDemo
Shows how components are placed in the five BorderLayout regions.

### Example 3: GridLayoutDemo
A simple calculator keypad using GridLayout.

### Example 4: CalculatorUI
A basic calculator with display, number buttons, and operators.

### Example 5: EventListenerDemo
Demonstrates ActionListener, MouseListener, and KeyListener in one application.

## Common Pitfalls
- **Null layout**: Try to avoid `setLayout(null)`; it makes the UI non-resizable and platform-dependent.
- **Forgetting to set layout**: JFrame's content pane uses BorderLayout by default — adding components without specifying a region places them all in CENTER, overwriting each other.
- **Blocking the EDT**: Long-running operations in event handlers freeze the UI. Use SwingWorker or separate threads.
- **Listener memory leaks**: Anonymous listener classes hold a reference to the enclosing class. For long-lived components, consider using weak references or removing listeners when no longer needed.
- **Mixing layout managers**: Nesting panels with different layouts is powerful, but over-nesting can hurt performance.

## Exercises
See [exercises/README.md](exercises/README.md) for exercise descriptions.

## Quiz

1. Which layout manager does JFrame's content pane use by default?
   a) FlowLayout
   b) BorderLayout
   c) GridLayout
   d) BoxLayout

2. How many components can you add to each region of a BorderLayout?
   a) 1
   b) Unlimited
   c) 5
   d) 10

3. Which of the following is a functional interface suitable for a lambda expression?
   a) MouseListener
   b) KeyListener
   c) ActionListener
   d) WindowListener

4. What does `GridLayout(3, 2)` create?
   a) 3 columns, 2 rows
   b) 3 rows, 2 columns
   c) 3 rows, an unspecified number of columns
   d) A single row with 6 cells

5. Which method is called when a mouse button is clicked (pressed and released)?
   a) mouseClicked
   b) mousePressed
   c) mouseReleased
   d) mouseEntered

---

**Answers**: 1-b, 2-a, 3-c, 4-b, 5-a

## Key Takeaways
- Layout managers handle component positioning and resizing automatically
- BorderLayout has five regions; FlowLayout flows left-to-right; GridLayout creates equal-sized cells
- Event listeners use the delegation model with interfaces
- Lambda expressions provide concise event handler syntax
- Never block the EDT with long-running code

## Next Module
Continue to Module 89: JavaFX Basics, where you will learn a modern alternative to Swing for desktop GUI development.
