# PSP-Actividad1-HilosYSockets

AE-1. Hilos y Sockets - Programación de Servicios y Procesos 

**Realizada por: Alberto Arroyo Santofimia**

Se pide hacer dos programas cliente-servidor con sockets e hilos. La aplicación servidora programa consistirá en crear una aplicación que gestione una serie de películas de una biblioteca virtual, la aplicación cliente consumirá dicha aplicación servidora.

Las películas tendrán un ID, un título, un director y un precio. Se encontrarán alojadas en el servidor. Dicho servidor cuando arranque tendrá 5 películas preestablecidas con todos los datos rellenos. Las películas se guardarán en memoria en cualquier tipo de estructura de datos (como puede ser un lista). El servidor deberá estar preparado para que interactúen con él varios clientes (se deberá abrir un hilo por cada cliente).

La aplicación cliente mostrará un menú como el que sigue:

Consultar película por ID Consultar película por título Salir de la aplicación La aplicación se ejecutará hasta que el cliente decida pulsar la opción de “salir de la aplicación”.

El cliente deberá de recoger todos los datos del usuario necesarios y mandarlos al servidor en un solo envío. Se pide añadir otra opción que sea “Consultar películas por director”. En este caso hay que tener en cuenta que puede haber varias películas por director, por lo que el servidor podrá devolver una lista de películas. Se recomienda pensar en grupo el formato de envío de información.

Se pide añadir otra opción que sea “Añadir película”. En este caso el cliente pedirá todos los datos de la película y los enviará al servidor para que este lo guarde. La lista en el servidor deberá estar preparada para que solo pueda añadir una película cada hilo a la vez, si algún hilo está agregando una película, los demás hilos deberán de esperar a que el hilo acabe.


**Requerimiento 1**

**SockerServidor**

![Imagen](imgReadme/i005.png)

**SocketCliente**

Elegimos la **opción 1**

Pedimos el ID 1

![Imagen](imgReadme/i006.png)

En caso de que el ID no sea numérico dará un error y nos dirá que lo introduzcamos de nuevo

![Imagen](imgReadme/i007.png)

El SocketServidor nos va informando de lo que se va pidiendo

![Imagen](imgReadme/i008.png)

Elegimos la **opción 2**

Buscamos la pelicula Terminator

![Imagen](imgReadme/i009.png)

En caso de no encontrar la película nos devolverá null

![Imagen](imgReadme/i010.png)

Se abre un hilo distinto por cada cliente

![Imagen](imgReadme/i026.png)

Elegimos la opción para salir del programa y terminar la conexión 

![Imagen](imgReadme/i011.png)

SocketServidor

![Imagen](imgReadme/i012.png)

**Requerimiento 2**
Buscar películas por director, nos deberá devolver si hay varias películas por director

![Imagen](imgReadme/i013.png)

SocketServidor

![Imagen](imgReadme/i014.png)

# <a name="_toc149131319"></a>Requerimiento 3
Añado la opción de añadir películas, si un hilo ha empezado a añadir una película, ningún otro hilo puede añadir ninguna película hasta que el primero haya terminado. 

Cliente 1

![Imagen](imgReadme/i015.png)

SocketServidor

![Imagen](imgReadme/i016.png)

Cliente 2

![Imagen](imgReadme/i017.png)

Vemos que el Cliente2 se ha quedado a la espera de que el Cliente1 termine

Terminamos de añadir la película del Cliente1

![Imagen](imgReadme/i018.png)



Una vez introducidos los datos del Cliente1, el objeto lista de las películas ya deja al otro hilo meter su pelicula.

![Imagen](imgReadme/i019.png)

Compruebo que se han metido las dos películas en la lista de películas 

![Imagen](imgReadme/i020.png)

![Imagen](imgReadme/i021.png)

Si se intenta introducir una película con un ID ya existente la película no se añadirá a la lista y lo notificará

![Imagen](imgReadme/i022.png)

Buscamos si esta la película Spiderman en el ID 1

![Imagen](imgReadme/i023.png)

Si se introduce una cadena en el ID o el precio dará error y lo pedirá de nuevo

![Imagen](imgReadme/i024.png)

Se ha metido correctamente

![Imagen](imgReadme/i025.png)
