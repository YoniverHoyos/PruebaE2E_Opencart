Ejercicio 1: Prueba Funcional automatizada (Prueba E2E) de un flujo de compra en la pagina http://opencart.abstracta.us/

Este repositorio contiene el codigo desarrollado en Selenium + Cucumber + Serenity BDD que cumple con los siguientes requerimientos:

Realiza una prueba funcional automatizada (Prueba E2E) de un flujo de compra la página http://opencart.abstracta.us/ que incluya:
1. Agregar dos productos al carrito
2. Visualizar el carrito
3. Completar el “Checkout” como invitado: “Guest Checkout”
4. Finalizar la compra hasta la confirmación: “Your order has been placed!”

Para la eleaboracion del proyecto se utiliza IntelliJ Idea Community Edition 2025.2.3 y el JDK Oracle OpenJDK 21.0.8.

Pasos para clonar el repositorio:
En este caso se utiliza IntelliJ Idea Community Edition 2025.2.3 para clonar el repositorio desde Github.

1. El primer paso es ir a la opcion de Git->clone
2. Luego copiar el link del repositorio en la opcion de url.
3. Se puede modificar la carpeta donde se clona el repositorio o simplemente dejar la opcion que entrega por defecto.
4. click en en el boton de Clone.

Pasos para ejecutar el repositorio:
1. Ejecutar el archivo Runner ubicado en src/test/java/com/opencart/co/Runner.java
2. El archivo ejecuta el codigo abriendo el navegador web y realizando las verificaciones requeridas por el ejercicio.

Luego de la ejecución es posible ejecutar el comando maven (mvn serenity:aggregate) en la ventana de Execute Maven Goal, ubicada a la derecha del projecto en Intellij. 

<img width="1025" height="393" alt="image" src="https://github.com/user-attachments/assets/d50c5758-69aa-4248-87b2-950f28de1819" />

Dicho comando permite obtener el reporte de SerenityBDD sobre la ejecucion realizada anteriormente. El cual se puede abrir dando click en la opcion de Full Report.

<img width="1294" height="393" alt="image" src="https://github.com/user-attachments/assets/b19b460b-0a7b-499a-8e80-86bcdbdc8f88" />

Obteniendo el reporte generado por SerenityBDD:

<img width="1365" height="721" alt="image" src="https://github.com/user-attachments/assets/c44c0773-75d0-4b19-839d-468820af838d" />

