<?php
    $conexion = mysqli_connect("localhost", "root", "", "formularioTallerPunto4");
    if(!$conexion){
        echo 'No se puedo hacer la conexion <br>';
    }else{
        echo 'Conectado a la BD <br>';
    }

