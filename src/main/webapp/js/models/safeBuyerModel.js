define([
  'underscore',
  'backbone'
], function(_, Backbone) {
  
  var SafeBuyerModel = Backbone.Model.extend({
	  urlRoot: 'rest/buyer'
	  //urlRoot: 'http://juanregala.com/rest/plan'
  });

  return SafeBuyerModel;

});