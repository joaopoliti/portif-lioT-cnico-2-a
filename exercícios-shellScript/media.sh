#!/bin/bash
#script que tira a media dos produtos 
#Nome: João Paulo
i=1
soma=0
while [ $i -le 15 ]
do 
    echo " Escreva o preço do $i° produto"
    read: valor 
    if [ $valor -lt $maior ]
    then 
        maior=$valor
     fi
     soma=$(( $soma + $valor ))
     i=$(( $i + 1 ))
done
soma=$( bc <<< "scale=4; $soma/15" )
echo " A media dos valores é $soma "
echo " O produto mais caro é $maior" 
