package com.br.pauloH.AluraCursos;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita1 {

    public static void main(String[] args) throws IOException {

    //Fluxo de Entrada com Arquivo
    //OutputStream fos = new FileOutputStream("testeeeeee.txt");
    //Writer osw = new OutputStreamWriter(fos);
    //Buff3eredWriter bw = new BufferedWriter(osw);

    FileWriter fw = new FileWriter("loremxx2.txt");
    fw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
    fw.write("\r\n");
    fw.write("\r\n");
    fw.write("asfasdfsafdas dfs sdf asf assdﬂ");

    fw.close();

    }
}