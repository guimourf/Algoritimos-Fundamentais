let n = parseInt(prompt("Digite a quantidade de notas"));
let nota;
let contagem = 0;
let i = 0;

while(i < n){
    nota = parseInt(prompt("Digite a nota: "));

    if(nota >= 5){
        contagem++;
    }
    i++;
}
document.write("Numero de alunos que passaram: "+contagem);
