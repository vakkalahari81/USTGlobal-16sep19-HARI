const hobbies = ['sleeping','Cricketer','Eating','Coding','Roaming'];
console.log(typeof hobbies)


const isArrayorNot = Array.isArray(hobbies);//given Argument Array or not

console.log(isArrayorNot);

const hasCricket = hobbies.includes('Cricketer');//searching given element present or not
console.log(hasCricket);

console.log(hobbies.includes('Cricketer',5))

hobbies.push('guitar','volleyball');//Add the Elements at Last Index return new length of array
console.log("After Push Method",hobbies)

console.log(hobbies.pop());//removed Element at Last Index return removed Element
console.log('after pop',hobbies);


hobbies.unshift("Debugging","Running");//Add Element at First Index 
console.log(hobbies); 

hobbies.shift();//Removed Element At First Index
console.log(hobbies);


hobbies.splice()
