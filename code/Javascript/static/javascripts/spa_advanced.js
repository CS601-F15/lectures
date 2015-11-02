function updatePage(){	
	var xhttp = new XMLHttpRequest();
  	xhttp.onreadystatechange = function() {
    	if (xhttp.readyState == 4 && xhttp.status == 200) {
    		var jsonObj = JSON.parse(xhttp.responseText);
      		document.getElementById("demo").innerHTML = jsonObj.count;
    	}
	  }

	xhttp.open("GET", "spa", true);
	xhttp.send();

}
setInterval(updatePage, 5000);