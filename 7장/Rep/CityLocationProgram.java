package assignment7;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Location {
    private double latitude;
    private double longitude;

    public Location(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    @Override
    public String toString() {
        return latitude + " " + longitude;
    }
}

public class CityLocationProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Location> cityLocations = new HashMap<>();

        // 사용자로부터 4개의 도시 정보 입력 받기
        for (int i = 0; i < 4; i++) {
            System.out.println("도시, 경도, 위도를 입력하세요.");
            String cityName = scanner.next();
            double latitude = scanner.nextDouble();
            double longitude = scanner.nextDouble();

            Location location = new Location(latitude, longitude);
            cityLocations.put(cityName, location);
        }

        // 입력된 도시 정보 출력
        System.out.println("-------------------------------------------");
        for (Map.Entry<String, Location> entry : cityLocations.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println("-------------------------------------------");

        // 도시 이름으로 검색
        while (true) {
            System.out.print("도시 이름>> ");
            String searchCity = scanner.next();

            if (searchCity.equals("그만")) {
                break;
            }

            Location foundLocation = cityLocations.get(searchCity);
            if (foundLocation != null) {
                System.out.println(searchCity + " " + foundLocation);
            } else {
                System.out.println(searchCity + "는 없습니다.");
            }
        }

        scanner.close();
    }
}
