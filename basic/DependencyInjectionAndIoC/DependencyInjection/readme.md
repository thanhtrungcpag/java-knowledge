# Dependency Injection

before we start talking about Dependency Injection, we can see first example:

Car class does very well, but we want to change in Manufactoring Class, then we must change Car and Manufactoring class. this make we develop hard in the project.

## Dependency Injection concept

Dependency Injection is the object dependent on Abstract class and the implememtation will be injected into runtime (when Object is created in constructor). DI help us reduce to dependency on hard code, which helps us develop it to be flexiable and easy to maintain 

Example:
    In the above example: we created interface for Manufactoring class.(FactoryInter.java)

    we will create Action Function for FactoryInter.java

    FactoryImp and ProduceImp are implemented FactoryInerClass

    Actually, Main class esaily create 2 different factory in class 