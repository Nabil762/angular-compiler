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
<label for="car_nameInput">car_name</label>
<input  type="text" name="car_name" class="form-input" required  placeholder="Enter car_name" id="car_nameInput" >
<div class="form-error" id="car_nameError"></div>
</div>
<div class = "label">
<label for="car_imageInput">car_image</label>
<input  type="file" name="car_image" class="form-input" required  placeholder="Enter car_image" id="car_imageInput" >
<div class="form-error" id="car_imageError"></div>
</div>
<div class = "label">
<label for="car_priceInput">car_price</label>
<input  type="text" name="car_price" class="form-input" required  placeholder="Enter car_price" id="car_priceInput" >
<div class="form-error" id="car_priceError"></div>
</div>
<div class = "label">
<label for="car_brandInput">car_brand</label>
<input  type="text" name="car_brand" class="form-input" required  placeholder="Enter car_brand" id="car_brandInput" >
<div class="form-error" id="car_brandError"></div>
</div>
<div class = "label">
<label for="car_modelInput">car_model</label>
<input  type="text" name="car_model" class="form-input" required  placeholder="Enter car_model" id="car_modelInput" >
<div class="form-error" id="car_modelError"></div>
</div>
<div class = "label">
<label for="car_yearInput">car_year</label>
<input  type="text" name="car_year" class="form-input" required  placeholder="Enter car_year" id="car_yearInput" >
<div class="form-error" id="car_yearError"></div>
</div>
<div class = "label">
<label for="car_categoryInput">car_category</label>
<input  type="text" name="car_category" class="form-input" placeholder="Enter car_category" id="car_categoryInput" >
<div class="form-error" id="car_categoryError"></div>
</div>
<div class = "label">
<label for="car_colorInput">car_color</label>
<input  type="text" name="car_color" class="form-input" required  placeholder="Enter car_color" id="car_colorInput" >
<div class="form-error" id="car_colorError"></div>
</div>
<div class = "label">
<label for="car_engin_sizeInput">car_engin_size</label>
<input  type="text" name="car_engin_size" class="form-input" placeholder="Enter car_engin_size" id="car_engin_sizeInput" >
<div class="form-error" id="car_engin_sizeError"></div>
</div>
<div class = "label">
<label for="car_engin_typeInput">car_engin_type</label>
<input  type="text" name="car_engin_type" class="form-input" required  placeholder="Enter car_engin_type" id="car_engin_typeInput" >
<div class="form-error" id="car_engin_typeError"></div>
</div>
<div class = "label">
<label for="car_horsepowerInput">car_horsepower</label>
<input  type="text" name="car_horsepower" class="form-input" required  placeholder="Enter car_horsepower" id="car_horsepowerInput" >
<div class="form-error" id="car_horsepowerError"></div>
</div>
<div class = "label">
<label for="car_descriptionInput">car_description</label>
<input  type="text" name="car_description" class="form-input" placeholder="Enter car_description" id="car_descriptionInput" >
<div class="form-error" id="car_descriptionError"></div>
</div>
<button type="submit" class="btn" id="submitBtn" >
<svg xmlns="http://www.w3.org/2000/svg" width="20" height="20" fill="currentColor" viewBox="0 0 16 16" style="margin-left: 8px">
<path d="M8 4a.5.5 0 0 1 .5.5v3h3a.5.5 0 0 1 0 1h-3v3a.5.5 0 0 1-1 0v-3h-3a.5.5 0 0 1 0-1h3v-3A.5.5 0 0 1 8 4z"/>
</svg>
ADD
</button>
</form>
`;
document.getElementById('car_nameInput').addEventListener('input', this.validateForm.bind(this));
document.getElementById('car_imageInput').addEventListener('input', this.validateForm.bind(this));
document.getElementById('car_priceInput').addEventListener('input', this.validateForm.bind(this));
document.getElementById('car_brandInput').addEventListener('input', this.validateForm.bind(this));
document.getElementById('car_modelInput').addEventListener('input', this.validateForm.bind(this));
document.getElementById('car_yearInput').addEventListener('input', this.validateForm.bind(this));
document.getElementById('car_categoryInput').addEventListener('input', this.validateForm.bind(this));
document.getElementById('car_colorInput').addEventListener('input', this.validateForm.bind(this));
document.getElementById('car_engin_sizeInput').addEventListener('input', this.validateForm.bind(this));
document.getElementById('car_engin_typeInput').addEventListener('input', this.validateForm.bind(this));
document.getElementById('car_horsepowerInput').addEventListener('input', this.validateForm.bind(this));
document.getElementById('car_descriptionInput').addEventListener('input', this.validateForm.bind(this));
document.getElementById('form').addEventListener('submit', (e) => {
//e.preventDefault();
this.onSubmit();
});
}
validateForm() {
let isValid = true;
const car_name = document.getElementById('car_nameInput').value.trim();
const car_nameError = document.getElementById('car_nameError');
if(!car_name){
car_nameError.style.display = 'block';
isValid = false;
} else {
car_nameError.style.display = 'none';
}
const car_image = document.getElementById('car_imageInput').value.trim();
const car_imageError = document.getElementById('car_imageError');
if(!car_image){
car_imageError.style.display = 'block';
isValid = false;
} else {
car_imageError.style.display = 'none';
}
const car_price = document.getElementById('car_priceInput').value.trim();
const car_priceError = document.getElementById('car_priceError');
if(!car_price){
car_priceError.style.display = 'block';
isValid = false;
} else {
car_priceError.style.display = 'none';
}
const car_brand = document.getElementById('car_brandInput').value.trim();
const car_brandError = document.getElementById('car_brandError');
if(!car_brand){
car_brandError.style.display = 'block';
isValid = false;
} else {
car_brandError.style.display = 'none';
}
const car_model = document.getElementById('car_modelInput').value.trim();
const car_modelError = document.getElementById('car_modelError');
if(!car_model){
car_modelError.style.display = 'block';
isValid = false;
} else {
car_modelError.style.display = 'none';
}
const car_year = document.getElementById('car_yearInput').value.trim();
const car_yearError = document.getElementById('car_yearError');
if(!car_year){
car_yearError.style.display = 'block';
isValid = false;
} else {
car_yearError.style.display = 'none';
}
const car_color = document.getElementById('car_colorInput').value.trim();
const car_colorError = document.getElementById('car_colorError');
if(!car_color){
car_colorError.style.display = 'block';
isValid = false;
} else {
car_colorError.style.display = 'none';
}
const car_engin_type = document.getElementById('car_engin_typeInput').value.trim();
const car_engin_typeError = document.getElementById('car_engin_typeError');
if(!car_engin_type){
car_engin_typeError.style.display = 'block';
isValid = false;
} else {
car_engin_typeError.style.display = 'none';
}
const car_horsepower = document.getElementById('car_horsepowerInput').value.trim();
const car_horsepowerError = document.getElementById('car_horsepowerError');
if(!car_horsepower){
car_horsepowerError.style.display = 'block';
isValid = false;
} else {
car_horsepowerError.style.display = 'none';
}
return isValid;
}

render() {
this.renderform()
}
onSubmit() {
const car_imageInput = document.getElementById('car_imageInput');
const car_image = car_imageInput.files?.[0];
const car_nameInput = document.getElementById('car_nameInput');
const car_name = car_nameInput.value.trim();
const car_priceInput = document.getElementById('car_priceInput');
const car_price = car_priceInput.value.trim();
const car_brandInput = document.getElementById('car_brandInput');
const car_brand = car_brandInput.value.trim();
const car_modelInput = document.getElementById('car_modelInput');
const car_model = car_modelInput.value.trim();
const car_yearInput = document.getElementById('car_yearInput');
const car_year = car_yearInput.value.trim();
const car_categoryInput = document.getElementById('car_categoryInput');
const car_category = car_categoryInput.value.trim();
const car_colorInput = document.getElementById('car_colorInput');
const car_color = car_colorInput.value.trim();
const car_engin_sizeInput = document.getElementById('car_engin_sizeInput');
const car_engin_size = car_engin_sizeInput.value.trim();
const car_engin_typeInput = document.getElementById('car_engin_typeInput');
const car_engin_type = car_engin_typeInput.value.trim();
const car_horsepowerInput = document.getElementById('car_horsepowerInput');
const car_horsepower = car_horsepowerInput.value.trim();
const car_descriptionInput = document.getElementById('car_descriptionInput');
const car_description = car_descriptionInput.value.trim();
const reader = new FileReader();
reader.onload = (e) => { 
const newcars = {
id: this.nextId++,
car_image: e.target.result,
car_name,
car_price,
car_brand,
car_model,
car_year,
car_category,
car_color,
car_engin_size,
car_engin_type,
car_horsepower,
car_description,
};
this.cars.push(newcars);
localStorage.setItem('cars', JSON.stringify(this.cars));
event.stopPropagation();
if (confirm('success added cars Do you want to show List cars?')) {
window.location.href = 'ListCarWithDetails.html';
}}
reader.readAsDataURL(car_image);

}
}
document.addEventListener('DOMContentLoaded', () => {
const app = new AppComponent();
app.createAppStructure();
const stored = localStorage.getItem('cars');
if (stored) {
app.cars = JSON.parse(stored);
app.nextId = app.cars.length > 0
? Math.max(...app.cars.map(p => p.id)) + 1
: 1;
}
app.render();
});