package epam.java.model.entity;

import epam.java.model.ShopDepartmentLocationComparator;
import epam.java.model.ShopDepartmentNameComparator;
import epam.java.model.ShopDepartmentServicesComparator;
import epam.java.model.ShopDepartmentTypeOfGoodsComparator;

import java.util.ArrayList;
import java.util.Collections;

public class Shop {
    private String name;
    private ArrayList <Department> departments = new ArrayList<>();

    public class Department{
        private String name;
        private String typeOfGoods;
        private String services;
        private String location;

        public Department(String name, String typeOfGoods, String services, String location) {
            this.name = name;
            this.typeOfGoods = typeOfGoods;
            this.services = services;
            this.location = location;
        }

        public String getName() {
            return name;
        }

        public String getTypeOfGoods() {
            return typeOfGoods;
        }

        public String getServices() {
            return services;
        }

        public String getLocation() {
            return location;
        }

        @Override
        public String toString() {
            return "\nDepartment{" +
                    "name='" + name + '\'' +
                    ", typeOfGoods='" + typeOfGoods + '\'' +
                    ", services='" + services + '\'' +
                    ", location='" + location + '\'' +
                    '}'+'\n';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Department that = (Department) o;

            if (name != null ? !name.equals(that.name) : that.name != null) return false;
            if (typeOfGoods != null ? !typeOfGoods.equals(that.typeOfGoods) : that.typeOfGoods != null) return false;
            if (services != null ? !services.equals(that.services) : that.services != null) return false;
            return location != null ? location.equals(that.location) : that.location == null;
        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + (typeOfGoods != null ? typeOfGoods.hashCode() : 0);
            result = 31 * result + (services != null ? services.hashCode() : 0);
            result = 31 * result + (location != null ? location.hashCode() : 0);
            return result;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Shop shop = (Shop) o;

        if (getName() != null ? !getName().equals(shop.getName()) : shop.getName() != null) return false;
        return departments != null ? departments.equals(shop.departments) : shop.departments == null;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (departments != null ? departments.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", departments:" + departments +
                '}';
    }

    public Shop(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addDepartment(String name, String typeOfGoods, String services, String location){
        departments.add(new Department(name,typeOfGoods,services,location));
    }

    public void deleteDepartment(int index){
        departments.remove(index);
    }
    public void sortByDepartmntName(){
        Collections.sort(departments,new ShopDepartmentNameComparator());
    }

    public void sortByDepartmntLocation(){
        Collections.sort(departments,new ShopDepartmentLocationComparator());
    }

    public void sortByDepartmntServices(){
        Collections.sort(departments,new ShopDepartmentServicesComparator());
    }

    public void sortByDepartmntTypeOfGoods(){
        Collections.sort(departments,new ShopDepartmentTypeOfGoodsComparator());
    }

}
