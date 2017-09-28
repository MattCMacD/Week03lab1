<%@page contentType="text/html" pageEncoding="utf-8"%>        
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="header.html" />

<h1>Main Page</h1><br>
               Hello, ${dasuser} <a href="login?logout=true">Logout</a>

<c:import url="footer.html" />