# SimpleRestApi

A simple REST API written in Java, using Jakarta and Tomcat web server. The server has one endpoint, `/ping`, which responds with a "pong!" message. Feel free to clone this project and use it as a template for a RESTful API server project.

This setup is inspired by [this tutorial](https://www.jetbrains.com/help/idea/creating-and-running-your-first-restful-web-service.html).

## Prerequisites

- IntelliJ (preferred editor)
- JDK
- [Tomcat](http://tomcat.apache.org/)
- A web browser

## Set up

1. Clone the repo, and open the project in IntelliJ
2. Open the settings and ensure the "Application Servers" settings includes Tomcat
3. Open the Run/Debug Configurations. Ensure Tomcat is the selected application server, and that the port is set to 3000, or any port of your choice. These configurations are stored in a project file in `.idea/runConfigurations` and should work out of the box
4. Run the application through the run button in the editor

The `/ping` endpoint should open automatically in your default browser, if not, visit `http://localhost:3000/SimpleRestAPI_war_exploded/api/ping`.
