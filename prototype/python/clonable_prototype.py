# Created by Sezer BOZKIR<admin@sezerbozkir.com> at 16.12.2021
from abc import ABC
from copy import deepcopy


class ClonablePrototype(ABC):

    def clone(self):
        return deepcopy(self)
