var arr = ['a','b','c','d','e','f','g'];
var person={
                name:'hari',
                age:22,
                gender:'M',
                id:131381,
}
console.log("For Loop");
for(var i = 0 ; i <arr.length;i++){
    console.log(arr[i]);
}

console.log("========For Of=======")
for(var ele of arr){

            console.log(ele);
}

console.log("====For Each====")
arr.forEach(function(value,index)
{
    console.log(value);
    console.log(index)
})
console.log('=======for in=====')

for(var data in arr){
    console.log(data);


}

for(var data in person){
    console.log(data);
}
