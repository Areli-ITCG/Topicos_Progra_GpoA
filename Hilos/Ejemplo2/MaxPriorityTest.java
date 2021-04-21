//programa que ejemplica la prioridad de un hilo y un grupo de hilos
class MaxPriorityTest 
{
 public static void main(String[] args) 
 {
 ThreadGroup groupNORM = new ThreadGroup("Un grupo con prioridad normal");
 Thread priorityMAX = new Thread(groupNORM,"Un thread con prioridad máxima");
 // Selecciona la prioridad del thread al máximo (10)
 priorityMAX.setPriority(Thread.MAX_PRIORITY);
 // Selecciona la prioridad del grupo a normal (5)
 groupNORM.setMaxPriority(Thread.NORM_PRIORITY);
 System.out.println("Máxima prioridad del grupo = " +groupNORM.getMaxPriority());
 System.out.println("Prioridad del Thread = " + priorityMAX.getPriority());
 }
}
