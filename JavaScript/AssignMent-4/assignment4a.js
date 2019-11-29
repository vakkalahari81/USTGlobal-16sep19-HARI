const numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
console.log(Array.isArray(numbers));

let a=numbers.includes(10);
console.log(a);
console.log(numbers.includes(19));
console.log(numbers.includes(10,11));


numbers.push(11);
numbers.push(12);
numbers.push(13);

console.log(numbers);

numbers.pop();
numbers.pop();
console.log(numbers);


numbers.shift();
numbers.shift();
console.log(numbers);


numbers.unshift(1);
numbers.unshift(2);
numbers.unshift(12);
console.log(numbers);

numbers.splice(0,3);
console.log(numbers);

numbers.splice(4,0,14);
console.log(numbers);
numbers.splice(0,0,15);
console.log(numbers);


numbers.splice(1,2,44);
console.log(numbers);

let num = numbers.slice(1,4);
console.log(num);
console.log(numbers);


let str = numbers.join('_');
console.log(str);
console.log(numbers.join("_"));

let d = numbers.indexOf(5);
console.log(d);

console.log(numbers.indexOf(23));
console.log(numbers.indexOf(11));

console.log("====This is Map Method=======")
const p = numbers.map(function(value,index){
    let NewArray;
    if(value>10){
       NewArray = value+10;
    }
    return NewArray;
})
console.log(p);

console.log("=========Filter Function========")
const data = numbers.filter(function(value){
    if(value>12){
        return true;
    }
})
console.log(data);

console.log("========Fat Arrow Function==========")

const number = numbers.map(data=>data+50)
console.log(number);


console.log("=====Filter Function=======")
const data1 = numbers.filter(value=>value >12);
console.log(data1)