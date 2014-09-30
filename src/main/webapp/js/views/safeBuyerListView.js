define([
		'jquery', 
		'backbone',
		'underscore',
		'handlebars',		
		'models/safeBuyerModel',
		'collections/buyerCollection',
		'text!templates/buyerCollectionTamplate.html'], 
function($, Backbone, _,  Handlebars, SafeBuyerModel,BuyerCollection, template){
	var SafeBuyerListView = Backbone.View.extend({
		el: '#container',
		events: {
			//'click #create_new' : 'createBuyer',
			
		},
		initialize: function(){
			this.buyerCollection = new BuyerCollection();
		},
		render: function(id){
			$(this.el).html(template); //put in the html the handlebars script template
			document.title = "Agregar SafeBuyer";
			var compiledTemplate = Handlebars.compile($("#safe_buyer_template").html());
			
			this.buyerCollection.fetch({
				async : false,
				success : function(data) {
					debugger;
					//the model is now updated, put something else here.
				},
				error: function(data, response){
					debugger;
					alert("there is a problem trying to connect to the server");
				}
			});

			debugger;
			var htmlSafeBuyer = compiledTemplate(this.buyerCollection.models);
    		$(this.el).html(htmlSafeBuyer);
		}
	});
	
	return new SafeBuyerListView();
});
