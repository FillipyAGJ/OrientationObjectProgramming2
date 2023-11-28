package Exercicios.provaFinal.questao10;

import java.util.ArrayList;

public class Selecao {
    private String nome;
    private Grupo grupo;
    private ArrayList<Partida> partida;
    private boolean favorita;
    private int pontos = 0;
    private int jogos =0;
    private int vitorias =0;
    private int empates =0;
    private int derrotas =0;
    private int golsPro =0;
    private int golsContra =0;
    private int saldoGols =0;

    public void ganharPartida(int gols, int golsContra, int golsPro) {
        this.saldoGols += gols;
        this.golsPro += golsPro;
        this.golsContra += golsContra;
        this.vitorias++;
        this.pontos += 3;
        this.jogos++;

        System.out.println("O time " + nome + " ganhou a partida com " + gols + " gols, com " + golsContra + " gols contra e " + golsPro + " gols pro.");
    }

    public void empatarPartida(int gols, int golsContra, int golsPro) {
        this.saldoGols += gols;
        this.golsPro += golsPro;
        this.golsContra += golsContra;
        this.empates++;
        this.pontos++;
        this.jogos++;

        System.out.println("O time " + nome + " ganhou a partida com " + gols + " gols, com " + golsContra + " gols contra e " + golsPro + " gols pro.");
    }

    public void perderPartida(int gols, int golsContra, int golsPro) {
        this.saldoGols += gols;
        this.golsPro += golsPro;
        this.golsContra += golsContra;
        this.derrotas++;
        this.jogos++;

        System.out.println("O time " + nome + " perdeu a partida com " + gols + " gols, com " + golsContra + " gols contra e " + golsPro + " gols pro.");
    }

    public ArrayList<Partida> getPartida() {
        return partida;
    }

    public void setPartida(ArrayList<Partida> partida) {
        this.partida = partida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public boolean isFavorita() {
        return favorita;
    }

    public void setFavorita(boolean favorita) {
        this.favorita = favorita;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public int getJogos() {
        return jogos;
    }

    public void setJogos(int jogos) {
        this.jogos = jogos;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getGolsPro() {
        return golsPro;
    }

    public void setGolsPro(int golsPro) {
        this.golsPro = golsPro;
    }

    public int getGolsContra() {
        return golsContra;
    }

    public void setGolsContra(int golsContra) {
        this.golsContra = golsContra;
    }

    public int getSaldoGols() {
        return saldoGols;
    }

    public void setSaldoGols(int saldoGols) {
        this.saldoGols = saldoGols;
    }
}
