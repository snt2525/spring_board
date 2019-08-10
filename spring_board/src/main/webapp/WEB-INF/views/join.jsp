<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" 
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
	
<title>회원가입</title>
</head>
<body>
	<article style="margin-left :30%">
		<h1 style="margin-left :15%" >회원가입</h1>
		<div class="container" role="main" >
			<form name="form" id="form" method="post" action="/board/join/post_info">
				<div>			
				<div>
					<label>아이디:</label>
					<input type = "text" name="id" id = "id" placeholder = "UserID">
					<button type = "button" id = "btnCheckID" onClick = "same_id_check()" >중복체크</button>
				</div>				

				<div style="margin-top : 5px">
					<label>비밀번호:</label>
					<input type ="text" name="pwd" id = "pwd" placeholder = "User Password" ></textarea>
				</div>
			</form>

			<div style="margin-top : 10px">
				<button type="button" id="btnJoin">가입하기</button>
				<button type = "button" id = "btnBack">돌아가기</button>
			</div>
		</div>
	</article>
</body>
</html>
	

<script>
	var check = false;
	$(document).on('click', '#btnBack', function(e){
		e.preventDefault();
		location.href="/board/login";
	});
	
	$(document).on('click', '#btnJoin', function(e){
		e.preventDefault();
		$("#form").submit();
	});
	
	//회원가입을 할 때 사용자의 id가 중복이 됬는 지 확인하는 함수
	function same_id_check(){
		var check_id = $("#id").val();
		
	    $.ajax({
	        url: "/login/check_same_id",
	        type: "GET",
	        data: "id=" + check_id,
	        dataType: text,
	        success: function(data){        	
	           alert("존재하는 아이디 입니다.")
	        },
	        error: function(){
	            alert("Database Connection Error");
	        }
	    });
	}
</script>
