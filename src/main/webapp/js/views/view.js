define([
		'jquery', 
		'backbone',
		'underscore', 
		'models/model',
		'text!templates/main.html'], 
function($, Backbone, _, model, template){
	var View = Backbone.View.extend({
		el: '#container',
		initialize: function(){
			this.model = new model({
				message: 'Hello World'
			});
			this.template = _.template( template, { model: this.model.toJSON() } );
		},
		render: function(){
			$(this.el).html( this.template );
		}
	});
	
	return new View();
});
