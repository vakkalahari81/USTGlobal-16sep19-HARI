function myFunction(){

    let x = document.getElementById('myInput');
    console.log('x=',x);

    if(x.type === 'password'){
                x.type = 'text';
    }
    else{

        x.type = 'password';
    }
}
function checkLength(){

     let uname = document.getElementById('username').value.trim();
     
     let pass = document.getElementById('myInput').value;

    if(uname.length <= 5 ){
        alert('username invalid');
     }
     if(pass.length <= 5 ){

        alert("Invalid Password");
      }
     if(  (uname.length >5) && (pass.length >5)){

        alert("success")
      }
}