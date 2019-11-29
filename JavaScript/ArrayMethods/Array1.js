const hobbies = ['sleeping','Eating','Coding','Roaming','pubg','Templerun']
hobbies.splice(2,2,"Debugging");
console.log(hobbies);

const array = hobbies.slice(2,5);
console.log(array);

console.log(hobbies.indexOf('sleeping'));

console.log(hobbies.indexOf('Eating',1))

console.log(hobbies.join('_'));

console.log(array.join('-'))
