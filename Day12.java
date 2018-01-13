class Student extends Person{
	private int[] testScores;
    public int sum=0;
    public double grade;
    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    Student(String firstName, String lastName, int identification, int[] testScores)
    {
        super(firstName, lastName, identification) ;
        this.testScores = testScores;
    }
    public String calculate()
    {

        for(int i=0;i<testScores.length;i++)
        {
            sum=sum+testScores[i];
        }
        grade=(sum)/testScores.length;
        if((grade<=100)&&(grade>=90))
        {
            return "O";
        }
        else if((grade<90)&&(grade>=80))
        {
            return "E";
        }
        else if((grade<80)&&(grade>=70))
        {
            return "A";
        }
        else if((grade<70)&&(grade>=55))
        {
            return "P";
        }
        else if((grade<55)&&(grade>=40))
        {
            return "D";
        }
        else
        {
            return "T";
        }
    }
}
    