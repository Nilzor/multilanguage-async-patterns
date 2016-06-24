var str = await GetSlowStringTask("Hello world");
var len = await GetSlowIntTask(str.Length);
var res = await GetSlowStringTask("Len: " + len);
Console.Out.WriteLine(res);