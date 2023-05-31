#language:es
@tag

Característica: Flujo de trabajo

  @Escenario1
  Esquema del escenario: Dar de alta registro de emppleado 
  	Dado que el usuario ingresa al sitio web
		Y el usuario ingresa sus credenciales de manera correcta usuario y clave <usuario>, <clave>
    Cuando quiero agregar un nuevo empleado al registro 
    Y  ingreso los datos <nombre>, <apellido> y <idEmpleado>
    Y presiono el boton guardar
    Entonces Se verifica que se agrego el empleado de forma correcta

    Ejemplos: 
      |	usuario	|	clave											| nombre  | apellido | idEmpleado  | 
      |	Admin		|	hUKwJTbofgPU9eVlw/CnDQ== 	|	Juan 		| Mouhape  | 1111		 		 |
      |	Admin		|	hUKwJTbofgPU9eVlw/CnDQ== 	|	Juan	 	| Rodriguez| 2222    		 |
      
      
  @Escenario2
  Esquema del escenario: Dar de alta registro de emppleado 
  	Dado que el usuario ingresa al sitio web
		Y el usuario ingresa sus credenciales de manera correcta usuario y clave <usuario>, <clave>
    Cuando quiero buscar un empleado con sus datos <nombreApellido> y <idEmpleado>
    Entonces Se verifica que se encontro el empleado buscado <idEmpleado>

    Ejemplos: 
      |	usuario	|	clave											| nombreApellido 		 | idEmpleado  | 
      |	Admin		|	hUKwJTbofgPU9eVlw/CnDQ== 	|	Juan Cruz Mouhape  | 0000000		 |
      |	Admin		|	hUKwJTbofgPU9eVlw/CnDQ== 	|	Kevin Mathews			 | 0058		     |