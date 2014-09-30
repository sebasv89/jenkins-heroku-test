define([
  'jquery',
  'underscore',
  'backbone',
  'models/safeBuyerModel'
], function($, _, Backbone, SafeBuyerModel){
  var BuyerCollection = Backbone.Collection.extend({
    model: SafeBuyerModel,
    url: 'rest/buyer',
    
    initialize: function(){
    }

  });
 
  return BuyerCollection;
});