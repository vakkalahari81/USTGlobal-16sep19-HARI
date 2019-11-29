console.log("---------Named Function------")
var a=prompt("Enter a number");
var fun=Factorial(a);
function Factorial(n)
{
    var fact = 1;
    while(n > 0)
    {
        fact = fact * n--;
    }
    return fact;
}
console.log('factorial of a number=',fun);

console.log("----Annonymus Function--------");

var fact=function(n)
{
    var f = 1;
    while(n > 0)
    {
        f = f * n--;
    }
    return f;
}
var val=prompt("Enter a number");
var fa=fact(val);
console.log("factorial of number=",fa);


console.log("------Self Invoked Function-------");
(function(n){
    var f = 1;
    while(n > 0)
    {
      f = f * n--;       
    }
    console.log(f);
    
})
var n=prompt("Enter a number");
(n);

console.log("------Fat Arrow Function---------");
var fact = (n) => {
    var f = 1;
    while(n > 0)
    {
        f = f * n--; 
    }
    console.log(f);
}
var num=prompt("Enter a number");
fact(num);

