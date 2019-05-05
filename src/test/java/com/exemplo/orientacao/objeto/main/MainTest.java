package com.exemplo.orientacao.objeto.main;

import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest {

    @Test
    public void deve_buscar_link_antecipacao_parcial_lower_case() {
        final String tipoAncetipacaoParcial = "antecipação parcial";

        final String link = Main.getLinkPeloTipoServico(tipoAncetipacaoParcial);


        final String linkEsperado = "<a href='https://portal.sefaz.pi.gov.br/falecomasefaz/arquivos/Antecipação_Parcial.pdf' target='_blank'>Modelo de cálculo</a><br><br>";

        assertNotNull("O link nao pode estar vazio", link);
        assertEquals("O link deve ser o mesmo da resposta esperada", linkEsperado, link);
    }
}
