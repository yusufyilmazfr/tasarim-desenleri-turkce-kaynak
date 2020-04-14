using System;
using System.Collections.Generic;
using System.Text;

namespace Composite
{
    // Soyut yapımızdır.
    // UML diyagramındaki Component kısmına denk gelmektedir.
    // Diğer istemci sınıflar bu yapıyı uygular.
    // Diğer sınıfların uygulayacağı hiyerarşiyi çizme metotunu içermektedir.
    public interface ICatalogComponent
    {
        void DrawHierarchy();
    }
}
