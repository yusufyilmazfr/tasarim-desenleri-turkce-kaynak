# Created by Sezer BOZKIR<admin@sezerbozkir.com> at 16.12.2021
from custom_operation import CustomOperation
from custom_serializer_adapter import CustomSerializerAdapter

if __name__ == '__main__':
    custom_operator = CustomOperation(CustomSerializerAdapter())
    serialized_object = custom_operator.serialize_object(object())
    print(serialized_object)  # output: serialized with CustomSerializer
