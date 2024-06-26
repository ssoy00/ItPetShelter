const items = [
    { id: 1, title: 'Item 1', description: 'This is item 1' },
    { id: 2, title: 'Item 2', description: 'This is item 2' },
    { id: 3, title: 'Item 3', description: 'This is item 3' },
    { id: 4, title: 'Item 4', description: 'This is item 4' },
    { id: 5, title: 'Item 5', description: 'This is item 5' },
    { id: 6, title: 'Item 6', description: 'This is item 6' },
    { id: 7, title: 'Item 7', description: 'This is item 7' },
    { id: 8, title: 'Item 8', description: 'This is item 8' },
    { id: 9, title: 'Item 9', description: 'This is item 9' },
    { id: 10, title: 'Item 10', description: 'This is item 10' },
    // 더 많은 아이템을 추가할 수 있습니다.
];

let currentPage = 1;
const itemsPerPage = 4;

function renderItems() {
    const cardList = document.getElementById('card-list');
    cardList.innerHTML = '';

    const startIndex = (currentPage - 1) * itemsPerPage;
    const endIndex = startIndex + itemsPerPage;
    const currentItems = items.slice(startIndex, endIndex);

    currentItems.forEach(item => {
        const card = document.createElement('div');
        card.className = 'card';
        card.innerHTML = `
            <h3>${item.title}</h3>
            <p>${item.description}</p>
        `;
        cardList.appendChild(card);
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

function initialize() {
    renderItems();
    renderPagination();
}

document.addEventListener('DOMContentLoaded', initialize);
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