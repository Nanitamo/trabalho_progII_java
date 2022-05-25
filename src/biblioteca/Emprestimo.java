/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author nantonio1
 */
public class Emprestimo {
   
    private String dataEmprestimo;
    private String horaEmprestimo;
    private Livro livro;
    private Usuario usuario;

    public Emprestimo() {
    }

    public Emprestimo(String dataEmprestimo, String horaEmprestimo, Livro livro, Usuario usuario) {
        this.dataEmprestimo = dataEmprestimo;
        this.horaEmprestimo = horaEmprestimo;
        this.livro = livro;
        this.usuario = usuario;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getHoraEmprestimo() {
        return horaEmprestimo;
    }

    public void setHoraEmprestimo(String horaEmprestimo) {
        this.horaEmprestimo = horaEmprestimo;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

   @Override
    public String toString() {
        return ("Data Emprestimo; " + dataEmprestimo + "; Hora Emprestimo; " + horaEmprestimo + "; Livro; " + livro.getTitulo() + ";Usuario; " + usuario.getNome() + "; \n");
    }
    
    
    
}
