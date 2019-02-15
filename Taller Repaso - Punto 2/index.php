<?php session_start(); ?>
<html>
    <head>
        <meta charset="utf-8">
        <title>Formulario</title>
        <link rel="stylesheet" href="CSS/estilos.css">
    </head>
    <body>
        <div class="contacto">
            <form action="formulario.php" id="formulario" name="formulario" method="POST">
                <table>
                    <tr>
                        <td><label>Informacion Personal</label></td>
                    </tr>
                    <tr>
                        <td><label for="nombre">Ingrese su nombre: </label></td>
                        <td><input type="text" placeholder="Escribe tu Nombre" name="nombre" id="nombre"></td>
                    </tr>
                    <tr>
                        <td><label for="nombre">Ingrese su Apellido: </label></td>
                        <td><input type="text" placeholder="Escribe tu Apellido" name="apellido" id="apellido"></td>
                    </tr>
                    <tr>
                        <td><label for="email">Ingrese su E-mail: </label></td>
                        <td><input type="email" placeholder="Escriba su E-mail" name="email" id="email"></td>
                    </tr>
                    <tr>
                        <td><label>Informacion Tarjeta Credito</label></td>
                    </tr>
                    <tr>
                        <td>
                            <label>Tipo de Tarjeta Credito</label>
                        </td>
                        <td>
                            <select name="tipoTarjeta">
                                <option selected>...</option>
                                <option value="visa">Visa</option>
                                <option value="master">Master</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td><label>Nombre del Titular</label></td>
                        <td><input type="text" placeholder="Escriba el Nombre del Titutal" name="nombreTitular" id="nombreTitular"></td>
                    </tr>
                    <tr>
                        <td><label>Numero de Tarjeta</label></td>
                        <td><input type="text" placeholder="Escriba el Numero de la Tarjeta" name="numeroTarjeta" id="numeroTarjeta"></td>
                    </tr>
                    <tr>
                        <td><label>CVV2</label></td>
                        <td><input type="text" placeholder="Escriba el CVV2" name="cvv2" id="cvv2"></td>
                    </tr>
                    <tr>
                            <td>
                                <label>Fecha de Exp</label>
                            </td>
                            <td>
                                <select name="mesExp">
                                    <option selected>...</option>
                                    <option value="01">01</option>
                                    <option value="02">02</option>
                                    <option value="03">03</option>
                                    <option value="04">04</option>
                                    <option value="05">05</option>
                                    <option value="06">06</option>
                                    <option value="07">07</option>
                                    <option value="08">08</option>
                                    <option value="09">09</option>
                                    <option value="10">10</option>
                                    <option value="11">11</option>
                                    <option value="12">12</option>
                                </select>
                                <select name="anoExp">
                                    <option selected>...</option>
                                    <option value="2000">2000</option>
                                    <option value="2001">2001</option>
                                    <option value="2002">2002</option>
                                    <option value="2003">2003</option>
                                    <option value="2004">2004</option>
                                    <option value="2005">2005</option>
                                    <option value="2006">2006</option>
                                    <option value="2007">2007</option>
                                    <option value="2008">2008</option>
                                    <option value="2009">2009</option>
                                    <option value="2010">2010</option>
                                    <option value="2011">2011</option>
                                    <option value="2012">2012</option>
                                    <option value="2013">2013</option>
                                    <option value="2014">2014</option>
                                    <option value="2015">2015</option>
                                    <option value="2016">2016</option>
                                    <option value="2017">2017</option>
                                    <option value="2018">2018</option>
                                    <option value="2019">2019</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td><label>Direccion de Envio</label></td>
                    </tr>
                    <tr>
                        <td><label>Direccion de la Casa</label></td>
                        <td><input type="text" placeholder="Escriba La Direccion de la Casa" name="direccion" id="direccion"></td>
                    </tr>
                    <tr>
                        <td><label>Ciudad</label></td>
                        <td><input type="text" placeholder="Escriba La Ciudad" name="ciudad" id="ciudad"></td>
                    </tr>
                    <tr>
                        <td><label>Departamento</label></td>
                        <td>
                            <select name="departamento">
                                <option selected>...</option>
                                <option value="amazonas">Amazonas</option>	
                                <option value="antioquia">Antioquia</option>
                                <option value="arauca">Arauca</option>	
                                <option value="atlantico">Atlantico</option>
                                <option value="bolivar">Bolivar</option>	
                                <option value="boyaca">Boyaca</option>	
                                <option value="caldas">Caldas</option>	
                                <option value="caqueta">Caqueta</option>	
                                <option value="casanare">Casanare</option>	
                                <option value="cauca">Cauca</option>	
                                <option value="cesar">Cesar</option>	
                                <option value="choco">Choco</option>	
                                <option value="cordoba">Cordoba</option>	
                                <option value="cundinamarca">Cundinamarca</option>	
                                <option value="guainia">Guainia</option>	
                                <option value="guaviare">Guaviare</option>	
                                <option value="huila">Huila</option>	
                                <option value="laGuajira">La Guajira</option>	
                                <option value="magdalena">Magdalena</option>	
                                <option value="meta">Meta</option>	
                                <option value="nariño">Nariño</option>	
                                <option value="norteSantander">Norte de Santander</option>	
                                <option value="putumayo">Putumayo</option>	
                                <option value="quindio">Quindio</option>	
                                <option value="risaralda">Risaralda</option>	
                                <option value="sanAndresProvivencia">San Andres y Provivencia</option>	
                                <option value="santander">Santander</option>	
                                <option value="sucre">Sucre</option>	
                                <option value="tolima">Tolima</option>	
                                <option value="valleCauca">Valle del Cauca</option>	
                                <option value="vaupes">Vaupes</option>	
                                <option value="vichada">Vichada</option>	
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td><label>Codigo Postal</label></td>
                        <td><input type="text" placeholder="Escriba el Codigo Postal" name="codigoPostal" id="codigoPostal"></td>
                    </tr>
                    <tr>
                        <td><label>País</label></td>
                        <td>
                            <select name="pais">
                                <option select>...</option>
                                <option value="Colombia">Colombia</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td><label>Telefono</label></td>
                        <td><input type="text" placeholder="Escriba el Numero de Telefono" name="telefono" id="tefono"></td>
                    </tr>
                    <tr>
                        <td><img id="captcha" src="securimage/securimage_show.php" alt="CAPTCHA Image" /></td>
                    </tr>
                    <tr>
                        <td> <input type="text" name="captcha_code" size="10" maxlength="6" /></td>
    
                        <td> <a href="#" onclick="document.getElementById('captcha').src = 'securimage/securimage_show.php?' + Math.random(); return false">[ Different Image ]</a></td>
                    </tr>
                    <tr>
                        <td><input type="checkBox" name="terminos"></td>
                        <td><label>Uster acepta los terminos y condiciones para registrar sus datos en esta pagina y poderlos usar de manera adecuada para la seguridad de su informcaion</label></td>
                    </tr>
                    <tr>
                        <td>
                            <input type="submit" value="Enviar" id="botonEnviar" name="botonEnviar">
                        </td>
                        <td>
                            <input type="submit" value="Eliminar" id="botonEliminar" name="botonEliminar">
                        </td>
                        <td><input type="reset" value="BorrrarInfo"></td>
                    </tr>
                </table>
            </form>		
        </div>
        <script src="script.js">
    </body>
</html>