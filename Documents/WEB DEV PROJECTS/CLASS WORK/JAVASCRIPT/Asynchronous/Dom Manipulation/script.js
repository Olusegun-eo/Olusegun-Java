// ADDING ELEMENT TO THE PAGE  
// ONE:==> SELECTING THE ELEMENT WE ARE GOING TO BE ADDING TO
//To append strings to the body===we use ".append"

const appendTextToBody = document.body.append("hello Dom Manipulation, Bye!!!, Hello Everyone");

// With "appendChild" You can only append elements eg div, a tag, para"
// i.e appendChild requires  a Node not a string
// const body = document.body.appendChild("You won't see a jack")


// HOW TO APPEND AN ELEMENT

const body = document.body
const div = document.createElement("div");
body.append(div); //body.appendChild(div);-->This will also work


// Now to ADD Text to the element Created
div.innerHTML = "First way of append text; Hello Everyone!!!"
div.append("Second way of append text")
div.textContent = "Another way of appending text"
div.innerText = "Adding text to the element!!" 


// Note==> Either "textContent" OR ".innerText" will overrides any other ways
let showSpan = document.querySelector('div');   
console.log(showSpan.textContent);
console.log();
console.log(showSpan.innerText);


// To DELETE ELEMENT FROM THE DOM
let diva = document.querySelector('#diva')
let divb = document.querySelector('#divb')
let bye = document.querySelector('#bye');
let hi = document.querySelector('#hi');

//Method A
diva.remove()

// Method B===> remove the child element
divb.removeChild(bye);



// object.addEventListener('event', function)
 myDiv.addEventListener('event', doSomething);
 const doSomething = (obj)=>{
     console.log(obj.type);
     console.log(obj.target);
 }