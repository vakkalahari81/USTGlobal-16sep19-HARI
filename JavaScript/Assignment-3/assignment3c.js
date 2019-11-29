var items=[{
                    item:'shoes',
                    id:1,
                    price:2000,

            },
            {
                item:'watch',
                id:2,
                price:500,
            },
            {
                item:'cloth',
                id:3,
                price:300
            }

    ]
    console.log("For in Iteration")
    for( var ele in items)
    console.log(items[ele]);



    var Student=[
        {
            name: 'HARI',
            id:1381,
            age:22,
            gender:'M'    
        },
        {
            name:'Pavitra',
            id:1382,
            age:21,
            gender:'F'
        },
        {
            name:'Abcdef',
            id:1345,
            age:23,
            gender:'other'
        }
]
console.log("This is For Loop")
for(let i=0;i<Student.length;i++)
{
    console.log(Student[i]);
}

for(data in Student)
console.log(Student[data]);


var Mobile=[
       {
        name:'Redmi',
        id:1382,
        model:'note4',
        cost:90000,
      },
      {
          name:'Samsung',
          model:'Duos',
          id:1389,
          cost:7000,
      },
      {
          name:'Vivo',
          model:'Y9',
          id:1322,
          cost:8000,
      },
      {
          name:'Nokia',
          mode:'Normal',
          id:3422,
          cost:40000, 
      }
   ]
   for(var data in Mobile)
   console.log(Mobile[data]);

    
    console.log("=======person Object=====")
    var person={
        name:'HAri',
        age:22,
        gender:'m'
     }
     for(var data in person)
     console.log(person[data]);

    var Car={
                name:'Maruthi',
                number:12121,
                cost:500000,
                model:'800'
            }

            for( var data in Car)
            console.log(Car[data]);

var Book={

                name:'Spoken English',
                id:1332,
                cost:300,
   }
   for(var data in Book)
   console.log(Book[data]);

    


              
        