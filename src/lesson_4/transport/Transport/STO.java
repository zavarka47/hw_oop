package lesson_4.transport.Transport;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class STO {
    //Добавьте новый класс «Станция техобслуживания», в которой реализована очередь из авто.
    //Кроме этого, в классе есть методы «добавить авто в очередь» и «провести техосмотр авто».
    //Напомним, что автобусы не нуждаются в техобслуживании перед заездом, поэтому они в очередь не встают.
    //Каждый новый объект становится в конец очереди на техобслуживание. Как только машина проходит техобслуживание,
    //она должна из очереди удаляться.

    private Queue <Transport> transportQueue = new LinkedList<>();
    public void addTransportToQueue (Transport transport) {
        if (!(transport instanceof Bus)) {
            transportQueue.add(transport);
        }
    }

    public void runTO (){
        Transport transport = transportQueue.poll();
        if (transport != null){
            System.out.print("Mechanic " + transport.getMechanics().get(0).getFullName() + " ");
            transport.getMechanics().get(0).CarryOutMaintenance(transport);
        }
    }
}
