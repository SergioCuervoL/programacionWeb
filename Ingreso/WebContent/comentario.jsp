<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Comentario</title>
</head>
<body>
	<div align="center" style="margin-top: 50px;">
        <form action="Comentario">
            Title:  <input type="text" id="titule" name="titule" size="20px"> <br>
            Comentario:  <input type="text" name="comentario" size="20px"> <br><br>
            <input type="hidden" id="idNot" name="idNot">
        	<input type="submit" value="submit">      	
        </form>
	</div>
</body>
</html>