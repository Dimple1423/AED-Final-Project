package HealthBuddy.models.WorkQueue;

import java.util.ArrayList;
import HealthBuddy.models.WorkQueue.WorkRequest;
import java.util.stream.Collectors;
import java.util.List;

/**
 *
 * @author Bhawna Singh
 */
public class WorkQueue {
    private ArrayList<WorkRequest> workRequestList;

    public WorkQueue() {
        workRequestList = new ArrayList();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
    
    public List<WorkRequest> getWorkRequestListWithNotAccMesg() {
        return workRequestList.stream().filter(list -> !list.getMessage().equals("Acknowledged"))
                .collect(Collectors.toList());
    }
    
}

