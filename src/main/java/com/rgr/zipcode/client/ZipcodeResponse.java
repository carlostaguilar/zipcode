package com.rgr.zipcode.client;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ZipcodeResponse {
    private Meta meta;
    private Result result;

    @Getter @Setter
    public static class Meta {
        private int currentPage;
        private int itemsPerPage;
        private int totalOfItems;
        private int totalOfPages;

    }

    @Getter @Setter
    public static class Result {
        private String street;
        private String complement;
        private String district;
        private String city;
        private String state;
        private String zipcode;

    }
}