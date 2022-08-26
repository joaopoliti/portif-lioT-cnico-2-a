import pyautogui #pyautogui serve para a automatização
import pyperclip #pyperclip serve só para copiar texto
import time
pyautogui.PAUSE = 1 # Para cada comando o codigo espera 1 segundo antes de rodar o proximo comando



# 1 Entrando no meu perfil no site da Shopee
pyautogui.press('win')
pyautogui.write('microsoft edge')
pyautogui.press('enter')
pyperclip.copy('https://shopee.com.br/user/purchase/')
pyautogui.hotkey( 'Ctrl', 'v')
pyautogui.press('enter')

# Site carregando
time.sleep(5) #faz o codigo esperar 5 segundos antes de prosseguir


# 2 Navegar no site 
pyautogui.click(x=411, y=147) # Clicar na barra de pesquisa 
pyautogui.write('hd externo 1tb samsung')
pyautogui.press('enter')

time.sleep(4)
pyautogui.click(x=637, y=457) #clicar no produto selecionado
time.sleep(4)
pyautogui.tripleClick(x=891, y=277) # Copia a descricao do produto
pyautogui.hotkey( 'Ctrl', 'c')

# 3 Entrar no Banco de Dados
time.sleep(3)
pyautogui.click(x=465, y=747)
time.sleep(30)
pyautogui.click(x=582, y=204)
pyautogui.write('johnny')
pyautogui.press('enter')
time.sleep(3)
pyautogui.click(x=16, y=103)
pyautogui.click(x=118, y=170)
pyautogui.click(x=273, y=39) # Tools
pyautogui.click(x=301, y=156) # Query Tool
time.sleep(3)
pyautogui.write('insert into bugiganga (produto, valor)')
pyautogui.press('tab')
pyautogui.write('values(')
pyautogui.write("'")
pyautogui.hotkey( 'Ctrl', 'v')
time.sleep(1)
pyautogui.press('delete')
pyautogui.press('delete')
pyautogui.write("'")
pyautogui.write(",'375')")
pyautogui.click(x=409, y=228)
pyautogui.press('delete')
pyautogui.hotkey( 'Ctrl', 'a')
pyautogui.press('f5')
pyautogui.hotkey( 'Ctrl', 'a')
pyautogui.write("select * from bugiganga")
pyautogui.hotkey( 'Ctrl', 'a')
pyautogui.press('f5')
pyautogui.hotkey('ctrl', 's')
