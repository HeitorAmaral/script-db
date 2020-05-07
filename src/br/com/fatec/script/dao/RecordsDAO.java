package br.com.fatec.script.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import br.com.fatec.script.configuration.ConnectionMySql;

public class RecordsDAO {

	public void insert(Integer qtd) throws Exception {
		Long startTime = System.currentTimeMillis();
		System.out.println("Iniciando Script de inserção de " + qtd + " registros...");
		Connection connection = ConnectionMySql.open();

		for (Integer i = 0; i < qtd; i++) {
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO table01 (teste) VALUES ('" + i + "')");
			System.out.println(sql.toString());
			PreparedStatement command = connection.prepareStatement(sql.toString());
			command.execute();
			command.close();
		}
		connection.close();
		System.out.println("Script de inserção de " + qtd + " registros finalizado em "
				+ (System.currentTimeMillis() - startTime) / 1000 + " segundos.");
		System.out.println("Script de inserção de " + qtd + " registros finalizado em "
				+ (System.currentTimeMillis() - startTime) + " milisegundos.");
	}
}
