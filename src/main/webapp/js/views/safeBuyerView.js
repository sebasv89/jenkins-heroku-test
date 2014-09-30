define([
		'jquery', 
		'backbone',
		'underscore',
		'handlebars',		
		'models/safeBuyerModel',
		'text!templates/addBuyerTamplate.html'], 
function($, Backbone, _,  Handlebars, SafeBuyerModel, template){
	var SafeBuyerView = Backbone.View.extend({
		el: '#container',
		events: {
			'click #sendButton' : 'saveBuyer',
			
		},
		initialize: function(){
			this.safeBuyerModel = new SafeBuyerModel();
		},
		render: function(id){
			$(this.el).html(template); //put in the html the handlebars script template
			document.title = "Agregar SafeBuyer";
			var compiledTemplate = Handlebars.compile($("#safe_buyer_template").html());
			
			if(id){
				debugger;
				this.safeBuyerModel.set('id' , id);
				this.safeBuyerModel.fetch({
					async : false,
					success : function(data) {
						//the model is now updated, put something else here.
					},
					error: function(data, response){
						alert("there is a problem trying to connect to the server");
					}
				});
				
				
				
			}
			var htmlSafeBuyer = compiledTemplate(this.safeBuyerModel.attributes);
    		$(this.el).html(htmlSafeBuyer);
		},
		saveBuyer: function(){
			debugger;
			var buyerJSON = {
					name : $('#name').val(),
					lastName : $('#last_name').val()
			};
			this.safeBuyerModel.save( buyerJSON, {
				dataType: "text",
				wait: true,
				success: function(model, response) {
	                alert('successfully saved');
	                
	            }, 
	            error: function(model, response) {
	            	alert("and another error :(");
	            } 
			});
		}
	});
	
	return new SafeBuyerView();
});
