class WalletStater
{
public static void main(String[] args)
{
Wallet wallet=new Wallet("black");
System.out.println("wallet color is :"+wallet.color);

Wallet wallet1=new Wallet("ega",12);
System.out.println("wallet brand is :"+wallet1.brand);
System.out.println("wallet length is :"+wallet1.length);

Wallet wallet2=new Wallet(5,"ega",12);
System.out.println("wallet noofrows is :"+wallet2.noofrows);
System.out.println("wallet brand is :"+wallet2.brand);
System.out.println("wallet length is :"+wallet2.length);


Wallet wallet3=new Wallet(5,"ega",12);
System.out.println("wallet noofrows is :"+wallet3.noofrows);

Wallet wallet4=new Wallet(5,"ega",12);
System.out.println("wallet noofrows is :"+wallet4.noofrows);
System.out.println("wallet brand is :"+wallet4.brand);
System.out.println("wallet length is :"+wallet4.length);


}

}