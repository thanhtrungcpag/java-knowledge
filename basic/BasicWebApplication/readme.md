# MVC Architecture

## MVC Architecture Concept
(https://en.wikipedia.org/wiki/Model%E2%80%93view%E2%80%93controller)
(https://javawebtutor.com/articles/spring/spring-mvc-tutorial.php#)


MVC (Model - View - Controller) is software design pattern commonly used for developing user interface that divides the relates program logic into three interconnected elements.

Spring MVC is used to develop the application that uses MVC design pattern. By using Spring MVC we can build flexible and losse coulped web application.

Model
    The central component of the pattern. It is the application's dynamic data structure, indepent of the user interface. It directly manages the data, logic, and rule of the application.
View
    Any representation of information such as chart, diagram or table. Multiple views of same information are possible.
Controller
    Controller are responsible for receiving the request from user and calling the back-end service.

## Advantage of Spring MVC Framework

Clear separation of responsibilities because it implements MVC design pattern

Loose coupling among Model, View, Controller

In built front controller.

Simplified validation implementation

Simplified exception handling.

## Spring MVC Flow

1. Client(Browser) requests for a Resource in the web Application.

2. The Spring front controller i.e, DispatcherServlet first receives the request.

3. DispatcherServlet consults the HandlerMapping to identify the particular controller for the given URL.

4. HandlerMapping identifies the controller for the given request and sends to the DispatcherServlet.

5. DispatcherServlet will call the handleRequest(request,response) method on Controller. A Controller is developed by writing a simple java class which implements Controller interface or extends its adapter class.

6. Controller will call the business method according to business requirement.

7. Service class will call the DAO class method for business data.

8. DAO interacts with DB to get data.

9. DAO returns same data to service.

10. Fetched data will be processed according to business requirement and return results to Controller.

11. The Controller returns the Model and View in the form of Object back to the Controller i.e, DispatcherServlet.

12. The front controller i.e, DispatcherServlet then tries to resolve the actual View which may be JSP,velocity or Free Marker by consulting the View Resolver Object.

13. ViewResolver selected view is rendred back to the DispatcherServlet.

14. DispatcherServletconsult the particular view with the model.

15. View executes and returns HTML output to the DispatcherServlet.

16. DispatcherServlet will sends the output to the Browser.
