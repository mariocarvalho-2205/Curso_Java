package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    // Associações
    private Department department;
    private List<HourContract> contracts = new ArrayList<>(); // aqui e criada uma lista por receber varios contratos

    public Worker() {

    }

    // OBS: Não incluir no construtor listas 
    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public void addContract(HourContract contract) {
        // adicionanto o contrato que vem como argumento a lista contracts
        contracts.add(contract);
    }

    public void removeContract(HourContract contract) {
        // removendo o contrato que vem como argumento
        contracts.remove(contract);
    }

    public Double income(int year, int month) {

        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();

        for (HourContract c : contracts) {
            cal.setTime(c.getDate());
            int c_year = cal.get(Calendar.YEAR);

            int c_month = 1 + cal.get(Calendar.MONTH);  // e preciso acrescentar masi 1, o Calendar começa com 0

            if (year == c_year && month == c_month) {
                sum += c.totalValue();
            }

        }
        return sum;


    }

    @Override
    public String toString() {
        return "Worker [name=" + name + ", level=" + level + ", baseSalary=" + baseSalary + ", department=" + department
                + ", contracts=" + contracts + "]";
    }

    


}
