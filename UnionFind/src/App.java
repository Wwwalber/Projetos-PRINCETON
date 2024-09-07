public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Let's teste the QuickFindUF!");
        QuickFindUF quickFindUF = new QuickFindUF(10);
        System.out.println(quickFindUF.conected(4 , 5));
        quickFindUF.union(4, 5);
        quickFindUF.union(9, 5);
        quickFindUF.union(9, 1);
        System.out.println(quickFindUF.conected(4 , 5));
    }
}

class QuickFindUF{

    private int[] id;

    public QuickFindUF(int N) {
        id = new int[N]; // 
        for(int i=0; i<N; i++)
            id[i]=i;
    }

    public boolean conected(int p, int q) {
        return id[p] == id[q];
    }

    public void union(int p, int q) {
        int pid = id[p];
        int qid = id[q];
        for(int i=0; i<id.length; i++)
            if(id[i] == pid) 
                id[i] = qid;
    }
}
