import javax.swing.*;
/*
Rasmus Mattas
Uppgifter Kapitel 4
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
		String OTicket = JOptionPane.showInputDialog(null, "Hur mycket kostar det att gymma en g" + a1 + "ng?");
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
		}
	}
}