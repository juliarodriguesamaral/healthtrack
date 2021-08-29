package br.com.healthtrack;

public class IMC {

    private float indice;
    private String diagnostico;

    public float getIndice() {
        return indice;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    @Override
    public String toString() {
        return "IMC{" +
                "indice=" + indice +
                ", diagnostico='" + diagnostico + '\'' +
                '}';
    }

    public void calcular(float peso, float altura) {
        this.indice = peso / (altura * altura);
        this.processaDiagnostico();
    }

    private void processaDiagnostico() {

        if (this.indice <= 16 || this.indice <= 16.9)
            this.diagnostico = "Muito abaixo do peso";
        else if (this.indice == 17 || this.indice <= 18.4)
            this.diagnostico = "Abaixo do peso";
        else if (this.indice == 18.5 || this.indice <= 24.9)
            this.diagnostico = "Peso normal";
        else if (this.indice == 25 || this.indice <= 29.9)
            this.diagnostico = "Acima do peso";
        else if (this.indice == 30 || this.indice <= 34.9) {
            this.diagnostico = "Obesidade Grau I";
        } else if (this.indice == 35 || this.indice <= 40.0) {
            this.diagnostico = "Obesidade Grau II";
        } else if (this.indice > 40.0) {
            this.diagnostico = "Obesidade Grau II";
        } else {
            this.diagnostico = "";
        }
    }
}
