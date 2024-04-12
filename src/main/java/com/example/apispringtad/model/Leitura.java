package com.example.apispringtad.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Leitura {
    private Long id;
    private Sensor sensor;
    private String valor;
    private LocalDateTime dataHora;
}
