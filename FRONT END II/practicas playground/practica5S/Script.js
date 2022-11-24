let titulo=document.querySelector('h1');
titulo.innerHTML += ", El one piece no existe por el momento";
console.log(titulo.innerHTML);

let parrafoTripulantes=document.querySelector('p.tripulacion');
parrafoTripulantes.innerHTML+=" Conformado por la mejor tripulacion de la nueva era";
console.log(parrafoTripulantes);
console.log(parrafoTripulantes.innerHTML);

/*const template=`<h1>Hola mundo</h1>`;
const body= document.getElementById("body");
body.innerHTML=template;
abody.innerText=template;

console.log(body.innerHTML);
console.log(body.innerText);
*/

function escribiendoEnHtml(titulo,texto){
    const body=document.getElementById("body"); 
    const template=`<h1>${titulo}</h1> <p>${texto}</p>`;

    body.innerHTML +=template;
}

escribiendoEnHtml("One piece","aqui va el poderoso texto");
escribiendoEnHtml("definiendo las bases", "demsotrando que es mejor que bleach");

const confirmacionCambioDeColor= confirm("¿Desea cambiar el color y el tamaño de la pagina One piece?");

if(confirmacionCambioDeColor){
const cambiodeColor=document.querySelector("body");
cambiodeColor.style.color="orange";
cambiodeColor.style.fontSize="25px";
};

const cambioEstilo=document.querySelector("h1");
cambioEstilo.innerHTML+=" se cambio el color y el texto";
cambioEstilo.classList.add("aplicador");
console.log(cambioEstilo);







