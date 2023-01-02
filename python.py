import sys
import json

argumentos = sys.argv
print(argumentos)
pessoa = {
    "nome":argumentos[1],
    "idade":argumentos[2]
}
print(pessoa)