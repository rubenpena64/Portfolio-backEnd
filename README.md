# Portfolio-Backend

Repositorio para el backend de #yoprogramo 3.0

La rama main contiene todo el desarrollo.

## Desarrollo
Se dasarrolló con el patrón MVC y la estructura de packages propuesto por la docente en la master class del modulo 7:

- com.porfolio.backend.controller.
- com.porfolio.backend.model.
- com.porfolio.backend.repository.
- com.porfolio.backend.interfaces.
- com.porfolio.backend.service.


## Error de Cors en el navegador y servicio no dispopnible con Postman

Aunque a veces ha funcionado perfectamente durante 10 horas otras veces el navegador da error de Cors en Koyeb: localmente funciona perfectamente.

Probé configuraciones de control de acceso de todas las maneras segun la documentación de Spring, en el foro de Argentina programa y otros, con el mismo resultado:

- La configuracion global
- La configuracion en cada @RestController
- La configuración en cada función del @RestController
- En todas las maneras perimitiendo cualquier origen y método

Cada vez que aparece este error al entrar en el dirección donde está alojada la api, en vez de decir "Ruben Peña - Porfolio personal" que es el mapping para "/" da diferentes mensajes de error como:

- "502 - Service unavailable"
- "upstream connect error or disconnect/reset before headers. reset reason: connection termination"
- "upstream connect error or disconnect/reset before headers. reset reason: connection failure, transport failure reason: delayed connect error: 111"

Una vez que contesta correctamente, en un par de minutos empieza a funcionar en el front end.

Lamentablemente no pude encontrar una solución. El debug es muy dificil ya que el problema surge solo en el hosting y no en mi PC, y a veces funciona correctamente el día entero; tampoco se si el problema es el backend con el front end o con la BD. Seguiré probando distintas cosas para encontrar una solución.
Parece ser que lo que se "cuelga" es la conexion con la BD. Lamentablemente no tengo logs en el servicio gratuito de Clever CloudLa 

## Intentos de solucionar el problema 

- Quitar una conexión de servicio (la del componente acerca) y dejar cinco en total: 4 componentes y el login
- Agregar la annotation @Transactional empeoró mucho todo
- Hacer que los mapeos de los listados iniciales respondan con un HttpResponse
- El log de Koyeb dice com.zaxxer.hikari.pool.PoolBase : HikariPool-1 - Failed to validate connection com.mysql.cj.jdbc.ConnectionImpl@1182d578 (No operations allowed after connection closed.). Possibly consider using a shorter maxLifetime value, por lo que se setea spring.datasource.hikari.max-lifetime: 120000 según lo sugerido en una pagina

Finalmente dejo de hacer cambios, ya que creo que cada vez funciona peor y no lo voy a solucionar sin la ayuda de alguien con mas conocimientos y experiencia. Creo que el problema está en la base de datos. El último clean and build costo muchisimo porque al compilar me decía que el servidor no aceptaba mas de 5 conexiones simultaneas. Tuve que cambiar el password para que se cerraran las conexiones
	

