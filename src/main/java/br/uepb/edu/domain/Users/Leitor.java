package br.uepb.edu.domain.Users;
import br.uepb.edu.domain.*;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Leitor {
    private String nome;
    private LeitorTipo tipo;
    private List<Reserva> reservas;
}
