/* --------------------------- NO TOCAR DESDE ACÁ --------------------------- */
let datosPersona = {
  nombre: "",
  edad: 0,
  ciudad: "",
  interesPorJs: "",
};

const listado = [{
    imgUrl: "https://huguidugui.files.wordpress.com/2015/03/html1.png",
    lenguajes: "HTML y CSS",
    bimestre: "1er bimestre",
  },
  {
    imgUrl: "https://jherax.files.wordpress.com/2018/08/javascript_logo.png",
    lenguajes: "Javascript",
    bimestre: "2do bimestre",
  },
  {
    imgUrl: "https://upload.wikimedia.org/wikipedia/commons/thumb/4/47/React.svg/1200px-React.svg.png",
    lenguajes: "React JS",
    bimestre: "3er bimestre",
  },
];

const profileBtn = document.querySelector("#completar-perfil");
const materiasBtn = document.querySelector("#obtener-materias");
const verMasBtn = document.querySelector("#ver-mas");
const cambiarTema = document.querySelector('#cambiar-tema');

profileBtn.addEventListener("click", renderizarDatosUsuario);
materiasBtn.addEventListener("click", recorrerListadoYRenderizarTarjetas);
cambiarTema.addEventListener("click", alternarColorTema);
/* --------------------------- NO TOCAR HASTA ACÁ --------------------------- */

function obtenerDatosDelUsuario() {
  /* --------------- PUNTO 1: Escribe tu codigo a partir de aqui --------------- */
 
datosPersona.nombre=prompt("Digite su nombre: ");
console.log(datosPersona.nombre);
datosPersona.edad=parseInt(2022-prompt(("Digite el año en que nacio: ")));
console.log(datosPersona.edad)
datosPersona.ciudad=prompt("Digite la ciudad en la que vive: ");
console.log(datosPersona.ciudad);
datosPersona.interesPorJs=confirm("Le gusta JavaScript");
console.log(datosPersona.interesPorJs);
if(datosPersona.interesPorJs){
  datosPersona.interesPorJs="SI";
}
else{
  datosPersona.interesPorJs="NO";
}
}

function renderizarDatosUsuario() {
  /* ------------------- NO TOCAR NI ELIMINAR ESTA FUNCION. ------------------- */
  obtenerDatosDelUsuario();
  /* --------------- PUNTO 2: Escribe tu codigo a partir de aqui --------------- */
  const nombre=document.querySelector("#nombre");
  nombre.innerText=datosPersona.nombre;
  const anio =document.querySelector("#edad");
  anio.innerText=datosPersona.edad;
  const ciudad=document.querySelector("#ciudad");
  ciudad.innerText=datosPersona.ciudad;
  const interesJS=document.querySelector("#javascript");
  interesJS.innerText=datosPersona.interesPorJs;


}


function recorrerListadoYRenderizarTarjetas() {
  /* ------------------ PUNTO 3: Escribe tu codigo desde aqui ------------------ */
  const contenedorLista=document.querySelector("#fila");
  contenedorLista.innerHTML="";
  listado.forEach(elementoDeListado => {
  
    contenedorLista.innerHTML+=` 

    <div class="caja">
    <img src="${elementoDeListado.imgUrl}" alt="Tarjeta React">
    <p clase="legunajes">${elementoDeListado.lenguajes} </p>
    <p clase="bimestre">${elementoDeListado.bimestre} </p>
    </div>
    `
  
  });


}

function alternarColorTema() {
  /* --------------------- PUNTO 4: Escribe tu codigo aqui --------------------- */
 const cambioTemaSitio=document.querySelector("#sitio");
 cambioTemaSitio.classList.toggle("dark");
  


}

/* --------------------- PUNTO 5: Escribe tu codigo aqui --------------------- */
function mostrarElemento(){
  const aparecerTexto=document.querySelector("#sobre-mi")
 
  window.addEventListener("keydown",e=>{
  console.log(e.key);
  if(e.key==="f"){
    aparecerTexto.classList.toggle("oculto");
  }
 })
}
mostrarElemento();