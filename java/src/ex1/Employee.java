package ex1;
public class Employee {
    private String nome;
    private double salary;
    private double bonus;
    private double salaryLiquid;

    public Employee(String nome, double salary) {
        this.nome = nome;
        this.salary = salary;
        calculateBonus();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
        calculateBonus();
    }

    public double getBonus() {
        return bonus;
    }

    private void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getSalaryLiquid() {
        return salaryLiquid;
    }

    private void setSalaryLiquid(double salaryLiquid) {
        this.salaryLiquid = salaryLiquid;
    }

    private void calculateBonus(){

        if (this.salary <= 1000.0){
            setBonus(this.salary * 0.2);
            setSalaryLiquid(this.salary + this.bonus);
        } else if (this.salary <= 2000.0) {
            setBonus(this.salary * 0.1);
            setSalaryLiquid(this.salary + this.bonus);
        }else {
            setBonus(this.salary * 0.1);
            setSalaryLiquid(this.salary - this.bonus);
        }
    }

    @Override
    public String toString() {
        return "\n{ " +
                "Employee= " + nome +
                "\nSalary= " + salary +
                "\nBonus= " + bonus +
                "\nLiquid salary= " + salaryLiquid +
                "}";
    }
}
