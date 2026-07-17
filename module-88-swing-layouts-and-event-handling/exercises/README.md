# Module 88 Exercises: Swing Layouts and Event Handling

## Exercise 1: Temperature Converter
Build a temperature converter that converts between Celsius and Fahrenheit. Use a GridLayout for the form: a JTextField for input, a JLabel showing "Celsius" / "Fahrenheit", two JButtons ("To Fahrenheit", "To Celsius"), and a JLabel for the result.

**Requirements:**
- Use GridLayout or a nested combination of layouts
- Input field accepts a number
- "To Fahrenheit" button converts C → F: (C * 9/5) + 32
- "To Celsius" button converts F → C: (F - 32) * 5/9
- Display the result with the unit label

## Exercise 2: Simple Login Form
Create a login form with BorderLayout. Place a JPanel with GridLayout in the CENTER containing "Username:" JLabel + JTextField and "Password:" JLabel + JPasswordField. Place a "Login" JButton in the SOUTH. Clicking Login should display a message dialog (JOptionPane.showMessageDialog) showing "Welcome, [username]!" if password is "java", or "Access denied" otherwise.

**Requirements:**
- Username and password fields arranged in a grid
- JPasswordField for password input
- BorderLayout for the overall layout
- JOptionPane for result messages

## Exercise 3: Mouse Event Painter
Create an application that uses a JPanel with a MouseListener. When the user clicks on the panel, draw a small filled circle at the click location. Use Graphics (override paintComponent) and store click points in a List<Point>.

**Requirements:**
- Override paintComponent to draw circles
- Store points in a List<Point>
- Mouse click adds a point and repaints
- Use a different color for the circles

## Exercise 4: Key Event Monitor
Create an application with a large JTextArea (read-only) and a JTextField. As the user types in the JTextField, display each key typed in the JTextArea on a new line showing: "Key typed: [char] | Key code: [code]". Use a KeyListener.

**Requirements:**
- JTextField listens for key events
- JTextArea displays event details (use setEditable(false))
- Show both the character and the key code
- Append each event on a new line

## Exercise 5: Multiplication Table
Build a window that displays a multiplication table. Use a GridLayout(10, 10). Each cell should be a JButton (or JLabel) showing the product of (row * column) for rows 1-10 and columns 1-10. When a cell is clicked, display the formula (e.g., "3 x 4 = 12") in a status JLabel at the bottom.

**Requirements:**
- 10x10 grid of buttons
- Each button shows the product of its row and column indices
- Clicking a button shows the formula in a status label
- Use nested BorderLayout (CENTER for grid, SOUTH for status)
