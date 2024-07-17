# JPA TUTORIAL CON SPRING BOOT
Este proyecto implementa un tutorial básico de JPA utilizando Spring Boot. Incluye configuraciones detalladas, servicios RESTful para operaciones CRUD y una inicialización de datos de prueba. A continuación, se detallan las clases y configuraciones clave para comprender y ejecutar este proyecto.

# Clase Producto:

Esta clase representa la entidad **Producto** en la base de datos. Define los atributos y métodos necesarios para manipular los datos de un producto. Los atributos incluyen id, nombre, descripcion y precio. Utiliza anotaciones de JPA (@Entity, @Id, @GeneratedValue) para mapear la clase a una tabla en la base de datos.

![producto](https://raw.githubusercontent.com/mamf1209/JPA-Tutorial/main/images/producto.jpg)


# Clase ProductoRepository:

Esta interfaz extiende JpaRepository y proporciona métodos CRUD para la entidad Producto. Incluye métodos personalizados para encontrar productos por nombre (findByNombre) y por rango de precio (findByPrecioBetween). Utiliza anotaciones de Spring Data JPA (@Repository, @Query, @Param).

![Repository](https://raw.githubusercontent.com/mamf1209/JPA-Tutorial/main/images/prepository.jpg)


# Clase ProductoController:

Esta clase define los endpoints de la API REST para la entidad **Producto**. Proporciona endpoints para realizar operaciones CRUD y búsquedas específicas sobre la entidad Producto. Utiliza anotaciones de Spring MVC (@RestController, @RequestMapping, @GetMapping, @PostMapping, @RequestParam, @PathVariable) para mapear las solicitudes HTTP a los métodos del controlador.


![controller](https://raw.githubusercontent.com/mamf1209/JPA-Tutorial/main/images/pcontroller.jpg)


# CLASE ProductoService:

Esta clase proporciona métodos para la lógica de negocio relacionada con la entidad Producto. Implementa métodos para obtener (findAll, findById), guardar (save), y buscar productos por nombre (findByNombre) y por rango de precio (findByPrecio). Utiliza la anotación @Service para ser detectada como un servicio de Spring.

![service](https://raw.githubusercontent.com/mamf1209/JPA-Tutorial/main/images/pservice.jpg)


# CLASE DataInitializer:

Esta clase se utiliza para inicializar datos de prueba en la base de datos al iniciar la aplicación. Implementa CommandLineRunner y sobrescribe el método run para guardar productos de prueba en la base de datos al inicio de la aplicación. Utiliza las anotaciones @Component y @Autowired.

![DataInit](https://raw.githubusercontent.com/mamf1209/JPA-Tutorial/main/images/data.jpg)


# application.properties:

Este archivo contiene la configuración de la base de datos como las credenciales (usser y password) y otras propiedades de la aplicación.

![appproperties](https://raw.githubusercontent.com/mamf1209/JPA-Tutorial/main/images/approperties.jpg)


# pom.xml:

Se asegura que las dependencias estén correctamente configuradas, en este caso "Spring web", "Spring Data JPA" y "PostgreSQL Driver".

![pomxml](https://raw.githubusercontent.com/mamf1209/JPA-Tutorial/main/images/pom.jpg)


# EJECUCIÓN DE SPRING BOOT:


A continuación, se verificará la ejecución de Spring Boot para asegurar que la aplicación se inicie correctamente y los endpoints API estén disponibles para gestionar productos en la base de datos PostgreSQL.

![spring](https://raw.githubusercontent.com/mamf1209/JPA-Tutorial/main/images/spring.jpg)


# PRUEBAS DE API'S EN POSTMAN

## 1. Obtener Todos los Productos:
### **Descripción:** Este endpoint recupera todos los productos disponibles en la base de datos.
![getall](https://raw.githubusercontent.com/mamf1209/JPA-Tutorial/main/images/getAll.jpg)

## 2. Obtener un Producto por ID:
### **Descripción:** Este endpoint recupera un producto específico por su ID.
![getid](https://raw.githubusercontent.com/mamf1209/JPA-Tutorial/main/images/getId.jpg)

## 3. Buscar Productos por Nombre:
### **Descripción:** Este endpoint recupera productos cuyo nombre coincide con el parámetro proporcionado.
![getname](https://raw.githubusercontent.com/mamf1209/JPA-Tutorial/main/images/getname.jpg)

## 4. Buscar Productos por Rango de Precio:
### **Descripción:** Este endpoint recupera productos cuyo precio está entre los valores de preciomin y preciomax.
![getrange](https://raw.githubusercontent.com/mamf1209/JPA-Tutorial/main/images/getminmax.jpg)




