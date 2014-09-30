<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE HTML>
<html>
<head>
  <title>Registrar Comprador</title>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <link href="css/style.css" rel="stylesheet" type="text/css"  media="all" />
  <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css'>
 </head>
<body>
	<!----start-header----->
	 <div class="header">
	     <div class="wrap">
			<div class="top-header">
				<div class="logo">
					<a href="index.html"><img src="Images/logo.png" title="logo" /></a>
				</div>
				<div class="social-icons">
					<ul>
						<li><a href="#"><img src="Images/facebook.png" title="facebook" /></a></li>
						<li><a href="#"><img src="Images/twitter.png" title="twitter" /></a></li>
						<li><a href="#"><img src="Images/google.png" title="google pluse" /></a></li>
					</ul>
				</div>
				<div class="clear"> </div>
			</div>
			<!---start-top-nav---->
			<div class="top-nav">
				<div class="top-nav-left">
					<ul>
						<li><a href="registrarComprador.html">Home</a></li>
						<li><a href="registrarComprador.html">PROMOCIONes</a></li>
						<li><a href="registrarComprador.html">BUSQUEDA</a></li>
						<li><a href="registrarComprador.html">sERVICIOS</a></li>
						<li class="active"><a href="registrarComprador.html">rEGISTRO</a></li>
						<div class="clear"> </div>
					</ul>
             </div>
				<div class="top-nav-right">
					<div class="telephone">
                    <a href="Tel:3002345679" rel="external">
					<span><i class="phone_img"><img src="images/phone.png" alt="" /></i></span><span class="number">(300) 234-5678</span></a>
					</div>
			     </div>
				<div class="clear"> </div>
			</div>
			<!---End-top-nav---->
		</div>
	</div>
   <!----End-header----->
		 <!---start-content---->
		 <form method="POST" action="registerBuyerAction.html">
		    <div class="contact_desc">
		        <div class="wrap">
			         <div class="contact-form">
				  	   <h2>REGISTRO DE USUARIOS CON CAMBIO EN CLASE EAFIT</h2>
					     <div class="left_form">
					    	<div>
						    	<span>
			    	      <label>NOMBRE USUARIO</label></span>
						    	<span><input name="user" type="text" class="textbox"></span>
						    </div>
						    <div>
						    	<span>
						    	<label>NOMBRE</label></span>
						    	<span><input name="name" type="text" class="textbox"></span>
						    </div>
						    <div>
						     	<span>
						     	<label>APELLIDO</label></span>
                                <span><input name="lastName" type="text" class="textbox"></span>
						        <div><span>
						          <label>FECHA DE NACIMIENTO</label>
						          </span> <span>
						            <input name="birthDay" type="text" class="textbox">
						            </span></div>
                                <div> <span>
                                  <label>E-MAIL</label>
                                  </span> <span>
                                    <input name="email" type="text" class="textbox">
                                  </span></div>
						    </div>
					    </div>
					    <div class="right_form">
					      <div><span>
				          <label>PREFERENCIAS</label></span></div>
                          <div> <span>
                          <label>
                            <input type="checkbox" name="codigoNotificacionEnvio3" id="codigoNotificacionEnvio3">
                            Promociones Confama
                          </label>
                          </span></div>
                          <div> 
                            <p><span>
                              <input type="checkbox" name="codigoNotificacionEnvio" id="codigoNotificacionEnvio">
                            <label>Promociones VISA</label>
                            </span>                          </p>
                          </div>
<div>
  <div>
    <p><span>
      <input type="checkbox" name="codigoNotificacionEnvio4" id="codigoNotificacionEnvio4">
      <label>Promociones American Express</label>
    </span></p>
  </div>
  <div>
    <p><span>
      <input type="checkbox" name="codigoNotificacionEnvio5" id="codigoNotificacionEnvio5">
      <label>Centro comercial Santa Fe</label>
    </span></p>
  </div>
  <div>
    <p><span>
      <input type="checkbox" name="codigoNotificacionEnvio6" id="codigoNotificacionEnvio6">
      <label>Centro comercial Oviedo</label>
    </span></p>
  </div>
  <div>
    <p><span>
      <input type="checkbox" name="codigoNotificacionEnvio7" id="codigoNotificacionEnvio7">
      <label>Centro comercial El tesoro</label>
    </span></p>
  </div>
  <div>
    <p><span>
      <input type="checkbox" name="codigoNotificacionEnvio8" id="codigoNotificacionEnvio8">
      <label>Centro comercial Los Molinos</label>
    </span></p>
  </div>
  <div>
    <p><span>
      <input type="checkbox" name="codigoNotificacionEnvio9" id="codigoNotificacionEnvio9">
      <label>Centro comercial Unicentro</label>
    </span></p>
  </div>
  <div>
    <p><span>
      <input type="checkbox" name="codigoNotificacionEnvio10" id="codigoNotificacionEnvio10">
      <label>Centro comercial San Diego</label>
    </span></p>
  </div>
  <div> <span>AUTORIZACION ENVIO NOTIFICACIONES
    <input type="checkbox" name="codigoNotificacionEnvio2" id="codigoNotificacionEnvio2">
</span></div>
  <span class="clear">
  <input name="Enviar" type="submit" class="myButton" value="Registrar" id="sendButton">
  </span></div>
				       </div>
					    
				  </div>
	              <p>&nbsp;</p>
	              <p>&nbsp;</p>
			      <div class="content_bottom"></div>
		        </div>
		    </div>
		    </form>
		 <!---start-footer---->
		  <div class="footer">
		    <div class="wrap"> 
			   <div class="footer-grid">
				<h3>Promociones </h3>
				       <div class="address">
					     <ul>
<li>15% de descuento por pago con tarjeta Comfama en Santafé,</li>
<li>25% en frutas y verduras con tu tarjeta Exito.</li>
						  	   <li>2X1 en mimo´s con tu tarjeta VISA</li>
						  	   <li></li>
					     </ul>
			        </div>
			   </div>
			<div class="footer-grid twitts">
				<h3>ULTIMOS Tweets</h3>
				<p>
				  <label>@Internauta:</label>
Ha sido realmente útil ubicar lo que deseaba comprar utilizando esta aplicación. </p>
				<span>Hace 10 minutos...</span>
		        <p>
		          <label>@fercho1689: De mucha ayuda SafeBuy.</label>
		        </p>
				<span>Hace 15 minutos...</span>
			</div>
			<div class="footer-grid center-grid">
			  <h3>tips</h3>
				<ul>
					<li><a href="#">- Compra en sitios reconocidos, certificados y seguros.</a></li>
					<li><a href="#">- Utiliza los beneficios obtenidos para comprar.</a></li>
					<li></li>
				</ul>
			</div>		
			<div class="footer-grid">
				<h3>SABIAS QUE...</h3>
				<p>SafeBuy te ofrece información disponible para que aproveches las ofertas y oportunidades comerciales que te ayudarán a ahorrar dinero en tus compras.</p>
			</div>
			<div class="clear"> </div>
		</div>
	</div>
	<div class="copy-right">
		<p>Design by <a href="http://w3layouts.com/"> W3layouts</a></p>
	</div>
		 <!---End-footer---->
	</body>
</html>
