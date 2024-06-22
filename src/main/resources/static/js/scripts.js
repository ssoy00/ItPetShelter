/*!
* Start Bootstrap - Clean Blog v6.0.9 (https://startbootstrap.com/theme/clean-blog)
* Copyright 2013-2023 Start Bootstrap
* Licensed under MIT (https://github.com/StartBootstrap/startbootstrap-clean-blog/blob/master/LICENSE)
*/
window.addEventListener('DOMContentLoaded', () => {
    let scrollPos = 0;
    const mainNav = document.getElementById('mainNav');
    const headerHeight = mainNav.clientHeight;
    window.addEventListener('scroll', function () {
        const currentTop = document.body.getBoundingClientRect().top * -1;
        if (currentTop < scrollPos) {
            // Scrolling Up
            if (currentTop > 0 && mainNav.classList.contains('is-fixed')) {
                mainNav.classList.add('is-visible');
            } else {
                console.log(123);
                mainNav.classList.remove('is-visible', 'is-fixed');
            }
        } else {
            // Scrolling Down
            mainNav.classList.remove(['is-visible']);
            if (currentTop > headerHeight && !mainNav.classList.contains('is-fixed')) {
                mainNav.classList.add('is-fixed');
            }
        }
        scrollPos = currentTop;
    });
})
document.addEventListener('DOMContentLoaded', function () {
    const dogsDropdown = document.getElementById('dogsDropdown');
    const dropdownMenus = document.querySelectorAll('.dropdown-menu');

    dogsDropdown.addEventListener('mouseover', function () {
        dropdownMenus.forEach(menu => {
            if (menu !== dogsDropdown.nextElementSibling) {
                menu.classList.remove('show');
            }
        });
        this.nextElementSibling.classList.toggle('show');
    });

    dropdownMenus.forEach(menu => {
        menu.addEventListener('mouseleave', function () {
            this.classList.remove('show');
        });
    });

});

document.addEventListener('DOMContentLoaded', function () {
    const items = Array.from(document.querySelectorAll('.card'));
    const itemsPerPage = 4;
    let currentPage = 1;

    function renderItems() {
        items.forEach((item, index) => {
            item.style.display = (index >= (currentPage - 1) * itemsPerPage && index < currentPage * itemsPerPage) ? 'block' : 'none';
        });
    }

    function renderPagination() {
        const pagination = document.getElementById('pagination');
        pagination.innerHTML = '';

        const totalPages = Math.ceil(items.length / itemsPerPage);

        for (let i = 1; i <= totalPages; i++) {
            const pageLink = document.createElement('a');
            pageLink.textContent = i;
            pageLink.className = currentPage === i ? 'active' : '';
            pageLink.addEventListener('click', (event) => {
                event.preventDefault();
                currentPage = i;
                renderItems();
                renderPagination();
            });
            pagination.appendChild(pageLink);
        }
    }

    renderItems();
    renderPagination();
});