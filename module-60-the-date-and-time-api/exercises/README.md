# Module 60 Exercises

## Exercise 1: Age Calculator (Easy)

Write a program that takes a birthdate as a `String` in `"yyyy-MM-dd"` format, parses it, and calculates:
- The person's age in years (use `Period.between`)
- The day of the week they were born
- Whether their birthday has already occurred this year

Test with `"1990-05-15"`.

## Exercise 2: Meeting Scheduler (Medium)

Write a program that:
- Creates a `LocalDateTime` for a meeting on the 3rd Friday of next month at 14:00
- Converts it to `ZonedDateTime` for `"America/New_York"`
- Prints the meeting time in `"America/Los_Angeles"` and `"Asia/Tokyo"`
- Calculates the `Duration` until the meeting from now
- Prints "Meeting is in X days, Y hours, Z minutes"

## Exercise 3: Date Range Generator (Medium)

Write a method `static List<LocalDate> getWeekdaysInRange(LocalDate start, LocalDate end)` that returns all weekdays (Monday–Friday) between two dates (inclusive). Use `TemporalAdjusters` and `DateTimeFormatter`. In `main`, test with the range `2025-03-01` to `2025-03-15` and print the dates formatted as `"EEEE, MMM d"`.

## Exercise 4: Business Day Calculator (Hard)

Write a program that calculates the next business day given a `LocalDate`. Business days are Monday–Friday, excluding holidays. Define a `Set<LocalDate>` of holidays for 2025 (e.g., New Year's Day, Christmas, July 4th, Thanksgiving — approximate). Create a method `static LocalDate nextBusinessDay(LocalDate date, Set<LocalDate> holidays)` that:
- Adds 1 day
- If the result is a weekend or holiday, keep advancing until a business day is found

Test with `2025-12-24`, `2025-12-31`, `2025-07-03`, and `2025-01-01`.
