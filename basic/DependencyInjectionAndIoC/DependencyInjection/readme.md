# Dependency Injection and IoC

Before we start talking about Dependency Injection, we can see first example:

Car class does very well, but we want to change in Manufactoring Class, then we must change Car and Manufactoring class. this make we develop hard in the project.

## Dependency Injection concept

Dependency Injection is the object dependent on Abstract class and when implememtation will be injected into runtime (when Object is created in constructor). DI help us reduce to dependency on hard code, which helps us develop it to be flexiable and easy to maintain 

Example:
    In the above example: we created interface for Manufactoring class.(FactoryInter.java)

    we will create Action Function for FactoryInter.java

    FactoryImp and ProduceImp are implemented FactoryInerClass

    Actually, Main class esaily create 2 different factory in class 
## IoC (Inversion of Control)

DI helps us to easily develop our code and reduce depend on together. But when Code have many dependency Injection, this difficulties in coding and managing code.

IoC (Invert of control) is a programming principle.  flow of control within the application is not controlled by the application itself, but rather by the underlying framework.

IOC Container is responsible for creating and managing object.

But we did not have support for the configura object to IoC Container management.
spring provide xml or annotation for us to configure IoC

The object managed IoC Container is called a Bean.

