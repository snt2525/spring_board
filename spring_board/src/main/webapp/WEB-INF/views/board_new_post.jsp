<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- jQuery -->

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>

<title>글쓰기</title>
</head>
<body>
	<article>
		<div class="container" role="main">
			<form name="form" id="form" method="post" action="/board/savePost">
				<div>
				<label>제목</label>
					<input type="text" name="title" id="title" placeholder="제목을 입력해 주세요">
				</div>
			
				<div>
					<label>작성자</label>
					<input type="text" name="id" id="id" placeholder="이름을 입력해 주세요">
				</div>				

				<div>
					<label for="content">내용</label>
					<textarea rows="5" name="content" id="content" placeholder="내용을 입력해 주세요" ></textarea>
				</div>
			</form>

			<div >
				<button type="button" id="btnSave">저장</button>
				<button type = "button" name = "btnList" id = "btnList">목록</button>
			</div>
		</div>
	</article>

</body>
</html>

<script type ="text/javascript">
	$(document).on('click', '#btnSave', function(e){
		e.preventDefault();
		$("#form").submit();
	});

	$(document).on('click', '#btnList', function(e){
		e.preventDefault();
		location.href="/board/getPostList";
	});

</script>
