let inputLenght = 0;
let combinazione = [];
let colori = [0,1,2];
let haPerso = false;
let lvl=0;
let canPlay = false;

async function play(){
    let colore = parseInt(Math.random()*colori.length);
    combinazione.push(colore);
    for(var i=0; i<combinazione.length; i++){
        resetColori();
        await wait(100);
        coloraCurrent(combinazione[i]);
        await wait(200);
    }
    resetColori();
    console.log(combinazione.length);
	lvl++;
	canPlay = true;
    inputLenght = 0;
    document.getElementById("lvl").innerHTML = "Livello raggiunto: "+lvl;
}

function nextColore(){
    coloraCurrent(colore);
    nColori--;
}

function coloraCurrent(nColore){
    if(nColore==0){
        document.getElementById("red").style.fill = "red";
    } else if(nColore==1){
        document.getElementById("green").style.fill = "green";
    } else if(nColore==2){
        document.getElementById("blue").style.fill = "blue";
    }
}

function resetColori(nColore){
    document.getElementById("red").style.fill = "white";
    document.getElementById("green").style.fill = "white";
    document.getElementById("blue").style.fill = "white";
}

async function checkCombinazione(nColore){
    if(canPlay){
        coloraCurrent(nColore);

        if(nColore != combinazione[inputLenght]){
            document.getElementById("wl").innerHTML = "Hai perso!";
            combinazione.length = 0;
        } else inputLenght++;

        resetColori();

        if(inputLenght >= combinazione.length){
            canPlay = false;
            play();
            return;
        }
    }
}

function wait(time) {
    return new Promise(resolve => {
        setTimeout(() => {
        resolve();
    }, time);
});
}
function reset(){
	location.reload();
}