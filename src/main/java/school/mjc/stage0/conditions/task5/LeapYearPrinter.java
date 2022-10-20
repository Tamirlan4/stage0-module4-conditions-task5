package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        String result = "";
        result = year % 4 == 0?
                "leap":
                "not leap";
        switch (year){
            case 1900:
                System.out.println("not leap");
                break;
            default:
                System.out.println(result);
                break;
        }
    }
}
