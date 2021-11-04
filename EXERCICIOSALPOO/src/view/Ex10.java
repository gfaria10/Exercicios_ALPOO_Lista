package view;

import java.io.FileWriter;

public class Ex10 {

    public static void main(String[] args) {
	// write your code here

        try {
            FileWriter fw;
            fw = new FileWriter("arq.txt",true);
            fw.write("Nome: Gabriel Faria R. Santos\nIdade: 19\nEmail: gabrielfaria168@gmail.com");
            fw.close();
        }catch (Exception e){
            System.out.println("Erro "+e.getMessage());
            }
    }
}