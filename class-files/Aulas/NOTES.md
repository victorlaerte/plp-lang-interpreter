# Study Notes

## Aula 1 - Introdução
* O que é um paradigma de programação?
    - Modelo, padrão ou estilo de programação  suportado por linguagens que agrupam certas características comuns;
    - A classificação de linguagens em paradigmas é uma conseqüência de decisões de projeto que impactam radicalmente a forma na qual uma aplicação real é modelada do ponto de vista computacional;

* Paradigma Imperativo (Procedural)
    - Programas centrados no conceito de um estado (modelado por variáveis) e ações (comandos) que manipulam o estado, inclui subrotinas ou procedimentos como mecanismo de estruturação. Primeiro paradigma a surgir
    - Modelo Computacional: Entrada -> (Programa <--> Estado) -> Saída
    - Vantagem: Eficiente (Embute Von Neumann), modelagem natural
    - Desvantagem: Relacionamenti indireto E/S, difícil legilibildade, focalizam o como e não o que

* Paradigma Orientado a Objetos
    - Subclassificação do imperativo
    - Classes, atributos, métodos e herança
    - Modelo Computacional: N (Entrada -> (Programa <--> Estado) -> Saída)
    - Vantagens: Todas do PImperativo, classes facilitam modularização e reuzo.
    - Desvantagens: Mesmas do PIperativo, amenizadas pela facilidade de estruturação
    - Não é um paradigma no sentido estrito (diferença metodologica)

* Paradigma Orientado a Aspectos
    - Mesmos elementos de POO, com aspectos (módulos), pontos de interceptação (pointcuts) que afetam classes ou outros aspectos definindo um novo comportamento (advice)
    - Modelo Computacional: N ((Entrada -> ((Programa <--> Estado) Aspecto) -> Saída) Aspecto)
    - Vantagens: Todas POO, útil para modularizar conceitos ligados a requisitos não funcionais. Aumento de reuzo.
    - Desvantagens: Semelhantes POO, conflito entre aspectos que afetam a mesma classe.

* Paradigma Funcional
    - Estilo declarativo
    - Programas são funções
    - Relação explícita de E/S
    - Não há conceito de estado
    - Funções de alta ordem, avaliação sob demanda, polimorfismo
    - Modelo computacional: Entrada -> Programa -> Saída
    - Vantagens: Prova de propriedades, concorrência explorada de forma natural
    - Desvantagens: O mundo não é funcional, implementações ineficientes.

* Paradigma Lógico
    - Estilo declarativo
    - Programas são relações entre E/S
    - Na prática inclui características imperativas
    - Modelo computacional: Entrada -> Programa -> Saída
    - Vantagens: Todas do PF, alto nível de abstração (através de associações entre E/S)\
    - Desvantagens: Toda do PF, não poossuem tipos e nem são de alta ordem.

