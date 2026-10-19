package archive_application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner; 

import archive_entities.ArchProduct;



public class ArchProductMain {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o caminho do arquivo:");
        String strSourceFile = sc.nextLine();

        File sourceFile = new File(strSourceFile);

        String sourceFolderStr = sourceFile.getParent();
        // Criando a subpasta "out"

        boolean success = new File(sourceFolderStr + "\\out").mkdir();
        String targetFileStr = sourceFolderStr + "\\out\\summary.csv";
        List<ArchProduct> list = new ArrayList<>();
        // Lendo o arquivo de origem
        try (BufferedReader br = new BufferedReader(new FileReader(strSourceFile))) {
            String itemCsv = br.readLine();
            while (itemCsv != null) {
                String[] fields = itemCsv.split(",");
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);
                list.add(new ArchProduct(name, price, quantity));
                itemCsv = br.readLine();
            }
   // Escrevendo no arquivo de destino (summary.csv)
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {
                for (ArchProduct item : list) {
                    bw.write(item.getName() + "," + String.format("%.2f", item.Totalprice()));
                    bw.newLine();
                }
                System.out.println(targetFileStr + " CRIADO COM SUCESSO!");
            } catch (IOException e) {
                System.out.println("Erro ao escrever o arquivo: " + e.getMessage());
            }

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
        sc.close();

    }

}