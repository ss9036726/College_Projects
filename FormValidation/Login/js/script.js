function validation(){
    var username = document.getElementById('username').value;
    var password = document.getElementById('password').value;
    
    var userCheck = /^[A-Za-z. ]{3,30}$/;
    var passCheck = /^(?=.*[0-9])(?=.*[!@#$%^&*])[a-zA-Z0-9!@#$%^&*]{8,20}$/;
    
    if(userCheck.test(username)){
        document.getElementById('usernameerror').innerHTML = " ";
    } else {
        document.getElementById('usernameerror').innerHTML = "** Username is Incorrect.";
        return false;
    }
    
    if(passCheck.test(password)){
        document.getElementById('passworderror').innerHTML = " ";
    } else {
        document.getElementById('passworderror').innerHTMl = "** Password is Invalid.";
        return false;
    }
}