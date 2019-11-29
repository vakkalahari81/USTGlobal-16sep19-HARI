let element = document.getElementById('demo');
console.log('Element=',element);
console.log('element text is',element.textContent);
element.textContent = 'Good Evening'
console.log(element.textContent);

console.log("========================")
let buttonElement = document.createElement('button');
buttonElement.textContent = 'Click Me !!!';
console.log('Button Element',buttonElement);

document.body.appendChild(buttonElement);

let ulElement = document.createElement('ul')
let li1Element = document.createElement('li')
let li2Element = document.createElement('li')
let li3Element = document.createElement('li')
let li4Element = document.createElement('li')

li1Element.textContent = 'Java'
li2Element.textContent = 'SQL'
li3Element.textContent = 'JAVASCRIPT'
li4Element.textContent = 'C'

let olElement = document.createElement('ol');
let li5Element = document.createElement('li');
let li6Element = document.createElement('li');
let li7Element = document.createElement('li');

ulElement.appendChild(li1Element);
ulElement.appendChild(li2Element);
ulElement.appendChild(li3Element);
ulElement.appendChild(li4Element);
document.body.appendChild(ulElement);

element.style.color = 'red';
element.style.backgroundColor = 'cyan'; 
element.style.fontSize='100px' 


olElement.type='a';
olElement.style.backgroundColor='yellow'
olElement.style.width='100px'

li5Element.textContent = "Advanced Java"
li6Element.textContent = 'Jdbc'
li7Element.textContent = 'J2ee'

olElement.appendChild(li5Element);
olElement.append(li6Element);
olElement.appendChild(li7Element);
document.body.appendChild(olElement)
 
