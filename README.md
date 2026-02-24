# Sistema cooperativa
Este proyecto implementa un sistema de notificación de microlotes de café especial usando Java y el patrón de diseño Observer. La idea es modelar una cooperativa que registra nuevos lotes y notifica automáticamente a los baristas que se encuentran suscritos.

La arquitectura está organizada en paquetes para separar responsabilidades. El paquete modelo contiene la entidad LoteCafe con toda la información del microlote. El paquete observer define las interfaces Observador y Sujeto que estructuran el patrón. El paquete servicio implementa la lógica principal mediante las clases Barista y Cooperativa. Finalmente, el paquete app contiene la clase principal que ejecuta el flujo del sistema.

Cuando la cooperativa registra un nuevo lote, se ejecuta el método de notificación y cada barista suscrito recibe los datos del café disponible. El diseño permite agregar nuevos tipos de observadores sin modificar la lógica central, manteniendo bajo acoplamiento y alta extensibilidad.

## Diagrama UML
A continuación el diagrama UML que demuestra como esta estructurado. 
![UML COOPERATIVA](https://github.com/user-attachments/assets/4c964655-0274-48bb-9114-fb9121923a15)


## Problemas de subida
Hubo problemas con la subida, y yo no tenia acceso a mi github desde la universidad, ademas que no habian equipos para poderlo realizar y tenia otras obligaciones (clases) a las cuales ir. Por eso no se subio a la hora que se cambio (10:30). Inicialmente se habia colocado a las 11:59 del dia de hoy.
