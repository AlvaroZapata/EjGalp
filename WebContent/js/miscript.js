/**
 * 
 */


$(document).ready(function() {
    
	$("form").hide();
	
	$( "main > div > div > button" ).on("click", function() {
		$(this).parent().find('form').toggle();	
	});
	
	/*
	$( "#botonefectivo" ).on("click", function() {
		$("#formuefectivo").toggle();	
	});
	*/
	
	
	
			
});
