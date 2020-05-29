package com.example.MockingwithMockito;

import org.springframework.stereotype.Repository;

@Repository
public class DataService {

    public int[] retrieveAllData() {
        return new int[] {1,2};
    }


}
