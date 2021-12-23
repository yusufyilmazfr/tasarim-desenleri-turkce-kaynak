class _Singleton(type):
    _instances = {}

    def __call__(cls, *args, **kwargs):
        print(cls._instances)
        if cls not in cls._instances:
            instance = super().__call__(*args, **kwargs)
            cls._instances[cls] = instance
        return cls._instances[cls]


class Database(metaclass=_Singleton):
    pass
