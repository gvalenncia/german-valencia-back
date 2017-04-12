## Cube Summation Challenge

### Synopsis

This project introduces an approach to solve the [cube summation challenge](https://www.hackerrank.com/challenges/cube-summation)
as stated in HackerRank.

The solution involves a REST API that implements the logic to create a 3D cube, and 
also to compute sum between its blocks.

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
