function crop() {
    var qiymat = document.getElementById("srcc").value;
    var need = qiymat.indexOff("src") + 5;
    var need = need + 44;
    var tayyor = qiymat.substring(need, need2);
    document.getElementById("tayy").value = tayyor
//<div style="position:relative;overflow:hidden;"><a href="https://yandex.uz/maps/10335/tashkent/?utm_medium=mapframe&utm_source=maps" style="color:#eee;font-size:12px;position:absolute;top:0px;">Ташкент</a><a href="https://yandex.uz/maps/10335/tashkent/?from=api-maps&ll=69.276492%2C41.300569&origin=jsapi_2_1_79&pt=69.27649199999999%2C41.30056900002783~69.277005%2C41.300887~69.27532%2C41.300043~69.27682%2C41.302318~69.274598%2C41.299005~69.277831%2C41.302759~69.279006%2C41.302065~69.274609%2C41.298497~69.275357%2C41.297741~69.273062%2C41.299128&utm_medium=mapframe&utm_source=maps&z=16" style="color:#eee;font-size:12px;position:absolute;top:14px;">Яндекс.Карты — транспорт, навигация, поиск мест</a><iframe src="https://yandex.uz/map-widget/v1/-/CCUqQOdE8B" width="560" height="400" frameborder="1" allowfullscreen="true" style="position:relative;"></iframe></div>
}