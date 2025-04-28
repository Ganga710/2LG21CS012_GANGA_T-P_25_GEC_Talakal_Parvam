// Smooth scroll to section when nav link is clicked
document.querySelectorAll('a[href^="#"]').forEach(link => {
    link.addEventListener('click', function (e) {
        e.preventDefault();
        const target = document.querySelector(this.getAttribute('href'));
        if (target) {
            target.scrollIntoView({ behavior: 'smooth' });
        }
    });
});

// Optional: Scroll-to-top button
const scrollBtn = document.createElement('button');
scrollBtn.innerText = '↑';
scrollBtn.style.position = 'fixed';
scrollBtn.style.bottom = '20px';
scrollBtn.style.right = '20px';
scrollBtn.style.padding = '10px 15px';
scrollBtn.style.fontSize = '18px';
scrollBtn.style.display = 'none';
scrollBtn.style.background = '#000';
scrollBtn.style.color = '#fff';
scrollBtn.style.border = 'none';
scrollBtn.style.borderRadius = '5px';
scrollBtn.style.cursor = 'pointer';
document.body.appendChild(scrollBtn);

scrollBtn.addEventListener('click', () => {
    window.scrollTo({ top: 0, behavior: 'smooth' });
});

window.addEventListener('scroll', () => {
    scrollBtn.style.display = window.scrollY > 200 ? 'block' : 'none';
});
