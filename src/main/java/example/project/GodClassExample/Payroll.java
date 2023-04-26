package example.project.GodClassExample;

import java.util.*;

public class Payroll {

    Map<String, PaySchedule> staffCategoryPaySchedule;

    public Payroll(Map<String, PaySchedule> staffCategoryPaySchedule) {
        this.staffCategoryPaySchedule = staffCategoryPaySchedule;
    }

    public PaySchedule getStaffCategoryPaySchedule(String staffCategory) {
        return staffCategoryPaySchedule.get(staffCategory);
    }
    public void changeDate(String staffcat, String date){
        PaySchedule ps =getStaffCategoryPaySchedule(staffcat);
        ps.setDate(date);
    }

}
