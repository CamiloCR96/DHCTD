
const prompt = require("prompt-sync")({ sigint: true });


let numero1=parseInt(prompt("Digite el primer numero:  "));
let numero2=parseInt(prompt("Digite el primer numero:  "));
let operacion=parseInt(prompt("Digite la operacion a realizar: 1.suma, 2.resta , 3.division, 4.multiplicacion "));
operaciones(numero1,numero2,operacion);


function operaciones(numero1,numero2,operacion){
   
    if(numero1 == NaN || numero2 == NaN){
        console.log("los valores ingresados deben ser en formato numerico");

    }
    else if(operacion==1){
        console.log(numero1+numero2);
    }
    
    else if(operacion==2){
        console.log(numero1-numero2);
    }
    else if(operacion==3){
        console.log(numero1/numero2);
    }
    else if(operacion==4){
        console.log(numero1*numero2);
    }
    else{
       console.log("Error numero invalido");
    }

}

