<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<title>로그인</title>
</head>
	<body>
		<article style="margin-left :30%">
			<h1 style="margin-left :15%" >로그인</h1>
			<div class="container" role="main">
				<form name="form" id="form" method="post" action="/board/login/member_info">
					<div>			
					<div>
						<label>아이디:</label>
						<input type = "text" name="id" id = "id" placeholder = "UserID">
					</div>				
	
					<div style="margin-top : 5px">
						<label>비밀번호:</label>
						<input type ="text" name="pwd" id = "pwd" placeholder = "User Password" ></textarea>
					</div>
				</form>
	
				<div style="margin-top : 10px">
					<button type="button" id="btnLogin">로그인</button>
					<button type = "button" id = "btnJoin">회원가입</button>
				</div>
			</div>
		</article>
	</body>
</html>
<script type ="text/javascript">
	$(document).on('click', '#btnLogin', function(e){
		e.preventDefault();
		$("#form").submit();
	});

	$(document).on('click', '#btnJoin', function(e){
		e.preventDefault();
		location.href="/board/join";
	});

</script>