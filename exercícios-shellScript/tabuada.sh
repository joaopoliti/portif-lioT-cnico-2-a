tabuada.sh  #Criação do script
#!/bin/bash
#depois vem o interpretador

read -p "Digite um numero para ver sua tabuada: " x  #imprima a mensagem que a pessoa digitar e atribuir ele para "x" depois

for i in $(seq 1 10)  #para "i" na sequencia de 1 a 10
do #faça
        res[$i]=$(($x*$i))  #a variavel "x" será multiplicada pela variavel "i"
done  #fechamento 
echo ${res[@]}  #mostre o resultado das sequências de multiplicação pela variavel "$x"
