//1- Agregar a la tarjeta, el atributo "class" con el valor "card"
 let card=document.getElementById("tarjeta");
 card.className+="card";

//2- Agregar a la imagen, el atributo "src" con el valor "https://www.youtube.com/img/desktop/yt_1200.png"
let atributo=document.querySelector("img");
atributo.setAttribute("src","https://www.youtube.com/img/desktop/yt_1200.png")

//3- Quitarle al titulo la clase que le está dando un formato feo
let removerClase=document.querySelector(".titulo-feo");
removerClase.removeAttribute("class");

//4- Chequear si el link a youtube posee o no el atributo href
let chequeoAtributo=document.querySelector("#logo");

if(chequeoAtributo.hasAttribute("href")){
    console.log("Si lo tiene");
};

//5- Obtener el href del link a wikipedia y mostrarlo por consola
let chequeoAtributoGet=document.querySelector("img")
if(chequeoAtributoGet.getAttribute("href")===null){
    console.log("No se encuentra este atributo se obtiene un "+ chequeoAtributoGet.getAttribute("href"));
};
