# Created by Sezer BOZKIR<admin@sezerbozkir.com> at 16.12.2021
from clonable_prototype import ClonablePrototype


class Employee(ClonablePrototype):
    first_name: str
    last_name: str

    def __init__(self, first_name, last_name):
        self.first_name = first_name
        self.last_name = last_name
