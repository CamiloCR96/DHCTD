const {generateText, createElement, validateInput }=require("../util.js");


test("prueba salida de nombre y edad", ()=>{
const text= generateText("Camilo",26);
expect(text).toBe("Camilo (26 years old)");
})
