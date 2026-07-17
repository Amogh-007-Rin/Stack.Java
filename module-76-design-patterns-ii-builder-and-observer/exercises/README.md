# Module 76: Exercises - Builder and Observer

## Exercise 1: Custom Burger Builder
Create a `Burger` class with fields: `String bun`, `String patty`, `boolean cheese`, `boolean lettuce`, `boolean tomato`, `boolean bacon`, `String sauce`. Implement a fluent Builder. Demonstrate building at least 3 different burgers with varying combinations.

## Exercise 2: Email Builder with Validation
Create an `Email` class using the Builder pattern with fields: `String from`, `String to`, `String subject`, `String body`, `List<String> cc`, `List<String> bcc`, `boolean isHtml`. The `build()` method should validate that `from` and `to` are non-null and non-empty, throwing `IllegalStateException` if invalid.

## Exercise 3: Stock Price Observer
Create a `Stock` class (subject) that holds a `String symbol` and `double price`. Define a `StockObserver` interface. Implement `PriceDisplay` (prints price changes) and `AlertSystem` (prints a warning if price changes by more than 5%). Demonstrate with a few price updates.

## Exercise 4: Chat Room Observer
Create a simple chat room where `User` objects implement a `MessageListener` interface. A `ChatRoom` class maintains a list of users and broadcasts messages. When a user sends a message via the chat room, all users (including the sender, optionally) receive it.
