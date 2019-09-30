package HL_1.Section_10.AP_Free_Response.Appointment;

import java.util.*;

public class DailySchedule
{
    // contains Appointment objects, no two Appointments overlap
    private ArrayList<Appointment> apptList;

    public DailySchedule()
    { 
          apptList = new ArrayList<Appointment>();
    }

        // part (b)
    // removes all appointments that overlap the given Appointment
    // postcondition: all appointments that have a time conflict with
    //appt have been removed from this DailySchedule
    public void clearConflicts(Appointment appt)
    { 
        Appointment appointment;

        int size = apptList.size();

        for (int i = 0; i < size; i++) {

            appointment = apptList.get(i);
            if (appt.conflictsWith(appointment)) {

                apptList.remove(i);
                i--;

            }
        }
    }


        // part (c)
    // if emergency is true, clears any overlapping appointments and adds
    // appt to this DailySchedule; otherwise, if there are no conflicting
    // appointments, adds appt to this DailySchedule;
    // returns true if the appointment was added;
    // otherwise, returns false
    public boolean addAppt(Appointment appt, boolean emergency)
    { 
        if (emergency == true) {

            clearConflicts(appt);
            apptList.add(appt);
            return true;

        } else {

            for (int i = 0; i < apptList.size(); i++) {

                if (appt.conflictsWith(apptList.get(i)))
                    return false;

            }

            apptList.add(appt);

        }

        return true;
    }

    public String toString()
    {
       String str = "";

       for(Appointment appt : apptList)
       {
          str += appt.getDescription() + "     " + appt.getTime().toString() + "\n";
       }

       return str;
    }

}