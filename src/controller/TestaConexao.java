
package controller;

import java.sql.Connection;

public class TestaConexao {
    public static void main(String[] args) {
        Connection con = ConnectionFactory.getConnection();
        
        if(con != null){
            System.out.println("Conexao com sucesso!");
        }
    }
}
