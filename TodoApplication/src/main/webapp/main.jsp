<!DOCTYPE html>
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
            <button >Add Todo</button>
        </div>
        <div id="todoList">
            <div class="todo-item">
                <span>Buy groceries</span>
                <button >Delete</button>
            </div>
            <div class="todo-item">
                <span>Complete homework</span>
                <button>Delete</button>
            </div>
            <div class="todo-item">
                <span>Call mom</span>
                <button >Delete</button>
            </div>
        </div>
    </div>
</body>
</html>