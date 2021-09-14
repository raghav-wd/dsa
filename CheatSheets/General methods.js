// Array Functions - transform the array according to the applied function and return the updated array
ls = [1, 2, 3, 4, 5]
ls.map(item => item + 1) // [2, 3, 4, 5, 6] // It applies a given function on all the elements of the array and returns the updated array
ls.filter(item => item & 2 == 0) // [2, 4] // It filters the elements of the array that return false for the applied condition
ls.reduce( (accumulator, item) => accumulator + item, 100 ) // 115 // It reduces all the elements of the array to a single value by repeatedly applying a function
ls.foreach( item => console.log(item) ) // for loop on array and doesn't return anything
