<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 l'�tudiant 
<% String nom = request.getParameter("nom"); // l'objet request est deja envoy� � la page succes => on peut getter le parametre nom
 out.println(nom);
   %>
 a r�ussi


</body>
</html>