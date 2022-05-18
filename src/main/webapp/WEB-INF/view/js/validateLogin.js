
document.getElementById("login-user").addEventListener("keyup", buttonEnable);
document.getElementById("login-password").addEventListener("keyup", buttonEnable);

function buttonEnable(){
	let inputUser = document.getElementById("login-user");
	let inputPassword = document.getElementById("login-password");
	let button = document.getElementById("btn-submit");
	let isEmailValid = inputEmailValidation();

	if((inputUser.value !="" && inputPassword.value != "" && isEmailValid)){
		button.disabled=false;
		button.style.backgroundColor="#132dc3";
	}
	else{
		button.disabled=true;
		button.style.backgroundColor="#c4c4c4";
	}
}

function inputEmailValidation(){

	const letters = /^[\w-\.]+@([\w-]+\.)+[\w-]{2,4}$/g;
	let inputUser = document.getElementById("login-user");

	if(inputUser.value.match(letters)){
		return true;		
	}
	return false;
}