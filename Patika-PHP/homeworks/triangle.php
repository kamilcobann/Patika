<?php

function ucgen($size){
    $i = 0;
    while($i<=$size){
        for($j=0; $j<=$i; $j++){
            echo "0 ";
        }
        echo "<br>";
        $i++;
    }
}

ucgen(15);
?>