<?php
$connect=mysqli_connect("localhost","root","",".voter") or die("connection failed!");
if($connect){
    echo "connected";
}
else{
    echo "not connected";

}
?>

