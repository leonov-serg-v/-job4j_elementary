package ru.job4j.condition;

public class WeeklySalary {

    public static int calculate(int[] hour) {
        int cashWork = 10;
        int cashWorkOver = 15;
        int hourWork = 8;
        int sum =  hour[0] > hourWork ? (hour[0] - hour[0] % hourWork) * cashWork + hour[0] % hourWork * cashWorkOver : hour[0] * cashWork;
        sum += hour[1] > hourWork ? (hour[1] - hour[1] % hourWork) * cashWork + hour[1] % hourWork * cashWorkOver : hour[1] * cashWork;
        sum += hour[2] > hourWork ? (hour[2] - hour[2] % hourWork) * cashWork + hour[2] % hourWork * cashWorkOver : hour[2] * cashWork;
        sum += hour[3] > hourWork ? (hour[3] - hour[3] % hourWork) * cashWork + hour[3] % hourWork * cashWorkOver : hour[3] * cashWork;
        sum += hour[4] > hourWork ? (hour[4] - hour[4] % hourWork) * cashWork + hour[4] % hourWork * cashWorkOver : hour[4] * cashWork;
        sum += (hour[5] > hourWork ? (hour[5] - hour[5] % hourWork) * cashWork + hour[5] % hourWork * cashWorkOver : hour[5] * cashWork) * 2;
        sum += (hour[6] > hourWork ? (hour[6] - hour[6] % hourWork) * cashWork + hour[6] % hourWork * cashWorkOver : hour[6] * cashWork) * 2;
        return sum;
    }
}
