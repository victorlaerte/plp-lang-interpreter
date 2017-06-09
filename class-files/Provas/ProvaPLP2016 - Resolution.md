## Prova 2016

# Question 1
```
head(x:xs) = x
tail(x:xs) = xs
 
Lista = [a,b,c,d]
n = 2
 
E([],n) = [ ]
E(Lista, 2) = E(Lista, 2, 0)
 
 
E(Lista, n):
	if (n-1 > 0) then
		[head(Lista)] ++ E(tail(lista), n-1)
	else
		[ ]
```

```
D([ ],n) = [ ] 
D(Lista, n) = D2(Lista, n, 0)
 
D(Lista, n):
	if (n-1 > 0) then
		D(tail(Lista), n-1)
	else
		[tail(Lista)]
```

# Question 5

1)
```
Expressao ::= Valor | ExpUnaria | ExpBinaria | Id | ChamadaProcedimento

DeclaracaoProcedimento ::= "proc" Id "(" [ ListaDeclaracaoParametro ] ")" "{" Comando "return" Expressao "}"

ChamadaProcedimento ::= "call" Tipo Id "(" [ ListaExpressao ] ")"
```
2) DecProcess terá que mapear ter um atributo do tipo do procedimento, além do tipo dos parametros. Dessa forma será possível saber o tipo do procedimento através do contexto de execução que mapeia os procedimentos.

3) ChamadaProcedimento agora deverá implementar Expressão ao invés de comando, tendo assim agora os métodos de Avaliar e getTipo, onde getTipo retorna o mesmo tipo na declaração do procedimento

