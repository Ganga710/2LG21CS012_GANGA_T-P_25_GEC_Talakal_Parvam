document.getElementById('menuToggle').addEventListener('click', function () {
    document.getElementById('navLinks').classList.toggle('active');
});
document.getElementById('landSize').addEventListener('change', function() {
    const size = parseInt(this.value);
    const priceInput = document.getElementById('price');

    // Set price based on land size
    let price;
    switch (size) {
        case 100:
            price = 10000; // Price for 100 sq ft
            break;
        case 200:
            price = 20000; // Price for 200 sq ft
            break;
        case 500:
            price = 50000; // Price for 500 sq ft
            break;
        case 1000:
            price = 100000; // Price for 1000 sq ft
            break;
        default:
            price = 0;
    }

    priceInput.value = price > 0 ? `$${price}` : '';
});

document.getElementById('searchButton').addEventListener('click', function() {
    const size = document.getElementById('landSize').value;
    const price = document.getElementById('price').value;

    const resultDiv = document.getElementById('result');
    if (size === "0") {
        resultDiv.innerHTML = "<p>Please select a land size.</p>";
    } else {
        resultDiv.innerHTML = `<p>You selected ${size} sq ft with a price of ${price}.</p>`;
    }
});