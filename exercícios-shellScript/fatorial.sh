 
#fatorial.sh  #Criação do script
#!/bin/bash   
#depois vem o interpretador

read -p "Digite um numero:" num #read para criar uma variavel e o "-p" para aparecer o pedido de variavel   
res=1   #atribui valor a variavel res
i=0    #atribui valor a variavel i
while [ $num -gt 0 ] #enquanto a variavel "num" for maior que 0 
do   #faça
        res=$((res*num))  #variavel "res" vezes a variavel "num" vai dar um resultado 
        fatorial[$i]=$num  #vai mostrar a variavel "num"
        i=$((i+1))    # "i" vai ser a posição do vetor fatorial que será acrescentado no script
        num=$((num-1))   #está diminuindo 1 no valor de "num"

#num=3
#res=1
#1° interação:
#res=1*3
#num=2

done #fecha
echo ${fatorial[@]}  #mostra os valores atribuidos ao fatorial
echo $res 
