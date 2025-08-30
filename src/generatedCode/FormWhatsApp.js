class AppComponent {
createAppStructure() {
this.appContainer = document.getElementById('app');
const header = document.createElement('div');
header.innerHTML = ``;
this.appContainer.appendChild(header);
this.container = document.createElement('div');
this.container.className = 'container';
this.appContainer.appendChild(this.container);
this.form = document.createElement('div');
this.form.className = 'form';
this.container.appendChild(this.form);
}
renderform() {
this.form.innerHTML = `
<form class="form" id="form" >
<div class = "label">
<label for="phone_numberInput">phone_number</label>
<input  type="text" name="phone_number" class="form-input" required  placeholder="Enter phone_number" id="phone_numberInput" >
<div class="form-error" id="phone_numberError"></div>
</div>
<button type="submit" class="btn" id="submitBtn" >
send
</button>
</form>
`;
document.getElementById('phone_numberInput').addEventListener('input', this.validateForm.bind(this));
document.getElementById('form').addEventListener('submit', (e) => {
//e.preventDefault();
this.onSubmit();
});
}
validateForm() {
let isValid = true;
const phone_number = document.getElementById('phone_numberInput').value.trim();
const phone_numberError = document.getElementById('phone_numberError');
if(!phone_number){
phone_numberError.style.display = 'block';
isValid = false;
} else {
phone_numberError.style.display = 'none';
}
return isValid;
}

render() {
this.renderform()
}
onSubmit() {
const phone_numberInput = document.getElementById('phone_numberInput');
const phone_number = phone_numberInput.value.trim();
const newcars = {
phone_number,
};
const index = this.cars.findIndex(car => car.id === this.selectedCarToSend);
const message = JSON.stringify(this.cars[index], null, 2);
const encodedMessage = encodeURIComponent(message);
const Url = `https://api.whatsapp.com/send/?phone=${newcars.phone_number}&text=${encodedMessage}`;
window.open(Url, '_blank');
event.stopPropagation();
}
}
document.addEventListener('DOMContentLoaded', () => {
const app = new AppComponent();
app.createAppStructure();
const cars = localStorage.getItem('cars');
if(cars) {
app.cars = JSON.parse(cars);
}
const carJson = sessionStorage.getItem('selectedCarToSend');
if(carJson) {
app.selectedCarToSend = JSON.parse(carJson);
}
app.render();
});