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

## Error de Cors en el navegador y de servicio no dispopnible en Postman

Aunque algunos días no falla, algunas veces Firefox da error de Cors en Koyeb: localmente funciona perfectamente por lo que es dificil de hacer un debug.

Probé de todas las maneras segun la documentación de Spring, en el foro de Argentina programa y otros, con el mismo resultado:

- La configuracion global
- La configuracion en cada @RestController
- La configuración en cada función del @RestController
- En todas las maneras perimitiendo cualquier origen y método

Cada vez que aparece este error al entrar en el dirección donde está alojada la api, en vez de decir "Ruben Peña - Porfolio personal" que es el mapping para "/" da diferentes mensajes de error como "servicio no dispònible" o "upstream connect error or disconnect/reset before headers. reset reason: connection termination"
Una vez que contesta correctamente, a los pocos segundos empieza a funcionar en el front end.

Lamentablemente no pude encontrar una solución definitiva.
