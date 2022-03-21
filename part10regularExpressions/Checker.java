public class Checker {


    public boolean isDayOfWeek(String string) {
        if (string.matches("mon|tue|wed|thu|fri|sat|sun")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean allVowels(String string) {
        if (string.matches("[aeiouyAEIOUY]+")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean timeOfDay(String string) {
        if (string.matches("[0-1][0-9]" + ":" + "[0-5][0-9]" + ":" + "[0-5][0-9]") ||
                string.matches("[2][0-3]" + ":" + "[0-5][0-9]" + ":" + "[0-5][0-9]")) {
            return true;
        } else {
            return false;
        }
        
    }

}
