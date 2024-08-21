Jhon Mario Diaz

Definición de los Verbos HTTP

GET: El verbo GET se emplea para recuperar información del servidor. En este servicio, el método correspondiente es getAll(), el cual devuelve todos los registros almacenados.
POST: El verbo POST se utiliza para enviar datos al servidor, generalmente con el propósito de crear un nuevo recurso. El método insert() permite añadir un nuevo registro a la base de datos.
PUT: El verbo PUT se emplea para actualizar un recurso existente en el servidor. El método update() es responsable de modificar un registro existente, basándose en el ID proporcionado.
DELETE: El verbo DELETE se usa para eliminar un recurso del servidor. En este servicio, el método deleteItem() permite borrar un registro específico usando su ID.
PATCH: El verbo PATCH se utiliza para aplicar cambios parciales a un recurso existente. El método updateData() permite actualizar partes específicas de un registro, como su nombre o categoría.
HEAD: El verbo HEAD se usa para obtener los encabezados de una respuesta HTTP sin incluir el cuerpo de la misma. El método handleHeadRequest() implementa este verbo en el servicio.
Anotaciones Utilizadas

@RestController: Esta anotación designa la clase como un controlador de Spring MVC, capaz de gestionar solicitudes HTTP y devolver respuestas en formato JSON o XML.
@RequestMapping("item"): Define el prefijo de la URL para todas las rutas manejadas por los métodos de la clase. En este caso, todas las rutas comenzarán con /item.
@Autowired: Esta anotación permite la inyección automática de dependencias gestionadas por Spring, como el servicio ItemService en el controlador ItemController.
Clase GroceryItem
La clase GroceryItem es el modelo de datos utilizado para representar los registros almacenados en la base de datos. Contiene los siguientes atributos:

id: Identificador único del registro.
name: Nombre del producto.
quantity: Cantidad disponible.
category: Categoría a la que pertenece el producto.
Método toString()
El método toString() en la clase GroceryItem está sobrescrito para proporcionar una representación textual del objeto, incluyendo todos sus atributos. Esto facilita la visualización de los datos al imprimir el objeto.

Anotación @Override
La anotación @Override se utiliza para indicar que un método está sobrescribiendo un método de la superclase. En este caso, se usa para sobrescribir el método toString() de la clase base Object.
