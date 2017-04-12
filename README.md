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
`java -jar cube-api-0.0.1-SNAPSHOT.jar`

### Cube API Specification

| Resource | Verb | Param | Request Body | Response Body| Status Code |
|---	|---	|---	|---	|---	|---	|
| /cube/{M}	| POST | M = dimension (int)| n/a | n/a | 201 CREATED|
| /cube  	| PUT  | n/a | `{"x":2,"y":1,"z":2,"w":15}` | n/a | 200 OK|
| /cube  	| GET  | n/a | n/a | `{"sum": 10}` | 200 OK |
