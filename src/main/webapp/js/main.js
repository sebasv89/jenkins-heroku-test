// This set's up the module paths for underscore and backbone
require.config({ 
    'paths': { 
		"jquery" : "libs/jquery-1.9.0.min",
		"underscore": "libs/underscore-min", 
		"backbone": "libs/backbone-min",
		"handlebars": 'libs/handlebars/handlebars-amd',
	},
	'shim': 
	{
		backbone: {
			'deps': ['jquery', 'underscore'],
			'exports': 'Backbone'
		},
		underscore: {
			'exports': '_'
		}
	}	
}); 

require([
	'underscore',
	'backbone',
	'app'
	], 
	function(_, Backbone, app){
		app.init();
});
