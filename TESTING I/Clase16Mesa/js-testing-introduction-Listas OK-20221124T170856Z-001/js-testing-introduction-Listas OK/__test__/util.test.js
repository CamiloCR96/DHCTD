const{validateInput,createElement, generateText} = require ('../util.js')

describe("prueba de entrada de datos",()=>{
    test("ingresar texto",()=>{
        const text=generateText("Naye",25);
        expect(text).toBe("Naye(25 years old)");
    })

})

describe("prueba de entrada de datos",()=>{
    test("ingresar texto",()=>{
        const text=generateText("Naye",25);
        expect(text).toMatch("Naye(25 years old)");
    })
    
})