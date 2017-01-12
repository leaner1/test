window.onload = function () {
    $('#register').on('click', function(){
        layer.open({
            type: 2,
            title:'Welcome to register!',
            area: ['450px', '425px'],
            shadeClose: true, //点击遮罩关闭
            // content: '\<\div style="padding:20px;">自定义内容\<\/div>'
            content:'/bookM/view/register.jsp'
        });
    });
};