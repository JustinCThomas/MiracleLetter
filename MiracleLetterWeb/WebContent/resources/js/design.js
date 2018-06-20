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

let textarea1 = document.createElement("textarea");
textarea1.classList.add("float-left");
let textarea2 = document.createElement("textarea");
textarea2.classList.add("float-right");


templateChoice.addEventListener("click", function(){
	console.log("clicked");
	displayTemplate(templateChoice.value);
});

function displayTemplate(choice){
	baseLetter.innerHTML = "";
	switch (choice) {
	case "ocean":
		baseLetter.appendChild(oceanimg);
		oceanimg.appendChild(textarea1);
		oceanimg.appendChild(textarea2);
		break;
	case "sky":
		baseLetter.appendChild(skyimg);
		skyimg.appendChild(textarea1);
		skyimg.appendChild(textarea2);
		break;
	case "fruitbasket":
		baseLetter.appendChild(fruitbasketimg);
		fruitbasketimg.appendChild(textarea1);
		fruitbasketimg.appendChild(textarea2);
		break;
	}
}
