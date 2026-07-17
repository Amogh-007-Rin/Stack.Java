# Exercise 2 — Sample Answer: Grocery Store

**Procedural approach:**
- Three parallel arrays: `String[] productNames`, `double[] productPrices`, `int[] cartQuantities`.
- Functions like `addToCart(name, price, quantity)` update separate structures.
- To calculate total: loop over arrays, multiply prices by quantities.
- Data and logic are separate; adding a new feature (e.g., discount) requires modifying multiple functions.

**OOP approach:**
- `Product` class with fields `name`, `price`, `discount` and method `getEffectivePrice()`.
- `ShoppingCart` class with a `List<Product>` and a `Map<Product, Integer>` for quantities, methods `addItem(product, quantity)`, `removeItem(product)`, `getTotal()`.
- Data and behavior are bundled. Adding a discount only changes `Product`; checkout logic stays in `ShoppingCart`.

**Comparison:** The OOP version is more organized, easier to extend, and naturally models the real-world concept of a "shopping cart." The procedural version is simpler for very small programs but becomes hard to maintain as features grow.
