# Module 60: The Date and Time API

## Overview

Java 8 introduced the `java.time` package (JSR-310) to address the flaws of `java.util.Date` and `java.util.Calendar`. Inspired by Joda-Time, the new API is immutable, thread-safe, and well-designed. It provides separate classes for dates, times, instants, durations, and periods.

## Learning Objectives

- Understand the problems with the legacy `Date`/`Calendar` API
- Use `LocalDate`, `LocalTime`, and `LocalDateTime` for local date/time
- Work with `Instant`, `ZonedDateTime`, and `ZoneId` for time zones
- Measure time with `Duration` and `Period`
- Format and parse dates with `DateTimeFormatter`
- Use `TemporalAdjusters` for calendar calculations

## Prerequisites

- Familiarity with dates and time zones conceptually

## Theory

### Problems with Old Date/Calendar

- **Mutable**: `Date` and `Calendar` are mutable, making them unsafe in concurrent code.
- **Poor design**: months are 0-indexed, years are 1900-based for `Date`.
- **Confusing**: `Date` represents both date and time despite its name.
- **Not thread-safe**: `SimpleDateFormat` is notorious for concurrency bugs.
- **No time zone support**: `Calendar` attempts it but is cumbersome.

### Core Classes

| Class              | Description                              | Example                |
|--------------------|------------------------------------------|------------------------|
| `LocalDate`        | Date without time or timezone            | `2025-03-15`           |
| `LocalTime`        | Time without date or timezone            | `14:30:00`             |
| `LocalDateTime`    | Date + Time without timezone             | `2025-03-15T14:30:00`  |
| `Instant`          | Point on the timeline (UTC)              | `2025-03-15T14:30:00Z` |
| `ZonedDateTime`    | Date + Time + Zone                       | `2025-03-15T10:30:00-04:00[America/New_York]` |
| `Duration`         | Amount of time (nanosecond precision)    | `PT2H30M` (2.5 hours)  |
| `Period`           | Amount of calendar time (date-based)     | `P1Y2M3D` (1 year, 2 months, 3 days) |

### Creating and Using

```java
LocalDate today = LocalDate.now();
LocalDate specific = LocalDate.of(2025, Month.MARCH, 15);

LocalTime now = LocalTime.now();
LocalTime lunch = LocalTime.of(12, 30);

LocalDateTime meeting = LocalDateTime.of(2025, 3, 15, 14, 30);

Instant instant = Instant.now();
ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("America/New_York"));

Duration duration = Duration.ofHours(2).plusMinutes(30);
Period period = Period.of(1, 6, 0);  // 1 year, 6 months
```

### Formatting and Parsing

```java
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
String formatted = localDateTime.format(formatter);
LocalDateTime parsed = LocalDateTime.parse("2025-03-15 14:30", formatter);
```

### TemporalAdjusters

```java
LocalDate firstMonday = LocalDate.now().with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
LocalDate nextSunday = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
```

### Comparison to Joda-Time

`java.time` was designed by the same author (Stephen Colebourne) as Joda-Time. Key differences:
- Joda-Time is a third-party library; `java.time` is part of the JDK.
- `java.time` uses the `Temporal` interface hierarchy for extensibility.
- If migrating from Joda-Time, most class names map directly (e.g., `org.joda.time.LocalDate` → `java.time.LocalDate`).

## Code Examples

- `LocalDateTimeDemo.java` — LocalDate, LocalTime, LocalDateTime creation and manipulation
- `InstantAndZonedDateTime.java` — Instant, ZonedDateTime, ZoneId, time zone conversions
- `DurationAndPeriod.java` — Duration, Period, plus/minus operations
- `DateTimeFormatterExample.java` — formatting and parsing with various patterns
- `TemporalAdjustersDemo.java` — common adjusters for calendar calculations

## Common Pitfalls

- **Using `Date`/`Calendar` out of habit**: always prefer `java.time` for new code.
- **Confusing `Duration` and `Period`**: `Duration` is for machine time (hours/minutes); `Period` is for human time (days/months/years).
- **Ignoring time zones**: `LocalDateTime.now()` uses the system clock; for UTC, use `Instant.now()`.
- **Using wrong pattern letters**: `M` vs `m`, `H` vs `h` are case-sensitive in `DateTimeFormatter`.
- **Parsing without a formatter**: `LocalDate.parse("2025-03-15")` works (ISO), but `"03/15/2025"` needs a custom format.

## Exercises

See `exercises/README.md`.

## Quiz

1. Which class represents a date without time or timezone?
   a) `Instant`
   b) `LocalDate`
   c) `LocalDateTime`
   d) `ZonedDateTime`

2. What does `Duration` measure?
   a) Calendar days
   b) Months and years
   c) Hours, minutes, seconds, nanoseconds
   d) Weeks and months

3. Which method creates a `ZonedDateTime` for "America/New_York"?
   a) `ZonedDateTime.of(2025, 3, 15, 10, 0, 0, 0, "America/New_York")`
   b) `ZonedDateTime.now(ZoneId.of("America/New_York"))`
   c) `ZonedDateTime.parse("America/New_York")`
   d) `LocalDateTime.now().atZone("America/New_York")`

4. `DateTimeFormatter.ofPattern("dd/MM/yyyy")` — what does `MM` represent?
   a) Minutes
   b) Month number (01-12)
   c) Month name
   d) Milliseconds

5. `TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)` returns:
   a) The first Monday of the current month
   b) The next Monday
   c) The first day of the month
   d) The last Monday of the month

---

Answers: 1-b, 2-c, 3-b, 4-b, 5-a

## Key Takeaways

- `java.time` is immutable, thread-safe, and well-designed — prefer it over legacy classes.
- Use `LocalDate`, `LocalTime`, `LocalDateTime` for local, timezone-unaware values.
- Use `Instant` for UTC timestamps and `ZonedDateTime` for timezone-aware values.
- `Duration` and `Period` differ: machine time vs human calendar time.
- `DateTimeFormatter` is thread-safe and supports both formatting and parsing.

## Next Module

Module 61: File I/O Basics — reading and writing files with `java.io`
