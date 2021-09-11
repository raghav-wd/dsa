var // has global scope
let // has block scope
const // has block scope and is a read-only/constant value

// Notes
() // after a variable means we are calling a function with that name
=> // fat arrow

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
