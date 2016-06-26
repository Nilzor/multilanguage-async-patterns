// Returns input string after 250ms
public static async Task<string> GetSlowStringTask(String toReturn)
{
    await Task.Delay(250);
    return toReturn;
}

// Returns input int after 250ms
public static async Task<int> GetSlowIntTask(int toReturn)
{
    await Task.Delay(250);
    return toReturn;
}