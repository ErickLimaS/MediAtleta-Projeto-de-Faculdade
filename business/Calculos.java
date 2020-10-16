package business;

    import java.text.DecimalFormat; 

public class Calculos {

    // MÉTODOS "MATEMÁTICOS" PARA A CRIAÇÃO DA MÉDIA DOS ATLETAS
     
    private byte ritmo, drible, finalizacao, defesa, passe, cobrPenalti, cobrFalta, posicionamento, reflexos, chute, numCamisa;
    private String nome, media, posicao;
    
    public Calculos(){
    }

    DecimalFormat df = new DecimalFormat("#.00");               // LIMITA A 2 DECIMAIS A VARIAVEL MEDIA

    // ATAQUE
    public String atacante(float ritmo, float drible, float finalizacao, float defesa, float passe, float cobrPenalti, float cobrFalta) { 
        if (defesa == 55 || defesa > 55 && defesa <64){
            defesa = (float) (defesa * 1.15);
        }
        if (defesa == 65 || defesa > 65 && defesa <69){
            defesa = (float) (defesa * 1.50);
        }
        if (defesa == 70 || defesa > 70 && defesa <99){
            defesa = (float)(defesa * 1.65);
        }
        if (cobrPenalti == 70 || cobrPenalti>70 && cobrPenalti<79){
            cobrPenalti = (float)(cobrPenalti * 1.10);
        }
        if (cobrPenalti == 80 || cobrPenalti>80 && cobrPenalti<99){
            cobrPenalti = (float)(cobrPenalti * 1.15);
        }
        if (cobrFalta == 70 || cobrFalta>70 && cobrFalta<79){
            cobrFalta = (float)(cobrFalta * 1.15);
        }
        if (cobrFalta == 80 || cobrFalta>80 && cobrFalta<99){
            cobrFalta = (float)(cobrFalta * 1.30);
        }
        media = df.format((ritmo + drible + finalizacao + defesa + passe + cobrPenalti + cobrFalta) /7);

        return media;
    }

    public String pontaDireEsq(float ritmo, float drible, float finalizacao, float defesa, float passe, float cobrPenalti, float cobrFalta){ 
        if (defesa == 55 || defesa > 55 && defesa <64){
            defesa = (float)(defesa * 1.15);
        }
        if (defesa == 65 || defesa > 65 && defesa <69){
            defesa = (float)(defesa * 1.50);
        }
        if (defesa == 70 || defesa > 70 && defesa <99){
            defesa = (float)(defesa * 1.65);
        }
        if (passe == 65 || passe > 65 && passe <69){
            passe = (float)(passe * 1.15);
        }
        if (passe == 70 || passe > 70 && passe <99){
            passe = (float)(passe * 1.50);
        }
        if (cobrPenalti == 70 || cobrPenalti>70 && cobrPenalti<79){
            cobrPenalti = (float)(cobrPenalti * 1.10);
        }
        if (cobrPenalti == 80 || cobrPenalti>80 && cobrPenalti<99){
            cobrPenalti = (float)(cobrPenalti * 1.30);
        }
        if (cobrFalta == 70 || cobrFalta>70 && cobrFalta<79){
            cobrFalta = (float)(cobrFalta * 1.20);
        }
        if (cobrFalta == 80 || cobrFalta>80 && cobrFalta<99){
            cobrFalta = (float)(cobrFalta * 1.30);
        }
        media = df.format((ritmo + drible + finalizacao + defesa + passe + cobrPenalti + cobrFalta) /7);

        return media;
    }

    // MEIO DE CAMPO
    public String meioCampo(float ritmo, float drible, float finalizacao, float defesa, float passe, float cobrPenalti, float cobrFalta){ 
        if (finalizacao == 70 || finalizacao>70 && finalizacao<74){
            finalizacao = (float)(finalizacao * 1.15);
        }
        if (finalizacao == 75 || finalizacao>75 && finalizacao<79){
            finalizacao = (float)(finalizacao * 1.30);
        }
        if (finalizacao == 80 || finalizacao>80 && finalizacao<99){
            finalizacao = (float)(float)(finalizacao * 1.50);
        }
        if (defesa == 70 || defesa>70 && defesa<74){
            defesa = (float)(defesa * 1.20);
        }
        if (defesa == 75 || defesa>75 && defesa<79){
            defesa = (float)(defesa * 1.50);
        }
        if (defesa == 80 || defesa>80 && defesa<99){
            defesa = (float)(defesa * 1.60);
        }
        if (cobrPenalti == 70 || cobrPenalti>70 && cobrPenalti<79){
            cobrPenalti = (float)(cobrPenalti * 1.20);
        }
        if (cobrPenalti == 80 || cobrPenalti>80 && cobrPenalti<99){
            cobrPenalti = (float)(cobrPenalti * 1.35);
        }
        if (cobrFalta == 75 || cobrFalta>75 && cobrFalta<79){
            cobrFalta = (float)(cobrFalta * 1.25);
        }
        if (cobrFalta == 80 || cobrFalta>80 && cobrFalta<99){
            cobrFalta = (float)(cobrFalta * 1.40);
        }
        media = df.format((ritmo + drible + finalizacao + defesa + passe + cobrPenalti + cobrFalta) /7);
        
        return media;
    }

