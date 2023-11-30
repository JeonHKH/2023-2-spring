function memberInsert(){
	//1. 사용자 입력정보를 읽어옴, username, passwordm email
	
	username = document.getElementById("username")
	password = document.getElementById("password")
	email = document.getElementById("email")	
	userinfo={
		"username" : username.value,
		"password" : password.value,
		"email": email.value
	}
	
	//2. 서버와 통신
	    $.ajax({
        type: "POST",
        url: "/user",
        data: JSON.stringify(userinfo)

    }).done(function(data){
	
		console.log(data)
		$('#tarea').text(JSON.stringify(data));

    }).fail(function(error){

    });
}


function memberList(){
    $.ajax({
        type: "GET",
        url: "/user/list"

    }).done(function(data){
	
		console.log(data)
		$('#tarea').text(JSON.stringify(data));

    }).fail(function(error){

    });
}