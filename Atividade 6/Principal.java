public class Principal {

    public static void main(String[] args) {
        
        Data d1 = new Data(10,10,2015);
        Data d2 = new Data(1,10,2015);
        

    	Funcionario f= new Funcionario("Func1",d1,10,100);
    	Aluno a = new Aluno("Aluno1",d2,"12345");

    	System.out.println(f);
    	System.out.println(a);
    }
}
