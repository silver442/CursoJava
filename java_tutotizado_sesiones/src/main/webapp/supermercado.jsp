<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<html>
<style type="text/css">
.titcentrado {
	text-align: center;
}
</style>

<body bgcolor="#99CC66">
<h1 class="titcentrado">Carro de la compra (supuesto)</h1>
<form name="Formulario_Compra" action="supermercado.jsp">
 
  <p>Artículos a comprar:</p>
  <p>
    <label>
      <input type="checkbox" name="articulos" value="agua " >
      Agua </label>
    <br>
    <label>
      <input type="checkbox" name="articulos" value="leche" >
      Leche </label>
    <br>
     <label>
      <input type="checkbox" name="articulos" value="pan" >
      Pan </label>
    <br>
     <label>
      <input type="checkbox" name="articulos" value="mazanas" >
      Manzanas </label>
    <br>
     <label>
      <input type="checkbox" name="articulos" value="carne" >
      Carne </label>
      <br>
       <label>
      <input type="checkbox" name="articulos" value="pescado" >
      Pescado </label>
  </p>
  <p>
    <input type="submit" name="button" id="button" value="Enviar">
    <br>
  </p>
</form>

<h3>Carro de la compra virtual</h3>
<ul>
<%

	ArrayList<String> listaAlimentos=(ArrayList<String>)session.getAttribute("misAlimentos");

	if(listaAlimentos==null){
		
		listaAlimentos=new ArrayList<String>();
		
		session.setAttribute("misAlimentos", listaAlimentos);
	}

	String [] alimentos=request.getParameterValues("articulos");

	if(alimentos!=null){
		
		for(String alimentoAlCarro : alimentos){

			listaAlimentos.add(alimentoAlCarro);
			
			//out.println("<li>"+alimentoAlCarro+"</li>");
		}
	}
	
	for(String alimento: listaAlimentos){
		
		out.println("<li>"+alimento+"</li>");
	}
%>
</ul>

</body>

</html>