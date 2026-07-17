# Module 74: Unit Testing Concepts with JUnit

## Overview
Unit testing is the practice of verifying individual units of code in isolation. JUnit 5 is the de facto standard testing framework for Java. This module covers writing and organizing tests, assertions, lifecycle hooks, and running tests.

## Learning Objectives
- Write JUnit 5 tests using `@Test` and assertion methods
- Use `assertEquals`, `assertTrue`, `assertFalse`, `assertNull`, `assertThrows`
- Understand the test lifecycle (`@BeforeEach`, `@AfterEach`, `@BeforeAll`, `@AfterAll`)
- Apply the Arrange-Act-Assert pattern
- Run tests from the IDE and command line
- Compare JUnit with pytest and Jest

## Prerequisites
- Java programming fundamentals
- Familiarity with exceptions

## Theory

### Test Structure: Arrange-Act-Assert
```
// Arrange — set up objects and data
Calculator calc = new Calculator();

// Act — call the method under test
int result = calc.add(2, 3);

// Assert — verify the result
assertEquals(5, result);
```

### Key JUnit 5 Annotations
| Annotation | Purpose |
|------------|---------|
| `@Test` | Marks a method as a test |
| `@BeforeEach` | Runs before each `@Test` method |
| `@AfterEach` | Runs after each `@Test` method |
| `@BeforeAll` | Runs once before all tests (static) |
| `@AfterAll` | Runs once after all tests (static) |

### Common Assertions
```java
assertEquals(expected, actual);
assertTrue(condition);
assertFalse(condition);
assertNull(object);
assertThrows(IllegalArgumentException.class, () -> { /* code */ });
```

### Parameterized Tests (brief)
```java
@ParameterizedTest
@ValueSource(strings = {"racecar", "radar", "level"})
void testPalindrome(String candidate) {
    assertTrue(isPalindrome(candidate));
}
```

### Comparison
| Feature | JUnit 5 | pytest | Jest |
|---------|---------|--------|------|
| Language | Java | Python | JS/TS |
| Assertions | Static methods | `assert` keyword | `expect()` chain |
| Parametrized | `@ParameterizedTest` | `@pytest.mark.parametrize` | `test.each` |
| Mocking | External (Mockito) | `unittest.mock` / `pytest-mock` | Built-in `jest.mock` |

## Code Examples

### 01_CalculatorTest
Simple `@Test` with `assertEquals` and `assertThrows`.

### 02_LifecycleTest
Demonstrates `@BeforeEach`, `@AfterEach`, `@BeforeAll`, `@AfterAll` ordering.

### 03_ParameterizedTestDemo
Uses `@ParameterizedTest` with `@ValueSource`.

## Common Pitfalls
- **Forgetting `@Test`** — Without it, the method is not executed as a test.
- **Using `assert` keyword** — Java's built-in `assert` is disabled at runtime by default; always use JUnit assertions.
- **Mutable shared state** — Tests should not depend on each other; reset state in `@BeforeEach`.
- **Testing too much** — One test should verify one behavior.

## Exercises

See [exercises/README.md](exercises/README.md).

## Quiz

1. Which annotation marks a method as a JUnit 5 test?
2. What does `assertEquals(5, result)` check?
3. Which lifecycle method runs once before all tests and must be `static`?
4. True or False: `@AfterEach` runs even if the test throws an exception.
5. What assertion would you use to verify a method throws `IllegalArgumentException`?

---
Answers: 1. `@Test`, 2. That `result` equals 5, 3. `@BeforeAll`, 4. True, 5. `assertThrows`

## Key Takeaways
- JUnit 5 makes unit testing straightforward with annotations and fluent assertions.
- Follow Arrange-Act-Assert for clean, maintainable tests.
- Lifecycle hooks help manage setup and teardown without duplication.

## Next Module
Congratulations — this completes Phase 9 of Stack.Java!
