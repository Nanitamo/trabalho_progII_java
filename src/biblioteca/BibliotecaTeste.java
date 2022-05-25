/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author nantonio1
 */
public class BibliotecaTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String fileName = "EmprestimoLivros.csv";
        String folder = "C:\\Users\\nantonio1\\Desktop\\ArquivosM2";
        String path = folder + "\\" + fileName;
        Scanner leitura = new Scanner(System.in);
        List<String> emprestimos = new ArrayList<>();
        
        System.out.println("Insira os dados do emprestimo: ");
        System.out.println("Data: ");
        String data = leitura.nextLine();
        System.out.println("Hora: ");
        String hora = leitura.nextLine();
        System.out.println("Nome: ");
        String userName = leitura.nextLine();
        
        Livro livro1 = new Livro("Programação em Java", "Afonso Bunga", "IT", "Porto Editora", 2021, "1ª Edição", 420);
        Livro livro2 = new Livro("Programação em C", "Jose Nsakala", "IT", "Porto Editora", 2021, "10ª Edição", 600);

        Usuario usuario1 = new Usuario(userName, 16, 'F', 123456789);
        Usuario usuario2 = new Usuario("Gaspar Bernardo", 14, 'M', 123456789);

        Emprestimo emp1 = new Emprestimo(data, hora, livro1, usuario1);
        Emprestimo emp2 = new Emprestimo("2022/05/09", "10:00AM", livro2, usuario2);

        emprestimos.add("Data do Emprestimo; Hora do Emprestimo; Livro; Usuario;");
        emprestimos.add(emp1.getDataEmprestimo() + " ; " + emp1.getHoraEmprestimo() + " ; " + emp1.getLivro().getTitulo() + " ; " + emp1.getUsuario().getNome() + ";");
        emprestimos.add(emp2.getDataEmprestimo() + " ; " + emp2.getHoraEmprestimo() + " ; " + emp2.getLivro().getTitulo() + " ; " + emp2.getUsuario().getNome() + ";");

        gravarEmprestimo(fileName, path, emprestimos);
        lerEmprestimo(path);
    }

    private static void gravarEmprestimo(String fileName, String path, List<String> emprestimos) {
        FileWriter stream;
        PrintWriter print;

        try {
            //stream é uma conexao de escrita para o arquivo
            stream = new FileWriter(path);
            //class PrintWriter vai escrever no arquivo
            print = new PrintWriter(stream);

            for (String linha : emprestimos) {
                print.println(linha);
            }
            //fechar o arquivo
            stream.close();
            print.close();

            System.out.println("O arquivo " + fileName + " foi guardado na pasta " + path);
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    private static void lerEmprestimo(String path) {
        try {
            // Abrir o arquivo;
            FileReader stream = new FileReader(path);

            // Classe que possui o metodo readLine()
            // A cada linha do arquivo, retorna uma String existente ou null caso não exista
            BufferedReader reader = new BufferedReader(stream);

            // Ler cada linha do Arquivo
            String linha = reader.readLine();

            while (linha != null) {
                System.out.println(linha);
                linha = reader.readLine();
            }
            reader.close();
            //Fechar o arquivo
            stream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}


