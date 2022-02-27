let n = parseInt(prompt("Digite quantos termos da sequencia voce quer ver: "))
let termo1 = 0;
let termo2 = 1;
let termo3;

if(n < 2)
    document.write(termo1);
else if(n < 3)
    document.write(termo1+", "+termo2);
else if(n => 3){
    document.write(termo1+", "+termo2);
    for(let i = 2; i < n; i++){
        termo3 = termo1 + termo2;
        document.write(", "+termo3);
        termo1 = termo2;
        termo2 = termo3;
    }
}