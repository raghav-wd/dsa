`Api` is a contract provided by 1 piece of software to other piece of software, usually consists of structured request and a structured response

`Web Api` is a mediator between client and web services so that they can share information and resources while maintaining security, control, and authentication - determining who get access to what.

`Representational state transfer` is a software architectural style that was created to guide the design and development of the architecture for the World Wide Web. REST defines a set of constraints for how the architecture of an Internet-scale distributed hypermedia system, such as the Web, should behave.
In order for an API to be considered RESTfu, it has to conform to these criteria:
1. A client-server architectrue managed through HTTP
2. Stateless client-server communication, means no client information is stored between get requests and each request is separate and unconnected.

Http methods
1. Get - for getting data
2. Post - for putting data
3. Put - for updating data
4. Delete - for deleting data



Making api call in javascript
```
const API = "https://reqres.in/api/users";

fetch(API, { // fetch takes in two params api url and options(optional), fetch returns a promise
// mandatory to add method, body, headers on post, put and delete
  method: 'POST',
  body: JSON.stringify({ // cant send js obj so need to convert it to json
    name: 'Raghav'
  }),
  headers: { 
    'Content-Type': 'application/json' // must add this
  }
}) 
  .then((res) => {
    if(res.ok){ // just a simple error catching 
      return res.json(); // res.json returns a promise
    } else {
      console.log("Error")
    }
  })
  .then((data) => console.log(data));
  ```
