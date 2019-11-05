package multithread;

/**
 * {@link Data}
 *
 * @author MarcoCalzada
 * @version 1
 * @since MarcoCalzada
 */
public class Data
{
  private String amount;
  private String cardNumber;
  private String authNumber;

  public Data(String amount, String cardNumber, String authNumber)
  {
    this.amount = amount;
    this.cardNumber = cardNumber;
    this.authNumber = authNumber;
  }

  public String getAmount()
  {
    return amount;
  }

  public String getCardNumber()
  {
    return cardNumber;
  }

  public String getAuthNumber()
  {
    return authNumber;
  }
}
