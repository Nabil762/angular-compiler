class AppComponent {
createAppStructure() {
this.appContainer = document.getElementById('app');
const header = document.createElement('div');
header.innerHTML = ``;
this.appContainer.appendChild(header);
this.container = document.createElement('div');
this.container.className = 'container';
this.appContainer.appendChild(this.container);
this.cardetails = document.createElement('div');
this.cardetails.className = 'car-details';
this.container.appendChild(this.cardetails);
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
this.rendercardetails()
}
}
document.addEventListener('DOMContentLoaded', () => {
const app = new AppComponent();
app.createAppStructure();
const carJson = sessionStorage.getItem('selectedCar');
if(carJson) {
app.selectedCar = JSON.parse(carJson);
}
app.render();
});