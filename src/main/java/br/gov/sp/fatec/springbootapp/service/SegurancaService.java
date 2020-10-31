package br.gov.sp.fatec.springbootapp.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import br.gov.sp.fatec.springbootapp.entity.Autorizacao;
import br.gov.sp.fatec.springbootapp.entity.Usuario;

public interface SegurancaService extends UserDetailsService{
    
    public List<Usuario>buscarTodosUsuarios();

    public Usuario buscarUsuarioPorId(Long id);

    public Usuario buscarUsuarioPorNome(String nome);

    public Usuario criaUsuario(String nome, String senha, String autorizacao);

    public void deleteUsuario(Long id);

    public Usuario updateUsuario(Long id, String nome, String senha, String autorizacao);

    public Autorizacao buscarAutorizacaoPorNome(String nome);

}