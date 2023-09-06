package com.example;

public class Jogo {
    private Monte monte = new Monte();
    private Jogador jogador = new Jogador();
    private Computador computador = new Computador();

    // inicio o jogo embaralhando o monte

    public Jogo() {
        monte.embaralhar();
    }

    // metodo que vai distribuir as cartas

    public Carta distribuiCartaParaJogador(Jogador jogador) {
        if (!jogador.parou()) {
            return monte.virar();
        } else {
            return null;
        }
    }


    public boolean acabou() {
        if (jogador.parou() && computador.parou()) {
            return true; 
        } else if (jogador.getPontos() > 21 || computador.getPontos() > 21) {
            return true;
        }
        return false;
    } 

    //possiveis resultados (Jogador ganha ou perde) (Computador perde ou ganha) | Empate
    
    public String resultado() {
        if (jogador.getPontos() > 21 && computador.getPontos() > 21) {
            return "Empatou";
        } else if (jogador.getPontos() > 21) {
            return "Você perdeu";
        } else if (computador.getPontos() > 21) {
            return "O Computador ganhou";
        } else if (jogador.getPontos() > computador.getPontos()) {
            return "Você ganhou da mesa";
        } else if (jogador.getPontos() < computador.getPontos()) {
            return "Você perdeu da mesa";
        } else{
            return "Empate!";
        }
    }

    public Computador getComputador() {
        return computador;
    }

    public Jogador getJogador() {
        return jogador;
    }
}

  

