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
this.productlist.innerHTML = `<h3 >Products </h3>`;
if (this.products.length === 0) {
this.productlist.innerHTML += `
<h3 class="mb-4 empty-message">No products available<br>Add products to see them listed here</h3>`;
return;
}
this.productlist.innerHTML += this.products.map(product  => `
<div class="product " data-id="${product .id}">
</div>
`).join('');
this.productlist.querySelectorAll('.product').forEach(item => {

});
}
renderproductdetails() {
this.productdetails.innerHTML = `<h3 >Product Details </h3>`;
if (this.selectedProduct) {
this.productdetails.innerHTML += `
<div class = "product-details" >
<img src = "${this.selectedProduct!.image}" alt = "${this. selectedProduct!.name }">
<h4 >${this.selectedProduct!.id} - ${this.selectedProduct!.name}</h4>
<p >${this.selectedProduct!.price} </p>
<p >${this.selectedProduct!.details} </p>
</div>
`;
}

}
render() {
this.renderproductlist()
this.renderproductdetails()
}
selectProduct(product) {
this.selectedProduct = product;
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