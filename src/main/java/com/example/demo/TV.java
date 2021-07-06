package com.example.demo;


public class TV extends Object{

    String model_name;
    int [] channel; //채널 입력
    private int current_channel;
    int resolution;
    boolean power; //전원 상태

    // static  int password;
    static void display(){
        System.out.println("화면 전송");
    }


    TV(String tv_name){  // 초기화
                        // 생성자에 타입ㄱ
        model_name = tv_name;
        resolution = 1080;
        power = false; // 컴퓨터는 꺼져 있을때
        current_channel = 0;
        channel = new int[100]; // 배열의 길이
        // 값을 세팅 할때 반복문을 사용 하여 쉽게 값을 입력할 수 있다.
        for(int i=0; i < channel.length; i++){
            channel [i] = i + 1;
        }

    }

    TV(String tv_name, int resolution){  // 초기화
        // 생성자에 타입ㄱ
        model_name = tv_name;
        this.resolution = resolution;
        power = false; // 컴퓨터는 꺼져 있을때
        current_channel = 0;
        channel = new int[100]; // 배열의 길이
        // 값을 세팅 할때 반복문을 사용 하여 쉽게 값을 입력할 수 있다.
        for(int i=0; i < channel.length; i++){
            channel [i] = i + 1;
        }

    }

    // Getter Setter

    public int[] getChannel() { // 시작 주소값
        return channel;
    }

    public void setChannel(int[] channel) { // 배열 시작주소 값
        this.channel = channel;
    }

    public int getCurrent_channel() {
        return current_channel;
    }

    public void setCurrent_channel(int current_channel) {
        if(current_channel > 100) {
            System.out.println("입력 오류: 없는 채널입니다.");
        } else {
            this.current_channel = current_channel;
        }
    }

    //기능

    public void add(int x, int y){
        System.out.println(x + y);

    }
    public int add(int x, int y, int z){
        return x + y + z;
    }
    public double add(double x, double y){
        return x + y;
    }

    @Override
    public String toString() {
        return "오버라이딩 메서드";
    }
}
