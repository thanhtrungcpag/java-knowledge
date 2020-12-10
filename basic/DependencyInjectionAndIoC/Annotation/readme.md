# Annotation

## Annotation Concept
(https://en.wikipedia.org/wiki/Java_annotation)
(https://codelearn.io/sharing/annotation-trong-java-la-gi)

Annotation is form of syntactic metadata that can be added to java source code.

Annotations are used in java resource code to be compiled into bitycode and used for reflection in order to query metadata information and take appropricate action.

Annotation have 2 types:
    Annotation is integrated
    Annotation is defined by user.

## How to create Annotation

## IoC use Annotation

In Annotation for IoC, we use component annotation.

@Component is the most generic Spring annotation. A Java class decorated with @Component is found during classpath scanning and registered in the context as a Spring bean. @Service, @Repository, and @Controller are specializations of @Component, which are used for more specific cases.

Development process

1. Enable component scanning in spring config file
2. Add the @component annotation to your Java Classes.
3. Retrieve bean from Spring container. 

## Depencency Injection

Spring @Autowired annotation is used for automatic dependency injection.

It allow Spring to resolve and inject colloborating bean into our bean. 

It will automatically scan the components in the current package and sub-package. If we have mutilple compoment base on one interface, we can use @qualifier annotation to resolve the conflict.

Autowired Injection types:

    Constructor Injection: we will that an instance of object is injected by Spring as  an argument to Object constructor.
    Setter Injection: Autorwired annotation on the setter method, in the setter method is called with instance of Object when Object is created.
    Properties Injection: This eliminates the need for getter and setter.

# Configuration without using the XML file
(https://howtodoinjava.com/spring-core/spring-configuration-annotation/)

## Concept

Configuration Annotation is used instead of xml file, 

Since Spring 2, we were writing our bean configuration to xml file. But Spring 3 gave the freedom to move bean definitions out of xml file. we can give bean difinitions in java files itself. Configuration annotation indicated that a class declares one or more @Bean (Bean Annotation) method and may be processed by Spring containter to generate bean definitions and service request for those beans at runtime.

we use @componentScan to scan all component that we declares.
## Difference Configuration and components

@Configuration Indicates that a class declares one or more @Bean methods and may be processed by the Spring container to generate bean definitions and service requests for those beans at runtime

@Component Indicates that an annotated class is a "component". Such classes are considered as candidates for auto-detection when using annotation-based configuration and classpath scanning.

@Configuration is meta-annotated with @Component, therefore @Configuration classes are candidates for component scanning

