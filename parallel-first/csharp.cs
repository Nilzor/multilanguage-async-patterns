var tasks = new Task<int>[3];
tasks[0] = GetSlowIntTask(1);
tasks[1] = GetSlowIntTask(2);
tasks[2] = GetSlowIntTask(3);
int firstResult = Task.WaitAny(tasks);
Console.Out.WriteLine("Res " + firstResult);