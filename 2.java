class Account {

static int numAccounts = 0;

static int getNumAccounts(){

return numAccounts;

}

//constructor

Account(){

numAccounts += 1;

}

public static void main(String[] args) {

//testing the Class

Account a1 = new Account();

System.out.println(getNumAccounts());

Account a2 = new Account();

Account a3 = new Account();

System.out.println(getNumAccounts());

}

}

