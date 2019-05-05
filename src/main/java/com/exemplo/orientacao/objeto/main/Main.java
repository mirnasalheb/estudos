package com.exemplo.orientacao.objeto.main;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    public static void main(final String[] args) {

//        exemploMirna();

        final String linkPeloTipoServico = getLinkPeloTipoServico("ECOMÉoioiRCIO/DIFAL");
        System.out.println(linkPeloTipoServico);

    }

    private static void exemploMirna() {
        final List<Pessoa> mirna = Arrays.asList(
                new Pessoa("Mirna", 24),
                new Pessoa("Mirna", 24),
                new Pessoa("Camilo", 25),
                new Pessoa("Cacau", 2)
        );


        final Set<String> collect = mirna.stream()
                .map(Pessoa::getName)
                .collect(Collectors.toSet());

        System.out.println(collect);
    }

    static class Pessoa {
        private String name;
        private Integer age;

        Pessoa(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }
    }

    static String getLinkPeloTipoServico(final String tipoServico) {
        switch (tipoServico.toUpperCase()) {
            case "ANTECIPAÇÃO PARCIAL":
                return "<a href='https://portal.sefaz.pi.gov.br/falecomasefaz/arquivos/Antecipação_Parcial.pdf' target='_blank'>Modelo de cálculo</a><br><br>";
            case "DIFERENCIAL DE ALÍQUOTA":
                return "<a href='https://portal.sefaz.pi.gov.br/falecomasefaz/arquivos/Diferencial_de_Alíquotas.pdf' target='_blank'>Modelo de cálculo</a><br><br>";
            case "ECOMÉRCIO/DIFAL":
                return "<a href='https://portal.sefaz.pi.gov.br/falecomasefaz/arquivos/DIFAL_e_FECOP.pdf' target='_blank'>Modelo de cálculo</a><br><br>";
            case "FECOP":
                return "<a href='https://portal.sefaz.pi.gov.br/falecomasefaz/arquivos/DIFAL_e_FECOP.pdf' target='_blank'>Modelo de cálculo</a><br><br>";
            default:
                return "<a href='https://portal.sefaz.pi.gov.br/falecomasefaz/arquivos/Com_Eventual_-_Irreg_-_Ant_Total_-_Sust_Trib.pdf' target='_blank'>Modelo de cálculo</a><br><br>";
        }
    }

}