	
		createjs: function(){
			var params = 'funid=fun_text&pagetype=editgrid&eventcode=createjs&projectpath=' + 

			//�����ļ����Զ����ظ��ļ�
			var hdcall = function() {
				Request.loadJS('/public/locale/jxstar-lang-zh.js');
			};

			//��������
			Request.postRequest(params, hdcall);
		}
	};