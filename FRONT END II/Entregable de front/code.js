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
  datosPersona.nombre = prompt('Ingrese nombre');
  console.log(datosPersona.nombre)
  datosPersona.edad = 2022 - parseInt(prompt('Ingrese año de nacimiento'));
  console.log(datosPersona.edad)
  datosPersona.ciudad = prompt('Ingrese ciudad');
  console.log(datosPersona.ciudad)
  datosPersona.interesPorJs = confirm('Ingrese si tiene interes por JS')? 'SI': 'NO';
 
}

function renderizarDatosUsuario() {
  /* ------------------- NO TOCAR NI ELIMINAR ESTA FUNCION. ------------------- */
  obtenerDatosDelUsuario();
  /* --------------- PUNTO 2: Escribe tu codigo a partir de aqui --------------- */
  const cardHeader = document.querySelector('.card-header');
  
  cardHeader.innerHTML = `
    <h3>Nombre:<span id="nombre">${datosPersona.nombre}</span></h3>
    <h3>Edad: <span id="edad">${datosPersona.edad}</span></h3>
    <h3>Ciudad: <span id="ciudad">${datosPersona.ciudad}</span></h3>
    <h3>Interes en Javascript: <span id="javascript">${datosPersona.interesPorJs}</span></h3>
  `;

}


function recorrerListadoYRenderizarTarjetas() {
  /* ------------------ PUNTO 3: Escribe tu codigo desde aqui ------------------ */
  const main = document.querySelector('main');
  const fila = document.querySelector('#fila')

  if(document.querySelector('.caja') == null ) {
    listado.forEach(item => {
      fila.innerHTML += `
      <article class="caja">
          <img src=${item.imgUrl}></img>
          <p>${item.lenguajes}</p>
          <p>${item.bimestre}</p>
      </article>
      ` 
  });
  }
}

function alternarColorTema() {
  /* --------------------- PUNTO 4: Escribe tu codigo aqui --------------------- */
  
  if(!sitio.classList.contains('dark')) {
    sitio.classList.add('dark');
  } 
  else {
    sitio.classList.remove('dark');
  }
}

/* --------------------- PUNTO 5: Escribe tu codigo aqui --------------------- */

let sobreMi = document.querySelector('#sobre-mi');

document.addEventListener('keypress', function(event) {
  if(event.key == "F") {
    sobreMi.classList.remove('oculto'); 
  }
});
