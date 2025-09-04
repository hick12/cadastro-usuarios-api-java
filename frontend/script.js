const formulario = document.querySelector('form');

const Inome = document.querySelector('.nome');
const Iusername = document.querySelector('.username'); // 👈 novo
const Iemail = document.querySelector('.email');
const Isenha = document.querySelector('.senha');
const Itel = document.querySelector('.tel');

function cadastrar() {
  fetch("http://localhost:8080/usuarios", {
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },
    method: 'POST',
    body: JSON.stringify({
      nomeCompleto: Inome.value,  // 👈 precisa bater com o atributo da entidade
      email: Iemail.value,
      senha: Isenha.value,
      telefone: Itel.value
    })
  })
  .then(res => res.json())
  .then(data => console.log("Usuário cadastrado:", data))
  .catch(err => console.error("Erro:", err));
};

function limpar() {
  Inome.value = "";
  Iemail.value = "";
  Isenha.value = "";
  Itel.value = "";
}

formulario.addEventListener('submit', function (event) {
  event.preventDefault();
  cadastrar();
  limpar();
});
