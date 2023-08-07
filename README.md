# RESTful Demo Application

This is a simple Java web application that demonstrates the usage of servlets and a web deployment descriptor. The application includes a servlet called `HelloServlet` that responds to HTTP GET requests and displays a message.

## Prerequisites

- Java Development Kit (JDK) 1.8.0_202
- Apache Tomcat 8.5.89
- Apache maven 3.9.3

## Getting Started

1. Clone or download the repository to your local machine.
2. Open the project in your Java IDE or text editor.

## Project Structure

The project consists of the following files and directories:

- `src/com/example/restdemo/HelloServlet.java`: This file contains the implementation of the `HelloServlet` class, which extends the `HttpServlet` class. It handles HTTP GET requests and displays a message.
- `webapp/WEB-INF/web.xml`: This file is the web deployment descriptor that configures the servlet mapping and initialization parameters. It maps the `HelloServlet` to the URL pattern `/hello-servlet`.

## Running the Application

Follow these steps to run the application:

1. Build the application using your Java IDE or by running the appropriate build command.
2. Deploy the application by copying the generated WAR file or the project directory to the servlet container's webapps directory.
3. Start the servlet container (e.g., Apache Tomcat).
4. Open a web browser and navigate to `http://localhost:8080/restdemo/` to access the default landing page.
5. Click on the "Enter Servlet" link to access the `HelloServlet` at `http://localhost:8080/restdemo/hello-servlet`.
6. You should see the message "This is a message for you! You have chosen /hello-servlet path." displayed on the page.

## Customization


## License


## Acknowledgments

This project is for educational purposes and was created as a demonstration of servlets and web deployment descriptors.

That's a sample README file for the provided code. You can modify it according to your requirements and add any additional information or sections as needed.