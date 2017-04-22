package example.codeclan.com.myfoodtracker;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;

import java.util.Calendar;

/**
 * Created by user on 22/04/2017.
 */

public class DatePickerDialog extends DialogFragment {



    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        DateSettings dateSettings = new DateSettings(getActivity());
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(calendar.YEAR);
        int month = calendar.get(calendar.MONTH);
        int day = calendar.get(calendar.DAY_OF_MONTH);
        android.app.DatePickerDialog dialog;
        dialog = new android.app.DatePickerDialog(getActivity(), dateSettings, year, month, day);

        return dialog;
    }
}
