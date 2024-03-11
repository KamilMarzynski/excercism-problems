class Badge {
    public String print(Integer id, String name, String department) {
        String idPrefix = id != null ? "[" + id + "]" + " - " : "";
        String departmentSuffix = department != null ? " - " + department.toUpperCase() : " - OWNER";

        return idPrefix + name + departmentSuffix;
    }
}
