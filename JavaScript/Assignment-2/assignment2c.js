console.log("-----------Named Function----------")
var c = prompt("Enter the Radius of circle");
var a = cirCumference(c);
function  cirCumference(c)
{
    var a = 2 * Math.PI * c;
    return a;
}
console.log("Circumference of Circle=",a);

console.log("-------------Annoymous Function----------")
var cir = function(p)
{
    var re = 2 * Math.PI * p;
    return re;
}
var p = prompt("Enter the Radius of Circle");
var result = cir(p);
console.log("Circumference of Circle=",result);

console.log("----------Self Invoked Function-------------");

//( function(n) {
    
  //  console.log(2 * Math.PI * n);
//} )
//var n=prompt("Ennter the Radius of Circle");
//(n);

console.log("------------Fat Arrow Function------------");
var fun = (n) => {
    console.log("Circumference of Circle=",2 * Math.PI * n);
}
var num = prompt("Enter the Radius of Circle");
 fun(num);          