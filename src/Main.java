import Bank.BankAccount;
import Person.Person;
import Person.GENDER;
import Bank.BankAccount;

import static Person.Person.personCounter;

public class Main {
    public static void main(String[] args) {
        Person xyz = new Person("XYZ", 33, GENDER.MALE, "runner", "none");
        Person abc = new Person("abc", 46, GENDER.MALE, "swimming","none");
        xyz.addNewFriends("valaki");
        System.out.println(xyz);
        System.out.println(personCounter);

        BankAccount xyza = new BankAccount("XYZ", 300, "1117732"); //22
        BankAccount abca = new BankAccount("ABC", 500, "1173500"); //17
        System.out.println(xyza.getAccountName());
        System.out.println(xyza.getAccountNumber());
        System.out.println(xyza.getBalance());
        xyza.depositBalance(1);
        System.out.println(xyza.getBalance());
        xyza.withdrawBalance(10);
        System.out.println(xyza.getBalance());
        xyza.transferBalance(200, abca);
        System.out.println(xyza.getBalance());
        xyza.isValidAccountNumber(xyza.getAccountNumber());
        abca.isValidAccountNumber(abca.getAccountNumber());
    }
}