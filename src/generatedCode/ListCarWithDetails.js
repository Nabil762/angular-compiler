class AppComponent {
createAppStructure() {
this.appContainer = document.getElementById('app');
const header = document.createElement('div');
header.innerHTML = ``;
this.appContainer.appendChild(header);
this.container = document.createElement('div');
this.container.className = 'container';
this.appContainer.appendChild(this.container);
this.carlist = document.createElement('div');
this.carlist.className = 'car-list';
this.container.appendChild(this.carlist);
this.cardetails = document.createElement('div');
this.cardetails.className = 'car-details';
this.container.appendChild(this.cardetails);
}
rendercarlist() {
this.carlist.innerHTML = `<h2 class = "text-xl font-bold mb-4 text-center"style = "color: #f5f7fa;">Cars </h2>`;
if (this.cars.length === 0) {
this.carlist.innerHTML += `
<h3 class="mb-4 empty-message">No cars available<br>Add cars to see them listed here</h3>`;
return;
}
this.carlist.innerHTML += this.cars.map(car  => `
<div class="car " data-id="${car .id}">
<div class = "car-info" >
<img src = "${car.car_image}" alt = "${ car.car_name }">
<p >${car.car_name} </p>
</div>
<button class="delete-btn" >
<svg xmlns = "http://www.w3.org/2000/svg" width = "16" height = "16" fill = "currentColor" viewBox = "0 0 16 16" > style="margin-left: 8px">
<path d="M5.5 5.5A.5.5 0 0 1 6 6v6a.5.5 0 0 1-1 0V6a.5.5 0 0 1 .5-.5zm2.5 0a.5.5 0 0 1 .5.5v6a.5.5 0 0 1-1 0V6a.5.5 0 0 1 .5-.5zm3 .5a.5.5 0 0 0-1 0v6a.5.5 0 0 0 1 0V6z"/>
<path fill-rule="evenodd" d="M14.5 3a1 1 0 0 1-1 1H13v9a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2V4h-.5a1 1 0 0 1-1-1V2a1 1 0 0 1 1-1H6a1 1 0 0 1 1-1h2a1 1 0 0 1 1 1h3.5a1 1 0 0 1 1 1v1zM4.118 4 4 4.059V13a1 1 0 0 0 1 1h6a1 1 0 0 0 1-1V4.059L11.882 4H4.118zM2.5 3V2h11v1h-11z"/>
</svg>
</button>
</div>
`).join('');
this.carlist.querySelectorAll('.car').forEach(item => {
item.addEventListener('click', () => {
this.selectCar(this.cars.find(p => p.id === parseInt(item.dataset.id)));
});
item.querySelector('.delete-btn').addEventListener('click', (e) => {
this.deleteCar(parseInt(item.dataset.id), e);
});
});
}
rendercardetails() {
this.cardetails.innerHTML = `<h2 class = "text-xl font-bold mb-4"style = "color: #f5f7fa;">Car Details </h2>`;
if (this.selectedCar) {
this.cardetails.innerHTML += `
<div class = "car-details" >
<h3 >${this.selectedCar.id} - ${this.selectedCar.car_name}</h3>
<img src = "${this.selectedCar.car_image}" alt = "${this.selectedCar.car_name}">
<p >car_price : ${this.selectedCar.car_price} </p>
<p >car_brand : ${this.selectedCar.car_brand} </p>
<p >car_model : ${this.selectedCar.car_model} </p>
<p >car_year : ${this.selectedCar.car_year} </p>
<p >car_category : ${this.selectedCar.car_category} </p>
<p >car_color : ${this.selectedCar.car_color} </p>
<p >car_engin_size : ${this.selectedCar.car_engin_size} </p>
<p >car_engin_type : ${this.selectedCar.car_engin_type} </p>
<p >car_horsepower : ${this.selectedCar.car_horsepower} </p>
<p >car_description : ${this.selectedCar.car_description} </p>
</div>
`;
}
else {
this.cardetails.innerHTML += `
<div class="empty-message" >
<h6 > selectedCar to view </h6 >
<h6 ><small > selectedCar from the list to see its details here </small ></h6 >
</div >
`;
}
}
render() {
this.rendercarlist()
this.rendercardetails()
}
selectCar(car) {
this.selectedCar = car;
this.render();
}
deleteCar(carId,event) {
event.stopPropagation();
if (confirm('Are you sure to delete this car from list ?')) {
this.cars = this.cars.filter(car => car.id !== carId);
localStorage.setItem('cars', JSON.stringify(this.cars));
if (this.selectedCar && this.selectedCar.id === carId) {
this.selectedCar = null;
}
this.render();
}
else {
this.render();
}
}
}
document.addEventListener('DOMContentLoaded', () => {
const app = new AppComponent();
app.createAppStructure();
const stored = localStorage.getItem('cars');
app.cars = JSON.parse(localStorage.getItem('cars')) || [
{id: 1,car_name: "M5",car_image: "/images/8.jpg",car_price: 4444000,car_brand: "BMW",car_model: "M5 series",car_year: 2025,car_category: "Sport",car_color: "Black",car_engin_size: "2.5L",car_engin_type: "Gasoline",car_horsepower: 400,car_description: "Is very famous and Modern Car"},
{id: 2,car_name: "G class",car_image: "/images/12.jpg",car_price: 50544,car_brand: "Mercedes",car_model: "G class series",car_year: 2018,car_category: "Jeep",car_color: "Purple",car_engin_size: "3L",car_engin_type: "Diesel",car_horsepower: 450,car_description: "Is very famous Car"},
{id: 3,car_name: "Land Cruiser",car_image: "/images/7.jpg",car_price: 25944,car_brand: "Toyota",car_model: "Land Cruiser series",car_year: 2022,car_category: "Jeep",car_color: "White",car_engin_size: "2L",car_engin_type: "Gasoline",car_horsepower: 350,car_description: " Modern Car"},
{id: 4,car_name: "Lexus TX",car_image: "/images/9.jpg",car_price: 345435,car_brand: "Lexus",car_model: "TX series",car_year: 2019,car_category: "Jeep",car_color: "White",car_engin_size: "2.5L",car_engin_type: "Electrical",car_horsepower: 410,car_description: "Is very famous and Modern Car"},
{id: 5,car_name: "GLE",car_image: "/images/10.jpg",car_price: 4444000,car_brand: "Mercedes",car_model: "GLE series",car_year: 2023,car_category: "SUV",car_color: "Black",car_engin_size: "3.5L",car_engin_type: "Gasoline",car_horsepower: 550,car_description: "Is very famous and Modern Car"}
];
localStorage.setItem('cars', JSON.stringify(app.cars));
app.render();
});