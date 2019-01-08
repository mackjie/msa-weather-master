/*下拉框选中事件*/
$(function(){
    $("#selectedCityId").change(function () {
        var cityId;
        cityId = $("#selectedCityId").val();
        //console("/report/cityId/"+cityId);
        window.location.href = "/report/cityId/"+cityId;
    })
});
