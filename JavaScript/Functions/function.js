//named Functions
function add(num1,num2)
{
    console.log('sum=',num1+num2);
}
add(10,34);

//Function Expression  s(Anonymous)
var sub=function(num1,num2)
{
    return num1-num2;
}
,
var value=sub(90,89);
console.log('value=',value);