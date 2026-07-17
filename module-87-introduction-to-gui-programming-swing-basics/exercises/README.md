# Module 87 Exercises: Introduction to GUI Programming - Swing Basics

## Exercise 1: Greeting App
Create a Swing application that has a JTextField for the user's name and a JButton. When clicked, display "Hello, [name]!" in a JLabel. Center the window on screen.

**Requirements:**
- JFrame with title "Greeting App"
- JTextField (15 columns)
- JButton labeled "Greet"
- JLabel to show the greeting
- Use SwingUtilities.invokeLater

## Exercise 2: Counter App
Build a Swing application with two buttons: "Increment" and "Reset", and a JLabel showing the current count. The count starts at 0. Each click of "Increment" adds 1, "Reset" sets it back to 0.

**Requirements:**
- Start count at 0
- Increment button adds 1
- Reset button sets to 0
- Display current count in a JLabel

## Exercise 3: Color Picker (Simple)
Create a Swing window with three buttons: "Red", "Green", "Blue". Clicking a button changes the background color of a JPanel to that color. Use a JLabel to show the name of the current color.

**Requirements:**
- Three buttons for Red, Green, Blue
- JPanel background changes on button click
- JLabel displays the current color name
- Use `panel.setBackground(Color.RED)` etc.

## Exercise 4: Text Repeater
Build an application with a JTextField and a JButton labeled "Repeat". When clicked, the text from the field should be appended to a JLabel (or multiple JLabels) each time. Each click adds another line of the same text.

**Hint:** Use HTML in a JLabel to create multi-line output: `<html>line1<br>line2</html>`.

## Exercise 5: Window Preferences
Create a Swing application that remembers the last entered text. The window should have a JTextField, a "Save" button that stores the text, and a "Load" button that retrieves and displays the saved text in a JLabel. Use a simple String field in the class to store the saved text.
