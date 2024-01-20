import java.util.Scanner;

class Grade{
    public String grade(int avgpercent){
        switch (avgpercent / 10) {
            case 10:
                return "O";
            case 9:
                return "A";
            case 8:
                return "B+";
            case 7:
                return "B";
            case 6:
                return "C";
            case 5:
                return "D";
            default:
                return "F";
        }
    }
}

public class Grade_calculator
{
    public static void main(String[] args){
        Grade gr = new Grade();
        Scanner in = new Scanner(System.in);

        //Taking input of how many subjects are there
        System.out.println("Enter the amount of subjects");
        int tsubs = in.nextInt();
        int tmarks = 0;

        //Taking and adding all the marks
        for (int i = 0; i < tsubs; i++) {
            System.out.println("Enter the marks obtained in subject " + (i + 1));
            int marks = in.nextInt();
            tmarks += marks;
        }

        //Calculating Percentage
        int avgpercent = tmarks / tsubs;

        //Calculating Grades
        String Grade = gr.grade(avgpercent);

        //Displaying all the Data
        System.out.println("Total marks obtained :- " + tmarks);
        System.out.println("Percentage obtained :- " + avgpercent+"%");
        System.out.println("Grade obtained :- " + Grade);

        in.close();
        //Lets test the code
    }
}