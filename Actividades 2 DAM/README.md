**1-NumeroPrimos_Hilos**

Realiza un programa en Java que pida 3 números por pantalla y determinará cuál de ellos es primo y cual no. El programa lanzará un hilo de ejecución por cada número, debido a la complejidad de tiempo que puede llevar el calcular si es primo o no, para que pueda ejecutarse en paralelo.



**2-Calculadora_HilosYSockets**

Se pide hacer una aplicación cliente y otra servidora, que se conecten mediante Sockets. La idea será hacer una calculadora sencilla.

La aplicación cliente mostrará el siguiente menú.

Sumar
Restar
Multiplicar
Dividir.
Salir
Una vez seleccionada la opción, la aplicación pedirá los dos números para realizar la operación y enviará al servidor tanto los números como la operación seleccionado.

Cada nueva conexion abrira un hilo distinto.


**3-PSP-Actividad1-HilosYSockets**

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

**4-PSP-Actividad1-Hilos Y Sockets**

Version V2.1 del ejercicio anterior, con una cola de peliculas en la cual los hilos harán uso del wait y del notify antes de poder entrar en la cola de peliculas.

**5-PSP-Actividad2-Spring boot REST**

Se pide hacer un servicio REST, dicho servicio gestionará una serie de Libros.

Los libros tendrán un ID, un título, una editorial y una nota. Los libros se encontrarán alojados en el servidor REST. Dicho servidor cuando arranque tendrá 5 libros preestablecidos con todos los datos rellenos. Los libros se guardarán en memoria en cualquier tipo de estructura de datos (como puede ser una lista).

El servicio REST proporcionará un servicio CRUD completo, y podrá ser consumido mediante un cliente como Postman y todo el intercambio de mensajes se hará a través de JSON.

Además, se pide a través de Postman realizar las siguientes tareas y apreciar los resultados:

Dar de alta un libro Dar de baja un libro por ID Modificar un libro por ID Obtener un libro por ID Listar todos los libros Es importante entender el funcionamiento del cliente Postman, como puede ser entender las URLs de acceso a los diferentes puntos de acceso de nuestro servicio REST, los verbos y métodos HTTP que tenemos emplear para cada una de las peticiones, así como en que parte del mensaje HTTP viaja la información.

Se pide que no pueda haber dos libros con ID o título repetido

Se pide crear una aplicación java que sea capaz de trabajar con el servidor REST. La aplicación mostrara un menú que sea capaz de realizar todas las operaciones del servidor, como puede ser:

Dar de alta un libro Dar de baja un libro por ID Modificar un libro por ID Obtener un libro por ID Listar todos los libros Salir Para cada opción, se tendrá que pedir los datos necesarios al usuario y/o mostrar los resultados pertinentes. La aplicación se ejecutará hasta que se pulse la opción de “salir”.
