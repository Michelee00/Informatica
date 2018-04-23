let nome;
let cognome;
let matricola;
let regione_di_residenza;
let email;
let telefono;
let richieste_particolari;
function get(){
	nome=document.getElementById("nome");
	cognome=document.getElementById("cognome");
	matricola=document.getElementById("matricola");
	//regione_di_residenza=document.getElementById("regione_di_residenza").value;
	email=document.getElementById("email");
	telefono=document.getElementById("telefono");
	richieste_particolari=document.getElementById("richieste_particolari");
}
function invia(){
	if(cognome.value=="")
		alert("Error 404: surname not found");
	if(nome.value=="")
		alert("Error 404 : name not found");
	if(telefono.value==0)
		alert("Error 404: number not found");
	if(email.value=="")
		alert("Error 404: email not found");
	if(telefono.value=="")
		alert("Error 404: number not found");
}
function reset(){
	
}
