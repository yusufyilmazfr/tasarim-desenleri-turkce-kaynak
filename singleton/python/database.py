import threading

lock = threading.Lock()

class Singleton(type):
    _instance = {}
    def __call__(cls, *args, **kwargs):
        if cls not in cls._instance:
            with lock:
                if cls not in cls._instance:
                    cls._instance[cls] = super(Singleton, cls).__call__(*args, **kwargs)
        return cls._instance[cls]

class Database(metaclass=Singleton):
    def __init__(self) -> None:
        pass #Database
