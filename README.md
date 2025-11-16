# 💰 Conversor de Monedas - Challenge ONE | Java

<p align="left">
   <img src="https://img.shields.io/badge/STATUS-TERMINADO-green">
   <img src="https://img.shields.io/badge/JAVA-17%2B-orange">
   <img src="https://img.shields.io/badge/RELEASE-V1.0-blue">
</p>

## 📝 Descripción

Este proyecto es parte del **Challenge ONE - Back End** de Oracle Next Education (ONE) y Alura Latam. 
Consiste en un sistema de conversión de monedas que interactúa directamente con una API en tiempo real para obtener tasas de cambio actualizadas. El programa se ejecuta a través de la consola de comandos y permite al usuario realizar conversiones entre diferentes divisas de manera interactiva.

## ⚙️ Funcionalidades

- [x] Menú interactivo en consola.
- [x] Conversión de divisas en tiempo real usando una API externa.
- [x] Soporte para las siguientes monedas:
  - 🇺🇸 Dólar (USD)
  - 🇦🇷 Peso Argentino (ARS)
  - 🇧🇷 Real Brasileño (BRL)
  - 🇨🇴 Peso Colombiano (COP)
- [x] Validación de entradas de usuario (manejo de errores).
- [x] Historial de conversiones (Opcional/En desarrollo).

## 🛠️ Tecnologías Utilizadas

* **Java 21** (Compatible con Java 17+): Lenguaje principal.
* **IntelliJ IDEA**: Entorno de desarrollo.
* **Biblioteca Gson (Google)**: Para el parseo de los datos JSON provenientes de la API.
* **Java HttpClient**: Para realizar las peticiones HTTP a la API.
* **ExchangeRate-API**: Servicio externo para obtener las tasas de cambio.

## 📸 Capturas de Pantalla

<img src="Captura de pantalla 2025-11-15 211655.png" alt="Menú Principal" width="600" />

*Menú de opciones del conversor*

## 🚀 Cómo ejecutar el proyecto

1.  **Clonar el repositorio**:
    ```bash
    git clone [https://github.com/TU-USUARIO/conversor-monedas.git](https://github.com/TU-USUARIO/conversor-monedas.git)
    ```
2.  **Abrir en IntelliJ IDEA**:
    * Abre el proyecto desde la carpeta clonada.
    * Asegúrate de que el SDK de Java esté configurado (versión 17 o superior).
3.  **Agregar la dependencia Gson**:
    * Descarga el JAR de [Maven Central](https://mvnrepository.com/artifact/com.google.code.gson/gson) o agrégalo desde `Project Structure > Libraries`.
4.  **Configurar API Key**:
    * Regístrate en [ExchangeRate-API](https://www.exchangerate-api.com/).
    * Reemplaza la variable `TU-API-KEY` en la clase `ConsultaMoneda.java` con tu propia clave.
5.  **Ejecutar**:
    * Busca la clase

## ✒️ Autor

**Adrian Jafet Luján Briceño**

---
Hecho con ❤️ para el programa ONE.
