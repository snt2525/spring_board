
function saveComment(){
	
}


function showReplyList(){
	var url = "${pageContext.request.contextPath}/getReqlyList";
	var paramData = {"post_num" : "${boardContent.post_num}"};
	
	$.ajax({
        type: 'POST',
        url: url,
        data: paramData,
        dataType: 'json',
        success: function(result) {
               	var htmls = "";
			if(result.length < 1){
				htmls.push("등록된 댓글이 없습니다.");
			} else {
              $(result).each(function(){
                     htmls += '<div id="rid' + this.rid + '">';
                     htmls += '<title>Placeholder</title>';
                     htmls += '<rect width="100%" height="100%" fill="#007bff"></rect>';
                     htmls += '<text x="50%" fill="#007bff" dy=".3em">32x32</text>';
                     htmls += '</svg>';
                     htmls += '<p class="media-body pb-3 mb-0 small lh-125 border-bottom horder-gray">';
                     htmls += '<span class="d-block">';
                     htmls += '<strong class="text-gray-dark"> ${sessionScope.loginId} </strong>';
                     htmls += '<span style="padding-left: 7px; font-size: 9pt">';
                     htmls += '<a href="javascript:void(0)" onclick="fn_deleteReply(' + this.comment_num + ')" >삭제</a>';
                     htmls += '</span>';
                     htmls += '</span>';
                     htmls += this.content;
                     htmls += '</p>';
                     htmls += '</div>';
                });	//each end
			}
			
			$("#replyList").html(htmls);
        }	   // Ajax success end
	});	// Ajax end
}
