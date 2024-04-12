package com.example.apispringtad.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Dispositivo {
    private Long id;
    private String nome;
    private String descricao;
    private String[] coordenadas;
    private List<Sensor> sensores;
    private List<Atuador> atuadores;
}
