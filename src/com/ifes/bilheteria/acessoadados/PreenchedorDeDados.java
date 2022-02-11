package com.ifes.bilheteria.acessoadados;

import com.ifes.bilheteria.entidades.*;
import java.util.ArrayList;
import java.util.List;

import static com.ifes.bilheteria.entidades.FormatadorDeString.*;

public class PreenchedorDeDados {

    private Evento evento;

    public PreenchedorDeDados(Evento evento) {
        this.evento = evento;
    }

    public List<Object> preencher() {
        List<Object> campos = new ArrayList<>();

        campos.add(evento.getNome());
        campos.add(evento.getDataDeInicio().getDataFormatada());
        campos.add(evento.getHorario().getHoraFormatada());

        if (evento instanceof Festival) {
            Festival festival = (Festival) evento;
            
            campos.add(evento.getCidade().getId());
            campos.add(evento.getClassificacaoIndicativa().getValor());
            String atracoes = unirElementosDeUmaListaSeparandoPorVirgula(festival.getAtracoes());
            campos.add(atracoes);
        } else if (evento instanceof Teatro) {
            Teatro teatro = (Teatro) evento;
            
            campos.add(evento.getCidade().getId());
            campos.add(evento.getClassificacaoIndicativa().getValor());
            campos.add(teatro.getDuracao().getDuracaoFormatada());
            campos.add(teatro.getGenero().getNome());
        } else if (evento instanceof Filme) {
            Filme filme = (Filme) evento;
            
            campos.add(evento.getCidade().getId());
            campos.add(filme.getCinema().getId());
            campos.add(evento.getClassificacaoIndicativa().getValor());
            campos.add(filme.getDuracao().getDuracaoFormatada());
        }

        return campos;
    }
}
