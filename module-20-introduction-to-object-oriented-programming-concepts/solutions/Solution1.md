# Exercise 1 — Sample Answer: Coffee Machine

**Objects involved:**
- CoffeeMachine
- WaterReservoir
- BeanHopper
- Cup

**CoffeeMachine state (fields):**
- isOn (boolean)
- waterLevel (int, in ml)
- beansLevel (int, in grams)
- currentTemperature (double, in °C)

**CoffeeMachine behavior (methods):**
- turnOn()
- turnOff()
- brewEspresso()
- brewLatte()
- refillWater()
- refillBeans()

**Cup state:**
- capacity (int, in ml)
- contents (String, e.g., "espresso", "latte")
- isFull (boolean)

**Cup behavior:**
- fill()
- drink()
- clean()

Simple class diagram:
```
CoffeeMachine  ──► WaterReservoir
             ──► BeanHopper
             ──► Cup  (creates/uses)
```
