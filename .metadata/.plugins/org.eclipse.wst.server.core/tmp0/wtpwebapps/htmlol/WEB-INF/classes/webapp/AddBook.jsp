<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add book</title>
</head>
<body>
	<form action="books" method="post">
		BookCode: <input type="number" name="bookcode"></br>
		Title: <input type="text" name="title"></br>
		Author: <input type="text" name="author"></br>
		Category: <input type="text" name="category"></br>
		Approved: <input type="checkbox" name="approved"></br>
		<input type="submit" value="Add Book">
	</form>
</body>
</html>