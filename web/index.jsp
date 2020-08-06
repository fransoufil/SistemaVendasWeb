<%-- 
    Document   : index
    Created on : 4 de ago. de 2020, 20:26:33
    Author     : franz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.1/css/bootstrap.min.css" integrity="sha384-VCmXjywReHh4PwowAiWNagnWcLhlEJLA5buUprzK8rxFgeH0kww/aWY76TfkUoSX" crossorigin="anonymous">
        
        
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container mt-4 col-lg-4">
            
            <div class="card col-sm-10">
                
                <div class="card-body">
                    
                    <form class="form-sign" action="Validar" method="POST" >
                        
                        <div class="form-group  text-center"> 
                            <h3>Sistema de Vendas WEB - Login</h3>
                            <img src="images/laptop.png" alt=""/>
                            <label>Bem Vindos ao Sistema!</label>
                        </div>
                        
                        <div class="form-group">
                            <label>Usuário:</label>
                            <input type="text" name="txtuser" class="form-control">
                        </div>
                        
                        <div class="form-group"> 
                            <label>Senha:</label>
                            <input type="password" name="txtpassword" class="form-control">
                        </div>
                        <input type="submit" name="acao" value="Ingressar" class="btn btn-primary btn-block">
                        
                                                   
                    </form>
                    
                </div>
                
            </div>
            
        </div>
        
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.1/js/bootstrap.min.js" integrity="sha384-XEerZL0cuoUbHE4nZReLT7nx9gQrQreJekYhJD9WNWhH8nEW+0c5qq7aIo2Wl30J" crossorigin="anonymous"></script>
        
    </body>
</html>
