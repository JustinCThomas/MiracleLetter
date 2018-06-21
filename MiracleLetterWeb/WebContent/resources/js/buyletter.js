let templateChoice = document.querySelector("select[name='template-choice']");
let baseLetter = document.getElementById("base-letter");

let oceanimg = document.createElement("div");
oceanimg.classList.add("letter-design");
oceanimg.classList.add("ocean");

let skyimg = document.createElement("div");
skyimg.classList.add("letter-design");
skyimg.classList.add("sky");

let fruitbasketimg = document.createElement("div");
fruitbasketimg.classList.add("letter-design");
fruitbasketimg.classList.add("fruitbasket");


templateChoice.addEventListener("click", function(){
	console.log("clicked letter");
	displayTemplate(templateChoice.value);
});

function displayTemplate(choice){
	baseLetter.innerHTML = "";
	
	switch (choice) {
	case "ocean":
		baseLetter.appendChild(oceanimg);
		break;
	case "sky":
		baseLetter.appendChild(skyimg);
		break;
	case "fruitbasket":
		baseLetter.appendChild(fruitbasketimg);
		break;
	}
}
