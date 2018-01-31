/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author m-besnard
 */
public class IP {
//attributs	
	private int octet1;
	private int octet2;
	private int octet3;
	private int octet4;

//constructeur 		
public IP(int octet1, int octet2, int octet3, int octet4) {
	this.octet1 = octet1;
	this.octet2 = octet2;
	this.octet3 = octet3;
	this.octet4 = octet4;
}

//methode 
public char getClasse() {
	char cl ='x';
	if (octet1>=1 && octet1<=126){
		cl= 'A';
	}
	if (octet1>=128 && octet1<=191){
		cl = 'B';
	}
	if (octet1>=192 && octet1<=223){
		cl = 'C';
	}
	return cl;	
}

//getters
public int getOctet1() {
	return octet1;
}

public int getOctet2() {
	return octet2;
}

public int getOctet3() {
	return octet3;
}

public int getOctet4() {
	return octet4;
}

//methodes
public IP adresseReseau(){
	int a = this.octet1;
	int b = 0;
	int c = 0;
	int d = 0;
	
	if(this.getClasse()=='B'){
		b=this.octet2;
		if(this.getClasse()=='C'){
			c=this.octet3;
		}
	}
	System.out.println("l'adresse reseau est : " +a + "." +b  +"." +c + "." +d);
	return new IP(a, b, c, d);
}

public boolean estMemeReseau(IP ip2){	
	if ((this.adresseReseau().octet1 ==ip2.adresseReseau().octet1) && 
		(this.adresseReseau().octet2==ip2.adresseReseau().octet2) && 
		(this.adresseReseau().octet3==ip2.adresseReseau().octet3)){
		System.out.println("Les 2 IP sont du meme reseau"); 
		return true; 
	}else { 
		System.out.println("Les 2 IP ne sont pas du meme reseau"); 
		return false;
	}
}
 
public static IP getInstance(int octet1, int octet2, int octet3, int octet4){
	 if ((octet1>0) && (octet1<=255) && (octet2>=0) && (octet2<=255) && (octet3>=0) && (octet3<=255) && (octet4>=0) && (octet4<=255)){     
		 System.out.println("c'est une IP valide");
		 return new IP(octet1, octet2, octet3, octet4);
	 } else {
     System.out.println("erreur, ce n'est pas une IP"); 
     	return null; 
     }
}

//toString
public String toString() {
	return "IP [octet1=" + octet1 + ", octet2=" + octet2 + ", octet3=" + octet3
			+ ", octet4=" + octet4 + "]";
}


}

