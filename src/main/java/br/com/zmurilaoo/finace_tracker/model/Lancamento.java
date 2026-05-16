package br.com.zmurilaoo.finace_tracker.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "lancamento")
@NoArgsConstructor
@Getter
@Setter

public class Lancamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 100)
    private String descricao;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal valor;

    @Column(nullable = false, name = "data_lancamento")
    private LocalDate data;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, name = "tipo_lancamento")
    private TipoLancamento tipo;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Lancamento that = (Lancamento) o;
        return Objects.equals(id, that.id) && Objects.equals(descricao, that.descricao) && Objects.equals(valor, that.valor) && Objects.equals(data, that.data) && tipo == that.tipo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, descricao, valor, data, tipo);
    }
}
