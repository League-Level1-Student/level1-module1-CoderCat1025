package _06_vault;

public class SecretAgent {
	public int findCode(Vault vault) {

		for (int e=0; e<1000000; e++) {
			boolean answer = vault.tryCode(e);
			if (answer) {
				return e;
			}
		}
		return -1;

	}
}
