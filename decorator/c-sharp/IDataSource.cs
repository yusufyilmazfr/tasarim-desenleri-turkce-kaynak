using System;
using System.Collections.Generic;
using System.Text;

namespace Decorator
{
    // Üst sınıfların uygulayacağı arayüzdür.
    // Yapılacak temel işlemler tanımlanmıştır.
    // UML diyagramındaki Component arayüzüne denk gelmektedir.
    interface IDataSource
    {
        string GetFileName();
        void WriteData(object data);
        void ReadData();
    }
}
