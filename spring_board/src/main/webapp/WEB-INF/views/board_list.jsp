<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<title>게시판</title>
	<div>
		${sessionScope.loginId}님 환영합니다.
		<button onClick = "location='/board/logout'">로그아웃</button>
	</div>
</head>
<tbody>
	<h1 style="margin-left :35%">게시판</h1>
	<table style="margin-left :30%">
        <colgroup>
            <col style="width:50px;" />
            <col style="width:100px;" />
            <col style="width:100px;" />
            <col style="width:150px;" />
        </colgroup>
        <thead>
            <tr colspan = "4">
                <th>NO</th>
                <th>글제목</th>
                <th>작성자</th>
                <th>작성일</th>
            </tr>
        </thead>
        <tbody>
            <c:choose>
                <c:when test="${empty postList}" >
                    <tr><td colspan="4" align="center">데이터가 없습니다.</td></tr>
                </c:when> 
                <c:when test="${!empty postList}">
              <c:forEach var="list" items="${postList}">
                  <tr>                                	  
                      <td><c:out value="${list.post_num}"/></td>
                      
                      <td><a href="#" onClick="contentView(<c:out value="${list.post_num}"/>)">
                      	  <c:out value="${list.title}" />
                      </a></td>
                      
                      <td><c:out value="${list.id}"/></td>
                      <td><c:out value="${list.date}"/></td>
                  </tr>
              </c:forEach>
          </c:when>
            </c:choose>
        </tbody>
    </table>
    <br>
      <button onClick = "location='/board/newPost'" style="margin-left :30%">글쓰기</a>
 </tbody>
</html>

<script type="text/javascript">
	function contentView(post_num){
		var url = "/board/getContent";
		url = url + "?post_num=" + post_num;
		location.href = url;
	}
</script>
