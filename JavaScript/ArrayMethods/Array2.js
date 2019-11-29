const numbers = [100,200,300,400,500];
const numbers1 = [];
for(let i=0;i<numbers.length;i++)
{
   let  newvalue = numbers[i]+50;
   numbers1.push(newvalue);
}console.log(numbers1);

console.log("==========Map Method==========")
const number = numbers.map(function(value,index){
    let newvalue=value+50;
    return newvalue;
})
console.log(number)


const num1 = numbers.map(value=>value+50)
console.log(num1);



console.log("======Filter Method==========")

const data = numbers.filter(function(value,index){

    if(value>100)
     return true;
    else
     return false;
})
console.log(data) 
p'
const data1 = numbers.filter(value => value>200)
console.log(data);