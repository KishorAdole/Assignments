<%@page import="com.dto.User"%>
<%@page import="com.service.UserServiceImplementation"%>
<%@page import="com.service.UserService"%>

<jsp:useBean id="user" class="com.dto.User" scope="page"></jsp:useBean>
<jsp:setProperty property="*" name="user"/>

<%
	UserService userService = new UserServiceImplementation();
	userService.register(user);
	response.sendRedirect("Login.jsp");
%>
