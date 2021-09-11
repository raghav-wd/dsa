var // has global scope
let // has block scope
const // has block scope and is a read-only/constant value

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

