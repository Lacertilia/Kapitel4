import javax.swing.*;
import java.text.*;
/*
Rasmus Mattas
Uppgifter Kapitel 4
19/9-17
*/
public class Kapitel4{
	public static void main(String[] args) {
		char a1 = '\u00E5'; //å
		char a2 = '\u00E4'; //ä
		char o1 = '\u00F6'; //ö

		/*String min = JOptionPane.showInputDialog(null, "Ungef" + a2 + "r hur m" + a1 + "nga minuter ringer du per m" + a1 + "nad?");
		String costS = JOptionPane.showInputDialog(null, "Hur mycket kostar det f" + o1 + "r dig att ringa minutvis?");
		double minutes = Double.parseDouble(min);
		double costD = Double.parseDouble(costS);
		double product = minutes * costD;
		if(product < 1000){
			JOptionPane.showMessageDialog(null, "Det kostar ungef" + a2 + "r " + product + " kr per m" + a1 + "nad.");
		} else {
			product = product * 0.9;
			JOptionPane.showMessageDialog(null, "Det kostar ungef" + a2 + "r " + product + " kr per m" + a1 + "nad.");
		}*/
		/*String OTicket = JOptionPane.showInputDialog(null, "Hur mycket kostar det att gymma en g" + a1 + "ng?");
		int OTW = Integer.parseInt(OTicket);
		String YTicket = JOptionPane.showInputDialog(null, "Hur mycker kostar ett " + a1 + "rskort?");
		int YTW = Integer.parseInt(YTicket);
		String ggr = JOptionPane.showInputDialog(null, "Hur m" + a1 + "nga g" + a1 + "nger kommer du gymma?");
		int gr = Integer.parseInt(ggr);
		OTW = OTW * gr;
		if(OTW >= YTW){
			JOptionPane.showMessageDialog(null, "Det l" + o1 + "nar sig att ta ett " + a1 + "rskort!");
		}else {
			JOptionPane.showMessageDialog(null, "Det l" + o1 + "nar sig inte att ta ett " + a1 + "rskort!");
		}*/
		/*String Sbetyg = JOptionPane.showInputDialog(null, "Hur m" + a1 + "nga po" + a2 + "ng fick personen?");
		int betyg = Integer.parseInt(Sbetyg);
		if(betyg > 50){
			JOptionPane.showMessageDialog(null, "Om" + o1 + "jligt!");
		}else if(betyg >=45){
			JOptionPane.showMessageDialog(null, "Personen fick ett A!");
		}else if(betyg >=40){
			JOptionPane.showMessageDialog(null, "Personen fick ett B!");
		}else if(betyg >=35){
			JOptionPane.showMessageDialog(null, "Personen fick ett C!");
		}else if(betyg >=30){
			JOptionPane.showMessageDialog(null, "Personen fick ett D!");
		}else if(betyg >=25){
			JOptionPane.showMessageDialog(null, "Personen fick ett E!");
		}else {
			JOptionPane.showMessageDialog(null, "Personen fick ett F!");
		}*/
		/*String ls = JOptionPane.showInputDialog(null, "Vilken l" + a2 + "ngd har paketet?");
		String bs = JOptionPane.showInputDialog(null, "Vilken bredd har paketet?");
		String ts = JOptionPane.showInputDialog(null, "Vilken tjocklek har paketet?");
		double ld = Double.parseDouble(ls);
		double bd = Double.parseDouble(bs);
		double td = Double.parseDouble(ts);
		if(140<=ld && ld<=600 && 90<=bd && td<=100 && ld+bd+td<=900){
			JOptionPane.showMessageDialog(null, "M" + a1 + "tten OK");
		}else {
			JOptionPane.showMessageDialog(null, "Felaktiga m" + a1 + "tt.");
		}*/
		/*double min = Double.parseDouble(JOptionPane.showInputDialog(null, "Hur m" + a1 + "nga minuter pratade du i telefonen?"));
		int button = JOptionPane.showConfirmDialog(null, "P" + a1 + "gick samtalet under dagtid?");
		double price = 0;
		if(button == 0){
			price = 0.6 +  2.5 * min;
		}else if(button == 1){
			price = 0.6 + 0.55 * min;
		}else {
			JOptionPane.showMessageDialog(null, "Avbrutet!");
			System.exit(1);
		}
		JOptionPane.showMessageDialog(null, "Kostnaden blev " + price + " kr!");*/
		/*String p1 = JOptionPane.showInputDialog(null, "Vad " + a2 + "r f" + o1 + "rsta personens personnummer?\n" +a1+a1+a1+a1+"mmdd");
		String p2 = JOptionPane.showInputDialog(null, "Vad " + a2 + "r andra personens personnummer?\n" +a1+a1+a1+a1+"mmdd");
		p1 = p1.substring(5);
		p2 = p2.substring(5);
		if(p1.equals(p2)){
			JOptionPane.showMessageDialog(null, "Ja, personerna fyller " + a1 + "r p" + a1 + " samma dag.");
		}else {
			JOptionPane.showMessageDialog(null, "Nej, personerna fyller inte " + a1 + "r p" + a1 + " samma dag.");
		}*/
		/*Collator n = Collator.getInstance();
		n.setStrength(Collator.PRIMARY);
		String n1 = JOptionPane.showInputDialog(null, "Vad heter f" + o1 + "rsta personen?\nEfternamn, F" + o1 + "rnamn");
		String n2 = JOptionPane.showInputDialog(null, "Vad heter andra personen?\nEfternamn, F" + o1 + "rnamn");
		if(n.compare(n1, n2) > 0){
			JOptionPane.showMessageDialog(null, n2 + "\n" + n1); 
		}else if(n.compare(n1, n2) < 0){
			JOptionPane.showMessageDialog(null, n1 + "\n" + n2);
		}else {
			JOptionPane.showMessageDialog(null, n1 + " och " + n2 + " kommer samtidigt i alfabetet.");
		}*/
		String pns = JOptionPane.showInputDialog(null, "Personnummer:\n" + a1+a1+a1+a1 + "mmddxxxx");

		switch(pns.charAt(10)){
			case '1': case '3': case '5': case '7': case '9':
			JOptionPane.showMessageDialog(null, "Personen " + a2 + "r en man.");
			break;
			case '2': case '4': case '6': case '8': case '0':
			JOptionPane.showMessageDialog(null, "Personen " + a2 + "r en kvinna.");
			break;
			default:
			JOptionPane.showMessageDialog(null, "Ingen siffra!");
		}
	}
}