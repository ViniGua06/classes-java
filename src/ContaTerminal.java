public class ContaTerminal {

    private int numero;
    private String agencia;
    private String nome_cliente;
    private double saldo;

    public void setNumero (int numero) {
        this.numero = numero;
    }

    public void setAgencia (String agencia) {
        this.agencia = agencia;
    }

    public void setNomeCliente (String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    public void setSaldo (double saldo) {
        this.saldo = saldo;
    }

    public void Apresentacao () {
        System.out.println("Olá " + nome_cliente + " obrigado por criar uma conta no nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível!" );
    }



}
