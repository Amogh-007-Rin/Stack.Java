# Module 63 Exercises

## Exercise 1: Student Serialization
Create a `Student` class (name, id, gpa) that implements `Serializable`. Write a program that serializes a `Student` object to a file and deserializes it back.

## Exercise 2: Transient Password
Create a `User` class with `username`, `email`, and `password` (mark `password` as `transient`). Serialize a `User`, then deserialize and verify that `password` is `null`.

## Exercise 3: serialVersionUID Mismatch
Serialize an object, then modify the class (add a field) without updating `serialVersionUID`. Attempt deserialization and observe the error. Then fix by adding `serialVersionUID`.

## Exercise 4: Collection Serialization
Serialize an `ArrayList` of objects (e.g., `List<Student>`) to a file and deserialize it back.
