> Interpreter tasarım deseni, belli bir düzen veya kurala göre sıralanmış verilerin, yorumlanarak istenilen çıktı üretmesini sağlar.

Bu tasarım desenine ait UML diyagramı aşağıdaki gibidir.

![ ](../../../images/interpreter-uml.png)

- **Expression:** Yorumlama işleminin tanımlandığı arayüz.

- **TerminalExpression:** Dil bilgisindeki terminal ifadeler üzerinde işlem yapar.

- **Context:** Yorumlanacak olan içerik.

Senaryo olarak bir projeye başlayacağımızı ve proje ekibinin verilerinin bir dizgi olarak geldiğini;

- Geliştirici: G karakteri ve 4000 malitet.

- Muhasebeci: M karakteri ve 3000 maliyet.

- Takım Lideri: L karakteri ve 7000 maliyet.

varsayalım. Örnek senaryo olarak **GGML** olarak gelen bir dizginin; 2 geliştirici, 1 muhasebeci, 1 takım lideri olarak toplamda 18000 maliyet oluşturduğu anlaşılmaktadır. Bu işlemleri yapan kodu Interpreter tasarım deseni kullanarak gerçekleştirelim.

C# Kod Örneği:

```csharp
// Yorumlanacak olan içeriktir.
// UML diyagramındaki Context sınıfına denk gelir.
class Context
{
    public string formula;
    public int totalPoint;

}
```

```csharp
// Yorumlama işleminin tanımlandığı arayüz.
// UML diyagramındaki Expression arayüzüne denk gelmektedir.
interface JobExpression
{
    void Interpret(Context context);
}
```

```csharp
// Dil bilgisindeki terminal ifadeler üzerinde işlem yapar.
// UML diyagramındaki TerminalExpression sınıfına denk gelmektedir.
class TeamLeadExpression : JobExpression
{
    public void Interpret(Context context)
    {
        if (context.formula.Contains('L'))
        {
            context.totalPoint += 7000;
        }
    }
}
```

```csharp
// Dil bilgisindeki terminal ifadeler üzerinde işlem yapar.
// UML diyagramındaki TerminalExpression sınıfına denk gelmektedir.
class AccountingExpression : JobExpression
{
    public void Interpret(Context context)
    {
        if (context.formula.Contains('M'))
        {
            context.totalPoint += 3000;
        }
    }
}
```

```csharp
// Dil bilgisindeki terminal ifadeler üzerinde işlem yapar.
// UML diyagramındaki TerminalExpression sınıfına denk gelmektedir.
class DeveloperExpression : JobExpression
{
    public void Interpret(Context context)
    {
        if (context.formula.Contains('G'))
        {
            context.totalPoint += 4000;
        }
    }
}
```

```csharp
class JobManager
{
    public List<IJobExpression> CreateExpressionTree(string formula)
    {
        List<IJobExpression> tree = new List<IJobExpression>();

        foreach (char role in formula)
        {
            switch (role)
            {
                case 'G':
                    tree.Add(new DeveloperExpression());
                    break;
                case 'M':
                    tree.Add(new AccountingExpression());
                    break;
                case 'L':
                    tree.Add(new TeamLeadExpression());
                    break;
                default:
                    throw new Exception("Unexpected role!");
            }
        }
        return tree;
    }

    public void RunExpression(Context context)
    {
        foreach (IJobExpression expression in CreateExpressionTree(context.formula))
        {
            expression.Interpret(context);
        }
    }
}
```

```csharp
Context context = new Context();
context.formula = "GGML";

JobManager jobManager = new JobManager();
jobManager.RunExpression(context);

Console.WriteLine($"{context.formula} :> {context.totalPoint}");
// output: GGML :> 18000
```

*Bu tasarım deseninin JAVA ve diğer diller için olan uygulamasını [bu tasarım deseni için oluşturulmuş klasörde](https://github.com/yusufyilmazfr/tasarim-desenleri-turkce-kaynak/tree/master/interpreter) bulabilirsiniz.*
