<?php
session_start();
include("connect.php");
$mobile=$_post['mobile'];
$password=$_post['password'];
$role=$_post['role'];
$check=mysqli_query($connect,"SELECT * FROM user WHERE mobile='$mobile' AND password='$password' AND role='$role'");
if(mysqli_num_rows($check)>0){
    $userdata=mysqli_fetch_array($check);
    $groups=mysqli_query($connect,"SELECT * FROM user WHERE role=2");
    $groupsdata=mysqli_fetch_all($groups,MYSQLI_ASSOC);

    $_SESSION['userdata']=$userdata;
    $_SESSION['groupsdata']=$groupsdata;


}
else{
    echo'
            <script>
                alert("Invalid credential or user not found");
                window.location="../";
            </script>
        ';    
    
}
?>