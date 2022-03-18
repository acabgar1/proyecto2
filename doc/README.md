# Proyecto del Segundo Cuatrimestre Fundamentos de Programación (Curso  \<XX\>/\<YY\>)
Autor/a: \<nombre del autor\>   uvus:\<uvus del autor\>

Aquí debes añadir la descripción del dataset y un enunciado del dominio del proyecto.


## Estructura de las carpetas del proyecto

* **/src**: Contiene los diferentes archivos que forman parte del proyecto. Debe estar estructurado en los siguentes paquetes
  * **fp.\<patients\>**: Paquete que contiene los tipos del proyecto.
  * **fp.\<patients\>.test**: Paquete que contiene las clases de test del proyecto.
  * **fp.common**: Paquete que contiene los tipos auxiliares del proyecto
  * **fp.utiles**:  Paquete que contiene las clases de utilidad. 
* **/data**: Contiene el dataset  del proyecto
    * **\<patients_covid.csv\>**: dataset de pacientes covid que entraron en 2020

    
## Estructura del *dataset*

Aquí debes describir la estructura del dataset explicando qué representan los datos que contiene y la descripción de cada una de las columnas. Incluye también la URL del dataset original.

El dataset está compuesto por \<13\> columnas, con la siguiente descripción:

Integer id,String first_name,String pais_nacimiento,String residencia,String sex,Integer age,LocalDate arrival_date,LocalDate recovery_date,Integer status,Boolean need_ICU,Double maximum_temperature,Integer daily_medications,Integer daily_medical_examinations 

* **\<columna 1>**: de tipo \<Integer\>,representa la id de los pacientes
* **\<columna 2>**: de tipo \<String\>, representa el nombre de los pacientes
* **\<columna 3>**: de tipo \<String\>, representa el pais de anciemientos de los pacientes
* **\<columna 4>**: de tipo \<String\>, representa el lugar de residencia de los pacientes
* **\<columna 5>**: de tipo \<String\>, representa el genero de los pacientes
* **\<columna 6>**: de tipo \<Integer\>, representa la edad de los pacientes
* **\<columna 7>**: de tipo \<LocalDate\>, representa la fecha de entrada al hospital
* **\<columna 8>**: de tipo \<LocalDate\>, representa la fecha de salida del hospital
* **\<columna 9>**: de tipo \<Integer\>, representa el estado del paciente
* **\<columna 10>**: de tipo \<Boolean\>, representa si necesitaron cuidados intensivos
* **\<columna 11>**: de tipo \<Double\>, representa la temperatura maxima alcanzada por el paciente
* **\<columna 12>**: de tipo \<Integer\>, representa la cantidad de medicamentos diarios dados
* **\<columna 13>**: de tipo \<tipo\>, representa la cantidad de  pruebas diarias hechas al paciente cada dia

## Tipos implementados

patients : archivo principal 

patients_test : test de patients

**Propiedades**:

- _periodo_, de tipo \<long\>, consultable. devuelve el tiempo pasado en el hospital en dias 
- getRango_edad, de tipo \<rango_edad\>, consultable. devuelve el rango de edad del paciente 
- 
**Constructores**: 

al ser un record no tiene constructores

**Restricciones**:
 
- R1: que la edad el paciente sea mayor que 0
- R2: que el año de entrada del paciente sea 2020

**Criterio de igualdad**: compara todas las columnas y solo si todas son iguales lo da por igual

**Criterio de ordenación**: los pacientes se ordenan por su id el cual es un Integer

#### Tipos auxiliares

Checkers.java : clase usada para facilitar el uso de las restricciones

rango_edad.java : implementa un enumerate con los rangos de edad posibles de los pacientes
