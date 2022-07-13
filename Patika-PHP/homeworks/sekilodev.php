<?php

class Sekil{
    public $x,$y,$z,$alan,$cevre;
    public function __construct($x,$y=null,$z=null)
    {
        $this->x=$x;
        $this->y=$y;
        $this->z=$z;
    }
}

class Kare extends Sekil{
    public function getCevre()
    {
        return 4*$this->x;
    }
    public function getAlan()
    {   
        return pow($this->x,2);
    }
}

class Ucgen extends Sekil{
    public function getCevre()
    {
        return $this->x+$this->x+$this->y+$this->z;
    }
    public function getAlan()
    {   
        $myCevre=$this->getCevre(); 
        return bcsqrt((($myCevre/2)*(($myCevre/2)-$this->x)*(($myCevre/2)-$this->y)*(($myCevre/2)-$this->z)),2);
    }
}

class Dikdortgen extends Sekil{
    public function getCevre()
    {
        return $this->x+$this->y;
    }
    public function getAlan()
    {   
        return $this->x*$this->y;
    }
}

$kare = new Kare(3);
$dikdortgen = new Dikdortgen(3,4);
$ucgen = new Ucgen(3,4,5);

echo "Kare Çevresi: " . $kare->getCevre() . "<br/>";
echo "Kare Alanı: " . $kare->getAlan() . "<br/>";
echo "Dikdörtgen Çevresi: " . $dikdortgen->getCevre() . "<br/>";
echo "Dikdörtgen Alanı: " . $dikdortgen->getAlan() . "<br/>";
echo "Üçgen Çevresi: " . $ucgen->getCevre() . "<br/>";
echo "Üçgen Alanı: " . $ucgen->getAlan() . "<br/>";
