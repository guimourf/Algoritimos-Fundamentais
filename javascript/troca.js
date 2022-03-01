let a = parseInt(prompt("Digite o valor de A: "));
let b = parseInt(prompt("Digite o valor de B: "));
let aux;

aux = b;
b = a;
a = aux;

document.write("O valor de A depois da troca é: "+a+"<br>")
document.write("O valor de B depois da troca é: "+b+"<br>")