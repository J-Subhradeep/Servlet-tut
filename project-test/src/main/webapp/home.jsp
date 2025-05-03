<%@page import="main.data.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Home Page</title>
</head>
<body>
    <h1>Welcome to the Home Page</h1>


    <p>This is a basic JSP example.</p>

    <h1>
    <%-- <% 
        // Java code can be embedded in JSP using scriptlets
        String message = "Subhradeep";
      
    %>
    
    <%= message %> --%>

<% 
            // Retrieve the message attribute from the request
            List<Student> list = (List<Student>) request.getAttribute("students");
            if (list != null) {
            	for(Student s: list){
        %>
            ID: <%= s.getId() %> , Name: <%= s.getName() %>, Email: <%= s.getEmail() %>, Mobile: <%= s.getMobile() %>, Roll: <%=s.getRoll() %> . <br/> 
        <% }
            } else { 
        %>
            No User received.
        <% 
            } 
        %>
    </h1>


</body>
</html>