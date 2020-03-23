using System;
using System.Collections.Generic;
using System.Text;

namespace ChainOfResponsibility
{
    // Zincirin bir sonraki halkasının tanımlandığı sınıftır.
    // İşlemi gerçekleştirecek olan metot tanımı bulunur.
    // UML diyagramındaki BaseHandler sınıfına denk gelmektedir.
    abstract class BaseHandler
    {
        protected BaseHandler _nextHandler;
        public void SetNextHandler(BaseHandler nextHandler)
        {
            _nextHandler = nextHandler;
        }

        public abstract void HandleRequest(Image image);
    }
}
