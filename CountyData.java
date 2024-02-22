class CountyData {
    private String county;
    private float enrollment;
    private String regularClass80;
    private String regularClass40To79;
    private String regularClass39OrLess;
    private String separateSchoolAndOtherSettings;
    private String preschoolSetting;

    public CountyData(String county, float enrollment, String regularClass80, String regularClass40To79,
                      String regularClass39OrLess, String separateSchoolAndOtherSettings, String preschoolSetting) {
        this.county = county;
        this.enrollment = enrollment;
        this.regularClass80 = regularClass80;
        this.regularClass40To79 = regularClass40To79;
        this.regularClass39OrLess = regularClass39OrLess;
        this.separateSchoolAndOtherSettings = separateSchoolAndOtherSettings;
        this.preschoolSetting = preschoolSetting;
    }

    // Getters for accessing the county data
    public String getCounty() {
        return county;
    }

    public float getEnrollment() {
        return enrollment;
    }

    public String getRegularClass80() {
        return regularClass80;
    }

    public String getRegularClass40To79() {
        return regularClass40To79;
    }

    public String getRegularClass39OrLess() {
        return regularClass39OrLess;
    }

    public String getSeparateSchoolAndOtherSettings() {
        return separateSchoolAndOtherSettings;
    }

    public String getPreschoolSetting() {
        return preschoolSetting;
    }
}