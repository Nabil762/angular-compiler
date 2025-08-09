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
<label for="nameInput">name</label>
<input  type="text" name="name" class="form-input" placeholder="Enter name" id="nameInput" required>
<div class="form-error" id="nameError"></div>
</div>
<div class = "label">
<label for="imageInput">image</label>
<input  type="text" name="image" class="form-input" placeholder="Enter image" id="imageInput" required>
<div class="form-error" id="imageError"></div>
</div>
<div class = "label">
<label for="descriptionInput">description</label>
<input  type="text" name="description" class="form-input" placeholder="Enter description" id="descriptionInput" required>
<div class="form-error" id="descriptionError"></div>
</div>
<button type="submit" class="btn" id="submitBtn" >
<svg xmlns="http://www.w3.org/2000/svg" width="20" height="20" fill="currentColor" viewBox="0 0 16 16" style="margin-left: 8px">
<path d="M8 4a.5.5 0 0 1 .5.5v3h3a.5.5 0 0 1 0 1h-3v3a.5.5 0 0 1-1 0v-3h-3a.5.5 0 0 1 0-1h3v-3A.5.5 0 0 1 8 4z"/>
</svg>
ADD
</button>
</form>
`;
document.getElementById('nameInput').addEventListener('input', this.validateForm.bind(this));
document.getElementById('imageInput').addEventListener('input', this.validateForm.bind(this));
document.getElementById('descriptionInput').addEventListener('input', this.validateForm.bind(this));
document.getElementById('form').addEventListener('submit', (e) => {
//e.preventDefault();
this.onSubmit();
});
}
validateForm() {
let isValid = true;
const name = document.getElementById('nameInput').value.trim();
const nameError = document.getElementById('nameError');
if(!name){
nameError.style.display = 'block';
isValid = false;
} else {
nameError.style.display = 'none';
}
const image = document.getElementById('imageInput').value.trim();
const imageError = document.getElementById('imageError');
if(!image){
imageError.style.display = 'block';
isValid = false;
} else {
imageError.style.display = 'none';
}
const description = document.getElementById('descriptionInput').value.trim();
const descriptionError = document.getElementById('descriptionError');
if(!description){
descriptionError.style.display = 'block';
isValid = false;
} else {
descriptionError.style.display = 'none';
}
return isValid;
}

render() {
this.renderform()
}
onSubmit() {
const imageInput = document.getElementById('imageInput');
const image = imageInput.value.trim();
const nameInput = document.getElementById('nameInput');
const name = nameInput.value.trim();
const descriptionInput = document.getElementById('descriptionInput');
const description = descriptionInput.value.trim();
const newproducts = {
id: this.nextId++,
image,
name,
description,
};
this.products.push(newproducts);
localStorage.setItem('products', JSON.stringify(this.products));
event.stopPropagation();
if (confirm('success added products\n Do you want to show List products?')) {
setTimeout(() => {
window.location.href = 'Products.html';
}, 0);
}}
}
document.addEventListener('DOMContentLoaded', () => {
const app = new AppComponent();
app.createAppStructure();
const stored = localStorage.getItem('products');
if (stored) {
app.products = JSON.parse(stored);
app.nextId = app.products.length > 0
? Math.max(...app.products.map(p => p.id)) + 1
: 1;
}
app.render();
});