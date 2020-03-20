using System;
using System.Collections.Generic;
using System.Text;

namespace Adapter
{
    class CustomOperation
    {
        private IJsonSerializer _jsonSerializer;

        public CustomOperation(IJsonSerializer jsonSerializer)
        {
            _jsonSerializer = jsonSerializer;
        }

        public string SerializeObject(object obj)
        {
            return _jsonSerializer.SerializeObject(obj);
        }
    }
}
