<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.main
{
width: 1100px;
height: 650px;
border: 1px solid #000000;
background-color: #dde4ea;
margin-left: auto;
margin-right: auto;



}

#section_name_div
{
width: 270px;
height: 24px;
border: 1px solid #000000;

position:absolute;
margin-left: 1px;
}


#icon_div
{

width: 290px;
height: 24px;
border: 1px solid #000000;
margin-left: 791px;

}
.region{

width: 290px;
height: 50px;
border: 1px solid #000;
margin-left: 1px;
margin-top: 5px;
}

.ss
{
width: 150px;
font-size:18px; 
}



.matrixcontainer
{

width: 800px;
height: 400px;
border: 1px solid #000;
margin-top: 20px;
margin-left: auto;
margin-right: auto;
}
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>


<script type="text/javascript">











function saveData()
{

	var dataval={"section_name":$("#section_name" ).val(),"region":$("select#region" ).val()};
	
	
	
	$.ajax({
	    type: 'POST',
	    
	    url: '/addData',
	    data: dataval,
	    success: function(msg){
	        alert('wow' + msg);
	    }
	}); 
	
	
}


</script>

</head>
<body>
<form action="/addData"  ModelAttribute="addDetails" method="post">
<div class="main">

<div id="section_name_div">
<label>Section Name</label>
<input  name=section_name  id="section_name"  type="text"/>
</div>

<div id="icon_div">
<label>Icon</label>
<input  name="icon"  id="icon" type="file"/>
</div>


<div class="region" >
<label>Aplication Region</label>
<select class="ss" name="region" id="region" >
<option value="latam">latam</option>
<option value="apac">apac</option>
<option value="power">power</option>
<option value="admin">admin</option>
</select>

</div>




<div  class="matrixcontainer">

<table border="1">
<tr>
<td>Metrics Name</td>
<td>ColorCode</td>
<td>Axis</td>
<td>ViewType</td>
 </tr>
 
 <tr>
<td>
<label>1. </label><input type="text" id="metricName1" name="metricName1" class="form-control" placeholder="Enter metric name">
</td>
<td><input type="color" id="colorCode1" name="colorCode1" class="form-control"></td>
<td><select id="axis1" name="axis1" class="form-control">
						    		<option value="">Please Select</option>
						    		<option value="X">X - Axis</option>
						    		<option value="Y">Y - Axis</option>
						    	</select></td>
<td><select id="viewType1" name="viewType1" class="form-control">
						    		<option value="">Please Select</option>
						    		<option value="Graph Line Table">Graph Line Table</option>
						    		<option value="Graph Bar Table">Graph Bar Table</option>
						    		<option value="Table">Table</option>
						    	</select></td>
 </tr>
 
 
 
 
 <tr>
<td>
<label>2. </label><input type="text" id="metricName2" name="metricName2" class="form-control" placeholder="Enter metric name">
</td>
<td><input type="color" id="colorCode2" name="colorCode2" class="form-control"></td>
<td><select id="axis2" name="axis2" class="form-control">
						    		<option value="">Please Select</option>
						    		<option value="X">X - Axis</option>
						    		<option value="Y">Y - Axis</option>
						    	</select></td>
<td><select id="viewType2" name="viewType2" class="form-control">
						    		<option value="">Please Select</option>
						    		<option value="Graph Line Table">Graph Line Table</option>
						    		<option value="Graph Bar Table">Graph Bar Table</option>
						    		<option value="Table">Table</option>
						    	</select></td>
 </tr>
 
 
 
 <tr>
<td>
<label>3. </label><input type="text" id="metricName3" name="metricName3" class="form-control" placeholder="Enter metric name">
</td>
<td><input type="color" id="colorCode2" name="colorCode3" class="form-control"></td>
<td><select id="axis2" name="axis3" class="form-control">
						    		<option value="">Please Select</option>
						    		<option value="X">X - Axis</option>
						    		<option value="Y">Y - Axis</option>
						    	</select></td>
<td><select id="viewType3" name="viewType3" class="form-control">
						    		<option value="">Please Select</option>
						    		<option value="Graph Line Table">Graph Line Table</option>
						    		<option value="Graph Bar Table">Graph Bar Table</option>
						    		<option value="Table">Table</option>
						    	</select></td>
 </tr>
</table>




<input type="submit" value="Save Data">

<button type="button"   id="savebutton"  onclick="saveData()"> Save Me</button>


</div>









</div>


</form>




</body>
</html>