class bank
{
string account name;
int account num;
int balance=0;
void deposit(int a,String b){
	account name=b;
	account num=a;
	int amount=2000;
	balance=+amount;
	System.out.println("accnt name="+account name + "accnt num="+account num + "balance="+balance);
}
}
class indianbank extends bank
{
	double discount=2.55;
	void withdraw()
	{
		balance*=discount;
		System.out.println("accnt name="+account name +"accnt num="+account num + "balance="+balance);
	}
	public static void main(String args{}){
		indianbank user1=new indianbank();
		user1.deposit(101,"selva");
		user1.withdraw();
		indianbank user2=new indianbank();
		user2.deposit(102,"raj");
		user2.withdraw();
		indianbank user3=new indianbank();
		user3.deposit(103,"pradeep");
		user3.withdraw();
}
}