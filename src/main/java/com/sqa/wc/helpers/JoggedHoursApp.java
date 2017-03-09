/**
 *   File Name: JoggedHoursApp.java<br>
 *
 *   Chan, William<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Mar 8, 2017
 *
 */

package com.sqa.wc.helpers;

/**
 * JoggedHoursApp //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Chan, William
 * @version 1.0.0
 * @since 1.0
 *
 */
public class JoggedHoursApp {

	static String appName = "Jog Weekly Average Calculator";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String user = AppBasics.welcomeUserAndName(appName);
		calcHoursJogged();
		AppBasics.farewellUser(appName, user);
	}

	/**
	 *
	 */
	private static void calcHoursJogged() {
		int hour1 = AppBasics.requestInt("How many hours did you jogged on day 1?");
		int hour2 = AppBasics.requestInt("How many hours did you jogged on day 2?");
		int hour3 = AppBasics.requestInt("How many hours did you jogged on day 3?");
		int hour4 = AppBasics.requestInt("How many hours did you jogged on day 4?");
		int hour5 = AppBasics.requestInt("How many hours did you jogged on day 5?");
		int hour6 = AppBasics.requestInt("How many hours did you jogged on day 6?");
		int hour7 = AppBasics.requestInt("How many hours did you jogged on day 7?");

		int totalJoggedHours = (hour1 + hour2 + hour3 + hour4 + hour5 + hour6 + hour7);
		int avgJoggedHours = (totalJoggedHours / 7);
		String result = "You have run " + totalJoggedHours + " this week. Average " + avgJoggedHours + " hours a day.";
		if (avgJoggedHours < 10) {
			System.out.println(result + " Your are a Amateur Jogger.");
		} else if (totalJoggedHours >= 10) {
			System.out.println(result + " Your are a Dedicated Jogger.");
		} else if (totalJoggedHours >= 20) {
			System.out.println(result + " Your are a Advanced Jogger.");
		} else if (totalJoggedHours >= 40) {
			System.out.println(result + " Your are a Premium Jogger.");
		}
	}

}
