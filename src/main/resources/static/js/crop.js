var elm = document.getElementById('map_url');
elm.addEventListener('change', function (e) {
    var s = this.value, i = s.indexOf("src") + 5;
    if (i !== -1) {
        s = s.substring(i, (i + 44));
        this.value = s;
    }
});