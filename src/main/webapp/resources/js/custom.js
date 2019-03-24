$(document).ready(function(){	
	$("#btnDangNhap").click(function(){
		var tendangnhap = $("#tendangnhap").val();
		var matkhau = $("#matkhau").val();
		$.ajax({
			url:"api/KiemTraDangNhap",
			type:"GET",
			data:{
				tendangnhap:tendangnhap,
				matkhau: matkhau
			},
			success:function(data){
				if(data=="true")
				{
					var duongDanHienTai = window.location.href;
					var duongDan = duongDanHienTai.replace("dangnhap", "");
					window.location = duongDan;
				}
				else 
					alert("Đăng nhập thất bại");
			}		
		})
	});
});