## Prova 2016

# Question 5

1)
```
Expressao ::= Valor | ExpUnaria | ExpBinaria | Id | ChamadaProcedimento

DeclaracaoProcedimento ::= "proc" Id "(" [ ListaDeclaracaoParametro ] ")" "{" Comando "return" Expressao "}"

ChamadaProcedimento ::= "call" Tipo Id "(" [ ListaExpressao ] ")"
```
2) DecProcess terá que mapear ter um atributo do tipo do procedimento, além do tipo dos parametros. Dessa forma será possível saber o tipo do procedimento através do contexto de execução que mapeia os procedimentos.

3) ChamadaProcedimento agora deverá implementar Expressão ao invés de comando, tendo assim agora os métodos de Avaliar e getTipo, onde getTipo retorna o mesmo tipo na declaração do procedimento

