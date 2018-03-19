// Bluej project: secret_messages
//
// TODO: implement the read method.
//
public class SecretMessage
{
    private String encodedMessage;

    public SecretMessage(String encodedMessage)
    {
        this.encodedMessage = encodedMessage;
    }

    /**
     * Reads every 10th letter of encodedMessage and returns a string
     * with the letters it reads.
     * @return A message hidden in the garbled text
     */
    public String read()
    {
        String decodedMessage = "";
        // YOUR CODE HERE
        // Implement this method.
        for(int i = 0 ; i < encodedMessage.length() ; i = i + 10)
        {
            decodedMessage = decodedMessage + encodedMessage.substring(i, i + 1);
        }
        return decodedMessage;
    }

    /**
     * Optional:
     * Decodes the same way as String read() but takes an index to start at.
     * There may be more than one secret message in the garbled text.
     * @return A message hidden in the garbled text starting at startingIndex
     * @param the first indexToRead
     */
    public String read(int startingIndex)
    {
        String decodedMessage = "";
        // YOUR CODE HERE
        int count = 0;
        int n = startingIndex;
        while(n > 0)
        {
            n = n / 10;
            count++;
        }
        for(int i = count - 1; i < 0 ; i--)
        {
            int digit = (int)(startingIndex / Math.pow(10, i)) % 10;
            decodedMessage = decodedMessage + digit;
        }
        return decodedMessage;
    }
}
