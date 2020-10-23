<%@page import="java.util.*" %>

<% 
session.removeAttribute("userID");
session.invalidate();
%>
<h3 style="color:green; margin=50px">
You have LogOut Successfully. To Login again please click below
</h3>
<a href="Login.jsp">Login</a>
