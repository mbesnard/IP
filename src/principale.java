/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author m-besnard
 */
public class principale {
	
	public static void main(String[] args) {
		IP IP1 = new IP(158, 15, 67, 17);
		System.out.println("la classe est " + IP1.getClasse()+ " pour l'" +IP1);
		
		IP IP2 = new IP(175,78,5,2);
		IP2.adresseReseau();
				
		System.out.println("Comparaison des adresses : ");
		IP2.estMemeReseau(IP1);
		
		IP IP3 = IP.getInstance(145, 58, 78, 0);
	}

}

