package trytry;

public class FinalExam {

	public static void main(String[] args) {
		LedgerOperations ledger = new Ledger();

		System.out.println("======����� ���� ���� =======");
		ledger.addTransaction(new Income(200000, "�뵷"));
		ledger.addTransaction(new Expense(10000, "����"));
		ledger.addTransaction(new Expense(20000, "����"));

		System.out.println("======����� ��� =======");
		ledger.printTransactions();

		System.out.println("======����� ���� =======");
		ledger.editTransaction(2, new Income(5000, "����"));

		System.out.println("====== 10000�� ������ �׸� =======");
		ledger.filterTransactions(10000);

		System.out.println("====== ����� ��� =======");
		ledger.printTransactions();

		System.out.println("======����� �� ���� =======");
		System.out.println("�� ����: " + ledger.getTotalIncome() + "��");

		System.out.println("======����� �� ���� =======");
		System.out.println("�� ����: " + ledger.getTotalExpense() + "��");

		System.out.println("====== ����� ���� ���� =======");
	}
}

interface Transaction {
	double getAmount();

	String getDescription();
}

interface LedgerOperations {
	void addTransaction(Transaction transaction);

	void printTransactions();

	void editTransaction(int index, Transaction transaction);

	void deleteTransaction(int index);

	void filterTransactions(double price);

	double getTotalIncome();

	double getTotalExpense();
}

class Income implements Transaction {
	double amount = 0;
	String description;

	Income(double amount, String description) {
		this.amount = amount;
		this.description = description;
	}

	@Override
	public double getAmount() {
		return amount;
	}

	@Override
	public String getDescription() {
		return description;
	}
}

class Expense implements Transaction {
	double amount;
	String description;

	Expense(double amount, String description) {
		this.amount = -amount;
		this.description = description;
	}

	@Override
	public double getAmount() {
		return amount;
	}

	@Override
	public String getDescription() {
		return description;
	}
}

class Ledger implements LedgerOperations {

	Transaction[] transactions = new Transaction[10];
	int size = 0;

	@Override
	public void addTransaction(Transaction transaction) {
		if (size < transactions.length) {
			transactions[size] = transaction;
			size++;
			System.out.println(transaction.getDescription() + " " + transaction.getAmount() + "�� �߰� �Ϸ�");
		} else {
			System.out.println("������ �����ϴ�.");
		}

	}

	@Override
	public void printTransactions() {
		double sum = 0;
		for (int i = 0; i < size; i++) {
			sum += transactions[i].getAmount();
			System.out.println("[" + transactions[i].getDescription() + "] �ݾ� " + transactions[i].getAmount());
		}
		System.out.println("���� �ܾ� : " + sum);
	}

	@Override
	public void editTransaction(int index, Transaction transaction) {
		if (index >= 0 && index < size) {
			transactions[index] = transaction;
			System.out.println("Ʈ����� ����");
		} else {
			System.out.println("�߸��� �Է��Դϴ�.");
		}

	}

	@Override
	public void deleteTransaction(int index) {
		if (index >= 0 && index < size) {
			transactions[index] = null;
			for (int i = index; i < size - 1; i++) {
				transactions[i] = transactions[i + 1];
			}
			transactions[size - 1] = null;
			size--;
			System.out.println("Ʈ������� ����");
		} else {
			System.out.println("�߸��� �ε����Դϴ�.");
		}
	}

	@Override
	public void filterTransactions(double price) {
		for (int i = 0; i < size; i++) {
			if (transactions[i].getAmount() <= price || transactions[i].getAmount() > 0) {
				System.out.println("[" + transactions[i].getDescription() + "] �ݾ� " + transactions[i].getAmount());
			}
		}
	}
	
	@Override
    public double getTotalIncome() {
        double totalIncome = 0;
        for (int i = 0; i < size; i++) {
            if (transactions[i] instanceof Income) {
                totalIncome += transactions[i].getAmount();
            }
        }
        return totalIncome;
    }


    @Override
    public double getTotalExpense() {
        double totalExpense = 0;
        for (int i = 0; i < size; i++) {
            if (transactions[i] instanceof Expense) {
                totalExpense += transactions[i].getAmount();
            }
        }
        return totalExpense;
    }
}
