<div align="center">
<table>
    <theader>
        <tr>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/epis.png?raw=true" alt="EPIS" style="width:50%; height:auto"/></td>
            <th>
                <span style="font-weight:bold;">UNIVERSIDAD NACIONAL DE SAN AGUSTIN</span><br />
                <span style="font-weight:bold;">FACULTAD DE INGENIERÍA DE PRODUCCIÓN Y SERVICIOS</span><br />
                <span style="font-weight:bold;">DEPARTAMENTO ACADÉMICO DE INGENIERÍA DE SISTEMAS E INFORMÁTICA</span><br />
                <span style="font-weight:bold;">ESCUELA PROFESIONAL DE INGENIERÍA DE SISTEMAS</span>
            </th>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/abet.png?raw=true" alt="ABET" style="width:50%; height:auto"/></td>
        </tr>
    </theader>
    <tbody>
        <tr><td colspan="3"><span style="font-weight:bold;">Formato</span>:Informe de Práctica de Laboratorio</td></tr>
        <tr><td><span style="font-weight:bold;">Aprobación</span>:  2022/03/01</td><td><span style="font-weight:bold;">Código</span>: GUIA-PRLD-001</td><td><span style="font-weight:bold;">Página</span>: 1</td></tr>
    </tbody>
</table>
</div>

<div align="center">
<span style="font-weight:bold;">INFORME DE LABORATORIO</span><br />
</div>


<table>
<theader>
<tr><th colspan="6">INFORMACIÓN BÁSICA</th></tr>
</theader>
<tbody>
<tr><td>ASIGNATURA:</td><td colspan="5">Estructura de Datos y Algoritmos</td></tr>
<tr><td>TÍTULO DE LA PRÁCTICA:</td><td colspan="5">Revisión de elementos de programación (Parte I)</td></tr>
<tr>
<td>NÚMERO DE PRÁCTICA:</td><td>02</td><td>AÑO LECTIVO:</td><td>2022 A</td><td>NRO. SEMESTRE:</td><td>III</td>
</tr>
<tr>
<td>FECHA DE PRESENTACIÓN:</td><td>15-May-2022</td><td>HORA DE PRESENTACIÓN:</td><td colspan="3">23:55</td>
</tr>
<tr><td colspan="4">Integrantes:
        <ul>
            <li><h5>Escobar Atamari, Diego Gabriel</h5></li>
            <li><h5>Flores Sucupaca, Ervin Eleazar </h5></li>
            <li><h5>Machicao Quispe, Gabriel Steven</h5></li>
            <li><h5>Moroccoire Pacompia Anthony Marcos</h5></li>
            <li><h5>Quispe Bejar, Garlet Analy</h5></li>
        </ul>
    </td>
    <td colspan="2">Nota:</td>
</<tr>
<tr><td colspan="6">DOCENTES:
<ul>
<li>Richart Smith Escobedo Quispe - rescobedoq@unsa.edu.pe</li>
</ul>
</td>
</<tr>
</tdbody>
</table>

