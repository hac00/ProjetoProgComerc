package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.bean.Vacina;

public class VacinaDAO {

    private Connection con = null;

    public VacinaDAO() {
        con = ConnectionFactory.getConnection();
    }

    public boolean create(Vacina vacina) {
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO vacina (nome, fabricante, doses_necessarias) VALUES (?, ?, ?)");
            stmt.setString(1, vacina.getNome());
            stmt.setString(2, vacina.getFabricante());
            stmt.setInt(3, vacina.getDosesNecessarias());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro ao salvar: " + ex);
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public ArrayList<Vacina> read() {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Vacina> ListaVacinas = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM vacina ORDER by id");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Vacina vacina = new Vacina();
                vacina.setId(rs.getInt("id"));
                vacina.setNome(rs.getString("nome"));
                vacina.setFabricante(rs.getString("fabricante"));
                vacina.setDosesNecessarias(rs.getInt("doses_necessarias"));
                ListaVacinas.add(vacina);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao ler as Vacinas: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return ListaVacinas;
    }

    public ArrayList<Vacina> getVacinasNome(String nome) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Vacina> listaVacinas = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM vacina WHERE nome ILIKE ? ORDER by id");
            stmt.setString(1, "%" + nome + "%");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Vacina vacina = new Vacina();
                vacina.setId(rs.getInt("id"));
                vacina.setNome(rs.getString("nome"));
                vacina.setFabricante(rs.getString("fabricante"));
                vacina.setDosesNecessarias(rs.getInt("doses_necessarias"));
                listaVacinas.add(vacina);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao ler as Vacinas: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return listaVacinas;
    }

    public ArrayList<Vacina> getVacinasFabricante(String fabricante) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Vacina> listaVacinas = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM vacina WHERE fabricante ILIKE ? ORDER by id");
            stmt.setString(1, "%" + fabricante + "%");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Vacina vacina = new Vacina();
                vacina.setId(rs.getInt("id"));
                vacina.setNome(rs.getString("nome"));
                vacina.setFabricante(rs.getString("fabricante"));
                vacina.setDosesNecessarias(rs.getInt("doses_necessarias"));
                listaVacinas.add(vacina);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao ler as Vacinas: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return listaVacinas;
    }

    public ArrayList<Vacina> getVacinasDoses(int doses) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Vacina> listaVacinas = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM vacina WHERE doses_necessarias = ? ORDER by id");
            stmt.setInt(1, doses);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Vacina vacina = new Vacina();
                vacina.setId(rs.getInt("id"));
                vacina.setNome(rs.getString("nome"));
                vacina.setFabricante(rs.getString("fabricante"));
                vacina.setDosesNecessarias(rs.getInt("doses_necessarias"));
                listaVacinas.add(vacina);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao ler as Vacinas: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return listaVacinas;
    }

    public boolean update(Vacina vacina) {
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE vacina set nome = ?, fabricante = ?, doses_necessarias = ? WHERE id = ?");
            stmt.setString(1, vacina.getNome());
            stmt.setString(2, vacina.getFabricante());
            stmt.setInt(3, vacina.getDosesNecessarias());
            stmt.setInt(4, vacina.getId());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro ao atualizar: " + ex);
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public boolean delete(Vacina vacina) {
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM vacina WHERE id = ?");
            stmt.setInt(1, vacina.getId());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro ao excluir: " + ex);
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}