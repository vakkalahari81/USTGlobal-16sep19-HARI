console.log("---------Named Function-----")
function Fibinocci(n)
{
        var a = 0 , b = 1;
        console.log(a);
        console.log(b);
        for(var i = 2 ; i <= n ; i++)
        {
            var c = a + b ;
            console.log(c);
            a = b;
            b = c;
        }
}
var num=prompt("Enter a number");
Fibinocci(num);

console.log("---------Anonymus Function-------------")

var fun=function(n)
{
    var a = 0,b = 1;
        console.log(a);
        console.log(b);
        for(var i = 2;i <= n;i++)
        {
            var c = a + b;
            console.log(c);
            a = b;
            b = c;
        }

}   
var num = prompt("Enter the Number");
fun(num);

console.log("-----------Self Invoked Function----------")


console.log("--------Fat Arrow Function-------------")

var fib=(n)=>{

    var a = 0,b = 1;
        console.log(a);
        console.log(b);
        for(var i = 2;i <= n;i++)
        {
            var c = a + b;
            console.log(c);
            a = b;
            b = c;
        }
}
var num=prompt("Enter the number");
fib(num);

