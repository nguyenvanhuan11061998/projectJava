package com.t3h.Bai9;

public class Main {
    public static void main(String[] args) {
        QLMuonSach qlMuonSach = new QLMuonSach();
        qlMuonSach.addTheMuon(new TheMuon("Nguyen Van Huan",1998,20,"58TH4",
                123241423,"20/10/2018","5 thang","GFD432523"));
        qlMuonSach.addTheMuon(new TheMuon("Nguyen Tuan Dat",1998,20,"58TH4",
                123241523,"21/10/2018","5 thang","GFD432525"));
        qlMuonSach.addTheMuon(new TheMuon("Nguyen Anh Tu",1998,20,"58TH4",
                133241423,"03/06/2018","6 thang","GFD432323"));
        qlMuonSach.addTheMuon(new TheMuon("Vu Ba Ngoc Minh",1998,20,"58TH4",
                183241423,"17/12/2018","4 thang","GFE432523"));

        System.out.println("=======Hien Thi Toan Bo The Muon========");
        qlMuonSach.printAllSV();
        System.out.println("\n\n=======Tim Kiem The Muon ============");
        qlMuonSach.printSV(123241423);
    }
}
