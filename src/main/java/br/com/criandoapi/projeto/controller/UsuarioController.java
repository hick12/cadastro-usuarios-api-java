package br.com.criandoapi.projeto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
import java.util.ArrayList;

import br.com.criandoapi.projeto.DAO.iUsuario;
import br.com.criandoapi.projeto.model.Usuario;

@RestController
@CrossOrigin("*")
@RequestMapping("/usuarios") // <- era 'ResquestMapping'
public class UsuarioController {

    @Autowired
    private iUsuario dao;

    // GET /usuarios
    @GetMapping
    public List<Usuario> listaUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        dao.findAll().forEach(usuarios::add); // Iterable -> List
        return usuarios;
    }

    // POST /usuarios
    @PostMapping
    public Usuario criaUsuario(@RequestBody Usuario usuario) {
        Usuario usuarioNovo = dao.save(usuario);
        return usuarioNovo;
    }

    @PutMapping
    public Usuario atualizaUsuario(@RequestBody Usuario usuario) {
        Usuario usuarioAtualizado = dao.save(usuario);
        return usuarioAtualizado;
    }

    @DeleteMapping("{id}")
    public Optional<Usuario> deletaUsuario( @PathVariable Integer id) {
        Optional<Usuario> usuario = dao.findById(id);
        dao.deleteById(id);
        return usuario;
        
    }
}