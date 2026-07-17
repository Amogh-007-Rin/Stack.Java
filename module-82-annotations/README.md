# Module 82: Annotations

## Overview
Annotations are metadata that can be attached to Java declarations (classes, methods, fields, etc.). They provide information to the compiler, build tools, or runtime frameworks without directly affecting program logic. Annotations are the foundation of modern Java frameworks like Spring, JUnit, and Jakarta EE.

## Learning Objectives
- Use built-in annotations: `@Override`, `@Deprecated`, `@SuppressWarnings`, `@FunctionalInterface`, `@SafeVarargs`
- Create custom annotations using `@interface`
- Specify retention and target policies with `@Retention` and `@Target`
- Process annotations at runtime via reflection

## Prerequisites
- Module 81 (Reflection API) — annotation processing uses reflection
- Familiarity with interfaces and enums

## Theory

### Built-in Annotations

| Annotation | Purpose |
|-----------|---------|
| `@Override` | Ensures a method overrides a superclass method (compile-time check) |
| `@Deprecated` | Marks code that should no longer be used; generates a warning |
| `@SuppressWarnings` | Tells the compiler to suppress specific warnings |
| `@FunctionalInterface` | Declares an interface is intended to be a functional interface (single abstract method) |
| `@SafeVarargs` | Suppresses heap-pollution warnings on varargs methods (applied to static/final methods) |

### Creating Custom Annotations

```java
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)  // available at runtime via reflection
@Target(ElementType.METHOD)          // can only be applied to methods
@interface Loggable {
    String level() default "INFO";   // element with default value
}
```

**Retention policies:**
- `SOURCE` — discarded by the compiler (e.g., `@Override`)
- `CLASS` — stored in the class file but not available at runtime (default)
- `RUNTIME` — available at runtime via reflection

**Target element types:**
`TYPE`, `FIELD`, `METHOD`, `PARAMETER`, `CONSTRUCTOR`, `LOCAL_VARIABLE`, `ANNOTATION_TYPE`, `PACKAGE`, `TYPE_PARAMETER`, `TYPE_USE`

### Processing Annotations at Runtime
Use `isAnnotationPresent()` and `getAnnotation()` from `java.lang.reflect.AnnotatedElement` (implemented by `Class`, `Method`, `Field`, etc.):

```java
if (method.isAnnotationPresent(Loggable.class)) {
    Loggable log = method.getAnnotation(Loggable.class);
    System.out.println("Level: " + log.level());
}
```

### Comparison to Other Languages
- **Python decorators** — wrappers that modify function behavior at definition time; more powerful than annotations because they can replace the decorated function
- **C# attributes** — very similar to Java annotations; created with `[AttributeUsage]` and accessed via reflection

## Code Examples

See the `examples/` directory:
- `BuiltInAnnotationsDemo.java` — demonstrates `@Override`, `@Deprecated`, `@SuppressWarnings`, `@FunctionalInterface`, `@SafeVarargs`
- `CustomAnnotationDemo.java` — defines `@Author` and `@Loggable` custom annotations
- `AnnotationProcessor.java` — processes `@Loggable` and `@Author` at runtime

## Common Pitfalls
- **Forgetting `@Retention(RetentionPolicy.RUNTIME)`** — custom annotations default to `CLASS` retention and won't be visible at runtime
- **Applying annotations to wrong targets** — e.g., putting a `@Target(ElementType.METHOD)` annotation on a class
- **Annotation elements must have types** — only primitives, `String`, `Class`, enums, annotations, and arrays of these are allowed
- **No inheritance for annotations** — annotations on a superclass are not automatically present on subclasses

## Exercises

See `exercises/README.md` for practice problems.

## Quiz

1. What is the default retention policy for a custom annotation?
   a) `SOURCE`
   b) `CLASS`
   c) `RUNTIME`
   d) `NONE`

2. Which annotation would you use to mark a method as intentionally overriding a superclass method?
   a) `@Override`
   b) `@Deprecated`
   c) `@SuppressWarnings`
   d) `@FunctionalInterface`

3. What does `@Target(ElementType.METHOD)` restrict?
   a) The annotation can only be read by the compiler
   b) The annotation can only be applied to methods
   c) The annotation can only be applied to method parameters
   d) The annotation can only be used on void methods

4. How do you check if a method has a specific annotation at runtime?
   a) `method.contains(MyAnnotation.class)`
   b) `method.hasAnnotation(MyAnnotation.class)`
   c) `method.isAnnotationPresent(MyAnnotation.class)`
   d) `method.getAnnotationName().equals("MyAnnotation")`

5. Which of the following types is NOT valid for an annotation element?
   a) `String`
   b) `int`
   c) `Object`
   d) `Class<?>`

---

**Answers:** 1-b, 2-a, 3-b, 4-c, 5-c

## Key Takeaways
- Annotations are metadata; they don't directly affect program behavior
- `@Retention` controls whether an annotation is available at runtime (`RUNTIME`), in the class file (`CLASS`), or only during compilation (`SOURCE`)
- Custom annotations are defined with `@interface` and can have typed elements with defaults
- Runtime annotation processing relies on reflection (`isAnnotationPresent()`, `getAnnotation()`)
- Unlike Python decorators, Java annotations cannot modify code behavior on their own — they need a processor

## Next Module
[Module 83: Records](../module-83-records/README.md)
