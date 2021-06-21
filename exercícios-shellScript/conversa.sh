#talk.sh:  #Criação do script
#!/bin/sh   
#depois vem o interpretador

echo "Please talk to me ..." #mensagem de pedido
while true   #em seguida vem uma loop “infinito” com o While true
do
  read INPUT_STRING    #atribui um nome para variável (chamada Input String)
  case $INPUT_STRING in   # case abre opções de valores para atribuir para a variável.
	hello)
		echo "Hello yourself!"   #Se for “Hello‘” ele vai digitar “Hello yourself!“
		;;
	bye)
		echo "See you again!"    #se colocar “ bye“ ele vai escrever “See you again” e irá quebrar o loop com o "break"
		break
		;;
	*)
		echo "Sorry, I don't understand"   #se for “*” ele irá escrever “Sorry, I don't understand”
		;;
  	   esac
done
echo 
echo "That's all folks!"
# (Os 2 “;;”  são para que, depois de executar o comando ele sair do “case”)