<table>
    <theader>
        <tr><th colspan="6">SOLUCIÓN Y RESULTADOS</th></tr>
    </theader>
    <tbody>
        <tr><td colspan="6">I. SOLUCIÓN DE EJERCICIOS/PROBLEMAS
          <ul>
          <li>I. Invertir una matriz de enteros (2pts)
             <ul>
	     <li><img src="img/invertido.jpg?raw=true" alt="image_1" style witdh="150"; height="150"/></li>
 	     <li>Se toma el primer y ultimo elemento para intercambiarlo,en un bucle guardando el primer valor en un auxiliar luego reemplazar el valor del primer valor con el ultimo y reemplazar el ultimo valor con el auxiliar.</li>.
	    </ul>
           </li>
          </ul>
          <ul>
          <li>II. Rotación a la izquierda (3pts)
             <ul>
	     <li><img src="z_imag/Comments.jpg?raw=true" alt="image_1" style witdh="250"; height="250"/></li>
	      </ul>
           </li>
          </ul>
          <ul>
          <li>III. Triangulo Recursivo (4pts)
             <ul>
	            <li><img src="img/Triangulo_recursivo.png?raw=true" alt="image_1" style witdh="250"; height="250"/></li>
                <li>Al condicionar que base sea mayor a cero logramos la recursión se detenga cuando cumpla las vueltas requeridas para imprimir el triangulo, asi mismo en cada recursión aumentamos un asterisco a la cadena para que asi vaya incrementando la cadena en cada recursión.
              </ul>
           </li>
          </ul>
          <ul>
          <li>IV. Lista (11pts)
              <ul>
	            <li>
                  Metodo add(T elemento) para añadir un elemento al final de la lista<br>
                  <img src="img/cap1.png" alt="add(T elemento)"/><br>
                  La parte fundamental del codigo esta en el recorrido a través del ciclo while, cuya condicion es verficar si el puntero del nodo es null si no lo es entonces el puntero se actualiza con la referencia del puntero.getNextNodo(), una vez concluido el ciclo el puntero que era null ahora contiene al nuevo nodo y finalmente se incremeta en uno el contador.
                </li>
	     <li>
          Metodo add(int indice, N elemento<br>
          <img src="img/cap2.png" alt="add(indice, elemento)"/><br>
          Ignorando los casos particulares estas lineas son las principales del metodo, se utiliza un for para iterar en la lista hasta llegar a una posición antes del elemento seleccionado, una vez allí se rescata el puntero del nodo actual y su puntero se actuliza al nodo creado y el puntero del nuevo nodo ahora almacena el puntero rescatado.
          </li>
	     <li>
          Metodo get(int indice)<br>
          <img src="img/cap3.png" alt="get(indice)"/><br>
          Ignorando los casos particulares, el ciclo for ayuda iterar en la Lista hasta llegar al indice requerido y finamente retorna el elemento, el cual es almacenado en el puntero
          </li>
	     <li>
         Metodo remove(int indice)<br>
         <img src="img/cap4.png" alt="remove(indice)"/><br>
         La parte fundamental del metodo es el mostrado en la imágen, el ciclo for nos posiciona un indice antes del elemento a borrar, despues, el puntero del nodo a borrar el rescatado y es asignado como null, la referencia rescatada se asigna al puntero del nodo en la que se posicionó el ciclo for y el contador disminuye en 1
         </li>
	     <li><img src="z_imag/Methods.jpg?raw=true" alt="image_1" style witdh="250"; height="250"/></li>
              </ul>
           </li>
          </ul>
          </td></tr>   
        <tr><td colspan="6">II. SOLUCIÓN DEL CUESTIONARIO
         <ul>
         <li>¿Que diferencia hay entre un List y un ArrayList en java?
              <ul>
                   <li>La lista es un interfaz donde no se pueden crear instancias sino una coleccion de elementos que se almacenan en una secuencia y se identifican y se accede a ellos mediante el indice; y el ARRAYLIST es una clase la cual extiende de la clase AbstractList e implementa la interfaz List.</li>
 	       </ul>
          </li>
        <li>¿Que beneficios y oportunidades ofrecen las clases genéricas en Java?
            <ul>
                 <li>Nos permite reutilizar un codigo para diferentes tipos de parametros y no tener que hacer algun tipo de casting para que coincida, nos muestra si existe un error a la hora de compilar y no al momento que el programa funciona.</li>  
          </ul>
        </li>
         </ul>
        </td></tr>
        <tr><td colspan="6">III. CONCLUSIONES
           <li>Las clases genéricas nos permite la reutilizacion del código e implementar nuestros propios algoritmos genéricos para diferentes casos.</li>
</td></tr>
 </tbody>
</table>

<table>
    <theader>
        <tr><th>RETROALIMENTACIÓN</th></tr>
    </theader>
    <tbody>
         <tr><td colspan="6">                       </td></tr>
    </tbody>
</table>

<table>
    <theader>
        <tr><th>REFERENCIAS Y BIBLIOGRAFIA</th></tr>
    </theader>
    <tbody>
        <tr><td>
            <ul>
                <li>https://git-scm.com/book/es/v2</li>
                <li>https://guides.github.com/</li>
                <li>https://www.w3schools.com/java/default.asp</li>
                <li>https://docs.oracle.com/javase/7/docs/api/java/util/List.html</li>
            </ul></td>
        </tr>
    </tbody>
</table>

