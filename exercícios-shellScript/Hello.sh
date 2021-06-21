#while.sh #Criação do script
#!/bin/bash  
#depois vem o interpretador
INPUT_STRING=”hello”  #então cria uma variável do tipo string e atribui o valor “Hellow”
while [ $INPUT_STRING != "bye" ]  #enquanto var string for diferente de "by"
do #Faça
  echo "Please type something in (bye to quit)" #depois tem a frase falando que para a pessoa sair do loop ela deve escrever “ bye”
  read INPUT_STRING  #pedindo pra escrever algo
  echo "You typed: $INPUT_STRING"  #se for diferente de “by” então vai imprimir “ Você escreveu ...”
done
