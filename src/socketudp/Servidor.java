package socketudp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author frapi
 */
public class Servidor {
    public static void main(String[] args) {
        try{
            DatagramSocket socket = new DatagramSocket(1100);
            //String mensagem = "";
            while(true){
                byte[] msg = new byte[50];
                DatagramPacket pacote = new DatagramPacket(msg,50);
                socket.receive(pacote);
                
                byte[] tit = new byte[50];
                DatagramPacket titulo = new DatagramPacket(tit,50);
                socket.receive(titulo);
                
                byte[] color = new byte[50];
                DatagramPacket cor = new DatagramPacket(color,50);
                socket.receive(cor);
                
                byte[] tamanho = new byte[50];
                DatagramPacket tam = new DatagramPacket(tamanho,50);
                socket.receive(tam);
                
                byte[] neg = new byte[50];
                DatagramPacket negrito = new DatagramPacket(neg,50);
                socket.receive(negrito);
                
                byte[] ita = new byte[50];
                DatagramPacket italico = new DatagramPacket(ita,50);
                socket.receive(italico);
                
                byte[] fonte = new byte[50];
                DatagramPacket font = new DatagramPacket(fonte,50);
                socket.receive(font);
                
                FileWriter txt = new FileWriter("C:\\Users\\Public\\Documents\\mensagem.txt");
                PrintWriter gravarTxt = new PrintWriter(txt);
                gravarTxt.write(new String(titulo.getData()).trim()+"\n\n"+new String(pacote.getData()).trim());
                gravarTxt.flush();
                FileWriter formt = new FileWriter("C:\\Users\\Public\\Documents\\formatacao.txt");
                PrintWriter gravarFormt = new PrintWriter(formt);
                gravarFormt.write("Cor: "+new String(cor.getData()).trim()+"\nTamanho: "+new String(tam.getData()).trim()+"\nFonte: "+new String(font.getData()).trim()
                +"\nNegrito: "+new String(negrito.getData()).trim()+"\nItalico: "+new String(italico.getData()).trim());
                gravarFormt.flush();
                System.out.println("Mensagem salva e recebida: "+ new String(cor.getData()).trim()+ " Tamanho: "+ pacote.getLength());
            }
            
        }catch(SocketException e){
            System.out.println("Erro no Socket"+ e.getMessage());
        }catch(IOException e){
            System.out.println("Erro no envio/recebimento "+ e.getMessage());
        }
    }
    
}
