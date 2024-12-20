package com.aniketjain.weatherapp.update;

import android.content.Context;

import com.aniketjain.weatherapp.R;

public class UpdateUI {

    public static String getIconID(int condition, long update_time, long sunrise, long sunset) {
        if (condition >= 200 && condition <= 232)
            return "гроза";
        else if (condition >= 300 && condition <= 321)
            return "морось";
        else if (condition >= 500 && condition <= 531)
            return "дождь";
        else if (condition >= 600 && condition <= 622)
            return "снег";
        else if (condition >= 701 && condition <= 781)
            return "ветер";
        else if (condition == 800) {
            if (update_time >= sunrise && update_time <= sunset)
                return "ясный_день";
            else
                return "ясная_ночь";
        } else if (condition == 801) {
            if (update_time >= sunrise && update_time <= sunset)
                return "малооблачный_день";
            else
                return "малооблачная_ночь";
        } else if (condition == 802)
            return "рассеянные_облака";
        else if (condition == 803 || condition == 804)
            return "неустойчивые_облака";
        return null;
    }

    public static String TranslateDay(String dayToBeTranslated, Context context) {
        switch (dayToBeTranslated.trim()) {
            case "Monday":
                return context.getResources().getString(R.string.monday);
            case "Tuesday":
                return context.getResources().getString(R.string.tuesday);
            case "Wednesday":
                return context.getResources().getString(R.string.wednesday);
            case "Thursday":
                return context.getResources().getString(R.string.thursday);
            case "Friday":
                return context.getResources().getString(R.string.friday);
            case "Saturday":
                return context.getResources().getString(R.string.saturday);
            case "Sunday":
                return context.getResources().getString(R.string.sunday);
        }
        return dayToBeTranslated;
    }
}
