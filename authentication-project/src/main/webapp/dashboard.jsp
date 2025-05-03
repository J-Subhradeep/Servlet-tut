<%@page import="main.auth.data.User"%>
<%@page import="main.auth.db.util.LoginUtil"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Dashboard</title>
</head>
<body>
    <h1>Welcome to the Dashboard</h1>

        <%
            // Retrieve the user_id from the session
            String userId = (String) session.getAttribute("user_id");
            if (userId != null) {
            	 User user =  LoginUtil.getUserByID(Integer.parseInt(userId));
       
            
            
           
        %>
            <p>User Details: Name :<strong><%= user.getName() %></strong></p>
        <%
        %>
            <p>Your User ID is: <strong><%= userId %></strong></p>
        <%
            } else {
        %>
            <%-- <p>User ID not found. Please <a href="login.jsp">log in</a>.</p> --%>
        <%
            }
        %>
    <%-- <%
        // Retrieve the username from the session
        // String username = (String) session.getAttribute("username");
        // if (username != null) {
    %>
        <p>Hello, <strong><%= username %></strong>! You are logged in.</p>
    <%
        // } else {
    %>
        <p>You are not logged in. Please <a href="login.jsp">log in</a>.</p>
    <%
        // }
    %> --%>
</body>
</html>