let nomeEcognome;
let sesso;
let univerità;
let cap;
let studenteLavoratore;
let descrizione_del_lavoro_svolto;
function get(){
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
}
function reset(){
	location.reload();
}
function ascoltoNomeCognome(){
	if(nomeEcognome.value=="")
		alert("Error: name not found");
}
function ascoltoCap(){
	if(cap.value>=100000&&cap.value<=9999)
		alert("Error: cap not valid");
}
function ascoltoUniversità(){
	if(università.options[università.selectedIndex].value=="")
		alert("Error: università not found");
}