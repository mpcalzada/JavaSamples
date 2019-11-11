package optionals;

import java.util.Optional;
import java.util.function.Supplier;

/**
 * {@link Process}
 *
 * @author MarcoCalzada
 * @version 1
 * @since MarcoCalzada
 */
public class Process
{
    public void proceed()
    {
        Optional.of(getRandomData()).ifPresent(Data::getAge);
        Optional<Data> optionalData = Optional.of(getRandomData());

        optionalData.orElseGet(Data::new);
    }

    private Data getRandomData()
    {
        Data data = new Data();

        data.setName("Marco");
        data.setLastName("Calzada");
        data.setAge(23);

        return data;
    }
}
