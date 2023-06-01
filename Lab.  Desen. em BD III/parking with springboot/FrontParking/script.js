const formulario = document.querySelector("form");
const botao = document.querySelector("button");
const imodelo = document.querySelector(".modelo");
const imarca = document.querySelector(".marca");
const iplaca = document.querySelector(".placa");
const icor = document.querySelector(".cor");

function cadastrar (){
    fetch("http://localhost:8080/carro",
    {
        headers: {
            "Accept": "application/json",
            "Content-Type": "application/json"
        },
        method: "POST",
        body: JSON.stringify({
            modelo: imodelo.value,
            marca: imarca.value,
            placa: iplaca.value,
            cor: icor.value})
    })
    .then(function (res) {console.log(res)})
    .catch(function (res) {console.log(res)})
};

function limpar() {
    imodelo.value = "";
    imarca.value = "";
    iplaca.value = "";
    icor.value = "";

};

formulario.addEventListener('submit', function(event){
    event.preventDefault();

    cadastrar();
    limpar();

})