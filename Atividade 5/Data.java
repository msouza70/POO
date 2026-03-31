public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public Data(int dia, int mes) {
        this.dia = dia;
        this.mes = mes;
        this.ano = 2026;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (dia>=1 && dia<=31)
            this.dia = dia;
        else System.out.println("Dia inválido");
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (mes>=1 && mes<=31)
            this.mes = mes;
        else System.out.println("Mês inválido");
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano>=2026)
            this.ano = ano;
        else System.out.println("Ano inválido");
    }

    public String toString() {
        return this.dia + "/" + this.mes + "/" + this.ano;
    }
  
}