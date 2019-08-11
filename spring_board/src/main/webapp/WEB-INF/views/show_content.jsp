<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" 
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
	
<script type="text/javascript" src="show_comment.js?ver=1"></script>
<title>게시글  쓰기</title>
</head>
<body>
	<script>
	$(document).on('click', '#btnList', function(){
		location.href = "/board/getPostList";
	});
	
	function deletePost(post_num){	
          if (confirm('삭제하시겠습니까?')) 
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
						<div class="board_author">글쓴이: ${boardContent.id}</div>
						<div class="board_date">날짜: ${boardContent.date}</div>
						<div class="board_content">내용: ${boardContent.content}</div>
				</div>
	
				<div style="margin-top : 20px">
					<button type="button" id="btnUpdate">수정</button>
					<button type = "button" onClick = "deletePost(${boardContent.post_num})">삭제</button>
					<button type="button" id="btnList">목록</button>
				</div>
			</div><br>	
			
		<!-- Reply Form {s} -->
			<div style="padding-top: 10px">
				<form name="form" id="form" action="/board/saveComment" method="post">
				<text path="reg_id" id="reg_id">${sessionScope.loginId}</text>
					<div class="row">
						<input type =text name="comment_content" id="comment_content" rows="3" placeholder="댓글을 입력해 주세요" />
						<input type= submit style= "margin-top: 10px" value ="저장"/>
						<input type= hidden name = "id" value="${boardContent.id}">
						<input type= hidden name = "post_num" value="${boardContent.post_num}">
					</div>
				</form>
			</div>
				<!-- Reply Form {e} -->
	
			<!-- Reply List {s}-->
			<div style="padding-top: 10px">
				<h5>Reply list</h5>
				<div id="replyList"></div>	
			</div>		
		</article>
	</body>
</html>
