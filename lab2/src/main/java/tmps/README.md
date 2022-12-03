# Structural Patterns

## Course: Design Patterns

### FAF - 202

### Author: Cristian Ionel

---

## Theory

**Structural design patterns** are concerned with how classes and objects can be composed, to form larger structures.

The structural design patterns simplifies the structure by identifying the relationships.

These patterns focus on, how the classes inherit from each other and how they are composed of other classes.

## Objectives

1. Get familiar with the basics of structural design patterns.
2. Implement structural design patterns in code.

## Implementation description

---

- **Adapter Pattern**
  
An Adapter Pattern says that just "converts the interface of a class into another interface that a client wants".

In other words, to provide the interface according to client requirement while using the services of a class with a different interface.

The Adapter Pattern is also known as **Wrapper**.

Usage :

1. When an object needs to utilize an existing class with an incompatible interface.
2. When you want to create a reusable class that cooperates with classes which don't have compatible interfaces.
3. When you want to create a reusable class that cooperates with classes which don't have compatible interfaces.

---

- **Bridge Pattern**

A Bridge Pattern says that just "decouple the functional abstraction from the implementation so that the two can vary independently".

The Bridge Pattern is also known as Handle or Body.

Usage : 
1. When you don't want a permanent binding between the functional abstraction and its implementation.
2. When both the functional abstraction and its implementation need to extended using subclasses.
3. It is mostly used in those places where changes are made in the implementation does not affect the clients.

---

- **Composite Pattern**

A Composite Pattern says that just "allow clients to operate in generic manner on objects that may or may not represent a hierarchy of objects".

Usage :
1. When you want to represent a full or partial hierarchy of objects.
2. When the responsibilities are needed to be added dynamically to the individual objects without affecting other objects. Where the responsibility of object may vary from time to time.

---

- **Decorator Pattern**

A Decorator Pattern says that just "attach a flexible additional responsibilities to an object dynamically".

In other words, The Decorator Pattern uses composition instead of inheritance to extend the functionality of an object at runtime.

Usage : 
1. When you want to transparently and dynamically add responsibilities to objects without affecting other objects.
2. When you want to add responsibilities to an object that you may want to change in the future.
3. Extending functionality by sub-classing is no longer practical.

---

- **Facade Pattern**

A Facade Pattern says that just "just provide a unified and simplified interface to a set of interfaces in a subsystem, therefore it hides the complexities of the subsystem from the client".

In other words, Facade Pattern describes a higher-level interface that makes the sub-system easier to use.

Practically, every Abstract Factory is a type of Facade.

Usage : 
1. When you want to provide simple interface to a complex sub-system.
2. When several dependencies exist between clients and the implementation classes of an abstraction.

---

- **Flyweight Pattern**

A Flyweight Pattern says that just "to reuse already existing similar kind of objects by storing them and create new object when no matching object is found".

Usage : 
- When an application uses number of objects
- When the storage cost is high because of the quantity of objects.
- When the application does not depend on object identity.

---

- **Proxy Pattern**

Simply, proxy means an object representing another object.

According to GoF, a Proxy Pattern "provides the control for accessing the original object".

So, we can perform many operations like hiding the information of original object, on demand loading etc.

Usage :
1. It can be used in Virtual Proxy scenario---Consider a situation where there is multiple database call to extract huge size image. Since this is an expensive operation so here we can use the proxy pattern which would create multiple proxies and point to the huge size memory consuming object for further processing.
2. It can be used in Protective Proxy scenario---It acts as an authorization layer to verify that whether the actual user has access the appropriate content or not.
3. It can be used in Remote Proxy scenario---A remote proxy can be thought about the stub in the RPC call. The remote proxy provides a local representation of the object which is present in the different address location.
4. It can be used in Smart Proxy scenario---A smart proxy provides additional layer of security by interposing specific actions when the object is accessed.

---

## Conclusion

In this laboratory work I have used 5 templates which responds to structural patterns. Namely, I used Adapter, Bridge, Facade, Flyweight, Proxy. Those patterns were structured into a simple RPG game. It was challenging in some way to implement these patterns, but I've managed in the end. 