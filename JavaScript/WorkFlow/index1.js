function first() {

    setTimeout(function(){
        console.log("First Function Executed");
    },5000)

    function second(){
        console.log('second function Executed');
    }
    second();

}
first();

function Third(){
    setTimeout(function(){
        console.log("Third Fuction Executed");
    },5000)
    function Fourth(){

            console.log("Fourth Function Executed")
    }
    Fourth();
}
Third();

