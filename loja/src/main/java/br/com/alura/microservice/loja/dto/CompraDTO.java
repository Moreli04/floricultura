package br.com.alura.microservice.loja.dto;

import java.util.List;

import lombok.Data;

@Data
public class CompraDTO {

	private List<ItemDaCompra> itens;
	private EnderecoDTO endereco;
}
