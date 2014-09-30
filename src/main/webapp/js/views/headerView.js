define([
		'jquery', 
		'backbone',
		'underscore', 
		'models/model',
		'text!templates/header.html'], 
function($, Backbone, _, model, template){
	var HeaderView = Backbone.View.extend({
		el: '#header',
		initialize: function(){
			this.template = template;
		},
		render: function(){
			$(this.el).html( this.template );
		}
	});
	
	return new HeaderView();
});