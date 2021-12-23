from abc import ABC
from copy import deepcopy


class ClonablePrototype(ABC):

    def clone(self):
        return deepcopy(self)
