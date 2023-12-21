public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    double oralExamWeight; // Sözlü notunun ortalamaya etkisi yüzdesi

    public Course(String name, String code, String prefix, double oralExamWeight) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.oralExamWeight = oralExamWeight;
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }

    public double calculateCourseAverage(double oralExamGrade, double examGrade) {
        // Sözlü not ve sınav notunun ortalamaya etkisini hesapla
        double oralContribution = oralExamGrade * (oralExamWeight / 100.0);
        double examContribution = examGrade * ((100.0 - oralExamWeight) / 100.0);

        // Toplam notu hesapla
        double totalGrade = oralContribution + examContribution;
        return totalGrade;
    }
}
