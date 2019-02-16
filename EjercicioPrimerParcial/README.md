# Ejercicio Primer Parcial

#### Este proyecto contiene una clase principal que muestra con comentarios lo que realiza cada parte del código.

##### Temas tratos:

###### Imprimir en consola.

Estructura | Descripción
------------ | -------------
```System.out.println(String x)``` | Imprime el valor de la variable x y da un salto de linea
```System.out.print(String x)``` | Imprime el valor de la variable x sin dar un salto de linea
```System.out.printf("Format dato, dato")``` | Imprime el valor de la variable dato con el formato especificado
```System.out.format("Format dato", dato)``` | Imprime el valor de la variable dato con el formato especificado

###### Objeto Scanner.

El objeto Scanner permite hacer la conexión a través de la consola con el usuario, de forma que el programa pueda **recibir** datos y procesarlos.

    Scanner name = new Scanner(**System.in)
    
```name``` es el nombre que se le asigna al objeto -> en este caso podría ser ***input***
```System.in``` es la funcion que le dice al Scanner que el ingreso de datos va a ser a traves de la consola.
```new``` Indica que se va a crear un nuevo objeto Scanner.

Para recibir un dato a través de la consola se usa las funciones next.
Ej:

***Crea un nuevo objeto Scanner***

    Scanner input = new Scanner(System.in);
    input.nexInt();
    
***input.nextInt();*** Indica que el dato que se espera es un número entero.

Función | Descripción
------------ | -------------
```input.nextInt()``` | Pide un Integer
```input.nexDouble()``` | Pide un Double
```input.nextLine()``` | Pide una cadena de texto en una linea

***Estas son algunas de las funciones que hay, Scanner tiene una gran variedad de funciones, para mayor información puede ver la [documentación](https://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html)*** 

##### Condicionales

Los condicionales son formas de crear "preguntas" en el programa, con estos puedo hacer comparaciones y ***establecer condiciones***
Ej:
  
    int condicion==0;
    if(condicion==0){
      System.out.println("La condicion si se cumple");
    }
    else{
      System.out.println("La condicion no se cumple :( ");
    }

> Para el caso anterior, la condición se cumple dado que si es igual a 0 y el programa imprime: ***La condicion si se cumple***, si la variable condición fuese igual a 1, el programa imprimiría: ***La condición no se cumple***.

Para usar los operadores de comparación < > <= >= siempre se requiere de dos datos por los cuales comparar, el operador no debe estar solo.

Ej: 

    if(a>4&&a<=6){
      ...
    }
> En este caso si `a` se encuentra entre 4.000000000....01 y 6 sin tener en cuenta el 4 la condición se cumple

***NO:***

    if(a>4&&<=6){
      ...
    }




