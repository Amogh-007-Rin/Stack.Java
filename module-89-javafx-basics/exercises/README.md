# Module 89 Exercises: JavaFX Basics

## Exercise 1: Personal Information Form
Create a JavaFX application with a form that collects: First Name, Last Name, and Email (three TextFields). When a "Submit" button is clicked, display the collected information in a TextArea (read-only) in a formatted way. Use a GridPane for the form layout and a VBox for the overall structure.

**Requirements:**
- GridPane for labels + fields (3 rows)
- VBox for overall layout
- TextArea to display submitted info
- "Submit" button copies data to TextArea
- "Clear" button resets all fields

## Exercise 2: Bouncing Ball Counter
Create an application with two Buttons ("Increment" and "Decrement") and a Label displaying a numeric value (starting at 0). The value should never go below 0. Use an HBox for the buttons and a VBox for the overall layout with the label centered.

**Requirements:**
- Label shows current count
- Increment adds 1
- Decrement subtracts 1 (minimum 0)
- HBox for buttons, VBox overall
- Styling: set font size on the label to 24px

## Exercise 3: Simple Notepad
Build a simple text editor with a TextArea for editing, a TextField for a file name (prompt: "File name"), and buttons: "New", "Save" (simulate by appending to the TextArea a message), "Append Date". The "Append Date" button adds the current date/time to the TextArea. Use BorderPane with the TextArea in CENTER and controls in TOP.

**Requirements:**
- BorderPane layout
- TextArea in CENTER (editable)
- Controls in TOP area using HBox
- Append current date/time using java.time.LocalDateTime.now()

## Exercise 4: Unit Converter
Create a unit converter with a ComboBox<String> for "From" unit, a ComboBox<String> for "To" unit, a TextField for input value, and a Label for the result. Support conversions between: Meters, Kilometers, Miles. (1 km = 1000 m, 1 mile = 1609.34 m).

**Requirements:**
- Two ComboBoxes with units
- TextField for input
- Label for result
- Convert button triggers calculation
- Use GridPane for layout

## Exercise 5: Number Guessing Game
Build a number guessing game. The program picks a random number between 1 and 100. The user enters a guess in a TextField and clicks "Guess". Show "Too high", "Too low", or "Correct!" in a Label. Count the number of attempts. Use a "New Game" button to reset.

**Requirements:**
- Random number between 1 and 100
- Guess button checks the input
- Attempt counter displayed
- New Game button resets everything
- Use VBox layout with proper spacing
