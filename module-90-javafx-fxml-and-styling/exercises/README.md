# Module 90 Exercises: JavaFX FXML and Styling

## Exercise 1: Registration Form with FXML
Create a registration form using FXML with fields: Full Name, Email, Password, Confirm Password. The controller should validate that passwords match and all fields are non-empty. Display success/error messages in a Label. Apply CSS styling (background color, padding, font styles).

**Requirements:**
- FXML file defines the UI layout
- Controller class annotated with @FXML
- Validation logic in controller
- External CSS stylesheet
- Success/failure message displayed in a Label

## Exercise 2: Contact Manager (FXML + ListView)
Build a contact manager using FXML with a ListView to display contact names (use ObservableList) and a detail area (Labels) showing the selected contact's phone and email. Use a VBox layout. Hard-code 3-5 contacts.

**Requirements:**
- FXML layout with ListView and detail labels
- Controller populated with sample contacts
- ListView selection listener updates the detail area
- CSS styling for the ListView and labels

## Exercise 3: Styled Calculator
Create a calculator UI using FXML that looks like a modern calculator. Use a GridPane for buttons and a TextField for the display (non-editable). Style it with CSS: dark background, rounded buttons, different colors for number buttons vs operator buttons.

**Requirements:**
- FXML layout with GridPane for buttons
- Controller handles digit and operator input
- CSS stylesheet with dark theme
- Number buttons in one style class, operators in another
- Display shows the current expression

## Exercise 4: Profile Card with CSS Animations
Create an FXML layout that displays a "profile card" — an ImageView (use a placeholder or a colored Shape), a name Label, a title Label, and a bio TextArea. Use CSS transitions/hover effects (change background color, scale slightly on hover using -fx-scale-x/y).

**Requirements:**
- FXML layout for the card
- CSS with hover effects using -fx-scale-x and -fx-scale-y
- Use -fx-effect for drop shadow
- Profile picture (use Rectangle as placeholder)

## Exercise 5: Theme Switcher
Build an FXML application with two buttons: "Light Theme" and "Dark Theme". Clicking each button switches the external stylesheet applied to the Scene. Define two CSS files (light-theme.css, dark-theme.css) with contrasting color schemes.

**Requirements:**
- FXML layout with controls and a content area
- Two external CSS stylesheets
- Buttons swap the applied stylesheet
- Dark theme: dark background, light text
- Light theme: light background, dark text
