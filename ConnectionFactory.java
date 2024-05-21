package com.mycompany.bancodedados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private String usuario = "root";
    private String senha = "";
    private String host = "localhost";
    private String porta = "3306";
    private String bd = "psc_bua";
    //private String timezone = "America/Sao_Paulo"; // Adiciona o fuso horário


    public Connection obtemConexao() {
        try {
            
            Connection conectar = DriverManager.getConnection(
                "jdbc:mysql://"+host+":"+porta+"/"+ bd,
                usuario,
                senha
            );
            if (conectar != null) {
                System.out.println("Conexão estabelecida com sucesso!");
            }
            return conectar;
        } catch (SQLException e) {
            System.out.println("Erro ao tentar estabelecer conexão com o banco de dados:");
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        ConnectionFactory connectionFactory = new ConnectionFactory();
        Connection connection = connectionFactory.obtemConexao();
        
        if (connection != null) {
            System.out.println("Conexão testada e aprovada!");
        } else {
            System.out.println("Falha na conexão!");
        }
    }
}
