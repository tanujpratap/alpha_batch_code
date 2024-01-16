<?php
include("connect.php");
$name=$_POST['name'];
$mobile=$_POST['mobile'];
$password=$_POST['password'];
$cpassword=$_POST['cpassword'];
$address=$_POST['address'];
$image=$FILES["name"]["photo"];
$tmp_name=$FILES['tmp_name']['photo'];
$role=$_POST['role'];

if($password==$cpassword){
    move_uploaded_file($tmp_name,"../uploads/$image");
    $insert = mysqli_querry($connect,"INSERT INTO .voter (name,mobile,address,password,photo,role,status,votes) VALUES ('$name','$mobile','$password','$address','$image','role',0,0)");
    if($insert){
        echo'
        <script>
            alert("Registeration successfull!");
            window.location = "../";
        </script>    
            
    ';
    } 
    elseP{
        echo'
        <script>
            alert("some error occured!");
            window.location = "../routes/register.html";
        </script>    
            
    ';
    }
}
else{
    echo'
        <script>
            alert("password and confirm password does not match!");
            window.location = "../routes/register.html";
        </script>    
            
    ';

    
}




?>