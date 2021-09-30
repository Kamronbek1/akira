
let uploadField = document.getElementById("image");
let str, file;
uploadField.onchange = function () {
    file = this.files[0];
    str = file.name.toLowerCase();
    if (str.toLowerCase().endsWith('.png') || str.toLowerCase().endsWith('.jpg')|| str.toLowerCase().endsWith('.jpeg')|| str.toLowerCase().endsWith('.jfif')) {
        if (file.size > 5000000) {
            alert("Fayl xajmi 5mb katta, iltmos kichikroq hajimli rasm kiriting!!!");
            this.value = "";
        }else{
            return;
        }
    } else {
        alert("Faqat rasm joylashingiz mumkin!!!");
        this.value = "";
    }
};

