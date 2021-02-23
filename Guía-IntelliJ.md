Guía para trabajo con IntelliJ:
1. Crear proyecto Java en IntelliJ
2. Instalar plugins *PlantUML integration* y *PlantUML Parser*
3. Crear carpeta `puml para guardar los ficheros PlanuUML (.puml)
4. Crear carpeta `doc` para guardar los ficheros Javadoc
5. Crear fichero `README.md` a nivel raíz que sirva de introducción al proyecto en GitHub
6. Crear repositorio local:
 `VCS -> Import into Version Control -> Create Git Repository
(equivalente a `git init` desde línea de comandos)
7. Crear fichero `.gitignore`. Una manera rápida de crearlo es:
    - Seleccionar la carpeta `.idea`, que no queremos que sea gestionada en Git
    - Click `Botón derecho -> Git -> Add to .gitignore -> Add to .gitignore`
    - Ante la pregunta de si queremos añadir el propio `.gitignore` recién creado a Git, le indicamos que sí, que lo añada.
    - Editar el fichero `.gitignore` además de `/.idea/`, para que de momento quede así:
    
    ```
    # Los ficheros propios de IntelliJ y los compilados
    /.idea/
    *.iml
    out/
    
    # Para los que tienen MacOS
    .DS_Store
    
    # El directorio para guardar los ficheros Javadoc
    /doc/
    ```

8. Hacer el "Commit inicial"
9. A programar

    (...)

99. Publicar en GitHub por primera vez:
`VCS -> Import into Version Control -> Share Project on GitHub`
