public class Start {
	public static void main(String[] a) {
		SimonSays[] diskussionsrunde = new SimonSays[28];

		diskussionsrunde[0] = new ListSays();
		diskussionsrunde[1] = new BrucknerSays();
		diskussionsrunde[2] = new ErcegSays();
		diskussionsrunde[5] = new GradonskiSays();
		diskussionsrunde[3] = new FockSays();
		diskussionsrunde[6] = new HackenbergerSays();
		diskussionsrunde[8] = new HamplSays();
		diskussionsrunde[9] = new HollanderSays();
		diskussionsrunde[10] = new JakubekSays();
		diskussionsrunde[12] = new KalaunerSays();
<<<<<<< HEAD
		diskussionsrunde[23] = new SchoberSays();
=======
		diskussionsrunde[20] = new PolydorSays();
		diskussionsrunde[21] = new P�cherSays();
		diskussionsrunde[13] = new KalaunerSays();
>>>>>>> b310543b7166706f12d59444f00d2bdeba235829
		diskussionsrunde[24] = new SchwenznerSays();
		diskussionsrunde[26] = new WeinbergerSays();
		diskussionsrunde[27] = new WorthaSays();
		for (SimonSays s : diskussionsrunde) {
			if (s != null)  
				s.say("Let's get started!");
		}
	}
}
