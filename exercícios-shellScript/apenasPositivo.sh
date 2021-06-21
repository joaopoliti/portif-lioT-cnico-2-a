#!/bin/bash
#script que permite apenas valor positivo
#nome: João Paulo
echo " Digite um nomero"
read x

if [ $i -gt 0 ]
then
    for i in $(seq 1 $x)
        do 
        echo " $i "
        done
else 
    echo " Tem que ser positivo"
fi
