<?php
$number_err="";

$number = $_POST["number"];
    if($_SERVER["REQUEST_METHOD"]=="POST"){
        if(empty($number)){
            $number_err = "Please enter a number";
        }else{
            $sum = array_sum(str_split($_POST["number"]));
            if($sum % 3 != 0){
                $number_err = "The number ".$_POST["number"].
                " is not divisible by 3.";
                while($number % 3 != 0){
                    $number++;
                }
                $number_err .= "The first number can be divisible is ".$number;
            }else{
                $number_err = "The number ".$number." is divisible by 3.";
            }
        }
}

?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="index.php" method="POST">
        <label for="number">Please enter an input</label>
        <br>
        <input type="number" name="number" id="number"><span>        <button type="submit">Submit</button>
</span>
        <br>
        <span><?=$number_err;?></span>
        <br>
    </form>
</body>
</html>