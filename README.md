## Cube Summation Challenge

### Synopsis

This project introduces an approach to solve the [cube summation challenge](https://www.hackerrank.com/challenges/cube-summation)
as stated in HackerRank.

The solution involves a REST API that implements the logic to create a 3D cube, and 
also to compute sum between its blocks.

### Solution Design Approach

1. The application is basically a REST API implementation that exposes functionality to interact with a 3D Array.
2. It has been used maven as a tool to handle the project's life cicle from creating the folder structure, handle the third party 
libraries, building the binary distribution and running test cases.
3. SpringBoot is a powerful module that speeds up the development of microservices based on the Spring Framework. Basically,
SpringBoot provides applications with all the infrastructure in terms of dependencies and app server (among other benefits), to run web-based
applications from the command line.
4. Given the benefits of the IoC Container, the application has been divided in 2 layers as follows:
* **Controller Layer:** The Controller layer aims to provide the classes that implement endpoints under a REST paradigm.
It means that this layer will implement all the logic to handle requests and responses over the HTTP protocol.
* **Service Layer:** The Service layer is the one in charge to actually implement the business logic. This layer
 knows how to create a 3D cube, how to insert values to the blocks, and also how to compute sums across them. There 
 was no need to create a Persistance Layer (DAO), so a **Singleton Helper Class** is not only used to keep the state of the 3D Array
 after adding values to blocks, but also to hide the way this array has been implemented to the upstream layers (Service, Controller).

#### Class Responsibilities

CubeApp.java: This is the configuration class that provides all the beans used across application's life cycle.
CubeController: This class provides the REST API implementation.
CubeService: This class implements the business logic to interact with a 3D cube.
HelperCube: This class keeps the state of the 3D array across upstream layers.

Block: This POJO is used to parse a json representation of a request to update a block of the 3D array, from the controller
Sum: This POJO is used to parse a json representation of the sum.

### Prerequisites

Make sure to install the following tools:

* JDK 8
* Maven 3.3.9
* Git

### Installation

1. Clone the repository: `$ git clone https://github.com/gvalenncia/german-valencia-back.git`
2. Go to the folder /cube-api/ and execute: `$ mvn clean package install`

### Unit testing

To run unit test go to the folder /german-valencia-back/cube-api/, 
and execute: `$ mvn clean test`

### Running

This is a SpringBoot application that generates a binary distribution (see _Installation_ step 2). So, please 
execute the following command from /german-valencia-back/cube-api/target/: 
`java -jar cube-api-1.0.0-RELEASE.jar`

The above command publish a REST API in the following URL http://localhost:2222/. So please
refer to the API specification to send requests.

### Cube API Specification

| Resource | Verb | Param | Request Body | Response Body| Status Code | Description |
|---	|---	|---	|---	|---	|---	| ---	|
| /cube/{M}	| POST | M = dimension (int)| n/a | n/a | 201 CREATED| This creates a cube of dimension MxMxM |
| /cube  	| PUT  | n/a | `{"x":2,"y":1,"z":2,"w":15}` | n/a | 200 OK| This set the value (w) of a block with the given (x,y,z) location | 
| /cube  	| GET  | n/a | n/a | `{"sum": 10}` | 200 OK | This gets the sum of the all blocks in a cube |