    public String meiaDirEsq(float ritmo, float drible, float finalizacao, float defesa, float passe, float cobrPenalti, float cobrFalta){
        if (finalizacao == 65 || finalizacao>65 && finalizacao<69){
            finalizacao = (float)(finalizacao * 1.15);
        }
        if (finalizacao == 70 || finalizacao>70 && finalizacao<77){
            finalizacao = (float)(finalizacao * 1.30);
        }
        if (finalizacao == 78 || finalizacao>78 && finalizacao<99){
            finalizacao = (float)(finalizacao * 1.50);
        }        
        if (defesa == 70 || defesa>70 && defesa<74){
            defesa = (float)(defesa * 1.20);
        }
        if (defesa == 75 || defesa>75 && defesa<79){
            defesa = (float)(defesa * 1.50);
        }
        if (defesa == 80 || defesa>80 && defesa<99){
            defesa = (float)(defesa * 1.60);
        }
        if (cobrPenalti == 70 || cobrPenalti>70 && cobrPenalti<79){
            cobrPenalti = (float)(cobrPenalti * 1.10);
        }
        if (cobrPenalti == 80 || cobrPenalti>80 && cobrPenalti<99){
            cobrPenalti = (float)(cobrPenalti * 1.15);
        }
        if (cobrFalta == 75 || cobrFalta>75 && cobrFalta<79){
            cobrFalta = (float)(cobrFalta * 1.10);
        }
        if (cobrFalta == 80 || cobrFalta>80 && cobrFalta<99){
            cobrFalta = (float)(cobrFalta * 1.15);
        }
        media = df.format((ritmo + drible + finalizacao + defesa + passe + cobrPenalti + cobrFalta) /7);
        
        return media;
    }

    public String volante(float ritmo, float drible, float finalizacao, float defesa, float passe, float cobrPenalti, float cobrFalta){
        if (finalizacao == 65 || finalizacao>65 && finalizacao<69){
            finalizacao = (float)(finalizacao * 1.25);
        }
        if (finalizacao == 70 || finalizacao>70 && finalizacao<74){
            finalizacao = (float)(finalizacao * 1.40);
        }
        if (finalizacao == 75 || finalizacao>75 && finalizacao<99){
            finalizacao =(float) (finalizacao * 1.50);
        }
        if (drible == 70 || drible>70 && drible<74){
            drible = (float)(drible * 1.25);
        }
        if (drible == 75 || drible>75 && drible<79){
            drible = (float)(drible * 1.40);
        }
        if (drible == 80 || drible>80 && drible<99){
            drible = (float)(drible * 1.50);
        }
        if (cobrPenalti == 70 || cobrPenalti>70 && cobrPenalti<74){
            cobrPenalti = (float)(cobrPenalti * 1.15);
        }
        if (cobrPenalti == 75 || cobrPenalti>75 && cobrPenalti<99){
            cobrPenalti = (float)(cobrPenalti * 1.35);
        }
        if (cobrFalta == 70 || cobrFalta>70 && cobrFalta<79){
            cobrFalta = (float)(cobrFalta * 1.25);
        }
        if (cobrFalta == 80 || cobrFalta>80 && cobrFalta<99){
            cobrFalta = (float)(cobrFalta * 1.45);
        }
        media = df.format((ritmo + drible + finalizacao + defesa + passe + cobrPenalti + cobrFalta) /7);
        
        return media;
    }

    // ZAGA
    public String zagueiro(float ritmo, float drible, float finalizacao, float defesa, float passe, float cobrPenalti, float cobrFalta){
        if (finalizacao == 65 || finalizacao>65 && finalizacao<69){
            finalizacao = (float)(finalizacao * 1.25);
        }
        if (finalizacao == 70 || finalizacao>70 && finalizacao<74){
            finalizacao = (float)(finalizacao * 1.40);
        }
        if (finalizacao == 75 || finalizacao>75 && finalizacao<99){
            finalizacao = (float)(finalizacao * 1.55);
        }
        if (drible == 65 || drible>65 && drible<69){
            drible = (float)(drible * 1.20);
        }
        if (drible == 70 || drible>70 && drible<78){
            drible = (float)(drible * 1.40);
        }
        if (drible == 79 || drible>79 && drible<99){
            drible = (float)(drible * 1.50);
        }
        if (ritmo == 70 || ritmo>70 && ritmo<74){
            ritmo = (float)(ritmo * 1.15);
        }
        if (ritmo == 75 || ritmo>75 && ritmo<79){
            ritmo = (float)(ritmo * 1.40);
        }
        if (ritmo == 80 || ritmo>80 && ritmo<99){
            ritmo = (float)(ritmo * 1.50);
        }
        if (cobrPenalti == 70 || cobrPenalti>70 && cobrPenalti<79){
            cobrPenalti = (float)(cobrPenalti * 1.20);
        }
        if (cobrPenalti == 80 || cobrPenalti>80 && cobrPenalti<99){
            cobrPenalti = (float)(cobrPenalti * 1.40);
        }
        if (cobrFalta == 65 || cobrFalta>65 && cobrFalta<69){
            cobrFalta = (float)(cobrFalta * 1.10);
        }
        if (cobrFalta == 70 || cobrFalta>70 && cobrFalta<79){
            cobrFalta = (float)(cobrFalta * 1.30);
        }
        if (cobrFalta == 80 || cobrFalta>80 && cobrFalta<99){
            cobrFalta = (float)(cobrFalta * 1.50);
        }
        media = df.format((ritmo + drible + finalizacao + defesa + passe + cobrPenalti + cobrFalta) /7);

        return media;
        
    }

