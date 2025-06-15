package ex_24_Exceptions;

public class Lab221_CustomException {
    public static void main(String[] args) {
        Bank sbi = new Bank("INR",100);
        Bank icici = new Bank("INR",123);
        Integer total_bal = sbi.add(icici);
        System.out.println(total_bal);
        Bank jp_chase = new Bank("USD",101);
        Integer total_bal_all_countires= sbi.add(jp_chase);
        System.out.println(total_bal_all_countires);
    }
}
