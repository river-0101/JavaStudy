package trytry;

public class FinalExam {

	public static void main(String[] args) {
		LedgerOperations ledger = new Ledger();

		System.out.println("======가계부 동작 시작 =======");
		ledger.addTransaction(new Income(200000, "용돈"));
		ledger.addTransaction(new Expense(10000, "점심"));
		ledger.addTransaction(new Expense(20000, "저녁"));

		System.out.println("======가계부 목록 =======");
		ledger.printTransactions();

		System.out.println("======가계부 수정 =======");
		ledger.editTransaction(2, new Income(5000, "복권"));

		System.out.println("====== 10000원 이하의 항목 =======");
		ledger.filterTransactions(10000);

		System.out.println("====== 가계부 목록 =======");
		ledger.printTransactions();

		System.out.println("======가계부 총 수입 =======");
		System.out.println("총 수입: " + ledger.getTotalIncome() + "원");

		System.out.println("======가계부 총 지출 =======");
		System.out.println("총 지출: " + ledger.getTotalExpense() + "원");

		System.out.println("====== 가계부 동작 종료 =======");
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
			System.out.println(transaction.getDescription() + " " + transaction.getAmount() + "원 추가 완료");
		} else {
			System.out.println("공간이 없습니다.");
		}

	}

	@Override
	public void printTransactions() {
		double sum = 0;
		for (int i = 0; i < size; i++) {
			sum += transactions[i].getAmount();
			System.out.println("[" + transactions[i].getDescription() + "] 금액 " + transactions[i].getAmount());
		}
		System.out.println("현재 잔액 : " + sum);
	}

	@Override
	public void editTransaction(int index, Transaction transaction) {
		if (index >= 0 && index < size) {
			transactions[index] = transaction;
			System.out.println("트랜잭션 수정");
		} else {
			System.out.println("잘못된 입력입니다.");
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
			System.out.println("트랜잭션이 삭제");
		} else {
			System.out.println("잘못된 인덱스입니다.");
		}
	}

	@Override
	public void filterTransactions(double price) {
		for (int i = 0; i < size; i++) {
			if (transactions[i].getAmount() <= price || transactions[i].getAmount() > 0) {
				System.out.println("[" + transactions[i].getDescription() + "] 금액 " + transactions[i].getAmount());
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
