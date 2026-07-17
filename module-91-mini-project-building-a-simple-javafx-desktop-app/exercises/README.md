# Module 91 Mini Project: To-Do List Manager

## Project Overview
Build a complete **To-Do List Manager** desktop application using JavaFX, FXML, and CSS. The application allows users to manage tasks with the ability to add, mark as complete, delete, and list all tasks.

This is a single larger project (not multiple exercises). The full solution is provided in the `solutions/` directory.

## Requirements

### Core Features

1. **Add Task**
   - A TextField where the user types a task description
   - An "Add" button that adds the task to the list
   - Empty or whitespace-only input should be rejected with a user-friendly message

2. **List All Tasks**
   - All tasks displayed in a ListView
   - Each task shows its description and completion status (e.g., via a CheckBox or text decoration)
   - The list updates immediately when tasks are added, completed, or deleted

3. **Mark Task as Complete / Incomplete**
   - Each task in the list has a way to toggle its completion status (CheckBox or double-click)
   - Completed tasks should be visually distinct (e.g., strikethrough text, different color)

4. **Delete Task**
   - A "Delete" button that removes the currently selected task
   - A confirmation dialog before deletion (optional but recommended)

5. **Task Statistics**
   - Display the total number of tasks and the number of completed tasks
   - Update the statistics dynamically as tasks change

### Technical Requirements

- **JavaFX with FXML**: The UI must be defined in an FXML file
- **Separate Controller**: All event handling logic must be in a controller class
- **External CSS**: At least one external CSS stylesheet for styling
- **Model Class**: A `Task` class with at least `description` (String) and `completed` (boolean) properties
- **ObservableList**: Use `FXCollections.observableArrayList()` as the backing data for the ListView
- **Custom Cell Factory**: Use a ListCell or CheckBoxListCell to render tasks with completion toggle

### Stretch Goals (Optional)

- **Persistence**: Save tasks to a file (e.g., `tasks.txt`) and load them on startup using BufferedReader/BufferedWriter
- **Edit Task**: Allow double-clicking a task to edit its description
- **Filter**: Add buttons to show "All", "Active", and "Completed" tasks
- **Priority**: Add a ComboBox for task priority (High, Medium, Low) and color-code items
- **Keyboard Shortcuts**: Enter key to add, Delete key to remove selected

## Suggested UI Layout (FXML)

```
+--------------------------------------------------+
|  To-Do List Manager                     [X]      |
+--------------------------------------------------+
|  [TextField______________] [Add]                  |
+--------------------------------------------------+
|  +--------------------------------------------+  |
|  | [x] Learn JavaFX                           |  |
|  | [ ] Build this app                         |  |
|  | [x] Master FXML                            |  |
|  +--------------------------------------------+  |
+--------------------------------------------------+
|  Stats: 3 total, 2 completed    [Delete]          |
+--------------------------------------------------+
```

## Grading Criteria

- **Functionality**: All core features work correctly (add, toggle, delete, stats)
- **Code Quality**: Clean, well-structured code following Java conventions
- **FXML Separation**: UI is defined in FXML, logic in controller
- **Styling**: CSS stylesheet provides a polished look
- **Error Handling**: Invalid input is handled gracefully
- **User Experience**: Clear labels, appropriate feedback, intuitive layout

## Solution
See the `solutions/` directory for a complete implementation.
