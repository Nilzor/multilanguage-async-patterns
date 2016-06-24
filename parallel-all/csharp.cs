var tasks = new Task<int>[3];
tasks[0] = GetSlowIntTask(1);
tasks[1] = GetSlowIntTask(2);
tasks[2] = GetSlowIntTask(3);
Task.WaitAll(tasks);
for (int i = 0; i < 3; i++)
{
    Console.Out.WriteLine("Res " + i + ": " + tasks[i].Result);
}