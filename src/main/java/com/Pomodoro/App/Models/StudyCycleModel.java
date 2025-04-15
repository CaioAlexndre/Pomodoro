package com.Pomodoro.App.Models;


import com.Pomodoro.App.Models.Dtos.CycleInfo;

import java.sql.*;

public class StudyCycleModel
{

    String Username;
    String CycleName;
    String CycleId;
    boolean CycleConclusion;

    public StudyCycleModel(CycleInfo cycleInfo)
    {
        this.Username = cycleInfo.getUsername();
        this.CycleName = cycleInfo.getCycleName();
        this.CycleConclusion = cycleInfo.isCycleConclusion();

        //cada ciclo e gerado por um metodo ou por um outro model.
        CycleId = "abc0001";
    }

    public String getUsername()
    {
        return Username;
    }

    public String getCycleName()
    {
        return CycleName;
    }

    public String getCycleId()
    {
        return CycleId;
    }

    public boolean isCycleConclusion()
    {
        return CycleConclusion;
    }


    //enfim criar uma classe exclusiva somente para isso.
    //talvez seja melhor mover isso para um outro controllador ou model.
    public static Connection conectar()
    {

        String url = "jdbc:sqlserver://CAIO_ALEXANDRE\\CONECTION_FORDEV;databaseName=pomodoro_app;integratedSecurity=true;Encrypt=False;";
        Connection conn = null;

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(url);
            return conn;

        } catch (ClassNotFoundException e) {
            System.err.println("Driver não encontrado: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Erro de conexão: " + e.getMessage());
        } finally {
            try {
                if (conn != null && !conn.isClosed()) {

                }
            } catch (SQLException e) {
                System.err.println("Erro ao fechar a conexão: " + e.getMessage());
            }
        }

        return conn;
    }


    //crie um metodo para caso o usuario esteja fazendo seu primeiro ciclo,ocorrra uma insercao na tabela
    //depois o banco de dados so ira fica atualizando os valores e registrando quando eles foram atualizados.

    public boolean SaveCycleBD(StudyCycleModel studyCycle)
    {

        try (Connection conexao = StudyCycleModel.conectar())
        {
            String sql = "INSERT INTO Cycles (Username, CycleName, CycleId, CycleConclusion) VALUES (?, ?, ?, ?)";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, studyCycle.getUsername());
            stmt.setString(2, studyCycle.getCycleName());
            stmt.setString(3, studyCycle.getCycleId());
            stmt.setBoolean(4, studyCycle.isCycleConclusion());
            stmt.executeUpdate();

            System.out.println("ae deu certo");
        }
        catch (SQLException e)
        {
            return false;
        }

        return true;
    }


}




