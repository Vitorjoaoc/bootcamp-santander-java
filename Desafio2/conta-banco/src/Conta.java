public class Conta {
    int numero;
    String agencia;
    String nomeCliente;
    Double saldo;



    public Conta(int numero, String agencia, String nomeCliente, Double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso JAVA Bank sua agência é %s, conta %d e seu saldo R$%.2f já está disponível para saque\n",this.nomeCliente,this.agencia,this.numero,this.saldo);
    }

    public void exibir() {
        System.out.println("---------------------------------------");
        System.out.printf("Numero da Conta: %d \nAgencia: %s \nCliente: %s \nSaldo: R$%.2f\n",this.numero,this.agencia,this.nomeCliente,this.saldo);
        
        System.out.println("---------------------------------------");
    }
    //Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque
}


