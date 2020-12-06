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