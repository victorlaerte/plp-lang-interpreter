# Prova 2012

## Question 1

```
// (1)
occ(i, []) = false
occ(i, (j,x):xs) = if i==j then true
                    else occ(i, xs)

//(2)
f([], ys) = ys
f((i,x):cs, ys) = if occ(i, ys) then f(xs, ys)
                    else [(i, x)] ++ f(xs, ys)
```

## Question 2

```
f(xs, xs) = xs

// base:
f([],[]) = [] ??
f([],[]) =
= (1)
[]

// passo indutivo:
//H.I f(xs, xs) = xs
f((i,x):xs, (i,x):xs) = (i,x): xs

f((i,x):xs, (i,x):xs)
= (2)

if occ(i, (i,x):xs) then f(xs, (i,x):xs)
else (i,x): f(xs, (i,x):xs)

= (def occ)
f(xs, (i,x):xs)
.
.
.
// Questão não resolvida
```

## Question 3

(F)
(V)
(V)
(F)

Estudar:
Princípio da completude dos tipos
Princípio da qualificação
Princípio da correspondência

## Question 4 (LF1, LI1 ou LI2)

