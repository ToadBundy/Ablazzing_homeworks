package package_3;

public class FinancialRecord {
    private int incomes, outcomes;


    public FinancialRecord(int incomes, int outcomes){
        this.outcomes = outcomes;
        this.incomes = incomes;
    }

    public void setIncomes(int incomes){
        this.incomes = incomes;
    }

    public void setOutcomes(int outcomes){
        this.outcomes = outcomes;
    }

    public int getIncomes() {
        return incomes;
    }

    public int getOutcomes() {
        return outcomes;
    }
}
