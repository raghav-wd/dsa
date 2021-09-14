var // has global scope
let // has block scope
const // has block scope and is a read-only/constant value
// variable without declaration are default var type

const person = {
  name: "Raghav",
  age: 21,
  talk: function () {},
  walk () {} // morder js
}
//ways to call object members
person.talk()
person['dataMember']() // dataMember = 'talk' // dynamically calling a function
console.log(person.name)
console.log(person[dataMember]) // dataMember = 'name' // dynamically access object member

//Simple api call thru xmlhttp
let xhttp = new XMLHttpRequest();
xhttp.open("GET", "https://reqres.in/api/users")
xhttp.send()
xhttp.onload = () => console.log(xhttp.response)

//Promise
  // Why - write cleaner code but reducing (or entirely removing) call-back hell. 2) better error handling can be done with promises
let promise = new Promise((resolve, reject) => {
  // when promise is fulfilled
  resolve(msg)
  // if error use reject
  reject
}
let p = new Promise((resolve, reject) => {
  let request = new XMLHttpRequest();
  request.open("GET", "https://reqres.in/api/users") //remove /users to create error
  request.send()
  request.onload = () => {
    if(request.status === 200)
      resolve(request.response)
    else
      reject("Failed to fetch")
  }
})
p.then(
  (response)=>console.log(response))
  .catch(
  (error) => console.log(error))
