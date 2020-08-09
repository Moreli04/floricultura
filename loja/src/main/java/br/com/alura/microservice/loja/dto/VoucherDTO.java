package br.com.alura.microservice.loja.dto;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VoucherDTO {
	private Long numero;
	private LocalDateTime previsaoParaEntrega;

}
