let nomeEcognome;
let sesso;
let univerità;
let cap;
let studenteLavoratore;
let descrizione_del_lavoro_svolto;
function getView(){
	nomeEcognome=document.getElementById("nomeEcognome");
	sesso=document.getElementsByName("sesso");
	università=document.getElementById("università");
	cap=document.getElementById("cap");
	studenteLavoratore=document.getElementById("studenteLavoratore");
	descrizione_del_lavoro_svolto=document.getElementById("descrizione_del_lavoro_svolto");
}
function invia(){
	if(nomeEcognome.value=="")
		alert("Error 404: name and surname not found");
	if(università.options[università.selectedIndex].value=="")
		alert("Error 404: univerità not found");
	if(sesso.value=="")
		alert("Error 404: sesso not found");
}
function reset(){
	location.reload();
}
function ascoltoNomeCognome(){
	if(nomeEcognome.value=="")
		nomeEcognome.style.borderColor = "#ff0000";
	else
		nomeEcognome.style.removeProperty('border');
}
function ascoltoCap(){
	if(cap.value>100000||cap.value<9999||cap.value=="")
		cap.style.borderColor = "#ff0000";
	else
		cap.style.removeProperty('border');
}
function ascoltoUniversità(){
	if(università.value=="")
		università.style.borderColor = "#ff0000";
	else
		università.style.removeProperty('border');
}
function ascoltoSesso(){
	if(sesso.value=="")
		alert("Error: sesso not found");
}