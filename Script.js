function showSection(sectionId) {
let sections = document.getElementsByClassName("section");
for (let sec of sections) {
sec.style.display = "none";
}
document.getElementById(sectionId).style.display = "block";
}

function logout() {
alert("Logged Out!");
}
