public class Date {

    private int day;
    private int month;
    private int year;

    int getDay(){
        return this.day;  
    }

    int getMonth(){
        return this.month;
    }

    int getYear(){
        return this.year;
    }

    public Date(int day, int month, int year) {
        if(this.month >= 1 && this.month <= 12)
            this.month = month;

        if(this.day >= 1 && this.day <= 31)
        this.day = day;

        if(this.year >= 0)
        this.year = year;
    }

    String getMonthName(){
        String monthName = "";

        switch (this.month){
            case 1:
                monthName = "Enero";
                break;
            case 2:
                monthName = "Febrero";
                break;
            case 3:
                monthName = "Marzo";
                break;
            case 4:
                monthName = "Abril";
                break;
            case 5:
                monthName = "Mayo";
                break;
            case 6:
                monthName = "Junio";
                break;
            case 7:
                monthName = "Julio";
                break;
            case 8:
                monthName = "Agosto";
                break;
            case 9:
                monthName = "Septiembre";
                break;
            case 10:
                monthName = "Octubre";
                break;
            case 11:
                monthName = "Noviembre";
                break;
            case 12:
                monthName = "Diciembre";
                break;
            default:
                System.out.println("Introduce un mes válido");
        }
        return monthName;
    }

    private int getMonthDays(int numMonth) {
        int monthDays = 0;

        switch (this.month) {
            case 1:
                monthDays = 31;
                break;
            case 2:
                monthDays = 28;
                break;
            case 3:
                monthDays = 31;
                break;
            case 4:
                monthDays = 30;
                break;
            case 5:
                monthDays = 31;
                break;
            case 6:
                monthDays = 30;
                break;
            case 7:
                monthDays = 31;
                break;
            case 8:
                monthDays = 31;
                break;
            case 9:
                monthDays = 30;
                break;
            case 10:
                monthDays = 31;
                break;
            case 11:
                monthDays = 30;
                break;
            case 12:
                monthDays = 31;
                break;

            default:
                System.out.println("Introduce un mes váildo");
        }
        return monthDays;
    }
        void getDatesUntilMonthEnd(){
            for(int i = day; i<= this.getMonthDays(); i++){
                System.out.println(i + "/" + month + "/" + year);
            }
        }

    boolean isSameDay(Date another){
        return this.day == another.getDay();
    }
    boolean isSameMonth(Date another){
        return this.month == another.getMonth();
    }
    boolean isSameYear(Date another){
        return this.year == another.getYear();
    }
    boolean isSame(Date another){
        return this.year == another.getYear() && this.month == another.getMonth() && this.day == another.getDay();
    }

    
    public String toString(){
        return this.day + "/" + this.month + "/" + this.year;
    }

    int getMonthDays(){
        return getMonthDays(this.month);
    }

    boolean isMonthCorrect(){
        boolean correctDays = false;
        if(day <= this.getMonthDays()){
            correctDays = true;
        }
    }
    return correctDays;

    String getSeason(){
        String season = "";
        switch (this.month){
            case 1:
            //Invierno
            case 2:
            //Invierno
            case 3:
                season = "Invierno";
            case 4:
            //Primavera
            case 5:
            //Primavera
            case 6:
                season = "Primavera";
            case 7:
            //Verano
            case 8:
            //Verano
            case 9:
                season = "Verano";
            case 10:
            //Otoño
            case 11:
            //Otoño
            case 12:
                season "Otoño";
                break;
        }
        return season;
    }

    public String monthsLeftUntilEndYear(){
        for()
    }

}
