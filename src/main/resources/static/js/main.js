/**
 * 删除
 * @param e
 * @returns
 */
function deleteUser(e){
	var id = e.value
	var sources = $('#selectSource')[0].elements
	var url = "/user/" + id //主节点删除测试地址
	for(let source of sources){
		if(source.checked && source.value == "slave"){
			url = "/user/slave/" + id //从节点删除测试地址
			console.log(source.value)
			break
		}
	}
	
	$.ajax({
		type: "DELETE",
		dataType: "json",
		contentType: "application/json",
		url: url,
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

/**
 * 保存信息
 * @returns
 */
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

/**
 * 表单填充
 * @param e
 * @returns
 */
function updateUser(e){
	$('#input_id')[0].value = e.value
	$('#input_name')[0].value = e.name
	$('#input_sex')[0].value = e.attributes.sex.value
	$('#input_age')[0].value = e.attributes.age.value
	$('#input_address')[0].value = e.attributes.address.value
}