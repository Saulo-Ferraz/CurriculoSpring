package curriculo.model;

import jakarta.persistence.*;

@Entity
public class Curriculo {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;

        private String nome;
        private String endereco;
        private String formacao;

        public Curriculo() {

        }

        public Curriculo(String nome, String endereco, String formacao) {

            this.nome = nome;
            this.endereco = endereco;
            this.formacao = formacao;
        }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
}