let envelopeType = document.querySelector("select[name='envelope-type']");
let baseEnvelope = document.getElementById("base-envelope");

let windowScreen1 = document.createElement("div");
windowScreen1.classList.add("window");

let windowScreen2 = document.createElement("div");
windowScreen2.classList.add("window");

let windowScreen3 = document.createElement("div");
windowScreen3.classList.add("window");


let whiteEnvelope = document.createElement("div");
whiteEnvelope.classList.add("envelope");
whiteEnvelope.classList.add("white");

let whiteEnvelopeWindow = document.createElement("div");
whiteEnvelopeWindow.classList.add("envelope");
whiteEnvelopeWindow.classList.add("white");
whiteEnvelopeWindow.appendChild(windowScreen1);


let blueEnvelope = document.createElement("div");
blueEnvelope.classList.add("envelope");
blueEnvelope.classList.add("blue");

let blueEnvelopeWindow = document.createElement("div");
blueEnvelopeWindow.classList.add("envelope");
blueEnvelopeWindow.classList.add("blue");
blueEnvelopeWindow.appendChild(windowScreen2);


let redEnvelope = document.createElement("div");
redEnvelope.classList.add("envelope");
redEnvelope.classList.add("red");

let redEnvelopeWindow = document.createElement("div");
redEnvelopeWindow.classList.add("envelope");
redEnvelopeWindow.classList.add("red");
redEnvelopeWindow.appendChild(windowScreen3);



envelopeType.addEventListener("click", function(){
	console.log("clicked envelope");
	displayEnvelope(envelopeType.value);
});


function displayEnvelope(choice){
	baseEnvelope.innerHTML = "";
	switch(choice){
	case "white":
		baseEnvelope.appendChild(whiteEnvelope);
		break;
	case "white-window":
		baseEnvelope.appendChild(whiteEnvelopeWindow);
		break;
	case "blue":
		baseEnvelope.appendChild(blueEnvelope);
		break;
	case "blue-window":
		baseEnvelope.appendChild(blueEnvelopeWindow);
		break;
	case "red":
		baseEnvelope.appendChild(redEnvelope);
		break;
	case "red-window":
		baseEnvelope.appendChild(redEnvelopeWindow);
		break;
	}
}