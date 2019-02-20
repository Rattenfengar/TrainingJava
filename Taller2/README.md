# Taller 2
Este segundo taller tiene como objetivo hacer un segundo repaso y complementar el anterior.

### Ejercicio propuesto:

Un cliente particular lo contrata a ud como programador para desarrollar un software por consola, que lo pueda ayudar con su trabajo, para ello necesita:

1. Resolver operaciones básicas: + - / *
2. Operaciones más complejas: raíz cuadra, potencias de cualquier tipo, cosenos y senos de un ángulo en grados hexagesimales (0-360°).
3. Hallar las raíces de una función cuadrática con la fórmula genera.
4. Sacar el promedio arimético de 6 notas y clasificarlo en el siguiente rango:
  * Unordered sub-list. 
  * [0, 2.5) Muy bajo
  * [2.5, 3) Insuficiente
  * [3, 3.5) Regular
  * [3.5, 4) Aceptable
  * [4, 4.5) Sobresaliente
  * [4.5, 5] Excelente.
5. Dar un juego para que el usuario no se aburra (Piedra papel o tijeras).

Con los anteriores requerimientos ud debe crear la solución y satisfacer todas los requerimientos.

# Uso de los condicionales if

## if solo

En el siguiente código podrá observar un ejemplo de un if solo:

```Java

if(input.hasNextInt()){
  //code
}
else{
 //Error
}
if(condicion){
}


```
> En este tipo de if, existe una sola condición y si esta no se cumple entonces da un error. Este tipo de condicionales, son útiles cuando se espera que solo pase una cosa, y no se tienen en cuenta otros casos. Para este, sería un único caso en donde se valida que lo que se ingresó sea un número de tipo entero. Como hay dos if normales, estos actuan de forma independiente.

## if en cascada

El siguiente ejemplo muestra un if en cascada.

```Java
int a = 4;
if(a>1){ //Condicional1
  if(a>2){ //Condicional2
  System.out.println("a es mayor que 1 y mayor que 2")
  }else{
   System.out.println("a es mayor que 1, pero no es mayor que 2");
  }
}else{
 System.out.println("a no es mayor que 1 ni mayor que 2");
}
```
> Este tipo de condicionales implica que para poder validar el condicional 2, el condicional 1 debió haberse cumplido. Este se suele usar por ejemplo para validar usuarios y contraseñas, condicional 1 seria: Si encuentra el usuario entonces valide condicional 2 que sería verificar que la contraseña pertenezca a ese usuario. Basicamente si condicional 1 no es verdadero, el programa no pregunta por condicional 2.

## else if

```Java
if(nota>=0&&nota<3){
 //code
}
else if(nota>=3&&nota<4){
 //code
}
else {
//code
}

```

> En el anterior segmento se utilizan el `else if` para preguntar si el valor se encuentra en alguno de los rangos, se inicia la estructura con un `if` normal, seguido de varios `else if`, esto con el fin de que la condición se valide con cada uno de los casos posibles, para que el código reaccione o haga algo frente al valor de nota. La estructura se cierra con un `else` para realizar una acción en caso de que ninguna de las condiciones anteriores aplique.
