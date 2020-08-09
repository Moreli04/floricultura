package br.com.alura.microservice.loja.dto;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InfoEntregaDTO {

	private Long pedidoId;

	private LocalDateTime dataParaEntrega;

	private String enderecoOrigem;

	private String enderecoDestino;
}
