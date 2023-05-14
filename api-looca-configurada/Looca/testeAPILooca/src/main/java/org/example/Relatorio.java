/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example;

/**
 *
 * @author luanb
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import static java.time.Instant.now;
import java.util.Date;

public class Relatorio {

    public static void main(String[] args) throws IOException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String horaAtual = sdf.format(new Date());
        
        
        try {
            Totem totem = new Totem(null, "Totem1", 1);
        } catch (MainException e) {
            salvarLogErro("Ocorreu um erro em " + horaAtual + e.getMessage());
        }
        try {
            Totem totem1 = new Totem(1, null, 1);
        } catch (MainException e) {
            salvarLogErro("Ocorreu um erro em " + horaAtual + e.getMessage());
        }
        try {
            Totem totem2 = new Totem(1, "Totem2", null);
        } catch (MainException e) {
            salvarLogErro("Ocorreu um erro em " + horaAtual+ e.getMessage());
        }

        try {
            Configuracao configuracao = new Configuracao(null, 1, 5.00, "GHz");
        } catch (MainException e) {
            salvarLogErro("Ocorreu um erro em " + horaAtual + e.getMessage());
        }
        try {
            Configuracao configuracao1 = new Configuracao(1, null, 4.00, "GHz");
        } catch (MainException e) {
            salvarLogErro("Ocorreu um erro em " + horaAtual + e.getMessage());
        }

        try {
            Configuracao configuracao2 = new Configuracao(1, 2, null, "GHz");
        } catch (MainException e) {
            salvarLogErro("Ocorreu um erro em " + horaAtual + e.getMessage());
        }

        try {
            Configuracao configuracao3 = new Configuracao(1, 2, 6.00, null);
        } catch (MainException e) {
            salvarLogErro("Ocorreu um erro em " + horaAtual + e.getMessage());
        }

        try {
            Componente componente = new Componente(null, null, null);
            Medida medida = new Medida(null, null, null, null);
            Empresa empresa = new Empresa(null, null, null, null, null, null, null);

        } catch (MainException e) {
            salvarLogErro("Ocorreu um erro em " + horaAtual + e.getMessage());
        }

    }

    private static void salvarLogErro(String mensagem) throws IOException {

        try {
            Path path = Paths.get("D:/logs/");

            if (!Files.exists(path)) {
                Files.createDirectory(path);
            }

//    criando um arquivo txt dentro do log
            File log = new File("D:/logs/logs.txt");

            if (!log.exists()) {
                log.createNewFile();
            }

            //escrevendo no txt
            FileWriter fw = new FileWriter(log, true);

            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(mensagem);
            bw.newLine();

            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
