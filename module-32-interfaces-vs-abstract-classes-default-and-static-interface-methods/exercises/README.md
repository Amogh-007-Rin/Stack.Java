# Module 32: Interfaces vs Abstract Classes, Default and Static Interface Methods — Exercises

## Exercise 1: Media Player

Create an abstract class `MediaPlayer` with:
- Field: `String mediaName`
- Constructor to set the name
- Abstract method: `void play()`
- Concrete method: `void stop()` that prints "Stopping [mediaName]"

Create an interface `VolumeControl` with:
- Default method `void volumeUp()` that prints "Volume increased"
- Default method `void volumeDown()` that prints "Volume decreased"

Create a class `AudioPlayer` that extends `MediaPlayer` and implements `VolumeControl`. Implement `play()` to print "Playing audio: [mediaName]".

Write a main method that creates an `AudioPlayer` and calls all methods.

## Exercise 2: DataProcessor with Default and Static Methods

Create an interface `DataProcessor` with:
- Abstract method `void process(String data)`
- Default method `void validate(String data)` that checks if data is null or blank and prints a warning
- Static method `boolean isNullOrBlank(String data)` that returns true if data is null or blank

Create a class `UpperCaseProcessor` that implements `DataProcessor`:
- `process()` converts data to uppercase and prints it

Write a main method that demonstrates processing with validation.

## Exercise 3: Shape with Default and Static Methods

Create an interface `Shape` with:
- Abstract method `double area()`
- Default method `String description()` that returns "This is a shape"
- Static method `String unit()` that returns "square units"

Create a class `Circle` that implements `Shape`:
- Field: `double radius`
- Constructor sets radius
- Implements `area()` as PI * r * r
- Overrides `description()` to return "This is a circle"

Create a class `Square` that implements `Shape`:
- Field: `double side`
- Constructor sets side
- Implements `area()` as side * side

Write a main method that creates one of each and prints area, description, and unit.
