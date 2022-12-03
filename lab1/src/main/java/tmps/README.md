# Creational Patterns

## Course: Design Patterns

### FAF - 202

### Author: Cristian Ionel

---

## Theory

**Creational design patterns** are concerned with the way of creating objects. These design patterns are used when a decision must be made at the time of instantiation of a class (i.e. creating an object of a class).

But everyone knows an object is created by using new keyword in java. For example:

```java
StudentRecord s1=new StudentRecord();  
```

Hard-Coded code is not the good programming approach. Here, we are creating the instance by using the new keyword. Sometimes, the nature of the object must be changed according to the nature of the program. In such cases, we must get the help of creational design patterns to provide more general and flexible approach.

## Objectives

1. Get familiar with the basics of creational design patterns.
2. Implement creational design patterns in code.

## Implementation description

---

- **Adapter Pattern**

A Factory Pattern or Factory Method Pattern says that just define an interface or abstract class for creating an object but let the subclasses decide which class to instantiate. In other words, subclasses are responsible to create the instance of the class.

Usage : 
1. When a class doesn't know what sub-classes will be required to create
2. When a class wants that its sub-classes specify the objects to be created.
3. When the parent classes choose the creation of objects to its sub-classes.

---

- **Abstract Factory**

Abstract Factory Pattern says that just define an interface or abstract class for creating families of related (or dependent) objects but without specifying their concrete sub-classes.That means Abstract Factory lets a class returns a factory of classes. So, this is the reason that Abstract Factory Pattern is one level higher than the Factory Pattern.

An Abstract Factory Pattern is also known as Kit.

Usage : 
1. When the system needs to be independent of how its object are created, composed, and represented.
2. When the family of related objects has to be used together, then this constraint needs to be enforced.
3. When you want to provide a library of objects that does not show implementations and only reveals interfaces.
4. When the system needs to be configured with one of a multiple family of objects.

---

- **Singleton Pattern**

Singleton Pattern says that just"define a class that has only one instance and provides a global point of access to it".

In other words, a class must ensure that only single instance should be created and single object can be used by all other classes.

Usage :
1. Singleton pattern is mostly used in multi-threaded and database applications. It is used in logging, caching, thread pools, configuration settings etc.

---

- **Prototype Pattern**

Prototype Pattern says that cloning of an existing object instead of creating new one and can also be customized as per the requirement.

This pattern should be followed, if the cost of creating a new object is expensive and resource intensive.

Usage :
1. When the classes are instantiated at runtime.
2. When the cost of creating an object is expensive or complicated.
3. When you want to keep the number of classes in an application minimum.
4. When the client application needs to be unaware of object creation and representation.

---

- **Builder Pattern**

Builder Pattern says that "construct a complex object from simple objects using step-by-step approach"

Usage :
1. It is mostly used when object can't be created in single step like in the de-serialization of a complex object.

---

## Conclusion

In this laboratory work I have used 5 templates which responds to creational patterns. Regarding Singleton Pattern, when we create a bean it is defined with singleton scope and the container creates a single instance of that bean; all requests for that bean name will return the same object, which is cached. Also, Prototype Pattern is implemented using scope of a bean in Spring, which is defined in `Main` as `@Scope("prototype")`.
