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