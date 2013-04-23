package uhuestounogit;

interface hello
{
    public void hello(String name);
    public void age(int input);
}

class Ba implements hello {
    public static int numero = 7;

    @Override
    public void hello(String name) {
        System.out.println(name);
    }

    @Override
    public void age(int input) {
        System.out.println("idade: " + input);
    }   
}


class Filho extends Ba
{
    private int lol;
    public void setLOL(int lol)
    {
        this.lol = lol;
    }
    public int getLOL()
    {
        return lol;
    }
    public void changeNumnero(int i)
    {
        super.numero = i;
    }
}

public class Braulio
{
    public void mein(String[] args)
    {
        Filho fi = new Filho();
        fi.changeNumnero(18);
        fi.setLOL(0);
        System.out.println(fi.getLOL());
        
        Ba ba = new Ba(){
            @Override
            public void age(int i)
            {
                System.out.println(i);
            }
        };
        
        ba.age(7);
        
        Ba fa = new Filho();
        fa.age(10);
        fa.hello("Fernando Enrique Cerdoso");
        Filho novo = (Filho) fa;
        novo.setLOL(1234);
        
        ba.age(5);
        System.out.println(novo.getLOL());
    }
}