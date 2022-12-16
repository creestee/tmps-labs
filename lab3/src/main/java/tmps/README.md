# Behavioral Patterns

## Course: Design Patterns

### FAF - 202

### Author: Cristian Ionel

---

## Theory

**Behavioral design patterns** are concerned with the interaction and responsibility of objects.

In these design patterns, **the interaction between the objects should be in such a way that they can easily talk to each other and still should be loosely coupled.**

That means the implementation and the client should be loosely coupled in order to avoid hard coding and dependencies.
## Objectives

1. Get familiar with the basics of behavioral design patterns.
2. Implement behavioral design patterns in code.

## Implementation description

---

- **Chain Of Responsibility**

A Chain of Responsibility Pattern says that just "avoid coupling the sender of a request to its receiver by giving multiple objects a chance to handle the request". For example, an ATM uses the Chain of Responsibility design pattern in money giving process.

Usage : 
1. When more than one object can handle a request and the handler is unknown.
2. When the group of objects that can handle the request must be specified in dynamic way.
---

- **Command Pattern**

A Command Pattern says that "encapsulate a request under an object as a command and pass it to invoker object. Invoker object looks for the appropriate object which can handle this command and pass the command to the corresponding object and that object executes the command".

It is also known as Action or Transaction.

Usage : 
1. When you need parameterize objects according to an action perform.
2. When you need to create and execute requests at different times.
3. When you need to support rollback, logging or transaction functionality.
---

- **Interpreter Pattern**

An Interpreter Pattern says that "to define a representation of grammar of a given language, along with an interpreter that uses this representation to interpret sentences in the language".

Basically the Interpreter pattern has limited area where it can be applied. We can discuss the Interpreter pattern only in terms of formal grammars but in this area there are better solutions that is why it is not frequently used.

Usage :
1. When the grammar of the language is not complicated.
2. When the efficiency is not a priority.

---

- **Iterator Pattern**

According to GoF, Iterator Pattern is used "to access the elements of an aggregate object sequentially without exposing its underlying implementation".

The Iterator pattern is also known as Cursor.

Usage :
1. When you want to access a collection of objects without exposing its internal representation.
2. When there are multiple traversals of objects need to be supported in the collection.

---

- **Mediator Pattern**

A Mediator Pattern says that "to define an object that encapsulates how a set of objects interact".

Mediator pattern is used to reduce communication complexity between multiple objects or classes. This pattern provides a mediator class which normally handles all the communications between different classes and supports easy maintainability of the code by loose coupling.

Usage :
1. It is commonly used in message-based systems likewise chat applications.
2. When the set of objects communicate in complex but in well-defined ways.

As mediator is usually used in message-based systems, I implemented a simple chat for my project :

```java
public class Player {

    private String name;
    private Chat mediator;

    public Player(String name, Chat mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public void sendMessage(String message) {
        mediator.showMessage(this, message);
    }

}
```
where `Chat` is the actual mediator :

```java
public class Chat {

    public void showMessage(Player player, String message){
        System.out.println(new Date().toString() + " [" + player.getName() + "] : " + message);
    }
}
```

---

- **Memento Pattern**

A Memento Pattern says that "to restore the state of an object to its previous state". But it must do this without violating Encapsulation. Such case is useful in case of error or failure.

The Memento pattern is also known as Token.

Undo or backspace or ctrl+z is one of the most used operation in an editor. Memento design pattern is used to implement the undo operation. This is done by saving the current state of the object as it changes state.

Usage :
1. It is used in Undo and Redo operations in most software.
2. It is also used in database transactions.

---

- **Observer Pattern**

An Observer Pattern says that "just define a one-to-one dependency so that when one object changes state, all its dependents are notified and updated automatically".

The observer pattern is also known as Dependents or Publish-Subscribe.

Usage :
1. When the change of a state in one object must be reflected in another object without keeping the objects tight coupled.
2. When the framework we write and needs to be enhanced in future with new observers with minimal changes.

---

- **State Pattern**

A State Pattern says that "the class behavior changes based on its state". In State Pattern, we create objects which represent various states and a context object whose behavior varies as its state object changes.

The State Pattern is also known as Objects for States.

Usage :
1. When the behavior of object depends on its state, and it must be able to change its behavior at runtime according to the new state.
2. It is used when the operations have large, multipart conditional statements that depend on the state of an object.

---

- **Strategy Pattern**

A Strategy Pattern says that "defines a family of functionality, encapsulate each one, and make them interchangeable".

The Strategy Pattern is also known as Policy.

Usage :
1. When the multiple classes differ only in their behaviors.e.g. Servlet API.
2. It is used when you need different variations of an algorithm.

For this pattern I created a `Resource` class which has a method that relies on 2 types of strategies : building a town or building a village :

```java
public class Resource {
    private final String type;
    private final Strategy strategy;

    public Resource(String type, Strategy strategy) {
        this.type = type;
        this.strategy = strategy;
    }

    public String buildStructure() {
        return strategy.buildStructure();
    }

    @Override
    public String toString() {
        return "Resource {" +
                "type='" + type + "' " +
                this.strategy.buildStructure() + '\'' +
                '}';
    }
}
```
```java
interface Strategy {
    String buildStructure();
}
```
Town strategy :
```java
public class BuildTownStrategy implements Strategy {

    @Override
    public String buildStructure() {
        return "Town built...";
    }
}
```
Village strategy :
```java
public class BuildVillageStrategy implements Strategy {

    @Override
    public String buildStructure() {
        return "Village built...";
    }
}

```

---

- **Template Pattern**

A Template Pattern says that "just define the skeleton of a function in an operation, deferring some steps to its subclasses".

Usage :
1. It is used when the common behavior among subclasses should be moved to a single common class by avoiding the duplication.

So, as template method suggests, I broke down GameAi steps into several steps and called these steps (methods) inside a single method, which is the template :

```java
public abstract class Template {
    public final void executeTurn() {
        collectResources();
        buildStructures();
        buildUnits();
        attack();
    }

    public abstract void collectResources();
    public abstract void buildStructures();
    public abstract void buildUnits();
    public abstract void attack();
}
```

`executeTurn()` being the template method

---

## Conclusion

In this laboratory work I have used 3 templates which responds to behavioral patterns and implements a dummy board game simulation (e.g. Catan). 
