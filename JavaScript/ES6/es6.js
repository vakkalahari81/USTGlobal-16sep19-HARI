const message = new Promise(function(resolve,reject){

    if(30>20){
        resolve('Success'); 
    }
    else{
        reject('Failed');
    }
})

message.then(function(msg){
    console.log("message",msg);
}).catch(function(error){
    console.log("Failure messge",error);
})


const employees = new Promise(function(resolve,reject){

    if(10>5)
    {
    resolve([{
        
        name: 'Bil Gates',
        age:67,
      },

      {
          name:'ZukerBerg',
          age:40,
    }])
}
    esle
        reject('Failed');
       
})
  employees.then(function(msg){
    console.log("message",msg);
}).catch(function(error){
    console.log("Failure messge",error);
})


console.log("============function=============")

function outerFunction(counter){

    function innerFunction(){
        let count;

        count = counter + 10;
        return count;
    }
    return innerFunction;
}

let innerFunc = outerFunction(20)
let counter = innerFunc()
console.log('counter value',counter);

