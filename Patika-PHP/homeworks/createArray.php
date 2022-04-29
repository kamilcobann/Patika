<?php

$planets = [
    "Mercury", "Venus", "Earth",
    "Mars", "Jupiter", "Saturn",
    "Uranus", "Neptune", "", "",
    NULL];
function createArray($array,$myVal){
    $filteredarray = array_filter($array); // Null değerlerden kurtul.
    $randArray = array_rand($filteredarray,$myVal);
    $result = array_map(function ($e) use ($filteredarray){
        return $filteredarray[$e];
    },$randArray);
    return $result;
}
echo "<pre>";
print_r(createArray($planets, 2));
print_r(createArray($planets, 3));
print_r(createArray($planets, 2));
print_r(createArray($planets, 4));
print_r(createArray($planets, 5));


?>