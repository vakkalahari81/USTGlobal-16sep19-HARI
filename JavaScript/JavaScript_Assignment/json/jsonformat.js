let person=[
                {
                     name: 'hari',
                     id:1381,
                },
                {
                     name: 'harish',
                     id:1382,
                },
                {
                        name:'bobby',
                        id:1212,
                }
      ]

      let b = JSON.stringify(person);

     for(data of person){
         console.log(data);
     }
     console.log("json Object");
     console.log(b);