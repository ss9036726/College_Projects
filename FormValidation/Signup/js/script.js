function validation(){
    var username = document.getElementById('username').value;
    var password = document.getElementById('password').value;
    var cpassword = document.getElementById('cpassword').value;
    var email = document.getElementById('email').value;
    var number = document.getElementById('number').value;
    
    var userCheck = /^[A-Za-z. ]{3,30}$/;
    var passCheck = /^(?=.*[0-9])(?=.*[!@#$%^&*])[a-zA-Z0-9!@#$%^&*]{8,20}$/;
    var emailCheck = /^[A-Za-z0-9]{3,}@[A-Za-z]{3,}[.]{1}[A-Za-z.]{2,6}$/;
    var mobileCheck = /^[0-9]{10}$/;    
    
    if(userCheck.test(username)){
        document.getElementById('usernameerror').innerHTML = " ";
    } else {
        document.getElementById('usernameerror').innerHTML = "** Username is Invalid";
        return false;
    }
    
    if(passCheck.test(password)){
        document.getElementById('passworderror').innerHTML = " ";
    } else {
        document.getElementById('passworderror').innerHTML = "** Password is Invalid";
        return false;
    }  
    
    if(cpassword.match(password)){
        document.getElementById('cpassworderror').innerHTML = " ";
    } else {
        document.getElementById('cpassworderror').innerHTML = "** Password is not matched";
        return false;
    }
    
    if(emailCheck.test(email)){
        document.getElementById('emailerror').innerHTML = " ";
    } else {
        document.getElementById('emailerror').innerHTML = "** Email is Invalid";
        return false;
    } 
    
    if(mobileCheck.test(number)){
        document.getElementById('numbererror').innerHTML = " ";
    } else {
        document.getElementById('numbererror').innerHTML = "** Number is Invalid";
        return false;
    }  
}