/*
Employees
Develop a class hierarchy of employees. The hierarchy should include three classes:

Employee is the base class. It includes three fields (name, email and integer variable experience),
one constructor with three arguments and three getters: getName(), getEmail(), getExperience().

Developer is a subclass. It includes fields from the base class and two additional fields (mainLanguage, skills),
one constructor with five arguments and two getters: getMainLanguage(), getSkills().

DataAnalyst is another subclass. It includes fields from the base class and two additional fields (phd, methods),
one constructor with five arguments and two getters: isPhd(), getMethods().
You need to define types of the fields and write suitable constructors. To understand it see the code below.
 */

class Employee {

    // write fields
    String name;
    String email;
    int experience;

    // write constructor

    public Employee(String name, String email, int experience) {
        this.name = name;
        this.email = email;
        this.experience = experience;
    }


    // write getters

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getExperience() {
        return experience;
    }
}

class Developer extends Employee {

    // write fields

    String mainLanguage;
    String[] skills;

    // write constructor

    public Developer(String name, String email, int experience, String mainLanguage, String[] skills) {
        super(name, email, experience);
        this.mainLanguage = mainLanguage;
        this.skills = skills;
    }


    // write getters

    public String getMainLanguage() {
        return mainLanguage;
    }

    public String[] getSkills() {
        return skills;
    }
}

class DataAnalyst extends Employee {

    // write fields
    boolean phd;
    String[] methods;

    // write constructor

    public DataAnalyst(String name, String email, int experience, boolean phd, String[] methods) {
        super(name, email, experience);
        this.phd = phd;
        this.methods = methods;
    }


    // write getters

    public boolean isPhd() {
        return phd;
    }

    public String[] getMethods() {
        return methods;
    }
}