/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.util.List;
import javax.swing.JOptionPane;
import model.Usuario;
import model.UsuarioDAO;

/**
 *
 * @author S.Lucas
 */
public class UsuarioController {

    private UsuarioDAO usuarioDAO;

    public UsuarioController() {
        usuarioDAO = new UsuarioDAO();
    }

    public boolean autenticar(String email, String senha) {
        if (usuarioDAO.autenticar(email, senha)) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "usuario ou senha incorreta");
            return false;
        }
    }

    public boolean adicionarUsuario(Usuario u) {
        if (usuarioDAO.adicionarUsuario(u)) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Usuário não cadastrado");
            return false;
        }
    }

    public boolean alterarUsuario(Usuario u, Long pk) {
        if (usuarioDAO.alterarUsuario(u, pk)) {
            return false;
        } else {
            JOptionPane.showMessageDialog(null, "Usuario não encontrado");
            return false;
        }
    }

    public List<Usuario> readForDesc(int tipo, String desc) {
        return usuarioDAO.readForDesc(tipo, desc);
    }

    public Usuario readForPk(long pk) {
        Usuario usu = usuarioDAO.readForPk(pk);
        if (usu == null) {
            JOptionPane.showMessageDialog(null, "Usuário não encontrado");
            return null;
        }
        return usu;
    }

    public boolean excluirUsuario(int pkUsuario) {
        if (usuarioDAO.excluirUsuario(pkUsuario)) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Usuário não excluido");
            return false;
        }
    }
}
