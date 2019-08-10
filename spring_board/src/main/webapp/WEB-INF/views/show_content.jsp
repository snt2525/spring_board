<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" 
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
	
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
				<h2>board Content</h2>	
				<div>
					<div class="title"> <c:out value="${boardContent.title}"/></div>	
					<div>	
						<div class="board_author">글쓴이: ${boardContent.id}</div>
						<div class="board_date">날짜: ${boardContent.date}</div>
					</div>
					<div class="board_title">제목: ${boardContent.title}</div>
					<div class="board_content">내용: ${boardContent.content}</div>
				</div>
	
				<div style="margin-top : 20px">
					<button type="button" id="btnUpdate">수정</button>
					<button type = "button" onClick = "deletePost(${boardContent.post_num})">삭제</button>
					<button type="button" id="btnList">목록</button>
				</div>
			</div>			
		</article>
	</body>
</html>