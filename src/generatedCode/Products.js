class AppComponent {
createAppStructure() {
this.appContainer = document.getElementById('app');
const header = document.createElement('div');
header.innerHTML = ``;
this.appContainer.appendChild(header);
this.container = document.createElement('div');
this.container.className = 'container';
this.appContainer.appendChild(this.container);
this.productlist = document.createElement('div');
this.productlist.className = 'product-list';
this.container.appendChild(this.productlist);
this.productdetails = document.createElement('div');
this.productdetails.className = 'product-details';
this.container.appendChild(this.productdetails);
}
renderproductlist() {
this.productlist.innerHTML = `<h2 class = "text-xl font-bold mb-4">Products </h2>`;
if (this.products.length === 0) {
this.productlist.innerHTML += `
<h3>No products available<br>Add products to see them listed here</h3>`;
return;
}
this.productlist.innerHTML += this.products.map(product  => `
<div class="product " data-id="${product .id}">
<div class = "product-info" >
<img src = "${product.image}" alt = "${ product.name }">
<p >${product.name} </p>
</div>
<button class="delete-btn" >
<svg xmlns = "http://www.w3.org/2000/svg" width = "16" height = "16" fill = "currentColor" viewBox = "0 0 16 16" > style="margin-left: 8px">
<path d="M5.5 5.5A.5.5 0 0 1 6 6v6a.5.5 0 0 1-1 0V6a.5.5 0 0 1 .5-.5zm2.5 0a.5.5 0 0 1 .5.5v6a.5.5 0 0 1-1 0V6a.5.5 0 0 1 .5-.5zm3 .5a.5.5 0 0 0-1 0v6a.5.5 0 0 0 1 0V6z"/>
<path fill-rule="evenodd" d="M14.5 3a1 1 0 0 1-1 1H13v9a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2V4h-.5a1 1 0 0 1-1-1V2a1 1 0 0 1 1-1H6a1 1 0 0 1 1-1h2a1 1 0 0 1 1 1h3.5a1 1 0 0 1 1 1v1zM4.118 4 4 4.059V13a1 1 0 0 0 1 1h6a1 1 0 0 0 1-1V4.059L11.882 4H4.118zM2.5 3V2h11v1h-11z"/>
</svg>
</button>
</div>
`).join('');
this.productlist.querySelectorAll('.product').forEach(item => {
item.addEventListener('click', () => {
this.selectProduct(this.products.find(p => p.id === parseInt(item.dataset.id)));
});
item.querySelector('.delete-btn').addEventListener('click', (e) => {
this.deleteProduct(parseInt(item.dataset.id), e);
});
});
}
renderproductdetails() {
this.productdetails.innerHTML = `<h2 class = "text-xl font-bold mb-4">Product Details </h2>`;
if (this.selectedProduct) {
this.productdetails.innerHTML += `
<div class = "product-details" >
<h3 >${this.selectedProduct.id} - ${this.selectedProduct.name}</h3>
<img src = "${this.selectedProduct.image}" alt = "${this.selectedProduct.name}">
<p >Details : ${this.selectedProduct.details} </p>
</div>
`;
}
else {
this.productdetails.innerHTML += `
<div class="empty-message" >
<p > selectedProduct to view </p >
<p ><small > selectedProduct from the list to see its details here </small ></p >
</div >
`;
}
}
render() {
this.renderproductlist()
this.renderproductdetails()
}
selectProduct(product) {
this.selectedProduct = product;
this.render();
}
deleteProduct(productId,event) {
event.stopPropagation()
if (confirm('Are you sure to do it ?')) {
this.products = this.products.filter(product => product.id !== productId);
localStorage.setItem('products', JSON.stringify(this.products));
if (this.selectedProduct && this.selectedProduct.id === productId) {
this.selectedProduct = null;
}
this.render();
}
}
}
document.addEventListener('DOMContentLoaded', () => {
const app = new AppComponent();
app.createAppStructure();
const stored = localStorage.getItem('products');
app.products = JSON.parse(localStorage.getItem('products')) || [
{id: 1,name: 'Product 1',image: '/images/1.jpg',details: 'Details about Product 1'},
{id: 2,name: 'Product 2',image: '/images/2.jpg',details: 'Details about Product 2'},
{id: 3,name: 'Product 3',image: '/images/3.jpg',details: 'Details about Product 3'}
];
localStorage.setItem('products', JSON.stringify(app.products));
app.render();
});
