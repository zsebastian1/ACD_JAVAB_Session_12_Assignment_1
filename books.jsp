<%@ page language = "java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset = "UTF-8">
<title> Book Logger</title>
</head>

<body>
<form action = "OnlineBooks2" method = "post">
Book Title: <input type = "text" name = "book_title">
Book Author: <input type = "text" name = "book_author">
Book Publisher: <input type = "text" name = "book_publisher">
Book Year Published <input type = "text" name = "book_year_published">
Book Price: <input type = "text" name = "book_price">

<input type = "Submit" value = "Submit">
</form>
</body>
<body>
<form action = "OnlineBooks3" method = "post">
Update Book Title: <input type = "text" name = "u_book_id">
Update Book Title: <input type = "text" name = "u_book_title">
Update Book Author: <input type = "text" name = "u_book_author">
Update Book Publisher: <input type = "text" name = "u_book_publisher">
Update Book Year Published <input type = "text" name = "u_book_year_published">
Update Book Price: <input type = "text" name = "u_book_price">

<input type = "Submit" value = "Submit">

</form>
</body>
<body>
<form action = "OnlineBooks4" method = "post">
Remove Book ID: <input type = "text" name = "r_book_id">


<input type = "Submit" value = "Submit">
</body>
</html>