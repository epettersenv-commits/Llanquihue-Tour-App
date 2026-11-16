![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)
# 🧠 LlanquihueTourApp – Catálogo de tours desde archivo

## 👤 Autor del proyecto
- **Nombre completo:** Elizabeth Pettersen
- **Sección:** 004A
- **Carrera:** Analista Programador Computacional
- **Sede:** Campus online

---

## 📘 Descripción general del sistema
Actividad formativa de la Semana 4 de *Desarrollo Orientado a Objetos I* (Duoc UC). Es un programa en Java para la agencia de turismo **Llanquihue Tour** que lee los tours desde un archivo `.txt`, crea objetos `Tour`, los guarda en un `ArrayList`, los recorre y los filtra (por tipo "Gastronómico" y por cupos disponibles)

---

## 🧱 Estructura general del proyecto

```plaintext
📁 LlanquihueTourApp/
├── resources/
│   └── tours.txt            # Datos de los tours (campos separados por ;)
└── src/
    ├── model/
    │   └── Tour.java        # Clase de dominio (nombre, tipo, precio, cupos)
    ├── data/
    │   └── GestorDatos.java # Lee el archivo y crea el ArrayList de tours
    └── ui/
        └── Main.java        # Clase principal: recorrido y filtros
```
---

## ⚙️ Instrucciones para clonar y ejecutar el proyecto

1. Clona el repositorio desde GitHub:

```bash
git clone https://github.com/epettersenv-commits/Llanquihue-Tour
```

2. Abre el proyecto en IntelliJ IDEA.

3. Ejecuta `ui/Main.java` (clic derecho → **Run 'Main.main()'**). El directorio de trabajo debe ser la raíz del proyecto, para que encuentre `resources/tours.txt`.

4. Revisa la salida por consola: se muestra un listado con todos los tours, también muestra un listado filtrado de los tours gastronómicos y de los tours que tienen cupos disponibles. Si el archivo está vacío muestra un mensaje mencionando que, "No hay tours registrados en el catálogo"

---

**Repositorio GitHub:** https://github.com/epettersenv-commits/Llanquihue-Tour
**Fecha de entrega:** 16/11/2026

---

© Duoc UC | Escuela de Informática y Telecomunicaciones
