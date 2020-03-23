using System;
using System.Collections.Generic;
using System.Text;

namespace ChainOfResponsibility
{
    // JPG dosyalarını dönüştüren sınıf.
    // UML diyagramındaki ConcreteHandler sınıfına denk gelmektedir.
    class JPGHandler : BaseHandler
    {
        public override void HandleRequest(Image image)
        {
            if (image.extension == "JPG")
            {
                Console.WriteLine("JPG to PNG");
                // JPG işlemine ait dönüştürme kodları işlemleri.
            }
            else
            {
                // Bu sınıfa ait bir işlem değilse zincirin bir sonraki halkasına aktarılır.
                _nextHandler.HandleRequest(image);
            }
        }
    }

}