    public String lateralDirEsq(float ritmo, float drible, float finalizacao, float defesa, float passe, float cobrPenalti, float cobrFalta){
        if (finalizacao == 65 || finalizacao>65 && finalizacao<69){
            finalizacao = (float)(finalizacao * 1.30);
        }
        if (finalizacao == 70 || finalizacao>70 && finalizacao<74){
            finalizacao = (float)(finalizacao * 1.50);
        }
        if (finalizacao == 75 || finalizacao>75 && finalizacao<99){
            finalizacao = (float)(finalizacao * 1.70);
        }
        if (cobrPenalti == 70 || cobrPenalti>70 && cobrPenalti<79){
            cobrPenalti = (float)(cobrPenalti * 1.20);
        }
        if (cobrPenalti == 80 || cobrPenalti>80 && cobrPenalti<99){
            cobrPenalti = (float)(cobrPenalti * 1.30);
        }
        if (cobrFalta == 70 || cobrFalta>70 && cobrFalta<79){
            cobrFalta = (float)(cobrFalta * 1.20);
        }
        if (cobrFalta == 80 || cobrFalta>80 && cobrFalta<99){
            cobrFalta = (float)(cobrFalta * 1.35);
        }
        media = df.format((ritmo + drible + finalizacao + defesa + passe + cobrPenalti + cobrFalta) /7);
        
        return media;
    }

    // GOL - VARIÁVEIS DIFERENTES DOS DEMAIS JOGADORES
    public String goleiro(float posicionamento, float reflexos, float chute, float cobrPenalti, float cobrFalta){
        if (cobrPenalti == 65 || cobrPenalti>65 && cobrPenalti<69){
            cobrPenalti = (float)(cobrPenalti * 1.25);
        }
        if (cobrPenalti == 70 || cobrPenalti>70 && cobrPenalti<79){
            cobrPenalti = (float)(cobrPenalti * 1.45);
        }
        if (cobrPenalti == 80 || cobrPenalti>80 && cobrPenalti<99){
            cobrPenalti = (float)(cobrPenalti * 1.55);
        }
        if (cobrFalta == 65 || cobrFalta>65 && cobrFalta<69){
            cobrFalta = (float)(cobrFalta * 1.15);
        }
        if (cobrFalta == 70 || cobrFalta>70 && cobrFalta<79){
            cobrFalta = (float)(cobrFalta * 1.35);
        }
        if (cobrFalta == 80 || cobrFalta>80 && cobrFalta<99){
            cobrFalta = (float)(cobrFalta * 1.60);
        }
        media = df.format((posicionamento + reflexos + chute + cobrPenalti + cobrFalta) /5);

        return media;
    }   

    public byte getRitmo() {
        return ritmo;
    }

    public void setRitmo(byte ritmo) {
        this.ritmo = ritmo;
    }

    public byte getDrible() {
        return drible;
    }

    public void setDrible(byte drible) {
        this.drible = drible;
    }

    public byte getFinalizacao() {
        return finalizacao;
    }

    public void setFinalizacao(byte finalizacao) {
        this.finalizacao = finalizacao;
    }

    public byte getDefesa() {
        return defesa;
    }

    public void setDefesa(byte defesa) {
        this.defesa = defesa;
    }

    public byte getPasse() {
        return passe;
    }

    public void setPasse(byte passe) {
        this.passe = passe;
    }

    public byte getCobrPenalti() {
        return cobrPenalti;
    }

    public void setCobrPenalti(byte cobrPenalti) {
        this.cobrPenalti = cobrPenalti;
    }

    public byte getCobrFalta() {
        return cobrFalta;
    }

    public void setCobrFalta(byte cobrFalta) {
        this.cobrFalta = cobrFalta;
    }

    public byte getPosicionamento() {
        return posicionamento;
    }

    public void setPosicionamento(byte posicionamento) {
        this.posicionamento = posicionamento;
    }

    public byte getReflexos() {
        return reflexos;
    }

    public void setReflexos(byte reflexos) {
        this.reflexos = reflexos;
    }

    public byte getChute() {
        return chute;
    }

    public void setChute(byte chute) {
        this.chute = chute;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    public byte getNumCamisa() {
        return numCamisa;
    }

    public void setNumCamisa(byte numCamisa) {
        this.numCamisa = numCamisa;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }        
}