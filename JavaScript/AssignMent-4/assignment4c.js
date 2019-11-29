const items = [{
                    name:"EarRings",
                    id:1,
                    price:5000

                },
                {
                    name:'Kajal',
                    id:2,
                    price:1000
                },
                {
                    name:'TRimmer',
                    id:3,
                    price:2000
                },
                {
                    name:"SetWet",
                    id:4,
                    price:1200
                }]

                console.log("=====by using for in loop==========")
                for( let data in items){

                    if(items[data].price>1000)
                    {
                        items[data].price = items[data].price + 300;
                   }
                 }
                 console.log(items);


                 console.log("========by using map Method=======")

                 const data = items.map(function(value){
                     let NewData;
                     if(value.price>1000) {   
                         NewData = value.price + 300;
                     }
                     return NewData;
                 })

                console.log("=======Fat Arrow Function=========")
                const values= items.map(value)=> {
                    value.price = value.price+300;
                    return value;
                 }
                 console.log(data);

                 console.log("=====By using For of Loop========");
                 for(let data of items)
                 {
                     if(data.price>1000)
                     {
                         data.price=data.price+300;
                     }
                 }
                 console.log(items);
