package dcx.ufpb.br.poo.quiz;

import java.util.Arrays;
import java.util.Objects;

public class PerguntaME extends Pergunta {

    private String [] alternativas;

    public PerguntaME(String enunciado, String [] alternativas, String respostaCorreta){
        super(enunciado, respostaCorreta);
        this.alternativas = alternativas;
    }

    public PerguntaME(){
        this("", new String[]{}, "");
        //super();
        //this.alternativas = new String[]{};
    }

    public boolean estahCorretaResposta(String resposta){
        return (resposta.startsWith(super.getRespostaCorreta()));
    }

    public String[] getAlternativas() {
        return alternativas;
    }

    public void setAlternativas(String[] alternativas) {
        this.alternativas = alternativas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PerguntaME that = (PerguntaME) o;
        return Objects.equals(super.getEnunciado(), that.getEnunciado())
                && Objects.equals (super.getRespostaCorreta(), that.getRespostaCorreta())
                && Arrays.equals(alternativas, that.alternativas);
    }

    @Override
    public int hashCode() {
        return super.getEnunciado().hashCode()
                + super.getRespostaCorreta().hashCode()
                + Arrays.hashCode(alternativas);
    }
    public String toString(){
        String texto = this.getEnunciado() + "\n";
        for (String s:this.alternativas){
            texto+=s + "\n";
        }
        return texto;
    }


}
