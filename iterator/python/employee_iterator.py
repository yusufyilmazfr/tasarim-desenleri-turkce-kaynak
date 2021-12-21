# Created by Sezer BOZKIR<admin@sezerbozkir.com> at 21.12.2021
from iterator import Iterator


class EmployeeIterator(Iterator):
    """
    Iterator arayüzünü ve koleksiyon üzerinde dolaşmak için gerekli metotları uygular.
    Veriler üzerinde dolanma işlemleri burada gerçekleştirilecektir.
    ConcreteAggregate (EmployeeListAggregate) sınıfı ile birlikte çalışır
    """

    def __init__(self, employee_list_aggregate):
        self._employee_list_aggregate = employee_list_aggregate
        self._current_index = 0

    def has_next(self):
        """
        SYB: has_next fonksiyonunun işlevini daha net görebilmek için bu fonksiyonun
        C# versiyonunda olan halinin tam python çevirisi:

        if(len(self._employee_list_aggregate.count() > self._current_index)):
            return True
        return False

        Ancak burada pythonic bir yazım stili ile tek satırda da aşağıdaki gibi bu
        kontrolün yapılması mümkündür.
        """
        return self._employee_list_aggregate.count() > self._current_index

    def get_current_item(self):
        current_employee = self._employee_list_aggregate.get(self._current_index)
        self._current_index += 1
        return current_employee
