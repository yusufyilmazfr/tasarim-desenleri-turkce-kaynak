# Created by Sezer BOZKIR<admin@sezerbozkir.com> at 16.12.2021
from json_serializer import JsonSerializer


class CustomOperation:
    _json_serializer: JsonSerializer

    def __init__(self, json_serializer: JsonSerializer):
        self._json_serializer = json_serializer

    def serialize_object(self, obj):
        return self._json_serializer.serialize_object(obj)
