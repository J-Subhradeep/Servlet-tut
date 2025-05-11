<!DOCTYPE html>
<%@page import="main.auth.data.Todo"%>
<%@page import="java.util.List"%>
<html>
<head>
    <title>Todo Application</title>
    <style>
        body {
            font-family: Arial, sans-serif;
        }
        .todo-container {
            width: 50%;
            margin: 0 auto;
            text-align: center;
        }
        .todo-item {
            display: flex;
            justify-content: space-between;
            margin: 10px 0;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
        .todo-item button {
            background-color: red;
            color: white;
            border: none;
            padding: 5px 10px;
            cursor: pointer;
        }
        .add-todo {
            margin: 20px 0;
        }
        .add-todo input {
            padding: 5px;
            width: 70%;
        }
        .add-todo button {
            padding: 5px 10px;
            background-color: green;
            color: white;
            border: none;
            cursor: pointer;
        }
       
    button:active {
        transform: scale(0.95);
        opacity: 0.8;
    }
    </style>
</head>
<body>
    <div class="todo-container">
        <h1>Todo Application</h1>
        <div class="add-todo">
        <a href="/TodoApplication/add_todo">
        
            <button >Add Todo</button>
        </a>
        </div>
        <div id="todoList">
            <%
            List<Todo> todos = (List<Todo>) request.getAttribute("todos");
            if (todos != null) {
                for (Todo todo : todos) {
            %>
                <div class="todo-item">
                    <span><%= todo.getTitle() %></span>
                    <a href="/TodoApplication/delete_todo?id=<%= todo.getId() %>"><button>Delete</button></a>
                </div>
            <%
                }
            } else {
            %>
                <p>No todos available.</p>
            <%
            }
            %>

        </div>



    </div>
    <div class="logout-container" style="text-align: center; margin-top: 20px;">
        <form action="/TodoApplication/main" method="post" style="display: inline;">
            <button type="submit" style="padding: 5px 10px; background-color: blue; color: white; border: none; cursor: pointer;">Logout</button>
        </form>
    </div>


</body>
</html>