# Module 36: Enums — Exercises

## Exercise 1: Season Enum

Create an enum `Season` with constants: SPRING, SUMMER, AUTUMN, WINTER.

Write a main method that:
- Iterates over all seasons using `values()`
- Prints each season's name and ordinal
- Uses a switch statement to print a message for each season

## Exercise 2: HttpStatus Enum with Fields

Create an enum `HttpStatus` with:
- Constants: OK(200), NOT_FOUND(404), INTERNAL_SERVER_ERROR(500)
- A field `int code`
- A field `String message`
- A constructor that sets both
- Methods `int getCode()` and `String getMessage()`

Write a main method that iterates over all statuses and prints code + message.

## Exercise 3: PizzaSize Enum with Pricing

Create an enum `PizzaSize` with:
- Constants: SMALL(8.99), MEDIUM(11.99), LARGE(14.99)
- A field `double price`
- A constructor that sets the price
- A method `double getPrice()`
- A method `String getDescription()` that returns size name + price

Write a main method that:
- Iterates over all sizes and prints descriptions
- Uses a switch to print a message for each size
