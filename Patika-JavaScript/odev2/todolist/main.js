// Gerekli elemanlara ulaşmak
let input = document.querySelector('#task');
let button = document.querySelector('.button');
let list = document.querySelector('#list');
let deleteButton = document.querySelectorAll('.fa-solid');

button.addEventListener('submit', newElement);


let index = 1;
// Textbar içindeki inputu newElement ve addItem fonksiyonları ile listeye append ediyoruz.
function newElement(){
 if(input.value){
        addItem(input.value);
        let toastSuccess = document.querySelector('.success');
        let toastAlertSuccess = new bootstrap.Toast(toastSuccess);
        toastAlertSuccess.show();
        input.value="";
        index++;
    }else{
        let toastFailed = document.querySelector('.error');
        let toastAlertFailed = new bootstrap.Toast(toastFailed);
        toastAlertFailed.show();
    }
    
}

function addItem(text){
    let liDOM = document.createElement('li');
    liDOM.innerHTML = `${text} <span onclick="deleteItem(this)" class="float-right mr-3 delete"><i class="fa-solid fa-xmark"></i></span>`;
    list.appendChild(liDOM);
    
}



// List item'e tıklanınca üzeri çiziliyor ve rengi değişiyor
list.addEventListener('click',toggler);

function toggler (e){
    if (e.target.className == '' || e.target.className == 'checked') {
        e.target.classList.toggle('checked');
      }
}

// x işaretine basınca element siliniyor.

function deleteItem(e){
    e.parentElement.remove();
}




