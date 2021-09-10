var uploadField = document.getElementById("image");
var str, file;
uploadField.onchange = function () {
    file = this.files[0];
    str = file.name.toLowerCase();
    if (str.endsWith('.png') || str.endsWith('.jpg')) {
        if (file.size > 5000000) {
            alert("Fayl xajmi 5mb katta, iltmos kichikroq hajimli rasm kiriting!!!");
            this.value = "";
        }
    } else {
        alert("Faqat rasm joylashingiz mumkin!!!");
        this.value = "";
    }
};