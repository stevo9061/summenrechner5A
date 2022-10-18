package at.fhtw.summenrechner5A.dto;

public class Summe {
    private long sum = 0;

    public long getSum(){
        return sum;
    }

    public void addToSum(long sum) {
        this.sum += sum;
    }
}
