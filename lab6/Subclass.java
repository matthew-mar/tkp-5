public class Subclass implements ISuper {
    double res;
    
    @Override
    public void OperationResult(Figure f1, Figure f2, String oper) {
        switch(oper) {
            case "+":
                ISuper.ShowHeader();
                res = f1.area + f2.area;
                System.out.println(f1.area + " + " + f2.area + " = " + res);
                break;
            
            case "-":
                ISuper.ShowHeader();
                res = f1.area - f2.area;
                System.out.println(f1.area + " - " + f2.area + " = " + res);
                break;
            
            case "*":
                ISuper.ShowHeader();
                res = f1.area * f2.area;
                System.out.println(f1.area + " * " + f2.area + " = " + res);
                break;
            
            case "/":
                ISuper.ShowHeader();
                res = f1.area / f2.area;
                System.out.println(f1.area + " / " + f2.area + " = " + res);
                break;
        }
    }
}
