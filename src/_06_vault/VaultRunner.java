package _06_vault;

public class VaultRunner {
public static void main(String[] args) {
	Vault vault = new Vault();
	SecretAgent agent = new SecretAgent();
	int code = 	agent.findCode(vault);
System.out.println(code);
}
}