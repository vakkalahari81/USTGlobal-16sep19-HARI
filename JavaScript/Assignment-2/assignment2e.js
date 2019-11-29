console.log("-----------Named Function-----------");
var num=prompt("Enter a number");
var num=Prime(num);

function Prime(n)
{
     var c=0;
        for(var i = 1 ; i <=n ; i++)
        {
            if(n % i == 0)
            {
                c++;
            }
        }
        return c;
}
if(num == 2)
{
    console.log("Prime Number");
}
else{
    console.log("Not Prime Number");
}

console.log("------------Annonymus Function-----------");

var fact = function(n)
{
    var c=0;
        for(var i = 1 ; i <=n ; i++)
        {
            if(n % i == 0)
            {
                c++;
            }
        }
        return c;
}
var num = prompt("Enter the Number");
var factors = fact(num);
if(factors == 2)
{
    console.log("Prime Number");
}
else{
    console.log("Not Prime number");
}

console.log("------Self Invoked Function---------");
(function(n) {
    
    var c=0;
    for(var i = 1 ; i <=n ; i++)
    {
        if(n % i == 0)
        {
            c++;
        }
    }
        return c;
})

var num = prompt("Enter the Number");
var f = (num);
 
if(f == 2)
{
    console.log("Prime Number");
}
else{
    console.log("Not Prime Number");
}


console.log("---------Fat Arrow Function---------")

var fun = (n) =>{

    var c=0;
        for(var i = 1 ; i <=n ; i++)
        {
            if(n % i == 0)
            {
                c++;
            }
        }
        return c;     
}

var num =  prompt("Enter the Number");
var result = fun(num);

if(result == 2)
{
    console.log("Prime Number");
}
else{
     
    console.log("Not Prime Number");
}
