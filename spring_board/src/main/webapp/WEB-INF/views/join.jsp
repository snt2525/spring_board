<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
	<form action="/login/join" method="post">
		ID: <input type = "text" name = "id" id = "id_check" /> 
			<input type = "button" name = "check_id" id = "check_id" /> <br/>
		Password: <input type = "submit" value = 가입하기" /> 	
	</form>
	<href ="list.jsp"> 돌아가기
</body>
</html>
	

<script>

	//회원가입을 할 때 사용자의 id가 중복이 됬는 지 확인하는 함수
	$('#check_id').on('click', function(){
		var check_id = $("#id_check").val();
		
	    $.ajax({
	        url: "/login/check",
	        type: "GET",
	        data: "id=" + check_id,
	        dataType: text,
	        success: function(data){
	        	if(data == '0'){
	           		alert("존재하는 아이디 입니다.")
	           		$("#id_check").val("");
	            }else{ 
	            	alert("생성이 가능한 아이디 입니다.")
	            }
	        },
	        error: function(){
	            alert("Database Connection Error");
	        }
	    });
	});
</script>
