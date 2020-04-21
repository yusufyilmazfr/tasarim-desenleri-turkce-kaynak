using System;
using System.Collections.Generic;
using System.Text;

namespace Visitor
{
    // UML diyagramındaki Element'ten türer.
    // Accept metoduna bulunduğu nesne örneği gönderilir.
    // UML diyagramındaki ConcreteElement yapısına denk gelir.
    class Encyclopedia : Book
    {
        public override void Accept(IBookExportVisitor visitor)
        {
            visitor.ExportVisit(this);
        }
    }
}
