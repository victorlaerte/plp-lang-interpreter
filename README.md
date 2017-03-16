# plp-lang-interpreter-lesson

Professor: [Augusto Sampaio](http://www.cin.ufpe.br/~acas/) (Center for Informatics (UFPE)

Class: Programming Languages and Paradigms

## The language will be presented incrementally:

- [Expressions](#expressions)
- [Functional](#functional)
- [Imperative](#imperative)
- [Object Oriented](#object-oriented)

![](images/img001.gif)

### Expressions

#### Expression Language 1

- Includes only constants (values) and operations on values
- Values and operations on integers, booleans, and string are supported
- A program is an expression

#### Expression Language 2

- Extends the Expression Language 1 with identifiers (variables) that have a value (constant)
- During compilation, the need arises for a context: mapping between identifiers and types
- During the interpretation, the need arises for a context: mapping between identifiers and values
- In evaluating an expression, the occurrence of an identifier is replaced by the value associated with the identifier
- A program is an expression

### Functional

#### Functional Language 1

- Extends Expression Language 2 with parameterized and recursive functions
- The body of a function is an expression and the application of the function to an argument returns a value
- The context includes two components: mapping of identifiers into values; mapping identifiers (role names) in role definitions
- A program is an expression

#### Functional Language 2

- Extends Functional Language 1 with high order functions
- A function becomes a value
- The context includes a single component: mapping of identifiers into values. So, the result of evaluating an expression can be a function, a function can be an argument of another function, ...
- A program is an expression

#### Functional Language 3

- Extends Functional Language 2 with list and list comprehension
- A List is a value, therefore it can be passed as a parameter to a function
- A program is an expression

### Imperative

#### Impreative Language 1

- Extends Expression Language 1 with identifiers (variables) and assignment, input / output, and flow control commands
- The context includes three components: A (dynamic) mapping of identifiers into values; a list of input values; a list of output values
- A program is a command

#### Impreative Language 2

- Extends Imperative Language 1 with parameterized and recursive procedures
- The body of a procedure is a command and the call of an idem procedure
- The context is also extended with: A mapping of identifiers (procedures names) in definitions of procedures
- Procedures do not have value status
- A program is a command

### Object Oriented

#### Object Oriented Language 1

- Estende Linguagem Imperativa 2 com classes e objetos
- Procedimentos passam a ocorrer exclusivamente como métodos das classes
- O contexto também é estendido com: um mapeamento de identificadores (nomes de classes) em definições de classes
- Um programa é um comando

#### Object Oriented Language 2 
- Estende a Linguagem OO1 com construtores e herançça
- Construtores são métodos especiais, com o mesmo nome da classe e sem valor de retorno, chamados automaticamente a cada criação de um objeto (através do comando new)
- Herança simples
- Não permite overloading, redefinição de métodos, super e nem modificadores de acesso
