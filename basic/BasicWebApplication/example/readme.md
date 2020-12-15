# Spring MVC Configuration

## Spring MVC Configuration Process Part 1

Add Configuration to file: WEB-INF/web.xml

    1. Configurate Spring MVC Dispatcher Servlet
    
    2. Set up URL mapping to Spring MVC Dispatcher Servlet
    
    Example:

```xml
    <servlet>
        <!-- Add Disparcher Servlet with name appservlet -->
        <servlet-name>appServlet</servlet-name>
        <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>

        <!-- Set up init parameter. this Spring context configuration file is located -->
        <init-param>
            <param-name>contextConfigLocation</param-name>
            <param-value>/WEB-INF/spring/appServlet/servlet-context.xml</param-value>
        </init-param>

        <!-- Cargar al iniciar la aplicación -->
        <load-on-startup>1</load-on-startup>
    </servlet>
    
    <!-- Set up URL mapping to Spring MVC dispacher servlet -->
    <!-- any url pattern coming in,
    I want you to pass it on to The Dispacher servlet,
    this mean all request should be handle by DispatcherServlet -->
    <servlet-mapping>
        <!-- Servlet name must match servlet -->
        <servlet-name>appServlet</servlet-name>
        <url-pattern>/</url-pattern>
    </servlet-mapping>
```

Add Configuration to file: /WEB-INF/spring/appServlet/servlet-context.xml

    3. We'll add support for a component scanning
```xml
     <context:component-scan base-package="com" />
```
    4. Add support for conversion, formatting and validation
    
    5. configure Spring MVC view resolver
    
    Example:
    
```xml
    <beans:bean id="viewResolver"
        class="org.springframework.web.servlet.view.InternalResourceViewResolver">
        <beans:property name="prefix" value="/WEB-INF/vistas/" />
        <beans:property name="suffix" value=".jsp" />
    </beans:bean>
```
        /WEB-INF/vistas/helo.jsp
        
        prefix: /WEB-INF/vistas/
        
        suffix: .jsp
        
        viewName: Helo
