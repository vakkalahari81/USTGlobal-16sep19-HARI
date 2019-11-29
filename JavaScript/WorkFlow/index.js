console.log(A);
var A=10;
console.log(hoist);
var hoist;

console.log("=====hoisting=============")
function hoisting(){
    console.log(hoisting);
    var hoisting;
}
hoisting();