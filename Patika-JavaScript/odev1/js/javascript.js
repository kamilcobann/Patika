let textInfo = document.getElementById("myName")
let timeInfo = document.getElementById("myClock")
let username= prompt("Adınızı giriniz: ")
textInfo.innerHTML=username

function showTime(){
    const date = new Date();
    let h = date.getHours();
    let m = date.getMinutes();
    let s = date.getSeconds();

    let time = h+":"+m+":"+s;
    document.getElementById("myClock").innerHTML=time;
    setTimeout(showTime,1000);

}
showTime();