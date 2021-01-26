
package data;

public class Jogador {
    private String nome;
    private String posicao;
    private double numcamisa;
    private double ritmo;
    private double finalizacao;
    private double defesa;
    private double passe;
    private double drible;
    private double cobrFalta;
    private double cobrPenalti;
  // exclusivo goleiro
    private String posicionamento;
    private double reflexo;
    private double chute;
    
    public Jogador() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getPosicao(){
        return posicao;
    }
    public void setPosicao(String posicao){
        this.posicao = posicao;
    }

    public double getNumcamisa() {
        return numcamisa;
    }

    public void setNumcamisa(double numcamisa) {
        this.numcamisa = numcamisa;
    }

    public double getRitmo() {
        return ritmo;
    }

    public void setRitmo(double ritmo) {
        this.ritmo = ritmo;
    }

    public double getFinalizacao() {
        return finalizacao;
    }

    public void setFinalizacao(double finalizacao) {
        this.finalizacao = finalizacao;
    }

    public double getDefesa() {
        return defesa;
    }

    public void setDefesa(double defesa) {
        this.defesa = defesa;
    }

    public double getPasse() {
        return passe;
    }

    public void setPasse(double passe) {
        this.passe = passe;
    }

    public double getDrible() {
        return drible;
    }

    public void setDrible(double drible) {
        this.drible = drible;
    }

    public double getCobrFalta() {
        return cobrFalta;
    }

    public void setCobrFalta(double cobrFalta) {
        this.cobrFalta = cobrFalta;
    }

    public double getCobrPenalti() {
        return cobrPenalti;
    }

    public void setCobrPenalti(double cobrPenalti) {
        this.cobrPenalti = cobrPenalti;
    }

    public String getPosicionamento() {
        return posicionamento;
    }

    public void setPosicionamento(String posicionamento) {
        this.posicionamento = posicionamento;
    }

    public double getReflexo() {
        return reflexo;
    }

    public void setReflexo(double reflexo) {
        this.reflexo = reflexo;
    }

    public double getChute() {
        return chute;
    }

    public void setChute(double chute) {
        this.chute = chute;
    }
    
}
