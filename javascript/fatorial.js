let n = parseInt(prompt("Digite um numero: "));
let fatorial = 1;

for(let i = n; i <= 1; i--){
    fatorial *= i;
}

document.write("O fatorial de "+n+" eh: "+fatorial)