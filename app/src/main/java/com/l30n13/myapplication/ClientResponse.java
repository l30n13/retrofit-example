package com.l30n13.myapplication;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by leon on 6/15/17.
 */

public class ClientResponse {
    @SerializedName("client")
    private List<Client> clientList;
    @SerializedName("error")
    private String error;
    @SerializedName("message")
    private String message;

    public void setClientList(List<Client> clientList) {
        this.clientList = clientList;
    }

    public void setError(String error) {
        this.error = error;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private class Client {
        @SerializedName("name")
        private String name;
        @SerializedName("logo")
        private String logo;
        @SerializedName("company")
        private String company;
        @SerializedName("country")
        private String country;
        @SerializedName("tags")
        private List<Tags> tagsList;

        public void setName(String name) {
            this.name = name;
        }

        public void setLogo(String logo) {
            this.logo = logo;
        }

        public void setCompany(String company) {
            this.company = company;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public void setTagsList(List<Tags> tagsList) {
            this.tagsList = tagsList;
        }

        private class Tags {
            @SerializedName("tag")
            private String tag;
            @SerializedName("url")
            private String url;

            public void setTag(String tag) {
                this.tag = tag;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }
    }
}
