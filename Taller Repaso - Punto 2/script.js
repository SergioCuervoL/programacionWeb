$(document).on('ready',function(){       
    $('#botonEnviar').click(function(){
        var url = "formulario.php";
        $.ajax({ 
           $alert("Pase por aca");
           type: "POST",                 
           url: url,                     
           data: $("#formulario").serialize(), 
           success: function(data)             
           {
             $('#resp').html(data); 
             $alert("Pase por aca");
           }
       });
    });
});