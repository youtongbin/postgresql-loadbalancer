function deleteUser(e){
	console.log('删除')
	var id = e.value
	console.log(id)
	$.ajax({
		type: "DELETE",
		dataType: "json",
		contentType: "application/json",
		url: "/user/" + id,
		success: function(data){
			if(data){
				alert('id为'+ id + '的用户信息删除成功！')
				window.location.href = "show"
			}
		},
		error: function(e){
			console.log(e)
			alert(e.responseText)
		}
	})
}

function saveUser(){
	var id = $('#input_id')[0].value
	var type = "POST"
	
	var user = {
		'name': $('#input_name')[0].value,
		'sex': $('#input_sex')[0].value,
		'age': $('#input_age')[0].value,
		'address': $('#input_address')[0].value
	}
	if(id != ""){
		type = "PUT"
		user.id = id
	}
	if(user.name == ""){
		alert('输入用户名！')
		return
	}
	
	$.ajax({
		type: type,
		dataType: "json",
		contentType: "application/json",
		url: "/user",
		data: JSON.stringify(user),
		success: function(data){
			if(data){
				window.location.href = "show"
				alert('操作成功！')
			}
		},
		error: function(e){
			console.log(e)
			alert(e.responseText)
		}
	})
}

function updateUser(e){
	$('#input_id')[0].value = e.value
	$('#input_name')[0].value = e.name
	$('#input_sex')[0].value = e.attributes.sex.value
	$('#input_age')[0].value = e.attributes.age.value
	$('#input_address')[0].value = e.attributes.address.value
}