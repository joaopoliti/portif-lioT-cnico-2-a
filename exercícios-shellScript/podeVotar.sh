#!/bin/bash
#script que diz se a pessoa tem idade para votar
#nome: João Paulo
echo " Em que ano você nasceu? "
read a 
if [ $a -le 2002 ] 
then
    echo " Você pode votar "
    else
        echo " você não pode votar"
fi
