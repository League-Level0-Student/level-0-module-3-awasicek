package _05_horoscope;

import javax.swing.JOptionPane;

public class Horoscope {
	public static void main(String[] args) {
		// 1. Ask the user for their star sign.
		String starSign = JOptionPane.showInputDialog("What is your star sign?").toLowerCase();
		
		// 2. Depending on what they answer, tell them their horoscope
		String horoscope;
		
		switch(starSign) {
			case "aries":
				horoscope = "When someone in authority annoys you today keep your cool and this will soon pass, do not react.";
				break;
			case "taurus":
				horoscope = "Do not let fear stop you from being creative, let your creativity have it's freedom or you will be frustrated.";
				break;
			case "gemini":
				horoscope = "Follow your feelings, thoughts, urges and impulses today as they are leading to interesting places.";
				break;
			case "cancer":
				horoscope = "Others will listen to you today so be careful about what you say, people will follow your lead.";
				break;
			case "leo":
				horoscope = "You will be excited at the potential in your existing relationships, or in new ones today, as energy enters.";
				break;
			case "virgo":
				horoscope = "Today you need to understand your limits and do not take on too much, you will only end up letting people down.";
				break;
			case "libra":
				horoscope = "When suppressed emotions or memories rise in you today, deal with this and move forward lighter.";
				break;
			case "scorpio":
				horoscope = "Think about the people around you today and whether your connection with them is equal or not.";
				break;
			case "saggitarius":
				horoscope = "Things in your house are unsettled today and positives could turn to negatives if you do not have patience.";
				break;
			case "capricorn":
				horoscope = "With easier communication today be honest with those close to you and be ready for honest responses.";
				break;
			case "aquarius":
				horoscope = "Today you will have to work as a team or be involved in a group, even though you know it's a bad idea.";
				break;
			case "pisces":
				horoscope = "Today something you started but never finished will raise it's head again, and this time you need to see it through.";
				break;
			default:
				// 3. If they enter something else, tell them "That's not a star sign!"
				horoscope = "That is not a star sign!";
				break;
		}
		
		JOptionPane.showMessageDialog(null, horoscope);
	}
}
