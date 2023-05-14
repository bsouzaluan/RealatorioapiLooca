package org.example;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.discos.Disco;
import com.github.britooo.looca.api.group.discos.DiscoGrupo;
import com.github.britooo.looca.api.group.memoria.Memoria;
import com.github.britooo.looca.api.group.processador.Processador;
import com.github.britooo.looca.api.group.processos.ProcessoGrupo;
import com.github.britooo.looca.api.group.rede.Rede;
import com.github.britooo.looca.api.group.rede.RedeInterface;
import com.github.britooo.looca.api.group.servicos.Servico;
import com.github.britooo.looca.api.group.servicos.ServicoGrupo;
import com.github.britooo.looca.api.group.sistema.Sistema;
import com.github.britooo.looca.api.group.temperatura.Temperatura;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import java.util.List;

public class Main {

  public static void main(String[] args) throws IOException {

        try {
            Looca looca = new Looca();

            Sistema sistema = looca.getSistema();
            Memoria memoria = looca.getMemoria();
            DiscoGrupo grupoDisco = looca.getGrupoDeDiscos();
            List<Disco> discos = grupoDisco.getDiscos();
            Rede rede = looca.getRede();

            List<RedeInterface> redes = new ArrayList();

            new Timer().scheduleAtFixedRate(new TimerTask() {
                @Override
                public void run() {

                    System.out.println(("Sistema operacional: " + sistema.getSistemaOperacional() + "  Tempo de atividade: " + sistema.getTempoDeAtividade()));

                    System.out.println("Memória disponivel: " + memoria.getDisponivel() + " Memória em uso: " + memoria.getEmUso() + " Total de memória: " + memoria.getTotal());

                    for (Disco disco : discos) {
                        System.out.println("Bytes de escritas: " + disco.getBytesDeEscritas() + " Bytes de leitura: " + disco.getBytesDeLeitura());

                    }

                   for (int i = 0; i < rede.getGrupoDeInterfaces().getInterfaces().size(); i++) {
                  
                    
                    if(!rede.getGrupoDeInterfaces().getInterfaces().get(i).getEnderecoIpv4().isEmpty() && rede.getGrupoDeInterfaces().getInterfaces().get(i).getPacotesRecebidos() > 0 && rede.getGrupoDeInterfaces().getInterfaces().get(i).getPacotesEnviados() > 0){
                        
                        redes.add(rede.getGrupoDeInterfaces().getInterfaces().get(i));
                        System.out.println("Pacotes enviados: " + rede.getGrupoDeInterfaces().getInterfaces().get(i).getPacotesEnviados()+ " Pacotes recebidos: " + rede.getGrupoDeInterfaces().getInterfaces().get(i).getPacotesRecebidos());
                    }
                }
                }
            }, 0, 5000);
        } catch (Exception e) {

            salvarLogErro("Ocorreu um erro em " + new Date() + e.getMessage());
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
