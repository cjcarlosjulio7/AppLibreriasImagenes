# AppLibreriasImagenes 📱🖼️

Aplicación Android desarrollada en Kotlin que demuestra el uso de tres librerías populares para la carga, transformación y edición visual de imágenes: **Picasso**, **Glide** y **GPUImage**.

## 🚀 Funcionalidades

- 📷 **Picasso**:  
  Carga de imágenes desde URL, redimensionamiento, recorte (`centerCrop`) y rotación.

- 🎯 **Glide**:  
  Carga optimizada de imágenes, transformaciones como `circleCrop` y `roundedCorners`, animaciones y manejo eficiente de memoria.

- 🎨 **GPUImage**:  
  Aplicación de filtros visuales con aceleración por GPU:
  - Sepia
  - Blanco y negro
  - Sketch (boceto)

## 🛠️ Tecnologías y librerías usadas

- **Kotlin**
- **Android SDK**
- [Picasso](https://square.github.io/picasso/) `v2.8`
- [Glide](https://github.com/bumptech/glide) `v4.16.0`
- [GPUImage](https://github.com/cats-oss/android-gpuimage) `v2.1.0`

## 📷 Capturas de pantalla

> Puedes agregar aquí capturas de cada actividad usando Markdown:
> 
> ```
> ![Picasso](screenshots/picasso_demo.png)
> ![Glide](screenshots/glide_demo.png)
> ![GPUImage](screenshots/gpuimage_demo.png)
> ```

## 📁 Estructura del proyecto

```
📂 AppLibreriasImagenes
 ┣ 📂 app
 ┃ ┣ 📁 src
 ┃ ┃ ┣ 📂 main
 ┃ ┃ ┃ ┣ 📂 java
 ┃ ┃ ┃ ┃ ┣ MainActivity.kt
 ┃ ┃ ┃ ┃ ┣ PicassoActivity.kt
 ┃ ┃ ┃ ┃ ┣ GlideActivity.kt
 ┃ ┃ ┃ ┃ ┗ GpuImageActivity.kt
 ┃ ┃ ┃ ┣ 📂 res
 ┃ ┃ ┃ ┃ ┣ layout/
 ┃ ┃ ┃ ┃ ┗ drawable/
```

## ▶️ Cómo ejecutar

1. Clona el repositorio
2. Ábrelo en **Android Studio**
3. Sincroniza Gradle y ejecuta la app en un emulador o dispositivo físico

## 📄 Licencia

Este proyecto se ha desarrollado con fines educativos.
