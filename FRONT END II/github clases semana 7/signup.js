window.addEventListener('load', function () {
    /* ---------------------- obtenemos variables globales ---------------------- */
    const form = document.forms[0];
    const nombre = document.querySelector("#inputNombre");
    const apellido = document.querySelector("#inputApellido");
    const email = document.querySelector("#inputEmail");
    const password = document.querySelector("#inputPassword");
    
    const url = "http://todo-api.ctd.academy:3000/v1/";

    /* -------------------------------------------------------------------------- */
    /*            FUNCIÓN 1: Escuchamos el submit y preparamos el envío           */
    /* -------------------------------------------------------------------------- */
    form.addEventListener('submit', function (event) {
      event.preventDefault();

      const objeto = {
        firstName : nombre.value,
        lastName : apellido.value,
        email : email.value,
        password : password.value
      }

      const settings = {
        method : "POST",
        body : JSON.stringify(objeto),
        headers : {
            'Content-Type': 'application/json'
        }

        }

    realizarRegister(settings);
    form.reset();

    });

    /* -------------------------------------------------------------------------- */
    /*                    FUNCIÓN 2: Realizar el signup [POST]                    */
    /* -------------------------------------------------------------------------- */
    function realizarRegister(settings) {
        
        fetch(`${url}users`, settings)
            .then(response =>{
                console.log(response);
                if(response.ok != true){
                    alert("Algún dato es incorrecto");
                }
                return response.json();
            })
            .then(data =>{
                console.log(data);
                if(data.jwt){
                    location.replace("./index.html")
                }
            })
            .catch(err =>{
                console.log("Promesa rechazada");
                console.log(err);
            })




    };


});