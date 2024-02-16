package edu.grcy.archaop.account;


//Klasa Account jest zwykłą klasą, nie ma adnotacji @Component
//nie jest więc zarządzana przez Springa
//nie jest więc aspektowana
class Account {
    public void accountInfo() {
        System.out.println(getClass().getName() + " user: Account info");
    }
}
