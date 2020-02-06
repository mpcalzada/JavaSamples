package multithread;

/**
 * {@link Cortado}
 *
 * @author MarcoCalzada
 * @version 1
 * @since MarcoCalzada
 */
public class Cortado
{

  private static final Insertar insertar = new Insertar();

  public void start()
  {
    while (true)
    {
      Data data = new Data("100", "5204", "0001");

      insertar.addData(data);
    }
  }

}
