public class Main {

    public static void main(String[] args) {
        Ninja ninja = new Ninja("Naruto", "Uzumaki");
        mostrarTreino(ninja);
        AcademicStudent academicStudent = new AcademicStudent("Sasuke", "Uchiha");
        mostrarTreino(academicStudent);
        Chunin chunin = new Chunin("Iruka","Umino", "Treinar XYZ");
        mostrarTreino(chunin);
        chunin.goToMission();
        Jounin jounin = new Jounin("Kakashi", "Hatake", "Train Sasuke");
        mostrarTreino(jounin);
    }

    static void mostrarTreino(Ninja ninja){
        ninja.train();
    }
}