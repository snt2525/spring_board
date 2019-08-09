<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
</head>
<tbody>	
	<table>
        <colgroup>
            <col style="width:5%;" />
            <col style="width:auto;" />
            <col style="width:15%;" />
            <col style="width:10%;" />
            <col style="width:10%;" />
        </colgroup>
        <thead>
            <tr>
                <th>NO</th>
                <th>글제목</th>
                <th>작성자</th>
                <th>작성일</th>
            </tr>
        </thead>
        <tbody>
            <c:choose>
                <c:when test="${empty postList}" >
                    <tr><td colspan="5" align="center">데이터가 없습니다.</td></tr>
                </c:when> 
                <c:when test="${!empty postList}">
              <c:forEach var="list" items="${postList}">
                  <tr>
                      <td><c:out value="${list.post_num}"/></td>
                      <td><c:out value="${list.title}"/></td>
                      <td><c:out value="${list.id}"/></td>
                      <td><c:out value="${list.regdate}"/></td>
                  </tr>
              </c:forEach>
          </c:when>
            </c:choose>
        </tbody>
    </table>
    <br>
      <button onClick = "location='/board/newPost'" >글쓰기</a>
 </tbody>
</html>

<script type="text/javascript">
</script>
