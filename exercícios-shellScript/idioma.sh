while2.sh:  #Criação do script
#!/bin/sh   
#depois vem o interpretador
while read input_text  #criação do loop e pedindo para escrever uma variavel, o read não vai pegar do terminal, mas sim vai pegar do arquivo 
do
  case $input_text in   # o "case" vai olhar pra variavel e vai dar opções
        hello)          echo English   #se escrever "hello" ele vai escrever "English"
        ;;
        howdy)          echo American   #se escrever "howdy" ele vai escrever "American"
        ;;
        gday)           echo Australian   #se escrever "gday" ele vai escrever "Australian"
        ;;
        bonjour)        echo French     #se escrever "bonjour" ele vai escrever "French"
        ;;
        "guten tag")    echo German      #se escrever "guten tag" ele vai escrever "German"
        ;;
        *)              echo Unknown Language: $input_text    #se escrever qualquer outra cois, ele vai escrever "Unknown Language: $input_text"
        ;;
   esac
done ​< myfile.txt #colocando sinal de entrada (<), fazendo a entrada ser no aqruivo "myfile"

touch myfile.txt:
#this file is called myfile.txt and we are using it as an example input.
#hello
#gday
#bonjour
#hola

