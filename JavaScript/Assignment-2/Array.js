console.log("---------Array of Function------");
var num = [10,20,30,40];
var length=num.length;
console.log(length);n
array(num);
function array(num)
{
        var sum=0;
        for(var i = 0 ; i <=num.length ; i++)
        {
            sum += num[i];
        }
        console.log("sum=", sum);
}
