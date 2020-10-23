<%@page import="javax.websocket.Session"%>
<%@page import="com.service.UserServiceImplementation"%>
<%@page import="com.service.UserService"%>
<jsp:useBean id="user" class="com.dto.User" scope="session"></jsp:useBean>
<jsp:setProperty property="*" name="user"/>

<%
	UserService userService = new UserServiceImplementation();
	boolean flag = userService.login(user);
	if(flag){
		session.setAttribute("userID", request.getAttribute("userID"));
		response.sendRedirect("Home.jsp");
	}
	else{
		response.sendRedirect("Login.jsp?errorMessage= You have entered Wrong credentials");
	}
	
%>