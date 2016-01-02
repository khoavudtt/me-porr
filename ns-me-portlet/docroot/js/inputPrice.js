AUI().ready(function(A){
	A.all('input.formatPrice').each(function(node){
		var priceInput = node;
		
		var money = priceInput.val().toString();
			
		money = money.replace(/[^\d]/g,'');
		
		priceInput.on('keyup', function(){
		
			money = priceInput.val().toString();
			
			money = money.replace(/[^\d]/g,'');
			
			var length = money.length;
			
			var offset = 3;
			
			var periods = 0;
			
			var value = '';
			
			if(length > offset && length % offset == 0){
				periods = (Math.floor(length / offset)) -1;
			}else{
				periods = (Math.floor(length / offset));
			}
			
			if(periods > 0){
				for(var i = 0; i < length; i++){
									
					var periodIndex =  length - (periods * offset) -1;
					
					if(i == periodIndex && periods > 0){
						periods--;
						value += money.charAt(i) + '.';
					}else{
						value += money.charAt(i);
					}
				}

			}else{
				value = money;
			}
			
			priceInput.val(value);
		});
	});
});