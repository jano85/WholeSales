<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
     lang="en">

<head>
    <script src="assets/js/jquery.min.js"></script>
    <title>prueba</title>

    <script>
         function cargar(e) {
               $.ajax({
                    url : '/getdata',
                    type : 'get',
                    // data : $form.serialize(),
                    success : function(response) {

                        $("#ajaxLoadedContent").replaceWith(response);
                    }
                });

        };


    </script>
</head>
<body>
<br/>

prueba 2


<button onclick="cargar()">click</button>


<div id="ajaxLoadedContent"></div>
</body>
</html>