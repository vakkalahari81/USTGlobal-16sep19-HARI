console.log('Window Object',window);
console.log('This KeyWord',this);
console.log(this === window)

//window.alert('Welcome to JavaScript Class');
//alert('Ust Global And Test Yantra')

/* let conFirmDelete = confirm('Are you sure You Want Delete')
console.log(conFirmDelete); */

//let UserName = prompt('What is your Name')
//console.log('User Name',UserName);


const Pesron =  { 
    firstName: 'Alia',
    age: 26,
    lastName: 'Kapoor',
    getName: function(){

        console.log(this)
        return this.firstName + ' '+this.lastName
    }

}
let FullName = Pesron.getName();
console.log("Full Name",FullName);
