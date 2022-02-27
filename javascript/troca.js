let n = parseInt(prompt("Digite um numero: "));
let fatorial = 1;
let i = n;

while(i >= 1){
    fatorial *= i
    i--;
}
document.write("O fatorial de "+n+" eh: "+fatorial)