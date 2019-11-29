function showMessage(){
    alert("Hi Hello Welcome")
}

function changeColor(){
    let pElement = document.getElementById('mover');
        pElement.style.color = 'red'        

}
function removeColor(){
    let pElement = document.getElementById("mover");
    pElement.style.color = 'blcak';
}
function printHello(){
    //console.log('hello');

    let username = document.getElementById('username').value
    document.getElementById('showusername').textContent = username;
}