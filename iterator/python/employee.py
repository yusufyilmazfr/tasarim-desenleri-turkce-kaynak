# Created by Sezer BOZKIR<admin@sezerbozkir.com> at 21.12.2021
class Employee:
    # Liste üzerinde gezilecek olan elamnı temsil eden sınıf.
    def __init__(self, e_id: int, first_name: str, last_name: str):
        self.e_id = e_id
        self.first_name = first_name
        self.last_name = last_name
