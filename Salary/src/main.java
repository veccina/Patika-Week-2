public class main {
    public static void main(String[] args) {
        // Örnek bir çalışan oluşturulur ve maaş artışı yapılır
        Employee kemal = new Employee("kemal", 2000.0, 45, 1985);
        kemal.raiseSalary();
        System.out.println(kemal.toString());
    }
}

