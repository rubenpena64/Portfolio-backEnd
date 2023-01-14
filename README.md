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

Lamentablemente no pude encontrar una solución. El debug es muy dificil ya que el problema surge solo en el hosting y no en mi PC, y a veces funciona correctamente el día entero; tampoco se si el problema es el backend con el front end o con la BD. Seguiré probando distintas cosas para encontrar una solución

