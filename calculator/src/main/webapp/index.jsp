<html>
<head>
<title>Scientific Calculator</title>
<style>
body {
	font-family: Arial, sans-serif;
	text-align: center;
	margin-top: 50px;
	background-color: #f4f4f9;
}

h2 {
	color: #333;
}

form {
	display: inline-block;
	padding: 20px;
	border: 1px solid #ccc;
	border-radius: 10px;
	background-color: #fff;
	box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
}

input[type="text"] {
	padding: 10px;
	margin: 5px;
	border: 1px solid #ccc;
	border-radius: 5px;
	width: 250px;
}

input[type="submit"] {
	padding: 10px 20px;
	margin: 5px;
	background-color: #007bff;
	color: #fff;
	border: none;
	border-radius: 5px;
	cursor: pointer;
}

input[type="submit"]:hover {
	background-color: #0056b3;
}
</style>
</head>
<body>
	<%
	String value = "";
	if(request.getAttribute("result")!=null){
		
	value = request.getAttribute("result").toString();
	} 
	
	
	%>
	<h2>Scientific Calculator</h2>
	<form action="/calculator/main" method="post">
		<input type="text" id="expression" placeholder="Enter expression"
			size="30" name="expression" /> <input type="submit" value="Calculate" />



		<input type="text"
			value="<%=value%>" id="result" placeholder="Result" readonly  />
	</form>
	<br>
</body>
</html>
