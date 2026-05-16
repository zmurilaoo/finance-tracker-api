package br.com.zmurilaoo.finace_tracker.repository;

import br.com.zmurilaoo.finace_tracker.model.Lancamento;
import br.com.zmurilaoo.finace_tracker.model.TipoLancamento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {

    List<Lancamento> findByTipo(TipoLancamento tipo);

    List<Lancamento> findByDataBetween(LocalDate dataInicial, LocalDate dataFinal);

    List<Lancamento> findB


}
