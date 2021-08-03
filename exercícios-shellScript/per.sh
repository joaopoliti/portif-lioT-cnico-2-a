#!/bin/bash
read var

var=$(ls -ld $1)
R=${var:0:1}
w=${var:0:2}
x=${var:0:3}

if [[ $R == "r" ]]
then
        echo "Tem leitura"
fi
if [[ $w == "w" ]]
then
        echo "Tem escrita"
fi
if [[ $x == "x" ]]
then
        echo "Tem execução"
fi
