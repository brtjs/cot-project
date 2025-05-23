public class Student {


    private String name;
    private int rollNo;
    private int[] marks= new int[3];

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }
    public Student(String name, int rollNo, int[] marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }
    public int averageMarksOfStudents(){
        int sum=0;
        int average=0;
        for (int m:marks){
            sum+=m;
        }
        average= sum/marks.length;
        //System.out.println("average marks of "+ average);
        return average;
    }
}
