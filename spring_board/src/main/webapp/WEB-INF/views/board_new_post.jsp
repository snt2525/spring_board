<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글쓰기</title>
</head>
<body>
	<form action = "/board/getPostList" method = "post">
		글쓴이: <input type = "text" name = "id" id = "id" /> <br/>
		제목:  <input type = "text" name = "title" id = "title" /> <br/>
		내용:  <input type = "text" name = "content" id = "content" /> <br/>
			  <input type = "submit" value = SUBMIT /> 			
	</form>
	</form>
</body>
</html>