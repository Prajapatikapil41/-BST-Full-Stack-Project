const baseURL = 'http://localhost:8080/bst';

async function insert() {
    const val = document.getElementById('inputValue').value;
    const response = await fetch(`${baseURL}/insert/${val}`, { method: 'POST' });
    const data = await response.text();
    alert(data);
    document.getElementById('search-result').innerText = '';
    document.getElementById('traversal-result').innerText = '';
    await refreshTreeDisplay();
}

async function deleteNode() {
    const val = document.getElementById('inputValue').value;
    const response = await fetch(`${baseURL}/delete/${val}`, { method: 'DELETE' });
    const data = await response.text();
    alert(data);
    document.getElementById('search-result').innerText = '';
    document.getElementById('traversal-result').innerText = '';
    await refreshTreeDisplay();
}

async function search() {
    const val = document.getElementById('inputValue').value;
    const response = await fetch(`${baseURL}/search/${val}`);
    const data = await response.text();
    document.getElementById('search-result').innerText = data;
    document.getElementById('traversal-result').innerText = '';
}

async function getInorder() {
    const response = await fetch(`${baseURL}/inorder`);
    const data = await response.json();
    document.getElementById('traversal-result').innerText = "Inorder: " + data.join(' ');
}

async function getPreorder() {
    const response = await fetch(`${baseURL}/preorder`);
    const data = await response.json();
    document.getElementById('traversal-result').innerText = "Preorder: " + data.join(' ');
}

async function getPostorder() {
    const response = await fetch(`${baseURL}/postorder`);
    const data = await response.json();
    document.getElementById('traversal-result').innerText = "Postorder: " + data.join(' ');
}

// ✅ Added display function
async function refreshTreeDisplay() {
    const response = await fetch(`${baseURL}/inorder`);
    const data = await response.json();

    let html = '<div style="display:flex; justify-content:center; flex-wrap:wrap;">';
    data.forEach(num => {
        html += `<div style="
            background: linear-gradient(135deg, #4facfe, #00f2fe);
            margin: 10px;
            padding: 15px 20px;
            border-radius: 10px;
            color: white;
            font-weight: bold;
            box-shadow: 0 5px 10px rgba(0,0,0,0.2);
        ">${num}</div>`;
    });
    html += '</div>';

    document.getElementById('tree-display').innerHTML = html;
}

// ✅ On load - show current tree
refreshTreeDisplay();
