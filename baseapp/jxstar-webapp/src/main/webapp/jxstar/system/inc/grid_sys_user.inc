	

		setRole: function(){
			var records = this.grid.getSelectionModel().getSelections();
			if (!JxUtil.selectone(records)) return;

		},
	};