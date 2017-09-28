<%@page contentType="text/html" pageEncoding="utf-8"%>        
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="header.html" />   


<form action="login" method="post">
        <h1>Login</h1><br>
        Username: <input type="textfield" name="uname" value=${dasuser}><br>
        Password: <input type="password" name="psswrd" value=${daspass}><br>
        <input type="submit" value="Login">
        <br>${message}
    </form>
    
    
<c:import url="footer.html" />