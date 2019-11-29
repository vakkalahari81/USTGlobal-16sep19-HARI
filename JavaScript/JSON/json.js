const person = {
                    name: 'Sundara',
                    age:100,
                    color:'white',
                    address:{

                                    city:'WhiteField',
                                    state: 'Karnata',
                                    pincode: 591115

                         },
                hobbies : ['coding','birdWatching','singing']
}
console.log('JavaScript Person Object', person);

const jsonObject = JSON.stringify(person);
console.log("JSON person object",jsonObject);

localStorage.setItem('email','vakkalahari@gmail.com');
//console.log(localStorage.getItem('email'))

const emailid = localStorage.getItem('email')
console.log(emailid);


//Log Out

localStorage.clear();


 