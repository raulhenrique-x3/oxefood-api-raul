package br.com.ifpe.oxefood.modelo.entregador;

import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EntregadorService {

        @Autowired
        private EntregadorRepository repository;

        @Transactional
        public Entregador save(Entregador entregador) {
            entregador.setHabilitado(Boolean.TRUE);
            return repository.save(entregador);
        }

        public List<Entregador> listarTodos() {
            return repository.findAll();
        }

        public Entregador obterPorID(Long id) {
            return repository.findById(id).get();
        }

    @Transactional
public void update(Long id, Produto produtoAlterado) {

    Produto produto = repository.findById(id).get();
    produto.setCodigo(produtoAlterado.getCodigo());
    produto.setTitulo(produtoAlterado.getTitulo());
    produto.setDescricao(produtoAlterado.getDescricao());
    produto.setValorUnitario(produtoAlterado.getValorUnitario());
    produto.setTempoEntregaMinimo(produtoAlterado.getTempoEntregaMinimo());
    produto.setTempoEntregaMaximo(produtoAlterado.getTempoEntregaMaximo());

    repository.save(produto);
}
}
