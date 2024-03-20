<!---Essa anotação %@page se chama diretiva  --->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Users</title>
    </head>
    <body>
        <h1>Users</h1>
        <table border="1">
            <tr>
                <th>Id:</th>
                <th>Name></th>
                <th>Email:</th>
                <th>Actions:</th>
            </tr> 
            <c:forEach items="$(users)" var="user">
                <td>$(user.id)</td>
                <td>$(user.name)</td>
                <td>$(user.email)</td>
                <td>
                    <a href="$(pageContext.request.getContextPath)/user?action=edit&id=$(user.id)">Edit</a>
                    <a href="$(pageContext.request.getContextPath)/user?action=delete&id=$(user.id)">Delete</a>
                </td>
                
            </c:forEach>

        </table>
        <br> 
        <a href="$(pageContext.request.contexPath)/edit.jsp">Add new User</a>
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    </body>
</html>
