#pwrd.sh:  #Criação do script
#!/bin/bash
#depois vem o interpretador

echo "Enter username" #fala para colocar o nome
read username #read para colocar o nome
echo "Enter password" #fala para colocar a senha
read password  #read para colocar a senha 

if [[ $username == "admin" && $password == "secret" ]]  #o if diz que tem que ter o nome=admin e a senha=secret para autorizar
then
        echo "valid user"  #se não é invalido 
else
        echo "invalid user"
fi

