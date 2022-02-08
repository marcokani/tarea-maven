-   Construyendo la aplicacion en el entorno definido

        mvn package -P test
        o
        mvn package -P prod

-   Ejecutando jar generado
        java -jar target/tareafinal-1.0-SNAPSHOT-jar-with-dependencies.jar

-   web

curl --location --request GET 
http://localhost:4567/tarea
