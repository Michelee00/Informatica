let nome;
let cognome;
let luogo_di_nascita;
let sesso;
let data_di_nascita;
let codiceFiscale="";
function myFunction(){
	nome=document.getElementById("nome").value;
	cognome=document.getElementById("cognome").value;
	luogo_di_nascita=document.getElementById("luogo_di_nascita").value;
	sesso=document.getElementById("sesso").value;
	data_di_nascita=document.getElementById("data_di_nascita").value;
}
function cognome(){
	cognome=cognome.toUpperCase();
	for (let i=0; i<cognome.length()&&codiceFiscale.length()<3; i++) {
		if(cognome.charAt(i)!=='A'&&cognome.charAt(i)!=='E'&&cognome.charAt(i)!=='I'&&cognome.charAt(i)!=='O'&&cognome.charAt(i)!=='U'){
			codiceFiscale+=cognome.charAt(i);
		}
	}
}
function nome(){
	nome=nome.toUpperCase();
	let nome1="";
	for (let i=0; i<nome.length(); i++) {
		if(nome.charAt(i)!=='A'&&nome.charAt(i)!=='E'&&nome.charAt(i)!=='I'&&nome.charAt(i)!=='O'&&nome.charAt(i)!=='U'){
			nome1+=nome.charAt(i);
		}
	}
	if(nome1.length()>2){
		codiceFiscale+=nome1.charAt(0)+nome1.charAt(2)+nome1.charAt(2);
	}else{
		codiceFiscale+=nome1;
	}
}
function anno(){
	codiceFiscale+=anno.substring(2, 4);
}
function mese(){
	switch(mese){
		case 1: codiceFiscale+="A"; break;
		case 2: codiceFiscale+="B"; break;
		case 3: codiceFiscale+="C"; break;
		case 4: codiceFiscale+="D"; break;
		case 5: codiceFiscale+="E"; break;
		case 6: codiceFiscale+="H"; break;
		case 7: codiceFiscale+="L"; break;
		case 8: codiceFiscale+="M"; break;
		case 9: codiceFiscale+="P"; break;
		case 10: codiceFiscale+="R"; break;
		case 11: codiceFiscale+="S"; break;
		case 12: codiceFiscale+="T"; break;
	}
}
function giorno(){
	if(sesso.toUpperCase().equals("FEMMINA")){
		giorno+=40;
		codiceFiscale+=giorno;
	}else{
		codiceFiscale+=giorno;
	}
}
function comune(){
	
}
function controllo(){
	
}