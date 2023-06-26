class DowhileNetwork{
public static void main(String[]args){
boolean NewNetwork=false;
do{
	if(NewNetwork){
		System.out.println("Data connection is on");
	}
	else{
		System.out.println("Waiting for the network");
	}
}
	while (!NewNetwork);
}
}