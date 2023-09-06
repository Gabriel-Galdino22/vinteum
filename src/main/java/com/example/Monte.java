package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Monte {
    private List<Carta> cartas = new ArrayList<>();

    public Monte() {
        for (Naipe naipe : Naipe.values()) {
            for (int valor = 1; valor <= 13; valor++) {
                cartas.add(new Carta(valor, naipe));
            }
        }
    }

    public void embaralhar() {
        Collections.shuffle(cartas);
    }

    public Carta virar() {
        if (!cartas.isEmpty()) {
            return cartas.remove(0);
        } else {
            throw new IllegalStateException("Caramba, acabou as cartas do monte.");
        }
    }
}


