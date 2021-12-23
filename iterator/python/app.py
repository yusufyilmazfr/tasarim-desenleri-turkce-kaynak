from employee_list_aggregate import EmployeListAggregate
from employee import Employee

if __name__ == '__main__':
    employee_list_aggregate = EmployeListAggregate()
    sezer = Employee(1, "Sezer", "Bozkir")
    yusuf = Employee(2, "Yusuf", "Yilmaz")
    arafat = Employee(3, "Arafat", "Önlük")

    employee_list_aggregate.add(sezer)
    employee_list_aggregate.add(yusuf)
    employee_list_aggregate.add(arafat)

    iterate = employee_list_aggregate.create_iterator()

    while iterate.has_next():
        current_employee: Employee = iterate.get_current_item()
        print(f"{current_employee.first_name} {current_employee.last_name}")

    """
    output:
        Sezer Bozkir
        Yusuf Yilmaz
        Arafat Önlük
    """
