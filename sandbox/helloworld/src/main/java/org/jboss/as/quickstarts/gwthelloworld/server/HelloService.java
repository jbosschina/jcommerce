package org.jboss.as.quickstarts.gwthelloworld.server;

/**
 * A simple CDI service that says hello to someone.
 * 
 */
public class HelloService {

   String createHelloMessage(String name) {
      return "Hello " + name + "!";
   }

}