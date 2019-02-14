package br.com.alura.spring.lojaspring.controller;

import org.springframework.core.convert.converter.Converter;

import br.com.alura.spring.lojaspring.entity.TipoStatus;

public class TipoStatusConverter implements Converter<String, TipoStatus> {

	@Override
	public TipoStatus convert(String status) {
		
		return (status.equals(TipoStatus.INATIVO.getDesc()) ? TipoStatus.INATIVO : TipoStatus.ATIVO);
		
	}

}
