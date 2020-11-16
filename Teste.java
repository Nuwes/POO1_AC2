package ac2;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste3 {
    
    public static void imprimirSomatorioCursosV1(ArrayList<Escola> escolas){
        double soma=0;

        for(Escola escola: escolas){
            for(Curso curso: escola.getCursos()){
                soma += curso.calcularTotalCurso();
            }
        }

        System.out.println("Soma = " + soma);
    }

    public static void imprimirSomatorioCursosV2(ArrayList<Escola> escolas){
        double soma=0;

        for(Escola escola: escolas){
             soma += escola.somarTotalCursos();
            
        }

        System.out.println("Soma = " + soma);
    }


    public static void main(String[] args) {

        int op;
        Scanner s = new Scanner(System.in);
        ArrayList <Escola> escolas = new ArrayList<Escola>();
        ArrayList <Escola> codigo = new ArrayList<Escola>();
        ArrayList <Curso> numero = new ArrayList<Curso>();


        Escola e1 = new Escola();
        e1.setCodigo(codigo.size()+1);
        codigo.add(e1);
        
        Escola e2 = new Escola();
        e2.setCodigo(codigo.size()+1);
        codigo.add(e2);

        escolas.add(e1);
        escolas.add(e2);

        Curso c = new Curso();
        c.setNumero(numero.size()+1);
        numero.add(c);

        Curso c2 = new Curso();
        c2.setNumero(numero.size()+1);
        numero.add(c2);
        
        Curso c3 = new Curso();
        c3.setNumero(numero.size()+1);
        numero.add(c3);
        
        Curso c4 = new Curso();
        c4.setNumero(numero.size()+1);
        numero.add(c4);
        
        Curso c5 = new Curso();
        c5.setNumero(numero.size()+1);
        numero.add(c5);
        
        
        do{
            System.out.println("---------------------------------------------");
            System.out.println("Digite uma opcao: ");
            System.out.println("1. Curso 1 ");
            System.out.println("2. Curso 2 ");
            System.out.println("3. Curso 3 ");
            System.out.println("4. Curso 4 ");
            System.out.println("5. Curso 5 ");
            System.out.println("6. Sair ");
            op = Integer.parseInt(s.nextLine());
            System.out.println("---------------------------------------------");

            switch (op) {
                
                case 1:
                System.out.println("---------------------------------------------");
                System.out.println("Digite uma opcao: ");
                System.out.println("1. Escola 1 ");
                System.out.println("2. Escola 2 ");
                op = Integer.parseInt(s.nextLine());
                System.out.println("---------------------------------------------");
                if(op==1){
                    System.out.println("Descricao do curso: ");
                    c.setDescricao(s.nextLine());
                    e1.addCurso(c);
                    c.setEscola(e1);
                }
                else{
                    System.out.println("Descricao do curso: ");
                    c.setDescricao(s.nextLine());
                    e2.addCurso(c);
                    c.setEscola(e2);
                }
                break;

                case 2:
                System.out.println("---------------------------------------------");
                System.out.println("Digite uma opcao: ");
                System.out.println("1. Escola 1 ");
                System.out.println("2. Escola 2 ");
                op = Integer.parseInt(s.nextLine());
                System.out.println("---------------------------------------------");
                    if(op==1){
                        System.out.println("Descricao do curso: ");
                        c2.setDescricao(s.nextLine());
                        e1.addCurso(c2);
                        c2.setEscola(e1);
                    }
                    else{
                        System.out.println("Descricao do curso: ");
                        c2.setDescricao(s.nextLine());
                        e2.addCurso(c2);
                        c2.setEscola(e2);
                    }
                    break;   
                    case 3:
                    System.out.println("---------------------------------------------");
                    System.out.println("Digite uma opcao: ");
                    System.out.println("1. Escola 1 ");
                    System.out.println("2. Escola 2 ");
                    op = Integer.parseInt(s.nextLine());
                    System.out.println("---------------------------------------------");
                    if(op==1){
                        System.out.println("Descricao do curso: ");
                        c3.setDescricao(s.nextLine());
                        e1.addCurso(c3);
                        c3.setEscola(e1);
                    }
                    else{
                        System.out.println("Descricao do curso: ");
                        c3.setDescricao(s.nextLine());
                        e2.addCurso(c3);
                        c3.setEscola(e2);
                    }
                    break;
    
                    case 4:
                    System.out.println("---------------------------------------------");
                    System.out.println("Digite uma opcao: ");
                    System.out.println("1. Escola 1 ");
                    System.out.println("2. Escola 2 ");
                    op = Integer.parseInt(s.nextLine());
                    System.out.println("---------------------------------------------");
                        if(op==1){
                            System.out.println("Descricao do curso: ");
                            c4.setDescricao(s.nextLine());
                            e1.addCurso(c4);
                            c4.setEscola(e1);
                        }
                        else{
                            System.out.println("Descricao do curso: ");
                            c4.setDescricao(s.nextLine());
                            e2.addCurso(c4);
                            c4.setEscola(e2);
                        }
                        break;   
                        case 5:
                        System.out.println("---------------------------------------------");
                        System.out.println("Digite uma opcao: ");
                        System.out.println("1. Escola 1 ");
                        System.out.println("2. Escola 2 ");
                        op = Integer.parseInt(s.nextLine());
                        System.out.println("---------------------------------------------");
                            if(op==1){
                                System.out.println("Descricao do curso: ");
                                c5.setDescricao(s.nextLine());
                                e1.addCurso(c5);
                                c5.setEscola(e1);
                            }
                            else{
                                System.out.println("Descricao do curso: ");
                                c5.setDescricao(s.nextLine());
                                e2.addCurso(c5);
                                c5.setEscola(e2);
                            }
                            break;   
            }
        }while(op!=6);

        System.out.println("Estabelenco relacoes entre os objetos!");
        System.out.println("---------------------------------------------");
        System.out.println("Codigo da escola: " + e1.getCodigo());
        System.out.println("Nome da Escola: ");
        e1.setNome(s.nextLine());
        System.out.println("Total de Cursos da escola " + e1.getQuantidadeCursos());
        System.out.println("---------------------------------------------");
        System.out.println("Codigo da escola: " + e2.getCodigo());
        System.out.println("Nome da Escola: ");
        e2.setNome(s.nextLine());
        System.out.println("Total de Cursos da escola: " + e2.getQuantidadeCursos());
         System.out.println("---------------------------------------------");

        System.out.println("Escola do curso " + c.getEscola().getNome());
        System.out.println("Codigo do curso= " + c.getNumero());
        System.out.println("Descricao do curso= " + c.getDescricao());
        System.out.println("*******************************************");
        System.out.println("Escola do curso " + c2.getEscola().getNome());
        System.out.println("Codigo do curso= " + c2.getNumero());
        System.out.println("Descricao do curso= " + c2.getDescricao());
        System.out.println("*******************************************");
        System.out.println("Escola do curso " + c3.getEscola().getNome());
        System.out.println("Codigo do curso= " + c3.getNumero());
        System.out.println("Descricao do curso= " + c3.getDescricao());
        System.out.println("*******************************************");
        System.out.println("Escola do curso " + c4.getEscola().getNome());
        System.out.println("Codigo do curso= " + c4.getNumero());
        System.out.println("Descricao do curso= " + c4.getDescricao());
        System.out.println("*******************************************");
        System.out.println("Escola do curso " + c5.getEscola().getNome());
        System.out.println("Codigo do curso= " + c5.getNumero());
        System.out.println("Descricao do curso= " + c5.getDescricao());
        System.out.println("*******************************************");

        s.close();

    }

}
