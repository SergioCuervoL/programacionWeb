<?php	
    /*include_once $_SERVER['DOCUMENT_ROOT'] . 'securimage/securimage.php';
    $securimage = new Securimage();
    if ($securimage->check($_POST['captcha_code']) == false) {
    echo "The security code entered was incorrect.<br /><br />";
    echo "Please go <a href='javascript:history.go(-1)'>back</a> and try again.";
    exit;
    }*/
    include ("conexion.php");
    $nombre = $_POST['nombre']; 
    $apellido = $_POST['apellido'];
    $email = $_POST['email'];
    $tipoTarjeta = $_POST['tipoTarjeta'];
    $nombreTitular = $_POST['nombreTitular'];
    $numeroTarjeta = $_POST['numeroTarjeta'];   
    $cvv2 = $_POST['cvv2'];
    $mesExp = $_POST['mesExp'];
    $anoExp = $_POST['anoExp'];
    $direccion = $_POST['direccion'];
    $ciudad = $_POST['ciudad'];
    $departamento = $_POST['departamento'];
    $codigoPostal = $_POST['codigoPostal'];
    $pais = $_POST['pais'];
    $telefono = $_POST['telefono'];
    
    if($_POST['terminos']){
        if($_POST['botonEliminar']){
           delete($conexion, $numeroTarjeta); 
        }
        if($_POST['botonEnviar']){
            read($conexion,$numeroTarjeta,$nombre,$apellido,$email,$tipoTarjeta,
            $nombreTitular,$cvv2,$mesExp,$anoExp,$direccion,
            $ciudad,$departamento,$codigoPostal,$pais,$telefono);
        }
    }    
    
    function insertar($conexion, $nombre,$apellido,$email,$tipoTarjeta,
            $nombreTitular,$numeroTarjeta,$cvv2,$mesExp,$anoExp,$direccion,
            $ciudad,$departamento,$codigoPostal,$pais,$telefono){
        $insert = "INSERT INTO `formulario`(`nombre`, `apellido`, `email`, "
                . "`tipoTarjeta`, `nombreTitular`, `numeroTarjeta`, `cvv2`, `"
                . "mesExp`, `anoExp`, `direccion`, `ciudad`, `departamento`, `"
                . "codigoPostal`, `pais`, `telefono`) VALUES ('$nombre','$apellido',"
                . "'$email','$tipoTarjeta','$nombreTitular','$numeroTarjeta','$cvv2',"
                . "'$mesExp','$anoExp','$direccion','$ciudad','$departamento',"
                . "'$codigoPostal','$pais','$telefono')";

        $resultado = mysqli_query($conexion, $insert);

        if(!$resultado){
           echo 'Error al registrar <br>';
        } else{
           echo 'Se registro<br>';
        }
    }
    
    function read($conexion,$numeroTarjeta,$nombre,$apellido,$email,$tipoTarjeta,
            $nombreTitular,$cvv2,$mesExp,$anoExp,$direccion,
            $ciudad,$departamento,$codigoPostal,$pais,$telefono){
        $read = "SELECT `nombre`, `apellido`, `email`, `tipoTarjeta`, `nombreTitular`, `numeroTarjeta`, `cvv2`, `mesExp`, `anoExp`, `direccion`, `ciudad`, `departamento`, `codigoPostal`, `pais`, `telefono` FROM `formulario` WHERE `numeroTarjeta` = '$numeroTarjeta' ";
        $resultado=mysqli_query($conexion, $read);  
        if (mysqli_num_rows($resultado)>0){
            echo "El usuario ya existe <br>";
            update($conexion,$nombre,$apellido,$email,$tipoTarjeta,
            $nombreTitular,$numeroTarjeta,$cvv2,$mesExp,$anoExp,$direccion,
            $ciudad,$departamento,$codigoPostal,$pais,$telefono);
        }else{
            insertar($conexion,$nombre,$apellido,$email,$tipoTarjeta,
            $nombreTitular,$numeroTarjeta,$cvv2,$mesExp,$anoExp,$direccion,
            $ciudad,$departamento,$codigoPostal,$pais,$telefono);
        } 
    }
    
    function update($conexion,$nombre,$apellido,$email,$tipoTarjeta,
            $nombreTitular,$numeroTarjeta,$cvv2,$mesExp,$anoExp,$direccion,
            $ciudad,$departamento,$codigoPostal,$pais,$telefono){
        $update = "UPDATE `formulario` SET `nombre`='$nombre',`apellido`='$apellido',`email`='$email',`tipoTarjeta`='$tipoTarjeta',`nombreTitular`='$nombreTitular',`cvv2`='$cvv2',`mesExp`='$mesExp',`anoExp`='$anoExp',`direccion`='$direccion',`ciudad`='$ciudad',`departamento`='$departamento',`codigoPostal`='$codigoPostal',`pais`='$pais',`telefono`='$telefono' WHERE `numeroTarjeta` = '$numeroTarjeta'";
        $resultado = mysqli_query($conexion, $update);
        if(!$resultado){
            echo "No existe el usuario <br>";
        }else{
            echo "Se actualizo <br>";
        }
    }
        
    function delete($conexion, $numeroTarjeta){
        $delete="DELETE FROM `formulario` WHERE `numeroTarjeta`= '$numeroTarjeta'";
        $resultado = mysqli_query($conexion, $delete);
        if(!$resultado){
            echo "No se pudo eliminar <br>";
        }else{
            echo "Se elimino<br>";
        }
    }
    
    mysqli_close($conexion);
    
    //header('Location: index.html');