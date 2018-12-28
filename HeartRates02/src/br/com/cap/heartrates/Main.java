package br.com.cap.heartrates;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws SQLException {
		
			
           Scanner input = new Scanner(System.in);
			
			
			HeartRates heartRates = new HeartRates();
			System.out.println("Qual o seu nome? ");
			heartRates.setNome(input.nextLine());
			
			
			System.out.println("Qual o seu sobrenome? ");
			heartRates.setSobrenome(input.nextLine());
			
			System.out.println("Em que dia você nasceu? ");
			heartRates.setDiaNascimento(Integer.parseInt(input.nextLine()));
			
			System.out.println("Em que mes você nasceu? ");
			heartRates.setMesNascimento(Integer.parseInt(input.nextLine()));
			
			System.out.println("Em que ano você nasceu? ");
			heartRates.setAnoNascimento(Integer.parseInt(input.nextLine()));
			
			
		
			int idade =  heartRates.calcularIdade(2018);
			
			System.out.println("Sua idade é: " + idade);
			System.out.println("Sua frequencia cardiaca é: " + heartRates.calculaFrequenciaCardiaca(idade));
			System.out.println("" + heartRates.retornaFrequenciaAlvo(idade)); 
		
		        Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost/bd_projeto?useTimezone=true&serverTimezone=UTC", "root", "" );
		        System.out.println("Conectado!");
		      try {
		        String sql = "insert into paciente " +
		                "(nome,sobrenome,diaNascimento,mesNascimento, anoNascimento) " +
		                "values (?,?,?,?,?)";
		        PreparedStatement stmt = conexao.prepareStatement(sql);
		        stmt.setString(1, heartRates.getNome());
		        stmt.setString(2, heartRates.getSobrenome());
		        stmt.setInt(3, heartRates.getDiaNascimento());
		        stmt.setInt(4, heartRates.getMesNascimento());
		        stmt.setInt(5,heartRates.getAnoNascimento());
		        stmt.execute();
		        conexao.close();
		    } catch (SQLException e) {
		    	System.out.println("Deu problema na comunicação: " +e.getMessage());
		    }
		
	}
}
			
		
			
			
			





