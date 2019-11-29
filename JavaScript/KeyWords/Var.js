console.log("Var KeyWord")
var name="Hari";
var name;
console.log(name);


console.log("Let KeyWord");

let name1="Hari"
//let name="Hari";  redclaration Not Possible

console.log(name1);
name1="Jaggu";
console.log(name1);

console.log("Const Key Word");
const name2='abcde';
//name2="ha";
console.log(name2);

for(var i=0;i<10;i++)
{
    console.log("Inside for Loop i=",i);
}
console.log("Outside of i",i); // because of  hoistiong we can access out side of the function;

for(let i=0;i<5;i++)
{
    console.log(i);
}
//console.log(i); // we cannot access out side of the fuction by using let keyword






