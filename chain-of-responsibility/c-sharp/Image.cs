using System;
using System.Collections.Generic;
using System.Text;

namespace ChainOfResponsibility
{
    // Uygulama süresince resimlerimizi temsil edecek sınıf.
    class Image
    {
        public string name;
        public string extension;

        public Image(string name, string extension)
        {
            this.name = name;
            this.extension = extension;
        }
    }
}
