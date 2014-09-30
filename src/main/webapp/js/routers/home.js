define([
	'jquery', 
	'backbone', 
	'underscore', 
	'views/view',
	'views/safeBuyerView',
	'views/headerView',
	'views/footerView',
	'views/safeBuyerListView'
], 
function($, Backbone, _, mainView, safeBuyerView, headerView, footerView, safeBuyerListView){
	var Router = Backbone.Router.extend({
		initialize: function(){
			this.mainView = mainView;
			this.safeBuyerView = safeBuyerView;
			this.headerView = headerView;
			this.footerView = footerView;
			this.safeBuyerListView = safeBuyerListView;
			this.headerView.render();
			this.footerView.render();
			Backbone.history.start();
		},
		routes: {
			'': 'home',
			'addSafeBuyer' : 'addSafeBuyer',
			'editSafeBuyer/:id' : 'addSafeBuyer', //the same as "addSafeBuyer" but with it has an "id" parameter
			'safeBuyerList' : 'safeBuyerList',
			// Default
			'*actions' : 'home'
		},
		'home': function(){
			this.mainView.render();
		},
		'addSafeBuyer': function(id){
			this.safeBuyerView.render(id);
		},
		'safeBuyerList': function(){
			this.safeBuyerListView.render();
		}
		
	});
	
	return Router;
});
