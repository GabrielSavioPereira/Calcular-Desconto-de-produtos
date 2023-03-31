package ATIVIDADE;

import java.util.Scanner;

public class atividade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String continuar = "S";
        String nome, maisCaro = null, maisBarato = null;
        float preco, precodesconto = 0, maiorP, menorP, total;
        int quantidade, codigo, desc, cont;
        maiorP = 0;
        menorP = 9999;
        total = 0;
        cont = 0;
        desc = 0;
        System.out.println("Pressione Enter para começar");
        while(continuar.equals("S")){
        scan.nextLine();

        System.out.println("Digite o nome do produto: ");
        nome = scan.nextLine();
        System.out.println("Digite o preço do produto: ");
        preco = scan.nextFloat();
        System.out.println("Digite o codigo do produto: ");
        codigo = scan.nextInt();
        if ((codigo == 1 | codigo == 2 | codigo ==3)&&(preco >= 1000)){
        precodesconto = (float) (preco - (preco * 0.015));
        System.out.println("O código deste produto contem desconto de 1.5% ficou R$: " +(precodesconto));
        }else{
            precodesconto = preco;
            System.out.println("O produto não contem desconto");
        }
        System.out.println("Digite  a quantidade vendida: ");
       quantidade = scan.nextInt();
        System.out.println("O total da venda deste produto: " +(precodesconto * quantidade));
        if (preco > maiorP ){

        
        maiorP = preco;
        maisCaro = nome;
        if (preco < maiorP);
        menorP = preco;
        maisBarato = nome;
    }
    total += precodesconto;
    cont++;
    System.out.println("Deseja continuar? (S/N)");
    continuar = scan.next().toUpperCase();
    System.out.println("/*************************************/");
    }

    System.out.println("O produto mais barato é: "+ maisBarato +" por R$"+menorP);
    System.out.println("O produto mais barato é: "+ maisCaro +" por R$"+maiorP);
    System.out.printf("Sua compra total foi de: R$ %.2f",total);
    if (total <= 5000){
        System.out.println("Não Tem Desconto");
    }else{
        if (total >= 10000){
            System.out.println("Teve um desconto de 3%"+(total * 0.3)+" O novo valor é de: "+(total -(total * 0.05)));
        }else{
            if(total > 10000){
                System.out.println("Teve um desconto de 5%"+(total * 0.5)+" O novo valor é de: "+(total -(total * 0.05)));
            }
        }
        System.out.println("Total de produtos com desconto especial: "+desc);
        System.out.println("A media geral de vendas foi de: R$" +((precodesconto)/cont));
    }
}
}

    

