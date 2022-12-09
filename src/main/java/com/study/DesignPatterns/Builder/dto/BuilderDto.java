package com.study.DesignPatterns.Builder.dto;

public class BuilderDto {
    private String name;
    private int age;
    private int phoneNumber;

    private BuilderDto() {
    }

    public static class Builder{
        private String name;
        private int age;
        private int phoneNumber;

        public Builder(String name){
            this.name = name;
        }

        public Builder setAge(int age){
            this.age = age;
            return this;
        }

        public Builder setPhoneNumber(int phoneNumber){
            this.phoneNumber = phoneNumber;
            return this;
        }

        public BuilderDto build(){
        BuilderDto builderDto = new BuilderDto();

        builderDto.age = age;
        builderDto.name = name;
        builderDto.phoneNumber = phoneNumber;

        return builderDto;
        }
    }
}
