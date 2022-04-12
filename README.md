# Demo for loose coupling with Spring

In this example there are 4 Modules.
When you run it, you should receive a similar output.

```
    Calculated summary 81 + 95 = 176 
    Calculated summary 31 + 3 = 34 
    Calculated summary 59 + 13 = 72 
    Calculated summary 81 + 70 = 151
```

The first two numbers are created in one module (producer) and the result is calculated in another (consumer).
Both modules are completely independent to each other, but they share the same interface code base.
Only the consumer implements the interface. Nevertheless the producer can also use autowiring to use the implementation

## App - Run the application

Contains the main application which knows all the other modules and loads the whole application context

Use ***DemoApplication:main*** to run the app

## Producer

Creates two numbers and calls the interface. It waits for the response and logs it out

## Consumer

Implements the interface. Calculates a summary and returns it.

## Interfaces

Contains only the interface without implementations to allow loosly coupled modules.