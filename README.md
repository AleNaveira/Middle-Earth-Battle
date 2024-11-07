#  La Batalla por la Tierra Media

This README is avaliable in [Español](#version-español) 

## 1. Description

- This application is a game simulating a battle between heroes and beasts based on characters from the ‘Lord of the Rings’ universe. Users can select heroes and beasts from a predefined list and have them fight in turns until one of the armies is defeated. The graphical user interface (GUI) allows interaction with characters and visualization of battle outcomes.

## 2. Key Features

- **Character Selection:** Users can choose from various hero types such as humans, hobbits, and elves (Aragorn, Legolas, Frodo…) and beasts like goblins and orcs (Azog, Bolg, Lurtz...) to form their armies..
- **Combat System:** The game follows a turn-based system where, in each turn, a character from one army attacks a single adversary in the opposing army. Each combat considers attack strength, armor resistance, and life points. Each combatant launches an attack (based on a roll of two dice with values ranging from 0 to 90/100, according to the character's strength attributes, choosing the highest roll) against an opponent. Damage is only inflicted if the attacker’s offensive power exceeds the defender's armor level. In that case, the damage dealt is the difference between the attack power and the opponent's armor level. Each turn, all confrontations take place, and life points are reduced accordingly.
- ** Flexible Army Sizes:** Users can choose the number of warriors for each army from all available characters. It is not necessary to have an equal number of combatants in each army. If one army has more members than the other, the extra characters will not participate in that turn of battle. When a character's life points reach zero or below, they die, are removed from their position, and subsequent teammates move up to fill the gap. This allows inactive characters to enter the battle in the following turns.
- **Graphical Interface (GUI):** Implemented with Swing, allowing users to visually interact to select, add, remove characters from the selected list, or execute the battle.
- **Game Reset:** A text window displays the chronological progress and results of the battle.

## 3. Prerequisites

a) **Java JDK**

The project functions correctly with the following Java versions:

- **Java 11** (Amazon Corretto 11 or equivalent versions)
- **Java 17** (optional)
- **Java 22** (development version)

b) **Recommended IDE **

- *IntelliJ IDEA* or any other IDE that supports Java projects.


## 4. Installation and Setup

To run this project locally, follow these steps:

a. **Clone the Repository:**

   Clone this repository to your local machine using Git:

 `git clone https://github.com/AleNaveira/batalla_tierra_media .git`

b. **Import the Project:**

It is recommended to use IntelliJ IDEA for an optimized development environment, although any IDE supporting Java will work.

- **If using IntelliJ IDEA:**
    - Open *IntelliJ*, select *File > Open*, and navigate to the cloned project folder.
    - Ensure the compatible Java version is selected (see prerequisites section).

- **If using another IDE**:
  - Import the project as a simple Java project.

## 5. Running the Application

**a. Running from an IDE (Recommended):**

- Open the *BatallaEnMarcha.java file* in your IDE. Run the class as a standard Java application. In IntelliJ, this can be done by right-clicking the file and selecting* Run 'BatallaEnMarcha.main()'*. The application will open a graphical interface where you can select heroes and beasts for battle.

**b. Running from the Command Line (Optional):**:

- Compile the project from the terminal or command line:

`javac -encoding UTF-8 -d . BatallaEnMarcha.java Batalla.java personajes/*.java`

- Run the application:

`java BatallaEnMarcha.java`

> **Note::** Running from the console (java BatallaEnMarcha) may cause an error related to initializing graphic components (contentPane). This issue is under review, and running the project from an IDE is recommended until it is solved.

**c. Using the Graphical Interface:**

- Select heroes and beasts for each side using buttons to add or remove characters from each army before starting the battle.
- Initiate the battle between armies.
- View the results of each turn and the final outcomes.

---------------------------------------
--------------------------------------
## Version Español

#  La Batalla por la Tierra Media



## 1. Descripción

- Esta aplicación es un juego que simula una batalla entre héroes y bestias basados en personajes del universo de ‘El Señor de los Anillos’. Los usuarios pueden seleccionar héroes y bestias de una lista predefinida y hacerlos luchar en turnos hasta que uno de los ejércitos sea derrotado. La interfaz gráfica de usuario (GUI) permite la interacción con los personajes y  la visualización de los resultados de la batalla.

## 2. Características principales

