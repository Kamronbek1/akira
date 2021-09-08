var uploadField = document.getElementById("file");

uploadField.onchange = function() {
    if(this.files[0].size > 5000000){
        alert("Fayl xajmi 5mb katta, iltmos kichikroq hajimli rasm kiriting!");
        this.value = "";
    };
};