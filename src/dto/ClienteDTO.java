/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author ANTUNES
 */
public class ClienteDTO {
    private int id_cliente;
    private String nome_cliente;
    private String email_cliente;
    private String telefone_cliente;
    private String nome_animal;
    private String raca_animal;
    private String especie_animal;
    private String tipo_servico;
    private String funcionario_servico;
    private String agendamento_servico;

    public String getNome_cliente() {
        return nome_cliente;
    }

    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    public String getEmail_cliente() {
        return email_cliente;
    }

    public void setEmail_cliente(String email_cliente) {
        this.email_cliente = email_cliente;
    }

    public String getTelefone_cliente() {
        return telefone_cliente;
    }

    public void setTelefone_cliente(String telefone_cliente) {
        this.telefone_cliente = telefone_cliente;
    }

    public String getNome_animal() {
        return nome_animal;
    }

    public void setNome_animal(String nome_animal) {
        this.nome_animal = nome_animal;
    }

    public String getRaca_animal() {
        return raca_animal;
    }

    public void setRaca_animal(String raca_animal) {
        this.raca_animal = raca_animal;
    }

    public String getEspecie_animal() {
        return especie_animal;
    }

    public void setEspecie_animal(String especie_animal) {
        this.especie_animal = especie_animal;
    }

    public String getTipo_servico() {
        return tipo_servico;
    }

    public void setTipo_servico(String tipo_servico) {
        this.tipo_servico = tipo_servico;
    }

    public String getFuncionario_servico() {
        return funcionario_servico;
    }

    public void setFuncionario_servico(String funcionario_servico) {
        this.funcionario_servico = funcionario_servico;
    }

    public String getAgendamento_servico() {
        return agendamento_servico;
    }

    public void setAgendamento_servico(String agendamento_servico) {
        this.agendamento_servico = agendamento_servico;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    
    
    
}
