How to run each version:  
Abstract class shape:  
Instantiate instances of shape objects inside of an array list and loop through the array list calling each method.

Interfaces:  
Make an array list for both calculable and describable so you can loop through the array lists to call the methods that were implemented in the shape classes  
AI Response Reflected on In AI Reflection:  
The comparison between abstract classes and interfaces highlights key design trade-offs in object-oriented programming. Abstract classes are ideal when multiple classes share common state or behavior — for example, shared fields like color or name, and default method implementations. They offer a clear inheritance structure but are limited by Java’s single inheritance model, making them less flexible in complex systems. Interfaces, on the other hand, promote flexibility by allowing classes to implement multiple behaviors (e.g., Drawable, Calculable, Describable) without enforcing a rigid hierarchy. This makes them especially powerful for defining capabilities across unrelated classes. While interfaces don’t allow shared state directly, they encourage cleaner separation of concerns and better modularity. In terms of scalability and maintenance, interfaces generally adapt better as systems grow or change, while abstract classes are useful when managing tightly related classes with shared logic. In modern design, especially with Java’s support for default methods in interfaces, interfaces are often favored for their ability to promote loose coupling, enhance code reuse through behavior composition, and improve testability.


AI Reflection with design rationale
