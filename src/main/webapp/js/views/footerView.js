define([
		'jquery', 
		'backbone',
		'underscore', 
		'models/model',
		'text!templates/footer.html'], 
function($, Backbone, _, model, template){
	var FooterView = Backbone.View.extend({
		el: '#footer',
		initialize: function(){
			//
			this.template = template;
		},
		render: function(){
			$(this.el).html( this.template );
		}
	});
	
	return new FooterView();
});