package br.com.henrique.screenmatch.services;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface IConverteDados
{
   <T> T obterDados(String json, Class<T> classe);
}
