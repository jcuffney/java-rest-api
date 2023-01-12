# Film Rest API

## Requirements

- jdk 19

## Getting Started

- clone this project as follows and open it in your IDE of choice:
    
    `git clone git@github.com:jcuffney/java-rest-api.git`

- From here if you open up the `FilmApplication.java` file and execute the program it should build and run successfully
- Open a browser to `http://localhost:8080` and you should see an error page - this is the root of our API's server.
- update the route to the following and you should observe some data returned for the following routes (urls)
  - http://localhost:8080/film
  - http://localhost:8080/film/1
  - http://localhost:8080/film/health
- look over the 3 java files in this project and try to see what they are doing and we can discuss.

## Context / Goals

The goal of this project is to give you an example of as close to a real world use case for Java programming. 
REST API's are the defaco way of sending data around although there are others that are growing in popularity.
Although this is a very simple project (all it does is return a representation of films) we can evolve this 
project in may ways that can show you different aspects of real world programming such as

- git flows
- debugging
- testing
- continuous integration
- deployments / cloud infrastructure
- authentication

This will obviously take time - but i think it will serve as a really good portfolio piece and a great learning experience.
