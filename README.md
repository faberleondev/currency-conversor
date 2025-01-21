# Currency Conversor App

Currency Conversor App es una aplicación sencilla para convertir dólares estadounidenses (USD) a tres monedas:
- Peso Argentino (ARS)
- Peso Colombiano (COP)
- Real Brasileño (BRL)

La aplicación utiliza la **API de Exchange Rate** para obtener las tasas de cambio en tiempo real.

---

## Características
- Conversión de USD a ARS, COP y BRL.
- Tasas de cambio actualizadas en tiempo real gracias a la **API de Exchange Rate**.
- Implementada con tecnologías modernas y herramientas robustas.

---

## Tecnologías utilizadas
- **Java 17**: Lenguaje principal para la aplicación.
- **Gson**: Biblioteca para el manejo de datos JSON.
- **HTTP Client**: Para realizar solicitudes HTTP a la API de Exchange Rate.
- **API de Exchange Rate**: Proveedor de datos para las tasas de cambio.

---

## Requisitos de instalación
1. **Java 11** o superior instalado en tu sistema.  
   Puedes verificar tu versión de Java con el comando:
   ```bash
   java -version
Si necesitas instalarlo, descarga Java desde su sitio oficial:
[Descargar Java](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)

Biblioteca Gson: Descarga el archivo .jar desde el siguiente enlace:
[Descargar Gson](https://repo1.maven.org/maven2/com/google/code/gson/gson/2.11.0/gson-2.8.9.jar)

---
## Instrucciones de instalación
1. Descarga y asegúrate de tener instalado Java 11 o superior.
2. Descarga el archivo `gson-2.1.0.jar` y colócalo en el mismo directorio que tu proyecto.
3. Configura tu entorno de desarrollo para incluir el archivo `gson-2.11.0.jar` en el classpath.

---
## Cómo conseguir la API de Exchange Rate
1. Visita el sitio web oficial de la API de Exchange Rate:
[Exchange Rate API](https://exchangerate-api.com/)
2. Regístrate para obtener una clave de API gratuita o premium, según tus necesidades.
3. Guarda tu clave de API en un lugar seguro; la necesitarás para configurar la aplicación.
4. Reemplaza el contenido de la constante `API_KEY` en la clase `ConsultaModena` con tu clave personal.

````bash
private final String API_KEY = "YOUR-API-KEY"; //cambiar "YOUR-API-KEY" por una propia
````

---
## Uso de la aplicación
1. Asegúrate de haber configurado correctamente el entorno de desarrollo.
2. Proporciona la clave de API de Exchange Rate en el archivo de configuración o directamente en el código (según el diseño del proyecto).
3. Ejecuta la aplicación y sigue las instrucciones en pantalla para convertir las monedas.

## 💡 Funcionalidades
- Conversión de USD a ARS
- Conversión de ARS a USD
- Conversión de USD a BRL
- Conversión de BRL a USD
- Conversión de USD a COP
- Conversión de COP a USD

---
## Autor
Proyecto desarrollado por [faberleondev](https://github.com/faberleondev).

---
## Contribuciones

¡Las contribuciones son bienvenidas! Si tienes sugerencias o mejoras, no dudes en abrir un `pull request` o crear un `issue`.

---
## Licencia
Este proyecto está bajo la licencia MIT. Puedes usarlo, modificarlo y distribuirlo libremente bajo los términos de esta licencia.