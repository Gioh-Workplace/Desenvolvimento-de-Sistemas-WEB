<%-- 
    Document   : login
    Created on : 12 de mar. de 2024, 21:50:37
    Author     : giovani.ajusto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    </head>
    <body class ="bg-light">
        <div class = "container mt-5">
            <div class="row justify-content-center">
                <div class="col md-4">
                    <div class="card">
                        <div class ="card-header">
                            
                            <h3 class="text-center">Login</h3>
                              
                        </div>
                    </div>
                    <div class="card-body">
                        <form action="${pageContext.request.contextPath}/login" method="post">
                            <div class="form-group">
                                <label for="username">Username</label>>
                                <input type="text" name="username" id="username" class="form-control">
                            
                            </div>
                            <div class="form-group">
                                <label for="username">Username</label>>
                                <input type="text" name="password" id="password" class="form-control">
                            
                            </div>
                            <button type="submit" class="btn btn-primary" >Enviar</button>

                        </form>
                      
                        
                    </div>
                </div>
            </div>
            
        
        
        
        
        
        
        
        
        
        </div>
    </body>
</html>
