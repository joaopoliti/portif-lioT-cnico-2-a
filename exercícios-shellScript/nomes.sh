#!/bin/bash
#script que fala os nomes om ordem
#nome: João Paulo 
nomes=( "Félix" "Caua" "Felipe" )
echo "Oi meu nome é ${nomes[@]} "
echo "O tamanho do vetor é: ${#nomes[@]} "

echo "O conteudo da posição numero 1: ${#nomes[0]} "
echo "_______________________________________________"

for i in ${nomes[@]}
  do 
     echo "O conteudo é igual Oi eu sou $i "
  done
echo "________________________________________________"

i=0
while [ $i -lt ${#nomes[@]} ]
do
    echo "O conteudo na posição $i é Oi eu sou ${nomes[$i]} "
    i=$(( i + 1 ))
done 
