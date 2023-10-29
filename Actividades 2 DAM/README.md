**NumeroPrimos_Hilos**

Realiza un programa en Java que pida 3 números por pantalla y determinará cuál de ellos es primo y cual no. El programa lanzará un hilo de ejecución por cada número, debido a la complejidad de tiempo que puede llevar el calcular si es primo o no, para que pueda ejecutarse en paralelo.



**Calculadora_HilosYSockets**

Se pide hacer una aplicación cliente y otra servidora, que se conecten mediante Sockets. La idea será hacer una calculadora sencilla.

La aplicación cliente mostrará el siguiente menú.

Sumar
Restar
Multiplicar
Dividir.
Salir
Una vez seleccionada la opción, la aplicación pedirá los dos números para realizar la operación y enviará al servidor tanto los números como la operación seleccionado.

Cada nueva conexion abrira un hilo distinto.




**PSP-Actividad1-HilosYSockets**

Se pide hacer dos programas cliente-servidor con sockets e hilos. La aplicación servidora programa consistirá en crear una aplicación que gestione una serie de películas de una biblioteca virtual, la aplicación cliente consumirá dicha aplicación servidora.

Las películas tendrán un ID, un título, un director y un precio. Se encontrarán alojadas en el servidor. Dicho servidor cuando arranque tendrá 5 películas preestablecidas con todos los datos rellenos. Las películas se guardarán en memoria en cualquier tipo de estructura de datos (como puede ser un lista). El servidor deberá estar preparado para que interactúen con él varios clientes (se deberá abrir un hilo por cada cliente).

La aplicación cliente mostrará un menú como el que sigue:

Consultar película por ID
Consultar película por título
Salir de la aplicación
La aplicación se ejecutará hasta que el cliente decida pulsar la opción de “salir de la aplicación”.

El cliente deberá de recoger todos los datos del usuario necesarios y mandarlos al servidor en un solo envío.
Se pide añadir otra opción que sea “Consultar películas por director”. En este caso hay que tener en cuenta que puede haber varias películas por director, por lo que el servidor podrá devolver una lista de películas. Se recomienda pensar en grupo el formato de envío de información.

Se pide añadir otra opción que sea “Añadir película”. En este caso el cliente pedirá todos los datos de la película y los enviará al servidor para que este lo guarde. La lista en el servidor deberá estar preparada para que solo pueda añadir una película cada hilo a la vez, si algún hilo está agregando una película, los demás hilos deberán de esperar a que el hilo acabe.