### Observações
Uma função de alta ordem é uma função que pode receber outra como parâmetro, ou retorna uma função como resultado [ref](https://en.wikipedia.org/wiki/Higher-order_function)

## Aula 2 - Conceitos e LE1

* LE1
    - valores constantes;
    - operações sobre inteiros, booleanos e strings;
    - um programa é uma expressão
* LE2
    - mapeamento entre identificadores e tipos
    - mapeamneto entre identificadores e valores
    - na avaliação de uma expressão um id é substituido pelo seu valor.
* LF1
    - mapeamento de identificadores em valores
    - mapeamento de identificadores (nomes de função) e definições de função
* LF2
    - Estende LF1 com alta ordem;
    - contexto de exeução inclui um único mapeamento de identificadores em valores;
    - o resultado da avaliação de uma expressão pode ser uma função, uma função pode ser um argumento de outra função
* LI1
    - mapeamento dinâmico de identificadores em valores;
    - uma lista de valores de entrada;
    - uma lista de valores de saída;
    - um programa é um comando;
* LI2
    - Estende LI1 com procedimentos parametrizados e recursivos
    - mapeamento de identificadores (nomes de procedimentos) em definições de procedimentos
    - procedimentos não possuem o status de valor
    - um programa é um comando
* Linguagem funcional imperativa
    - Integra LF2 e LI2
    - um programa é uma expressão ou um comando
* LOO1
    - Estende LI2 com classes e objetos
    - Procedimentos só como métodos
    - mapeamento de identificadores em definições de classes
    - um programa é um comando
* LOO2
    - Introduz herança e subtipos
    - métodos podem ser redefinidos
    - uma estrutura para registrar a hierarquia de classes
    - um programa é um comando
* Linguagem Funcional Imperativa OO
    - Integra LF2 e LOO2

### Observações

Cada linguagem tem uma BNF ([Backus Naur Form](https://pt.wikipedia.org/wiki/Formalismo_de_Backus-Naur)) que define sua gramática
* Em LE1:
    - Um valor é o componente mais básico que pode ser avaliado, armazenado, passado como parametro, etc.
    - É conveniente agrupar valores em tipos. Valores de um tipo devem exibir comportamento uniforme. (Restrição contextual)

## Aula 3 - LE2

* Um binding é uma associação entre um identificador e uma entidade (constante, variável, função, procedimento, tipo, etc)
* Um ambiente ou contexto é um conjunto de bindings
* Entidades que podem ser associadas a identificadores são denominadas bindable
* Valores do tipo registro ou arrays não são bindable
* Escopo é a porção do texto do programa na qual uma dada declaração é visível
* Em uma linguagem monolítica existe apenas um espoco.
* Em uma estrutura de blocos lienar onde um programa é particionado em blocos existem variáveis de escopo global e local
* Em uma estrutura de blocos aninhados (um bloco dentro de outro) existem vários níveis de escopo. Surge o conceito de buraco, isso ocorre quando em uma parte do texto do programa o identificador não é visível pq um outro (com mesmo nome) foi introduzido.
* Uma declaração é uma construção do programa partir da qual bindins são definidos.
    - Declarações colaterais
    - Delcarações sequenciais
    - Declarações recursivas
* Em uma avaliação de forma normal ou canônica as expressões mais internas são avaliadas primeiro.

## Aula 5 - Parsing

* Símbolos terminais: +, -, not, length, and, or, ==, ++, 0, …, 9, a, …, z, A, …, Z
* Símbolos não terminais: Programa, Expressao, Valor, ExpUnaria, ExpBinaria, ValorConcreto, ValorInteiro, ValorBooleano, ValorString
* Árvore com labels em que As folhas são símbolos terminais, os nós são símbolos não-terminais
* Ambiguidade gramatical e precedência
    - Exemplo (ambiguidade): 2 + 3 - 4
    - Exemplo (precedência): 2 + 3 * 4

## Aula 6 - JavaCC

* É um parser Top-Down (Examina os símbolos terminais da esquerda para a direita; Forma a ST (syntax tree) de cima para baixo)
* A gramática não pode possuir recursão à esquerda.(ex: expr:= expr ‘+’ expr)
* Opções do parser:
    - STATIC – diz se os métodos do parser serão estáticos (default: true)
    - LOOKAHEAD – informa o nível de profundidade do lookahead (default: 1) (The LOOKAHEAD value tells the generated parser how many unprocessed (i.e., future) tokens to use to decide what state to transition to. In a tightly-constrained language, only one lookahead token is necessary. The more ambiguous a language is, the more lookahead tokens are needed to determine which state transition to make.)
    - IGNORE_CASE– instrui o parser a ser ou não case sensitive (default: false)
    - DEBUG_PARSER – instrui o parser a registrar todas as informações durante o parsing do arquivo (default: false)

## Aula 7 - Linguagem funcional LF1

* Innermost (eager evaluation, applicative order reduction): Começa a avaliação da expressão de dentro pra fora
* Outermost (normal order reduction): começa a avaliação da expressão de fora para dentro
* Se um termo possuir uma forma normal, esta será sempre obtida através de uma outermost reduction.
* Se a redução usando a estratégia innermost (ou qualquer outra combinação de avaliação entre innermost e outermost) produzir um resultado, este será o mesmo produzido usando uma redução outermost.
* Lazy Evaluation: Especialização de outtermost. O argumento só é avaliado uma única vez e só quando preciso.
* Escopo Estático: uma vez que foi determinado um valor para x, o mesmo não é afetada pela introdução de uma variável local de mesmo nome em um bloco aninhado.
* Escopo Dinâmico: a avalição de uma expressão leva em conta sempre a ultima avaliação de uma variável, mesmo ela tendo sido atribuida em um outro escopo.
* Builtin functions
    - cons(e,L) recebe um elemento (e), uma lista (L) e retorna uma lista com o elemento e acrescido no início de L
    - head(L) recebe uma lista L e retorna o elemento que está na cabeça (elemento mais à esquerda) de L
    - tail(L) recebe uma lista  L e retorna uma lista com todos os elementos de L  exceto o head
    - Concat(L1,L2) concatena (combina) os elementos de L1  e de L2 preservando a ordem (os de L1 aparecem primeiro)
* Currying is when you break down a function that takes multiple arguments into a series of functions that take part of the arguments. Here's an example in JavaScript:
```javascript
function add (a, b) {
  return a + b;
}

add(3, 4); returns 7
This is a function that takes two arguments, a and b, and returns their sum. We will now curry this function:

function add (a) {
  return function (b) {
    return a + b;
  }
}

This is a function that takes one argument, a, and returns a function that takes another argument, b, and that function returns their sum.

add(3)(4);
var add3 = add(3);
add3(4);
```

## Aula 8 - Linguagem funcional LF2 e 3

* Exemplo de currying em LF2:
```
//Considere as seguintes definições para min
fun min x y  =  if  (x <=  y) then x else y 
fun min’ x  =  fn y . min (x, y)
```
Observe que min é sempre aplicada a dois argumentos e retorna o menor deles, enquanto min’ pode ser aplicada só a um argumento, retornando uma função que espera o outro argumento.
```
min : (int x int) -> int 
min´ : int -> (int -> int)
```

* Teoria com igualdade que permite a substituição do lado esquerdo pelo lado direito de uma equação, e vice-versa
* Igualdade é uma relação de ordem: reflexiva, simétrica e transitiva
```
suc x = x + 1
pred x = x - 1
Id x = x
// Provar que a composição de Suc e Pred equivale a Id
x + 1 = x - 1
x = x - 1 + 1
Id x = x
```

* Prova por indução:
    - Caso base (0)
    - Caso indutivo (n+1)

Exemplo:
```
//Considere a função a seguir, para x e y naturais
prod(0,y) = 0                  (1)
prod(x,y) = y + prod(x-1,y)    (2)

//Provar:
(B) prod(y,x+1) = y + prod(y,x)

(Y = 0). prod(0,x+1) = 0 = 0 + prod(0,x)

(Y+1). prod(y+1,x+1) = y+1 + prod(y+1,x)
prod(y+1,x+1)  
= x+1 + prod(y,x+1)    (2)
= x+1 + y + prod(y,x)  H.I
= y+1 + x + prod(y,x)  Aritmética
= y+1 + prod(y+1,x)    (2)

//Provar:
(C) prod(x,y) = prod(y,x)

(x = 0). prod(0,y) = 0 = prod(y,0), por (A)

(x+1). prod(x+1,y) = prod(y,x+1)
prod(x+1,y)
= y + prod(x,y)  (2)
= y + prod(y,x)  H.I
= prod(y,x+1)    (B)
```

* Notação A notação [x1,...,xn] é uma abreviação para x1 : x2 : ... : xn : []
* Função head(x : xs) = x
* Função tail(x : xs) = xs
* ^^ (Concatenação)
    - (x : xs) ^^ ys = x : (xs ^^ ys)
* fold (function to combine all elements given a certain operation)
    - The folding of the list [1,2,3,4,5] with the addition operator would result in 15
    - let fun fold op elem list
* map (aplica função passada como parametro a todos os elementos da lista)
    - map f (x : xs) = f(x) : map(f,xs)
* filter (filtra a lista dado um condicional)
    - filter positivo [-5, 3, -2, 0, 4], onde positivo(x) = (x > 0)
* Compreensão de listas em LF3  [exp qualificador,...,qualificador]
    - [x+1 for x in 3..1 ] = = [4, 3, 2]
    - [x+1 for x in 3..1 if x==1] = = [2]

## Aula 16 e 17 - Imperativa 1

* Memória abstrata: Id -> Valor
* Memória concreta: Id -> Ref -> Valor
* Limites de um array
    - estático: determinado em tempo de compilação
    - dinâmico: determinado no momento da criação da variável
    - flexível: não é determinado em nenhum momento
* Variáveis Locais: existem durante execução de um bloco
* Variáveis Globais: existem durante a execução de todo programa
* Variáveis da heap:
    - criadas e destruídas em qualquer parte do programa, por comando especiais
    - anônimas, acessadas via ponteiros
    - referências pendentes
* Comando: construção que atualiza variáveis; um ponto de entrada, um ponto de saída; múltiplos pontos de entrada, múltiplos pontos de saída. goto, throw, continue, break.
* Atribuição:
    - AcessoVariável := Expressão
    - AV := AV’ := AV’’ := Expressão
    - AV, AV’ := Expressão, Expressão’
* Composição colateral: (Comando , Comando’) os dois comandos são executados, em uma ordem qualquer; não determinismo
* Composição Paralela: (Comando || Comando’) os dois comandos são executados, de maneira concorrente
concorrência e não determinismo; Composição seqüencial e colateral são casos especiais

## Aula 19 - Imperativa 2

* Abstração: Processo pelo qual ignora-se detalhes irrelevantes, concentran-se em idéias gerais ao invés de caracaterizações delas. O que? versus Como?
    - função que contém uma expressão
    - procedimento que contém um comando (que retorno ou não um valor)
    - uma abstração pode ser invocada
    - Uma abstração pode ter um identificador ou não (anônima)
* Outros tipos de abstrações
    - Acesso a variável (Id, Id.Id, Id[Id])
    - Declarações
* Parâmetros e Argumentos:
    - Argumento (São valores da linguagem)
        - Valor fornecido para a execução do objeto da abstração
    - Parâmetro formal (denota uma variável local à abstração)
        - Identificador utilizado na construção da abstração para denotar um argumento
    - Parâmetro real (É avaliado resultando no argumento)
        - Expressão cuja avaliação resulta em um argumento; fornecida na invocação da abstração
* Mecanismos de cópia
    - Valor (LF2, LI2, Java, Pascal, C, ML)
        - O argumento é copiado para a variável local antes da execução do objeto da abstração
        - A variável local pode ser não só inspecionada, mas também atualizada
    - Resultado
        - O argumento tem que ser uma referência para uma variável
        - O valor inicial da variável local não é determinado
        - No final da execução do objeto da abstração, o valor da variável local é copiado para a variável cuja referência foi recebida como argumento
    - Valor-resultado
        - O argumento tem que ser uma referência para uma variável
        - O valor da variável associada ao argumento é copiado para a variável local antes da execução do objeto da abstração
        - No final da execução do objeto da abstração, o valor da variável local é copiado para a variável cuja referência foi recebida como argumento