package edu.citytech.cst.service;

public class Status {

	public static String getDescription(String code, float yearly) {

		String description = "";

		switch (code) {
		case "SI":
			description = "Single Taxable Income";

			break;

		case "MFJ":
			description = "Married Filing Jointly";

			break;

		case "QW":
			description = "Qualified Widower";

			break;

		case "MFS":
			description = "Marrried Filing separately";

			break;

		case "HH":
			description = "Head of Household";

			break;

		case "NA":
			description = "Not Applicable";

		}

		return description;

	}

	public static float getPercent(String code, float yearly) {
		float percent = 0;

		switch (code) {
		case "SI":

			if (yearly <= 9326) {
				percent = .10f;

			} else if (yearly <= 37950) {
				percent = .15f;

			} else if (yearly <= 91900) {
				percent = .25f;

			} else if (yearly <= 191650) {
				percent = .28f;

			} else if (yearly <= 416700) {
				percent = .33f;

			} else if (yearly <= 418400) {
				percent = .35f;

			} else {
				percent = .396f;

			}

			break;

		case "MFJ":

			if (yearly <= 18650) {
				percent = .10f;

			} else if (yearly <= 75900) {
				percent = .15f;

			} else if (yearly <= 153100) {
				percent = .25f;

			} else if (yearly <= 233350) {
				percent = .28f;

			} else if (yearly <= 416700) {
				percent = .33f;

			} else if (yearly <= 470700) {
				percent = .35f;

			} else {
				percent = .396f;

			}
			break;

		case "QW":

			if (yearly <= 18650) {
				percent = .10f;

			} else if (yearly <= 75900) {
				percent = .15f;

			} else if (yearly <= 153100) {
				percent = .25f;

			} else if (yearly <= 233350) {
				percent = .28f;

			} else if (yearly <= 416700) {
				percent = .33f;

			} else if (yearly <= 470700) {
				percent = .35f;

			} else {
				percent = .396f;

			}
			break;

		case "MFS":

			if (yearly <= 9325) {
				percent = .10f;

			} else if (yearly <= 37950) {
				percent = .15f;

			} else if (yearly <= 76550) {
				percent = .25f;

			} else if (yearly <= 116675) {
				percent = .28f;

			} else if (yearly <= 208350) {
				percent = .33f;

			} else if (yearly <= 235350) {
				percent = .35f;

			} else {
				percent = .396f;

			}

			break;

		case "HH":

			if (yearly <= 13350) {
				percent = .10f;

			} else if (yearly <= 50800) {
				percent = .15f;

			} else if (yearly <= 131200) {
				percent = .25f;

			} else if (yearly <= 212500) {
				percent = .28f;

			} else if (yearly <= 416700) {
				percent = .33f;

			} else if (yearly <= 444550) {
				percent = .35f;

			} else {
				percent = .396f;

			}
			break;

		case "NA":
			percent = .40f;

		}

		return percent;
	}

}
