package br.com.ifpe.oxefood.modelo.categoriaProduto;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.transaction.Transactional;

public class CategoriaProdutoService {
    @Autowired
    private CategoriaProdutoRepository repository;

    @Transactional
    public CategoriaProduto save(CategoriaProduto categoriaProduto) {
        categoriaProduto.setHabilitado(Boolean.TRUE);
        return repository.save(categoriaProduto);
    }

    public CategoriaProduto obterPorID(Long id) {
        return repository.findById(id).get();
    }
}
