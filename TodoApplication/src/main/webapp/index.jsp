<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Login Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f9;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        .login-container {
            background: #ffffff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
            min-width: 300px;
        }
        .login-container h2 {
            text-align: center;
            margin-bottom: 20px;
        }
        .form-group {
            margin-bottom: 15px;
        }
        .form-group label {
            display: block;
            margin-bottom: 5px;
            font-weight: bold;
        }
        .form-group input {
            width: 90%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }
        .form-group button {
            width: 100%;
            padding: 10px;
            background-color: #007bff;
            color: white;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }
        .form-group button:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="login-container">

        <%
            String registerParam = request.getParameter("registerd");
            if ("true".equals(registerParam)) {
        %>
            <div style="color: green; text-align: center; margin-bottom: 20px;">
                You have registered successfully, please login with your email & password.
            </div>
        <%
            }
        %>

           <%
            Object loginerror = request.getAttribute("loginerror");
            if (loginerror != null) {
        %>
            <div style="color: red; text-align: center; margin-bottom: 20px;">
                Username or password is incorrect.
            </div>
        <%
            }
        %>
        <h2>Login</h2>
        <form action="/TodoApplication/login" method="post">
            <div class="form-group">
                <label for="username">Username</label>
                <input type="text" id="username" name="username" required>
            </div>
            <div class="form-group">
                <label for="password">Password</label>
                <input type="password" id="password" name="password" required>
            </div>
            <div class="form-group">
                <button type="submit">Login</button>
            </div>
            <div class="form-group" style="text-align: center;">
                <a href="register.jsp" style="text-decoration: none; color: #007bff;">Don't have an account? Register here</a>
            </div>
        </form>
    </div>
</body>
</html>