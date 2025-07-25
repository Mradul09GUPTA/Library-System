package Library_System;

public interface Lendable  {
boolean lend(Users user);
void returnBook(Users user);
boolean isAvailable();

}