- **Selección de personajes: **Los usuarios pueden elegir entre varios héroes de diversa tipología como humanos, hobbits, elfos (Aragorn, Legolas, Frodo… ) y bestias como trasgos y orcos (Azog, Bolg, Lurtz...) para formar sus ejércitos.
- **Sistema de combate:** Sigue un sistema basado en turnos en el que en cada turno un personaje de un ejército atacará a un único adversario del ejército oponente. En cada combate se tiene en cuenta la fuerza del ataque, la resistencia de la armadura y los puntos de vida. Cada combatiente lanza un ataque (el ataque se basa en la tirada de dos dados con valores de entre 0 o  90/100 según las características de fuerza del personaje y se elige el de mayor valor)  contra su adversario. Sólo se producirá un daño al adversario si la potencia ofensiva del atacante es superior al nivel de armadura del defensor. Si es así, el daño producido será la diferencia entre la potencia de ataque y el nivel de armadura del oponente. En cada turno se producirán todos los enfrentamientos y se disminuirá la vida de cada personaje en los casos que corresponda.
- ** Selección de personajes:** Los usuarios pueden elegir el número de guerreros que deseen para cada ejército entre todas la opciones de personajes disponibles. No es necesario que en cada batalla exista el mismo número de combatientes para cada ejército. Si alguno de los ejércitos dispone de más efectivos que el contrario, los personajes sobrantes no participarán en ese turno de batalla. En el momento que alguno de los otros personajes llegue a un nivel de vida igual o inferior a cero, se producirá su muerte, por lo que se eliminará de su posición y se desplazarán todos sus compañeros en posiciones posteriores para cubrir la baja. De esa manera, los personajes inactivos podrán participar en la batalla en los siguientes turnos. 
- **Interfaz gráfica (GUI):** Se implementa con Swing. Así, los usuarios pueden interactuar de forma visual  para seleccionar, agregar, eliminar personajes de la lista seleccionada o ejecutar batalla.
- **Reinicio del juego:** Una ventana de texto muestra el progreso cronólogico y los resultados de la batalla.

## 3. Requisitos previos

a) **Java JDK **

El proyecto funciona correctamente con las siguientes versiones de Java:

- **Java 11** (Amazon Corretto 11 o versiones equivalentes)
- **Java 17** (opcional)
- **Java 22** (versión usada durante el desarrollo)

b) **IDE recomendado **

- *IntelliJ IDEA* o cualquier otro IDE que soporte proyectos Java.


## 4. Instalación y configuración

Para ejecutar este proyecto localmente, sigue los siguientes pasos: 

a. **Clonar el repositorio:**

   Clona este repositorio en tu máquina local usando Git:

 `git clone https://github.com/AleNaveira/batalla_tierra_media .git`

b. **Importar el proyecto en un IDE:**

Se recomienda utilizar IntelliJ IDEA para un entorno de desarrollo optimizado, aunque cualquier otro IDE que soporte Java funcionará.

- **Si usas IntelliJ IDEA:**
    - Abre *IntelliJ*, selecciona *File > Open* y navega a la carpeta del proyecto clonado.
    - Asegúrate de que esté seleccionada la versión de Java compatible (ver sección de requisitos previos).

- **Si usas otro IDE**:
  - Importa el proyecto como un proyecto de Java simple.

## 5. Ejecución de la aplicación:

**a. Ejecución desde un IDE (Recomendado):**

- Abre el archivo *BatallaEnMarcha.java* desde tu IDE. Ejecuta la clase como una aplicación de Java estándar. En IntelliJ, esto se hace haciendo clic derecho sobre el archivo y seleccionando *Run 'BatallaEnMarcha.main()'*. La aplicación abrirá una interfaz gráfica donde podrás seleccionar héroes y bestias para la batalla.

**b. Ejecución desde la línea de comandos (opcional)**:

- Compila el proyecto desde el terminal o la línea de comandos:

`javac -encoding UTF-8 -d . BatallaEnMarcha.java Batalla.java personajes/*.java`

- Ejecuta la aplicación:

`java BatallaEnMarcha.java`

> **Nota:** La ejecución desde consola (java BatallaEnMarcha) puede causar un error relacionado con la inicialización de componentes gráficos (contentPane). Este problema está en revisión, y se recomienda ejecutar el proyecto desde un IDE hasta que se resuelva.

**c. Uso de la interfaz gráfica:**

- Seleccionar héroes y bestias para cada bando usando los botontes para agregar o eliminar personajes de cada ejército antes de comenzar la batalla.
- Iniciar la batalla entre los ejércitos.
- Visualizar los resultados de cada turno y los resultados finales.




