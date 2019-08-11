<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" 
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
	
<title>�Խñ�  ����</title>
</head>
<body>
	<script>
	$(document).on('click', '#btnList', function(){
		location.href = "/board/getPostList";
	});
	
	function deletePost(post_num){	
          if (confirm('�����Ͻðڽ��ϱ�?')) 
          {
       		var url = "/board/deletePost";
       		url = url + "?post_num=" + post_num;
       		location.href = url;
          }        
	}
	
	$(document).on('click', '#btnUpdate', function(){
		location.href = "/board/updatePost";
	});
	
</script>

</head>
	<body>
		<article>	
			<div>
				<h2>[${boardContent.title}]</h2>	
				<div>
					<div class="title"> <c:out value="${boardContent.title}"/></div>	
					<div>	
						<div class="board_author">�۾���: ${boardContent.id}</div>
						<div class="board_date">��¥: ${boardContent.date}</div>
						<div class="board_content">����: ${boardContent.content}</div>
				</div>
	
				<div style="margin-top : 20px">
					<button type="button" id="btnUpdate">����</button>
					<button type = "button" onClick = "deletePost(${boardContent.post_num})">����</button>
					<button type="button" id="btnList">���</button>
				</div>
			</div>		
			
		<!-- Reply Form {s} -->
			<div style="padding-top: 10px">
				<form:form name="form" id="form" role="form" modelAttribute="commentVO" method="post">
					<form:hidden path="id" id="id"/>
					<div class="row">
						<div class="col-sm-10">
							<form:textarea path="comment" id="comment" rows="3" placeholder="����� �Է��� �ּ���"></form:textarea>
						</div>
						<div class="col-sm-2">
							<form:input path="reg_id" id="reg_id" placeholder="��� �ۼ���"></form:input>
							<button type="button" id="btnReplySave" margin-top: 10px">�� �� </button>
						</div>
					</div>
				</form:form>
			</div>
				<!-- Reply Form {e} -->
	
			<!-- Reply List {s}-->
			<div style="padding-top: 10px">
				<h6>Reply list</h6>
				<div id="replyList"></div>	
			</div>		
		</article>
	</body>
</html>