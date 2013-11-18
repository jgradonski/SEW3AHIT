public class Start {
	public static void main(String[] a) {
		SimonSays[] diskussionsrunde = new SimonSays[28];
		diskussionsrunde[0] = new ListSays();
		diskussionsrunde[6] = new HackenbergerSays();
		diskussionsrunde[8] = new HamplSays();
		diskussionsrunde[9] = new HollanderSays();
		diskussionsrunde[10] = new JakubekSays();
		diskussionsrunde[12] = new KalaunerSays();
		for (SimonSays s : diskussionsrunde) {
			if (s != null)  
				s.say("Let's get started!");
		}
	}
}
